package com.rajni.grpc.calculator.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Calculator server started.");

        Server calculatorServer = ServerBuilder.forPort(50551)
                .addService(new CalculatorServiceImpl()).build();
        System.out.println("Server has been created for calculation");
        calculatorServer.start();

        System.out.println("Server has been started successfully and is ready to accept requests.");


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown hook added.");
            calculatorServer.shutdown();
        }));
        calculatorServer.awaitTermination();
    }
}
