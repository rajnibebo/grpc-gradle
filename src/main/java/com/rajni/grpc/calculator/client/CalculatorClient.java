package com.rajni.grpc.calculator.client;

import com.rajni.grpc.calculator.Calculator;
import com.rajni.grpc.calculator.CalculatorRequest;
import com.rajni.grpc.calculator.CalculatorResponse;
import com.rajni.grpc.calculator.CalculatorServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50551)
                .usePlaintext().build();

        CalculatorServiceGrpc.CalculatorServiceBlockingStub syncCall = CalculatorServiceGrpc.newBlockingStub(channel);

        Calculator calculator = Calculator.newBuilder().setArgument1(10).setArgument2(3).build();
        CalculatorRequest request = CalculatorRequest.newBuilder().setRequest(calculator).build();

        CalculatorResponse result = syncCall.sum(request);
        System.out.println("Result received by the client:: "+result);

        channel.shutdown();
    }
}
