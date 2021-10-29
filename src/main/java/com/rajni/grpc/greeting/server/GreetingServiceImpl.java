package com.rajni.grpc.greeting.server;

import com.rajni.grpc.greeting.*;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class GreetingServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {
    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        Greeting greeting = request.getRequest();

        String firstName = greeting.getFirstName();
        String result = "Hello, "+firstName;

        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result).build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {
        GreetRequest greetRequest = request.getRequest();
        String name = greetRequest.getRequest().getFirstName();

        for (int i = 0 ; i < 10; i++) {
            try {
                String result = "Hello "+ name+", response number : "+i;
                GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder().setResult(result).build();
                responseObserver.onNext(response);
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {
        StreamObserver<LongGreetRequest> requestObserver = new StreamObserver<>() {
            String result = "";
            @Override
            public void onNext(LongGreetRequest value) {
                result += "Hello, "+value.getRequest().getRequest().getFirstName() +" ! ";
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(LongGreetResponse.newBuilder().setResult(result).build());
                responseObserver.onCompleted();
            }
        };
        return requestObserver;
    }
}
