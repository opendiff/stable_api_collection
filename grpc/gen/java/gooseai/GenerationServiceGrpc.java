package gooseai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * gRPC services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: generation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GenerationServiceGrpc {

  private GenerationServiceGrpc() {}

  public static final String SERVICE_NAME = "gooseai.GenerationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gooseai.Generation.Request,
      gooseai.Generation.Answer> getGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Generate",
      requestType = gooseai.Generation.Request.class,
      responseType = gooseai.Generation.Answer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<gooseai.Generation.Request,
      gooseai.Generation.Answer> getGenerateMethod() {
    io.grpc.MethodDescriptor<gooseai.Generation.Request, gooseai.Generation.Answer> getGenerateMethod;
    if ((getGenerateMethod = GenerationServiceGrpc.getGenerateMethod) == null) {
      synchronized (GenerationServiceGrpc.class) {
        if ((getGenerateMethod = GenerationServiceGrpc.getGenerateMethod) == null) {
          GenerationServiceGrpc.getGenerateMethod = getGenerateMethod =
              io.grpc.MethodDescriptor.<gooseai.Generation.Request, gooseai.Generation.Answer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Generate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Generation.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Generation.Answer.getDefaultInstance()))
              .setSchemaDescriptor(new GenerationServiceMethodDescriptorSupplier("Generate"))
              .build();
        }
      }
    }
    return getGenerateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Generation.ChainRequest,
      gooseai.Generation.Answer> getChainGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainGenerate",
      requestType = gooseai.Generation.ChainRequest.class,
      responseType = gooseai.Generation.Answer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<gooseai.Generation.ChainRequest,
      gooseai.Generation.Answer> getChainGenerateMethod() {
    io.grpc.MethodDescriptor<gooseai.Generation.ChainRequest, gooseai.Generation.Answer> getChainGenerateMethod;
    if ((getChainGenerateMethod = GenerationServiceGrpc.getChainGenerateMethod) == null) {
      synchronized (GenerationServiceGrpc.class) {
        if ((getChainGenerateMethod = GenerationServiceGrpc.getChainGenerateMethod) == null) {
          GenerationServiceGrpc.getChainGenerateMethod = getChainGenerateMethod =
              io.grpc.MethodDescriptor.<gooseai.Generation.ChainRequest, gooseai.Generation.Answer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainGenerate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Generation.ChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Generation.Answer.getDefaultInstance()))
              .setSchemaDescriptor(new GenerationServiceMethodDescriptorSupplier("ChainGenerate"))
              .build();
        }
      }
    }
    return getChainGenerateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GenerationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenerationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenerationServiceStub>() {
        @java.lang.Override
        public GenerationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenerationServiceStub(channel, callOptions);
        }
      };
    return GenerationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GenerationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenerationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenerationServiceBlockingStub>() {
        @java.lang.Override
        public GenerationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenerationServiceBlockingStub(channel, callOptions);
        }
      };
    return GenerationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GenerationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenerationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenerationServiceFutureStub>() {
        @java.lang.Override
        public GenerationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenerationServiceFutureStub(channel, callOptions);
        }
      };
    return GenerationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * gRPC services
   * </pre>
   */
  public static abstract class GenerationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generate(gooseai.Generation.Request request,
        io.grpc.stub.StreamObserver<gooseai.Generation.Answer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateMethod(), responseObserver);
    }

    /**
     */
    public void chainGenerate(gooseai.Generation.ChainRequest request,
        io.grpc.stub.StreamObserver<gooseai.Generation.Answer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainGenerateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                gooseai.Generation.Request,
                gooseai.Generation.Answer>(
                  this, METHODID_GENERATE)))
          .addMethod(
            getChainGenerateMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                gooseai.Generation.ChainRequest,
                gooseai.Generation.Answer>(
                  this, METHODID_CHAIN_GENERATE)))
          .build();
    }
  }

  /**
   * <pre>
   * gRPC services
   * </pre>
   */
  public static final class GenerationServiceStub extends io.grpc.stub.AbstractAsyncStub<GenerationServiceStub> {
    private GenerationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenerationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenerationServiceStub(channel, callOptions);
    }

    /**
     */
    public void generate(gooseai.Generation.Request request,
        io.grpc.stub.StreamObserver<gooseai.Generation.Answer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void chainGenerate(gooseai.Generation.ChainRequest request,
        io.grpc.stub.StreamObserver<gooseai.Generation.Answer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getChainGenerateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * gRPC services
   * </pre>
   */
  public static final class GenerationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GenerationServiceBlockingStub> {
    private GenerationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenerationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenerationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<gooseai.Generation.Answer> generate(
        gooseai.Generation.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<gooseai.Generation.Answer> chainGenerate(
        gooseai.Generation.ChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getChainGenerateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * gRPC services
   * </pre>
   */
  public static final class GenerationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GenerationServiceFutureStub> {
    private GenerationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenerationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenerationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GENERATE = 0;
  private static final int METHODID_CHAIN_GENERATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GenerationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GenerationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE:
          serviceImpl.generate((gooseai.Generation.Request) request,
              (io.grpc.stub.StreamObserver<gooseai.Generation.Answer>) responseObserver);
          break;
        case METHODID_CHAIN_GENERATE:
          serviceImpl.chainGenerate((gooseai.Generation.ChainRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Generation.Answer>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GenerationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GenerationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gooseai.Generation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GenerationService");
    }
  }

  private static final class GenerationServiceFileDescriptorSupplier
      extends GenerationServiceBaseDescriptorSupplier {
    GenerationServiceFileDescriptorSupplier() {}
  }

  private static final class GenerationServiceMethodDescriptorSupplier
      extends GenerationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GenerationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GenerationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GenerationServiceFileDescriptorSupplier())
              .addMethod(getGenerateMethod())
              .addMethod(getChainGenerateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
