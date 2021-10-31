package com.rajni.grpc.greeting;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: greet/greet.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetRequest,
      com.rajni.grpc.greeting.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.rajni.grpc.greeting.GreetRequest.class,
      responseType = com.rajni.grpc.greeting.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetRequest,
      com.rajni.grpc.greeting.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetRequest, com.rajni.grpc.greeting.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.rajni.grpc.greeting.GreetRequest, com.rajni.grpc.greeting.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetManyTimesRequest,
      com.rajni.grpc.greeting.GreetManyTimesResponse> getGreetManyTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetManyTimes",
      requestType = com.rajni.grpc.greeting.GreetManyTimesRequest.class,
      responseType = com.rajni.grpc.greeting.GreetManyTimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetManyTimesRequest,
      com.rajni.grpc.greeting.GreetManyTimesResponse> getGreetManyTimesMethod() {
    io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetManyTimesRequest, com.rajni.grpc.greeting.GreetManyTimesResponse> getGreetManyTimesMethod;
    if ((getGreetManyTimesMethod = GreetServiceGrpc.getGreetManyTimesMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyTimesMethod = GreetServiceGrpc.getGreetManyTimesMethod) == null) {
          GreetServiceGrpc.getGreetManyTimesMethod = getGreetManyTimesMethod =
              io.grpc.MethodDescriptor.<com.rajni.grpc.greeting.GreetManyTimesRequest, com.rajni.grpc.greeting.GreetManyTimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetManyTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.GreetManyTimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.GreetManyTimesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetManyTimes"))
              .build();
        }
      }
    }
    return getGreetManyTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rajni.grpc.greeting.LongGreetRequest,
      com.rajni.grpc.greeting.LongGreetResponse> getLongGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongGreet",
      requestType = com.rajni.grpc.greeting.LongGreetRequest.class,
      responseType = com.rajni.grpc.greeting.LongGreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.rajni.grpc.greeting.LongGreetRequest,
      com.rajni.grpc.greeting.LongGreetResponse> getLongGreetMethod() {
    io.grpc.MethodDescriptor<com.rajni.grpc.greeting.LongGreetRequest, com.rajni.grpc.greeting.LongGreetResponse> getLongGreetMethod;
    if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
          GreetServiceGrpc.getLongGreetMethod = getLongGreetMethod =
              io.grpc.MethodDescriptor.<com.rajni.grpc.greeting.LongGreetRequest, com.rajni.grpc.greeting.LongGreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LongGreet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.LongGreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.LongGreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("LongGreet"))
              .build();
        }
      }
    }
    return getLongGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetEveryOneRequest,
      com.rajni.grpc.greeting.GreetEveryOneResponse> getGreetEveryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetEveryone",
      requestType = com.rajni.grpc.greeting.GreetEveryOneRequest.class,
      responseType = com.rajni.grpc.greeting.GreetEveryOneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetEveryOneRequest,
      com.rajni.grpc.greeting.GreetEveryOneResponse> getGreetEveryoneMethod() {
    io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetEveryOneRequest, com.rajni.grpc.greeting.GreetEveryOneResponse> getGreetEveryoneMethod;
    if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
          GreetServiceGrpc.getGreetEveryoneMethod = getGreetEveryoneMethod =
              io.grpc.MethodDescriptor.<com.rajni.grpc.greeting.GreetEveryOneRequest, com.rajni.grpc.greeting.GreetEveryOneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.GreetEveryOneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.GreetEveryOneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetEveryone"))
              .build();
        }
      }
    }
    return getGreetEveryoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetRequestWithDeadline,
      com.rajni.grpc.greeting.GreetResponseWithDeadline> getGreetWithDeadlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetWithDeadline",
      requestType = com.rajni.grpc.greeting.GreetRequestWithDeadline.class,
      responseType = com.rajni.grpc.greeting.GreetResponseWithDeadline.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetRequestWithDeadline,
      com.rajni.grpc.greeting.GreetResponseWithDeadline> getGreetWithDeadlineMethod() {
    io.grpc.MethodDescriptor<com.rajni.grpc.greeting.GreetRequestWithDeadline, com.rajni.grpc.greeting.GreetResponseWithDeadline> getGreetWithDeadlineMethod;
    if ((getGreetWithDeadlineMethod = GreetServiceGrpc.getGreetWithDeadlineMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetWithDeadlineMethod = GreetServiceGrpc.getGreetWithDeadlineMethod) == null) {
          GreetServiceGrpc.getGreetWithDeadlineMethod = getGreetWithDeadlineMethod =
              io.grpc.MethodDescriptor.<com.rajni.grpc.greeting.GreetRequestWithDeadline, com.rajni.grpc.greeting.GreetResponseWithDeadline>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetWithDeadline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.GreetRequestWithDeadline.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.grpc.greeting.GreetResponseWithDeadline.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetWithDeadline"))
              .build();
        }
      }
    }
    return getGreetWithDeadlineMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void greet(com.rajni.grpc.greeting.GreetRequest request,
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public void greetManyTimes(com.rajni.grpc.greeting.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetManyTimesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetManyTimesMethod(), responseObserver);
    }

    /**
     * <pre>
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.LongGreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLongGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     *BIDI Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetEveryOneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetEveryOneResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetEveryoneMethod(), responseObserver);
    }

    /**
     * <pre>
     *RPC call with deadline of 500 ms
     * </pre>
     */
    public void greetWithDeadline(com.rajni.grpc.greeting.GreetRequestWithDeadline request,
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetResponseWithDeadline> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetWithDeadlineMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.rajni.grpc.greeting.GreetRequest,
                com.rajni.grpc.greeting.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.rajni.grpc.greeting.GreetManyTimesRequest,
                com.rajni.grpc.greeting.GreetManyTimesResponse>(
                  this, METHODID_GREET_MANY_TIMES)))
          .addMethod(
            getLongGreetMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.rajni.grpc.greeting.LongGreetRequest,
                com.rajni.grpc.greeting.LongGreetResponse>(
                  this, METHODID_LONG_GREET)))
          .addMethod(
            getGreetEveryoneMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.rajni.grpc.greeting.GreetEveryOneRequest,
                com.rajni.grpc.greeting.GreetEveryOneResponse>(
                  this, METHODID_GREET_EVERYONE)))
          .addMethod(
            getGreetWithDeadlineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.rajni.grpc.greeting.GreetRequestWithDeadline,
                com.rajni.grpc.greeting.GreetResponseWithDeadline>(
                  this, METHODID_GREET_WITH_DEADLINE)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void greet(com.rajni.grpc.greeting.GreetRequest request,
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public void greetManyTimes(com.rajni.grpc.greeting.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetManyTimesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.LongGreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getLongGreetMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *BIDI Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetEveryOneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetEveryOneResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryoneMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *RPC call with deadline of 500 ms
     * </pre>
     */
    public void greetWithDeadline(com.rajni.grpc.greeting.GreetRequestWithDeadline request,
        io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetResponseWithDeadline> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetWithDeadlineMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.rajni.grpc.greeting.GreetResponse greet(com.rajni.grpc.greeting.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public java.util.Iterator<com.rajni.grpc.greeting.GreetManyTimesResponse> greetManyTimes(
        com.rajni.grpc.greeting.GreetManyTimesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGreetManyTimesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *RPC call with deadline of 500 ms
     * </pre>
     */
    public com.rajni.grpc.greeting.GreetResponseWithDeadline greetWithDeadline(com.rajni.grpc.greeting.GreetRequestWithDeadline request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetWithDeadlineMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rajni.grpc.greeting.GreetResponse> greet(
        com.rajni.grpc.greeting.GreetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *RPC call with deadline of 500 ms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rajni.grpc.greeting.GreetResponseWithDeadline> greetWithDeadline(
        com.rajni.grpc.greeting.GreetRequestWithDeadline request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetWithDeadlineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIMES = 1;
  private static final int METHODID_GREET_WITH_DEADLINE = 2;
  private static final int METHODID_LONG_GREET = 3;
  private static final int METHODID_GREET_EVERYONE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.rajni.grpc.greeting.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIMES:
          serviceImpl.greetManyTimes((com.rajni.grpc.greeting.GreetManyTimesRequest) request,
              (io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetManyTimesResponse>) responseObserver);
          break;
        case METHODID_GREET_WITH_DEADLINE:
          serviceImpl.greetWithDeadline((com.rajni.grpc.greeting.GreetRequestWithDeadline) request,
              (io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetResponseWithDeadline>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_GREET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longGreet(
              (io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.LongGreetResponse>) responseObserver);
        case METHODID_GREET_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryone(
              (io.grpc.stub.StreamObserver<com.rajni.grpc.greeting.GreetEveryOneResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rajni.grpc.greeting.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyTimesMethod())
              .addMethod(getLongGreetMethod())
              .addMethod(getGreetEveryoneMethod())
              .addMethod(getGreetWithDeadlineMethod())
              .build();
        }
      }
    }
    return result;
  }
}
