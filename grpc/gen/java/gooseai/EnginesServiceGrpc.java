package gooseai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: engines.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnginesServiceGrpc {

  private EnginesServiceGrpc() {}

  public static final String SERVICE_NAME = "gooseai.EnginesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gooseai.EnginesOuterClass.ListEnginesRequest,
      gooseai.EnginesOuterClass.Engines> getListEnginesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEngines",
      requestType = gooseai.EnginesOuterClass.ListEnginesRequest.class,
      responseType = gooseai.EnginesOuterClass.Engines.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.EnginesOuterClass.ListEnginesRequest,
      gooseai.EnginesOuterClass.Engines> getListEnginesMethod() {
    io.grpc.MethodDescriptor<gooseai.EnginesOuterClass.ListEnginesRequest, gooseai.EnginesOuterClass.Engines> getListEnginesMethod;
    if ((getListEnginesMethod = EnginesServiceGrpc.getListEnginesMethod) == null) {
      synchronized (EnginesServiceGrpc.class) {
        if ((getListEnginesMethod = EnginesServiceGrpc.getListEnginesMethod) == null) {
          EnginesServiceGrpc.getListEnginesMethod = getListEnginesMethod =
              io.grpc.MethodDescriptor.<gooseai.EnginesOuterClass.ListEnginesRequest, gooseai.EnginesOuterClass.Engines>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEngines"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.EnginesOuterClass.ListEnginesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.EnginesOuterClass.Engines.getDefaultInstance()))
              .setSchemaDescriptor(new EnginesServiceMethodDescriptorSupplier("ListEngines"))
              .build();
        }
      }
    }
    return getListEnginesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnginesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnginesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnginesServiceStub>() {
        @java.lang.Override
        public EnginesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnginesServiceStub(channel, callOptions);
        }
      };
    return EnginesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnginesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnginesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnginesServiceBlockingStub>() {
        @java.lang.Override
        public EnginesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnginesServiceBlockingStub(channel, callOptions);
        }
      };
    return EnginesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnginesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnginesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnginesServiceFutureStub>() {
        @java.lang.Override
        public EnginesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnginesServiceFutureStub(channel, callOptions);
        }
      };
    return EnginesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EnginesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listEngines(gooseai.EnginesOuterClass.ListEnginesRequest request,
        io.grpc.stub.StreamObserver<gooseai.EnginesOuterClass.Engines> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEnginesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListEnginesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.EnginesOuterClass.ListEnginesRequest,
                gooseai.EnginesOuterClass.Engines>(
                  this, METHODID_LIST_ENGINES)))
          .build();
    }
  }

  /**
   */
  public static final class EnginesServiceStub extends io.grpc.stub.AbstractAsyncStub<EnginesServiceStub> {
    private EnginesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnginesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnginesServiceStub(channel, callOptions);
    }

    /**
     */
    public void listEngines(gooseai.EnginesOuterClass.ListEnginesRequest request,
        io.grpc.stub.StreamObserver<gooseai.EnginesOuterClass.Engines> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEnginesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EnginesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnginesServiceBlockingStub> {
    private EnginesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnginesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnginesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public gooseai.EnginesOuterClass.Engines listEngines(gooseai.EnginesOuterClass.ListEnginesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEnginesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EnginesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnginesServiceFutureStub> {
    private EnginesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnginesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnginesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.EnginesOuterClass.Engines> listEngines(
        gooseai.EnginesOuterClass.ListEnginesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEnginesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ENGINES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnginesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnginesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ENGINES:
          serviceImpl.listEngines((gooseai.EnginesOuterClass.ListEnginesRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.EnginesOuterClass.Engines>) responseObserver);
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

  private static abstract class EnginesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnginesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gooseai.EnginesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnginesService");
    }
  }

  private static final class EnginesServiceFileDescriptorSupplier
      extends EnginesServiceBaseDescriptorSupplier {
    EnginesServiceFileDescriptorSupplier() {}
  }

  private static final class EnginesServiceMethodDescriptorSupplier
      extends EnginesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnginesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnginesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnginesServiceFileDescriptorSupplier())
              .addMethod(getListEnginesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
