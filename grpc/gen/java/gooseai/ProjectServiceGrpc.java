package gooseai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * gRPC services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: project.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final String SERVICE_NAME = "gooseai.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.CreateProjectRequest,
      gooseai.ProjectOuterClass.Project> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = gooseai.ProjectOuterClass.CreateProjectRequest.class,
      responseType = gooseai.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.CreateProjectRequest,
      gooseai.ProjectOuterClass.Project> getCreateMethod() {
    io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.CreateProjectRequest, gooseai.ProjectOuterClass.Project> getCreateMethod;
    if ((getCreateMethod = ProjectServiceGrpc.getCreateMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getCreateMethod = ProjectServiceGrpc.getCreateMethod) == null) {
          ProjectServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<gooseai.ProjectOuterClass.CreateProjectRequest, gooseai.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.UpdateProjectRequest,
      gooseai.ProjectOuterClass.Project> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = gooseai.ProjectOuterClass.UpdateProjectRequest.class,
      responseType = gooseai.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.UpdateProjectRequest,
      gooseai.ProjectOuterClass.Project> getUpdateMethod() {
    io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.UpdateProjectRequest, gooseai.ProjectOuterClass.Project> getUpdateMethod;
    if ((getUpdateMethod = ProjectServiceGrpc.getUpdateMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateMethod = ProjectServiceGrpc.getUpdateMethod) == null) {
          ProjectServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<gooseai.ProjectOuterClass.UpdateProjectRequest, gooseai.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.UpdateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.ListProjectRequest,
      gooseai.ProjectOuterClass.Project> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = gooseai.ProjectOuterClass.ListProjectRequest.class,
      responseType = gooseai.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.ListProjectRequest,
      gooseai.ProjectOuterClass.Project> getListMethod() {
    io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.ListProjectRequest, gooseai.ProjectOuterClass.Project> getListMethod;
    if ((getListMethod = ProjectServiceGrpc.getListMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getListMethod = ProjectServiceGrpc.getListMethod) == null) {
          ProjectServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<gooseai.ProjectOuterClass.ListProjectRequest, gooseai.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.ListProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.GetProjectRequest,
      gooseai.ProjectOuterClass.Project> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = gooseai.ProjectOuterClass.GetProjectRequest.class,
      responseType = gooseai.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.GetProjectRequest,
      gooseai.ProjectOuterClass.Project> getGetMethod() {
    io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.GetProjectRequest, gooseai.ProjectOuterClass.Project> getGetMethod;
    if ((getGetMethod = ProjectServiceGrpc.getGetMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetMethod = ProjectServiceGrpc.getGetMethod) == null) {
          ProjectServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<gooseai.ProjectOuterClass.GetProjectRequest, gooseai.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.DeleteProjectRequest,
      gooseai.ProjectOuterClass.Project> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = gooseai.ProjectOuterClass.DeleteProjectRequest.class,
      responseType = gooseai.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.DeleteProjectRequest,
      gooseai.ProjectOuterClass.Project> getDeleteMethod() {
    io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.DeleteProjectRequest, gooseai.ProjectOuterClass.Project> getDeleteMethod;
    if ((getDeleteMethod = ProjectServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDeleteMethod = ProjectServiceGrpc.getDeleteMethod) == null) {
          ProjectServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<gooseai.ProjectOuterClass.DeleteProjectRequest, gooseai.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.DeleteProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.QueryAssetsRequest,
      gooseai.ProjectOuterClass.QueryAssetsResponse> getQueryAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssets",
      requestType = gooseai.ProjectOuterClass.QueryAssetsRequest.class,
      responseType = gooseai.ProjectOuterClass.QueryAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.QueryAssetsRequest,
      gooseai.ProjectOuterClass.QueryAssetsResponse> getQueryAssetsMethod() {
    io.grpc.MethodDescriptor<gooseai.ProjectOuterClass.QueryAssetsRequest, gooseai.ProjectOuterClass.QueryAssetsResponse> getQueryAssetsMethod;
    if ((getQueryAssetsMethod = ProjectServiceGrpc.getQueryAssetsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getQueryAssetsMethod = ProjectServiceGrpc.getQueryAssetsMethod) == null) {
          ProjectServiceGrpc.getQueryAssetsMethod = getQueryAssetsMethod =
              io.grpc.MethodDescriptor.<gooseai.ProjectOuterClass.QueryAssetsRequest, gooseai.ProjectOuterClass.QueryAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.QueryAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.ProjectOuterClass.QueryAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("QueryAssets"))
              .build();
        }
      }
    }
    return getQueryAssetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub>() {
        @java.lang.Override
        public ProjectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceStub(channel, callOptions);
        }
      };
    return ProjectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub>() {
        @java.lang.Override
        public ProjectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceBlockingStub(channel, callOptions);
        }
      };
    return ProjectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub>() {
        @java.lang.Override
        public ProjectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceFutureStub(channel, callOptions);
        }
      };
    return ProjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * gRPC services
   * </pre>
   */
  public static abstract class ProjectServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a new project if it does not exist
     * </pre>
     */
    public void create(gooseai.ProjectOuterClass.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing project
     * </pre>
     */
    public void update(gooseai.ProjectOuterClass.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the projects for an organization
     * </pre>
     */
    public void list(gooseai.ProjectOuterClass.ListProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a project
     * </pre>
     */
    public void get(gooseai.ProjectOuterClass.GetProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a project
     * </pre>
     */
    public void delete(gooseai.ProjectOuterClass.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query the assets of a project, with additional filtering
     * </pre>
     */
    public void queryAssets(gooseai.ProjectOuterClass.QueryAssetsRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.QueryAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.ProjectOuterClass.CreateProjectRequest,
                gooseai.ProjectOuterClass.Project>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.ProjectOuterClass.UpdateProjectRequest,
                gooseai.ProjectOuterClass.Project>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                gooseai.ProjectOuterClass.ListProjectRequest,
                gooseai.ProjectOuterClass.Project>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.ProjectOuterClass.GetProjectRequest,
                gooseai.ProjectOuterClass.Project>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.ProjectOuterClass.DeleteProjectRequest,
                gooseai.ProjectOuterClass.Project>(
                  this, METHODID_DELETE)))
          .addMethod(
            getQueryAssetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.ProjectOuterClass.QueryAssetsRequest,
                gooseai.ProjectOuterClass.QueryAssetsResponse>(
                  this, METHODID_QUERY_ASSETS)))
          .build();
    }
  }

  /**
   * <pre>
   * gRPC services
   * </pre>
   */
  public static final class ProjectServiceStub extends io.grpc.stub.AbstractAsyncStub<ProjectServiceStub> {
    private ProjectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new project if it does not exist
     * </pre>
     */
    public void create(gooseai.ProjectOuterClass.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing project
     * </pre>
     */
    public void update(gooseai.ProjectOuterClass.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the projects for an organization
     * </pre>
     */
    public void list(gooseai.ProjectOuterClass.ListProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a project
     * </pre>
     */
    public void get(gooseai.ProjectOuterClass.GetProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a project
     * </pre>
     */
    public void delete(gooseai.ProjectOuterClass.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query the assets of a project, with additional filtering
     * </pre>
     */
    public void queryAssets(gooseai.ProjectOuterClass.QueryAssetsRequest request,
        io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.QueryAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * gRPC services
   * </pre>
   */
  public static final class ProjectServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new project if it does not exist
     * </pre>
     */
    public gooseai.ProjectOuterClass.Project create(gooseai.ProjectOuterClass.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing project
     * </pre>
     */
    public gooseai.ProjectOuterClass.Project update(gooseai.ProjectOuterClass.UpdateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the projects for an organization
     * </pre>
     */
    public java.util.Iterator<gooseai.ProjectOuterClass.Project> list(
        gooseai.ProjectOuterClass.ListProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a project
     * </pre>
     */
    public gooseai.ProjectOuterClass.Project get(gooseai.ProjectOuterClass.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a project
     * </pre>
     */
    public gooseai.ProjectOuterClass.Project delete(gooseai.ProjectOuterClass.DeleteProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query the assets of a project, with additional filtering
     * </pre>
     */
    public gooseai.ProjectOuterClass.QueryAssetsResponse queryAssets(gooseai.ProjectOuterClass.QueryAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * gRPC services
   * </pre>
   */
  public static final class ProjectServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new project if it does not exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.ProjectOuterClass.Project> create(
        gooseai.ProjectOuterClass.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.ProjectOuterClass.Project> update(
        gooseai.ProjectOuterClass.UpdateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.ProjectOuterClass.Project> get(
        gooseai.ProjectOuterClass.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.ProjectOuterClass.Project> delete(
        gooseai.ProjectOuterClass.DeleteProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query the assets of a project, with additional filtering
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.ProjectOuterClass.QueryAssetsResponse> queryAssets(
        gooseai.ProjectOuterClass.QueryAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_QUERY_ASSETS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((gooseai.ProjectOuterClass.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((gooseai.ProjectOuterClass.UpdateProjectRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((gooseai.ProjectOuterClass.ListProjectRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((gooseai.ProjectOuterClass.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((gooseai.ProjectOuterClass.DeleteProjectRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_QUERY_ASSETS:
          serviceImpl.queryAssets((gooseai.ProjectOuterClass.QueryAssetsRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.ProjectOuterClass.QueryAssetsResponse>) responseObserver);
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

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gooseai.ProjectOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getQueryAssetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
