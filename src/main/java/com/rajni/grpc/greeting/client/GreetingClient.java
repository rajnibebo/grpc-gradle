package com.rajni.grpc.greeting.client;

import com.rajni.grpc.greeting.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class GreetingClient {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is coming via the greeting client");


        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        System.out.println("ManagedChannel has been created for transferring the request from client to server");

        //DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);
        GreetServiceGrpc.GreetServiceBlockingStub syncClient = GreetServiceGrpc.newBlockingStub(channel);
        //unaryCall(syncClient);
        streamCall(syncClient);
        System.out.println("Sync client has been created.");
        System.out.println("Shutting down channel.");
        channel.shutdown();
    }

    public static void unaryCall(GreetServiceGrpc.GreetServiceBlockingStub syncClient) {
        Greeting greeting = Greeting.newBuilder().setFirstName("Rajni").setLastName("Ubhi").build();

        GreetRequest request = GreetRequest.newBuilder().setRequest(greeting).build();

        GreetResponse response = syncClient.greet(request);
        System.out.println("Unary Call: Request has been sent to the server and got the following response");
        System.out.println(response.getResult());

    }

    public static void streamCall(GreetServiceGrpc.GreetServiceBlockingStub syncClient) throws InterruptedException {
        Greeting greeting = Greeting.newBuilder().setFirstName("Rajni").setLastName("Ubhi").build();

        GreetManyTimesRequest request = GreetManyTimesRequest.newBuilder()
                .setRequest(GreetRequest.newBuilder().setRequest(greeting).build())
                .build();

        Iterator<GreetManyTimesResponse> response = syncClient.greetManyTimes(request);
        while (response.hasNext()) {
            System.out.println("Receiving Next message: ");
            System.out.println(response.next().getResult());
            Thread.sleep(1000);
        }
        System.out.println("Stream Call: Request has been sent to the server and got the following response");

    }
}
