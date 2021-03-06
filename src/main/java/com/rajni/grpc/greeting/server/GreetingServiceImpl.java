package com.rajni.grpc.greeting.server;

import com.rajni.grpc.greeting.*;
import io.grpc.Context;
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

    @Override
    public StreamObserver<GreetEveryOneRequest> greetEveryone(StreamObserver<GreetEveryOneResponse> responseObserver) {

        StreamObserver<GreetEveryOneRequest> greetObserver = new StreamObserver<GreetEveryOneRequest>() {
            @Override
            public void onNext(GreetEveryOneRequest value) {
                String response = "Hello, "+value.getGreet().getFirstName();
                GreetEveryOneResponse greetEveryOneResponse =  GreetEveryOneResponse.newBuilder().setResult(response).build();
                responseObserver.onNext(greetEveryOneResponse);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return greetObserver;
    }

    @Override
    public void greetWithDeadline(GreetRequestWithDeadline request, StreamObserver<GreetResponseWithDeadline> responseObserver) {
        String firstName = request.getGreeting().getFirstName();

        Context context = Context.current();
        try {
            if(!context.isCancelled()) {
                TimeUnit.MILLISECONDS.sleep(1000);
            } else {
                return;
            }
            System.out.println("Sending response to client after checking deadlines.");
            responseObserver.onNext(GreetResponseWithDeadline.newBuilder().setResult("Hello, "+firstName).build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
