package com.rajni.grpc.blog.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.File;
import java.io.IOException;

public class BlogServer {

    public static void main(String[] args) throws IOException {
        Server server = ServerBuilder.forPort(50051)
                .useTransportSecurity(new File("ssh/server.crt"), new File("ssh/server.pem"))
                .addService(new BlogServiceImpl())
                .build();

        server.start();
        System.out.println("Blog Server has been started successfully.");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("ShutdownHook added successfully.");
            server.shutdown();
        }));

        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
