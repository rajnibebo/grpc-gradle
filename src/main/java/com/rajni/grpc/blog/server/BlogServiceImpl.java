package com.rajni.grpc.blog.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import com.rajni.grpc.blog.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

public class BlogServiceImpl extends BlogServiceGrpc.BlogServiceImplBase {

    private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    private MongoDatabase mongoDatabase = mongoClient.getDatabase("myBlogDB");
    private MongoCollection<Document> collection = mongoDatabase.getCollection("blog");

    @Override
    public void createBlog(BlogRequest request, StreamObserver<BlogResponse> responseObserver) {
        Blog blog = request.getBlogRequest();
        System.out.println("Received Blog request for creation");
        Document document = new Document("author_id", blog.getAuthorId())
                .append("title", blog.getTitle())
                .append("content", blog.getContent());

        collection.insertOne(document);

        String id = document.getObjectId("_id").toString();
        System.out.println("Insertion of blog in mongo is successful: "+id);

        BlogResponse response = BlogResponse.newBuilder()
                .setBlogResponse(blog.toBuilder().setId(id).build())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void readBlog(ReadBlogRequest request, StreamObserver<ReadBlogResponse> responseObserver) {
        System.out.println("Server started reading blog execution.");
        String blogId = request.getBlogId();

        Document responseBlog = null;
        try {
            responseBlog = collection.find(Filters.eq("_id", new ObjectId(blogId))).first();
            System.out.println("Server got the blog from Mongo collection");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(responseBlog == null) {
            System.out.println("Server could not fetch the blog from Mongo collection as its not available");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        } else {
            responseObserver.onNext(ReadBlogResponse.newBuilder()
                            .setBlog(documentToBlog(responseBlog))
                    .build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void updateBlog(UpdateBlogRequest request, StreamObserver<UpdateBlogResponse> responseObserver) {
        Blog requestedBlog = request.getBlog();
        // first find the blog
        System.out.println("Find the existing blog so as to update the values");

        Document responseDocument = null;

        try {
            responseDocument = collection.find(Filters.eq("_id", new ObjectId(requestedBlog.getId()))).first();
        } catch (Exception e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("Invalid Id passed.")
                            .augmentDescription(e.getLocalizedMessage())
                    .asRuntimeException());
        }


        if(responseDocument == null) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("Invalid Id passed, this Id does not exist.")
                    .asRuntimeException());
        } else {
            // Update the document.
            System.out.println("Document is found. Now update the existing values.");
            Document replacement = new Document("author_id", requestedBlog.getAuthorId())
                    .append("content", requestedBlog.getContent())
                    .append("title", requestedBlog.getTitle())
                    .append("_id", new ObjectId(requestedBlog.getId()));

            collection.replaceOne(Filters.eq("_id", new ObjectId(requestedBlog.getId())), replacement);

            System.out.println("Request has been completed. Value has been replaced in DB.");
            responseObserver.onNext(UpdateBlogResponse.newBuilder()
                            .setBlog(documentToBlog(replacement))
                    .build());
            responseObserver.onCompleted();

        }
    }

    @Override
    public void deleteBlog(DeleteBlogRequest request, StreamObserver<DeleteBlogResponse> responseObserver) {
        String blogId = request.getBlogId();

        // first step is to find the Blog
        Document foundBlog = null;
        try {
            foundBlog = collection.find(Filters.eq("_id", new ObjectId(blogId))).first();
        } catch (Exception e) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("Invalid Id passed;")
                            .augmentDescription(e.getLocalizedMessage())
                    .asRuntimeException());
        }

        if(foundBlog == null) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("Invalid Id passed which does not exist in the Mongo DB;")
                    .asRuntimeException());
        } else {
            long deletedCount = collection.deleteOne(Filters.eq("_id", new ObjectId(blogId))).getDeletedCount();
            if(deletedCount > 0) {
                System.out.println("Blog has been deleted successfully.");
                responseObserver.onNext(DeleteBlogResponse.newBuilder().setBlog(documentToBlog(foundBlog)).build());
            }
            responseObserver.onCompleted();
        }

    }

    @Override
    public void listBlog(ListBlogRequest request, StreamObserver<ListBlogResponse> responseObserver) {
        System.out.println("Server received the request for ListBlog method.");
        collection.find().iterator().forEachRemaining(c -> {
           System.out.println("Sending next response from ListBlog method.");
           responseObserver.onNext(ListBlogResponse.newBuilder().setResponse(documentToBlog(c)).build());
        });
        System.out.println("List Blog Method has been executed successfully.");
       responseObserver.onCompleted();
    }

    private Blog documentToBlog(Document document) {
        return Blog.newBuilder()
                .setAuthorId(document.getString("author_id"))
                .setTitle(document.getString("title"))
                .setContent(document.getString("content"))
                .setId(document.getObjectId("_id").toString())
                .build();
    }
}
