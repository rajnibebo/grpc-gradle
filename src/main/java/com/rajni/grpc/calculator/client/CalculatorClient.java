package com.rajni.grpc.calculator.client;

import com.rajni.grpc.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

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

        channel.shutdown();
    }
}
