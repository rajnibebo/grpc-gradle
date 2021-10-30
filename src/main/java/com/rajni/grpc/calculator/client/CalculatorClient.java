package com.rajni.grpc.calculator.client;

import com.rajni.grpc.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class CalculatorClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50551)
                .usePlaintext().build();

        CalculatorServiceGrpc.CalculatorServiceBlockingStub syncCall = CalculatorServiceGrpc.newBlockingStub(channel);

        System.out.println("Below is sum request");
        Calculator calculator = Calculator.newBuilder().setArgument1(10).setArgument2(3).build();
        CalculatorRequest request = CalculatorRequest.newBuilder().setRequest(calculator).build();

        CalculatorResponse result = syncCall.sum(request);
        System.out.println("Result received by the client:: "+result);

        System.out.println("Below is prime factor decomposition request");
        syncCall.primeNumberDecompositionFactor(PrimeNumberDecompositionRequest.newBuilder().setNumber(7).build())
                .forEachRemaining(n -> {
                    System.out.println("Number for prime factor is :"+n);
                });

        // compute Average functionality starts here

        //First create an Async client
        CalculatorServiceGrpc.CalculatorServiceStub asyncCall = CalculatorServiceGrpc.newStub(channel);

        //create Countdown latch
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AverageRequest> averageRequestStreamObserver = asyncCall.computeAverage(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse value) {
                System.out.println("Average is: "+value.getAverage());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Server call finished....");
                latch.countDown();
            }
        });

        averageRequestStreamObserver.onNext(AverageRequest.newBuilder().setNumber(1).build());
        averageRequestStreamObserver.onNext(AverageRequest.newBuilder().setNumber(2).build());
        averageRequestStreamObserver.onNext(AverageRequest.newBuilder().setNumber(3).build());
        averageRequestStreamObserver.onNext(AverageRequest.newBuilder().setNumber(4).build());
       // averageRequestStreamObserver.onNext(AverageRequest.newBuilder().setNumber(12).build());

        averageRequestStreamObserver.onCompleted();
        System.out.println("Client request completed...");

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        channel.shutdown();
    }
}
