package com.rajni.grpc.calculator.client;

import com.rajni.grpc.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class CalculatorClient {

    private ManagedChannel channel;

    public void run() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50551)
                .usePlaintext().build();

//        doUnaryCall(channel);
//        doClientStreamCall(channel);
//        doServerStreamCall(channel);
//        doBIDIStreamCall(channel);

        doErrorCall(channel);

        channel.shutdown();
    }
    public static void main(String[] args) {
        CalculatorClient client = new CalculatorClient();
        client.run();
    }

    public void doUnaryCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub syncCall = CalculatorServiceGrpc.newBlockingStub(channel);

        System.out.println("Below is sum request");
        Calculator calculator = Calculator.newBuilder().setArgument1(10).setArgument2(3).build();
        CalculatorRequest request = CalculatorRequest.newBuilder().setRequest(calculator).build();

        CalculatorResponse result = syncCall.sum(request);
        System.out.println("Result received by the client:: "+result);

    }

    public void doClientStreamCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub syncCall = CalculatorServiceGrpc.newBlockingStub(channel);

        System.out.println("Below is prime factor decomposition request");
        syncCall.primeNumberDecompositionFactor(PrimeNumberDecompositionRequest.newBuilder().setNumber(7).build())
                .forEachRemaining(n -> {
                    System.out.println("Number for prime factor is :"+n);
                });
    }

    public void doServerStreamCall(ManagedChannel channel) {
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

    }

    public void doBIDIStreamCall(ManagedChannel channel) {
        //First create an Async client
        CalculatorServiceGrpc.CalculatorServiceStub asyncCall = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch newLatch = new CountDownLatch(1);
        StreamObserver<FindMaximumRequest> requestObserver = asyncCall.findMaximum(new StreamObserver<FindMaximumResponse>() {
            @Override
            public void onNext(FindMaximumResponse value) {
                System.out.println("Client received server response: "+value.getResponse());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Client received response from server complete(). ");
                newLatch.countDown();
            }
        });

        Arrays.asList(1,2,3,4,5,66,77,55,88).forEach(num -> {
            requestObserver.onNext(FindMaximumRequest.newBuilder().setNumber(num).build());
        });

        try {
            newLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void doErrorCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        try {
            SquareRootResponse squareRootResponse = stub.squareRoot(SquareRootRequest.newBuilder().setNumber(-1).build());
        } catch (StatusRuntimeException e) {
            System.out.println("An exception was thrown on the stub.");
            e.printStackTrace();
        }

    }

}
