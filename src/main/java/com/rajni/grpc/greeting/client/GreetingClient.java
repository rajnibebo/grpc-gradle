package com.rajni.grpc.greeting.client;

import com.rajni.grpc.greeting.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClient {
    private ManagedChannel channel;

    public void run() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        System.out.println("ManagedChannel has been created for transferring the request from client to server");
      //  doUnaryCall(channel);
      //  doServerStreamCall(channel);

        doClientStreaming(channel);

    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is coming via the greeting client");
        GreetingClient client = new GreetingClient();
        client.run();
        //DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);
        System.out.println("Shutting down channel.");
        client.channel.shutdown();
    }

    public static void doUnaryCall(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceBlockingStub syncClient = GreetServiceGrpc.newBlockingStub(channel);

        Greeting greeting = Greeting.newBuilder().setFirstName("Rajni").setLastName("Ubhi").build();

        GreetRequest request = GreetRequest.newBuilder().setRequest(greeting).build();

        GreetResponse response = syncClient.greet(request);
        System.out.println("Unary Call: Request has been sent to the server and got the following response");
        System.out.println(response.getResult());

    }

    public void doServerStreamCall(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceBlockingStub syncClient = GreetServiceGrpc.newBlockingStub(channel);

        Greeting greeting = Greeting.newBuilder().setFirstName("Rajni").setLastName("Ubhi").build();

        GreetManyTimesRequest request = GreetManyTimesRequest.newBuilder()
                .setRequest(GreetRequest.newBuilder().setRequest(greeting).build())
                .build();

        Iterator<GreetManyTimesResponse> response = syncClient.greetManyTimes(request);
        try {
            while (response.hasNext()) {
                System.out.println("Receiving Next message: ");
                System.out.println(response.next().getResult());
                TimeUnit.MILLISECONDS.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Stream Call: Request has been sent to the server and got the following response");

    }

    public void doClientStreaming(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<LongGreetRequest> requestObserver = asyncClient.longGreet(new StreamObserver<>() {
            @Override
            public void onNext(LongGreetResponse value) {
                System.out.println("Server is processing next Message");
                System.out.println("onNext finished executing");
                System.out.println(value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
                System.out.println("onCompleted call finished...");
            }
        });

        System.out.println("Sending Message 1");

        requestObserver.onNext(
                LongGreetRequest.newBuilder()
                        .setRequest(
                                GreetRequest.newBuilder().setRequest(Greeting.newBuilder().setFirstName("Avnoor").build())
                                        .build()).build());
        System.out.println("Sending Message 2");
        requestObserver.onNext(
                LongGreetRequest.newBuilder()
                        .setRequest(
                                GreetRequest.newBuilder().setRequest(Greeting.newBuilder().setFirstName("Gugli").build())
                                        .build()).build());

        requestObserver.onCompleted();

        try {
            latch.await();
            //latch.await(10l, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
