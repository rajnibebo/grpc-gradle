package com.rajni.grpc.calculator.server;

import com.rajni.grpc.calculator.*;
import io.grpc.Status;
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

    @Override
    public StreamObserver<FindMaximumRequest> findMaximum(StreamObserver<FindMaximumResponse> responseObserver) {
        StreamObserver<FindMaximumRequest> requestStreamObserver = new StreamObserver<>() {
            Integer maxNumber = Integer.valueOf(0);
            @Override
            public void onNext(FindMaximumRequest value) {
                Integer newNumber = value.getNumber();
                System.out.println("Calculating Max Number");
                if(newNumber > maxNumber) {
                    maxNumber = newNumber;
                }
                responseObserver.onNext(FindMaximumResponse.newBuilder().setResponse(maxNumber).build());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return requestStreamObserver;
    }

    @Override
    public void squareRoot(SquareRootRequest request, StreamObserver<SquareRootResponse> responseObserver) {
        int number = request.getNumber();
        System.out.println("Number for which we have to find the square root is: "+number);
        if(number >= 0) {
            double squareRoot = Math.sqrt(number);
            responseObserver.onNext(SquareRootResponse.newBuilder().setNumberRoot(squareRoot).build());
        } else {
            responseObserver.onError(
                    Status.INVALID_ARGUMENT
                    .withDescription("The number being sent is not positive")
                    .augmentDescription("Additional information on this exception: Number: "+number)
                    .asRuntimeException()
            );
        }
    }
}
