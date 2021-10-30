package com.rajni.grpc.calculator.server;

import com.rajni.grpc.calculator.*;
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

    @Override
    public void primeNumberDecompositionFactor(PrimeNumberDecompositionRequest request, StreamObserver<PrimeNumberDecompositionResponse> responseObserver) {
        Integer number = request.getNumber();
        Integer divisor = 2;
        while(number > 1) {
            if(number % divisor == 0) {
                number = number / divisor;
                responseObserver.onNext(PrimeNumberDecompositionResponse.newBuilder().setPrimeFactor(divisor).build());
            } else {
                divisor = divisor + 1;
            }
        }

        responseObserver.onCompleted();
    }


    @Override
    public StreamObserver<AverageRequest> computeAverage(StreamObserver<AverageResponse> responseObserver) {
        StreamObserver<AverageRequest> request = new StreamObserver<AverageRequest>() {
            double number;
            int count;

            @Override
            public void onNext(AverageRequest value) {
                count++;
                this.number = (this.number + value.getNumber());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                double average = ((double) number )/count;
                responseObserver.onNext(AverageResponse.newBuilder().setAverage(average).build());
                responseObserver.onCompleted();
            }
        };
        return request;
    }
}
