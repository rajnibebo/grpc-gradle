package com.rajni.grpc.greeting.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetingServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello, This is from greeting service");

        Server server = ServerBuilder.forPort(50051)
                .addService(new GreetingServiceImpl()).build();
        server.start();

        System.out.println("Server has been started successfully");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request.");
            server.shutdown();
            System.out.println("Server has been shutdown successfully");
        }));

        server.awaitTermination();


    }
}
