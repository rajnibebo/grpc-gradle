package com.rajni.grpc.calculator.server;

import com.rajni.grpc.calculator.Calculator;
import com.rajni.grpc.calculator.CalculatorRequest;
import com.rajni.grpc.calculator.CalculatorResponse;
import com.rajni.grpc.calculator.CalculatorServiceGrpc;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {
    @Override
    public void sum(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        Calculator calculator = request.getRequest();
        System.out.println("Request Received!!");
        int result = calculator.getArgument1() + calculator.getArgument2();

        CalculatorResponse response = CalculatorResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);

        System.out.println("Response sent!!");
        responseObserver.onCompleted();

        System.out.println("RPC call completed.");
    }
}
