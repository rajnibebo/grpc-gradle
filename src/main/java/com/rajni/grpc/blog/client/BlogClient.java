package com.rajni.grpc.blog.client;

import com.rajni.grpc.blog.*;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

import javax.net.ssl.SSLException;
import java.io.File;
import java.util.Iterator;

public class BlogClient {
    private ManagedChannel channel;

    public void run() {
        try {
            channel = NettyChannelBuilder.forAddress("localhost",50051)
                    .sslContext(GrpcSslContexts.forClient().trustManager(new File("ssh/ca.crt")).build())
                    .build();

            createBlog(channel);
            readBlog(channel);
          //  updateBlog(channel);
          //  deleteBlog(channel);
            listBlog(channel);
        } catch (SSLException e) {
            e.printStackTrace();
        }

    }

    private void createBlog(ManagedChannel channel) {
        BlogServiceGrpc.BlogServiceBlockingStub blockingStub = BlogServiceGrpc.newBlockingStub(channel);

        BlogResponse blogResponse = blockingStub.createBlog(
                BlogRequest.newBuilder()
                        .setBlogRequest(Blog.newBuilder()
                                .setAuthorId("Rajni")
                                .setContent("This is my first blog !!")
                                .setTitle("New Blog !!")
                                .build())
                        .build());
        System.out.println("Client has received the response for create blog");
        System.out.println(blogResponse);
    }

    private void readBlog(ManagedChannel channel) {
        BlogServiceGrpc.BlogServiceBlockingStub blockingStub = BlogServiceGrpc.newBlockingStub(channel);
        ReadBlogResponse readBlogResponse = blockingStub.readBlog(ReadBlogRequest.newBuilder()
                        .setBlogId("61803a12b730146eaf11280b")
                .build());

        System.out.println("Client has received the response from server.");
        System.out.println(readBlogResponse);
    }

    private void updateBlog(ManagedChannel channel) {
        System.out.println("Update request will be sent to server.");
        BlogServiceGrpc.BlogServiceBlockingStub blockingStub = BlogServiceGrpc.newBlockingStub(channel);
        UpdateBlogResponse updatedBlog = blockingStub.updateBlog(UpdateBlogRequest.newBuilder()
                .setBlog(Blog.newBuilder()
                        .setId("61803aa161b9187d38b8e60f")
                        .setAuthorId("Rajni Ubhi")
                        .setContent("This is updated content for the new blog")
                        .setTitle("New Updated Blog")
                        .build())
                .build());

        System.out.println("Client has received the response from server for update blog.");
        System.out.println(updatedBlog);
    }

    private void deleteBlog(ManagedChannel channel) {
        System.out.println("Delete request will be sent to server.");
        BlogServiceGrpc.BlogServiceBlockingStub blockingStub = BlogServiceGrpc.newBlockingStub(channel);
        DeleteBlogResponse deleteBlog = blockingStub.deleteBlog(DeleteBlogRequest.newBuilder().setBlogId("61803aa161b9187d38b8e60f").build());

        System.out.println("Client has received the response from server for delete blog. Following blog has been deleted.");
        System.out.println(deleteBlog);
    }

    private void listBlog(ManagedChannel channel) {
        System.out.println("List Blog request will be sent to server.");
        BlogServiceGrpc.BlogServiceBlockingStub blockingStub = BlogServiceGrpc.newBlockingStub(channel);
        Iterator<ListBlogResponse> nextBlog = blockingStub.listBlog(ListBlogRequest.newBuilder().build().newBuilder().build());

        while (nextBlog.hasNext()) {
            System.out.println("Received next blog from server in list blog method.");
            System.out.println(nextBlog.next());
        }
        System.out.println("Client has received the response from server for list blog.");
    }
    public static void main(String[] args) {
        BlogClient client = new BlogClient();
        client.run();
    }
}
