package gooseai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: dashboard.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DashboardServiceGrpc {

  private DashboardServiceGrpc() {}

  public static final String SERVICE_NAME = "gooseai.DashboardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest,
      gooseai.Dashboard.User> getGetMeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMe",
      requestType = gooseai.Dashboard.EmptyRequest.class,
      responseType = gooseai.Dashboard.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest,
      gooseai.Dashboard.User> getGetMeMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest, gooseai.Dashboard.User> getGetMeMethod;
    if ((getGetMeMethod = DashboardServiceGrpc.getGetMeMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getGetMeMethod = DashboardServiceGrpc.getGetMeMethod) == null) {
          DashboardServiceGrpc.getGetMeMethod = getGetMeMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.EmptyRequest, gooseai.Dashboard.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.User.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("GetMe"))
              .build();
        }
      }
    }
    return getGetMeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.GetOrganizationRequest,
      gooseai.Dashboard.Organization> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = gooseai.Dashboard.GetOrganizationRequest.class,
      responseType = gooseai.Dashboard.Organization.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.GetOrganizationRequest,
      gooseai.Dashboard.Organization> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.GetOrganizationRequest, gooseai.Dashboard.Organization> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = DashboardServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getGetOrganizationMethod = DashboardServiceGrpc.getGetOrganizationMethod) == null) {
          DashboardServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.GetOrganizationRequest, gooseai.Dashboard.Organization>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.Organization.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("GetOrganization"))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.GetMetricsRequest,
      gooseai.Dashboard.Metrics> getGetMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetrics",
      requestType = gooseai.Dashboard.GetMetricsRequest.class,
      responseType = gooseai.Dashboard.Metrics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.GetMetricsRequest,
      gooseai.Dashboard.Metrics> getGetMetricsMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.GetMetricsRequest, gooseai.Dashboard.Metrics> getGetMetricsMethod;
    if ((getGetMetricsMethod = DashboardServiceGrpc.getGetMetricsMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getGetMetricsMethod = DashboardServiceGrpc.getGetMetricsMethod) == null) {
          DashboardServiceGrpc.getGetMetricsMethod = getGetMetricsMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.GetMetricsRequest, gooseai.Dashboard.Metrics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.GetMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.Metrics.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("GetMetrics"))
              .build();
        }
      }
    }
    return getGetMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.APIKeyRequest,
      gooseai.Dashboard.APIKey> getCreateAPIKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAPIKey",
      requestType = gooseai.Dashboard.APIKeyRequest.class,
      responseType = gooseai.Dashboard.APIKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.APIKeyRequest,
      gooseai.Dashboard.APIKey> getCreateAPIKeyMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.APIKeyRequest, gooseai.Dashboard.APIKey> getCreateAPIKeyMethod;
    if ((getCreateAPIKeyMethod = DashboardServiceGrpc.getCreateAPIKeyMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getCreateAPIKeyMethod = DashboardServiceGrpc.getCreateAPIKeyMethod) == null) {
          DashboardServiceGrpc.getCreateAPIKeyMethod = getCreateAPIKeyMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.APIKeyRequest, gooseai.Dashboard.APIKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAPIKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.APIKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.APIKey.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("CreateAPIKey"))
              .build();
        }
      }
    }
    return getCreateAPIKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.APIKeyFindRequest,
      gooseai.Dashboard.APIKey> getDeleteAPIKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAPIKey",
      requestType = gooseai.Dashboard.APIKeyFindRequest.class,
      responseType = gooseai.Dashboard.APIKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.APIKeyFindRequest,
      gooseai.Dashboard.APIKey> getDeleteAPIKeyMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.APIKeyFindRequest, gooseai.Dashboard.APIKey> getDeleteAPIKeyMethod;
    if ((getDeleteAPIKeyMethod = DashboardServiceGrpc.getDeleteAPIKeyMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getDeleteAPIKeyMethod = DashboardServiceGrpc.getDeleteAPIKeyMethod) == null) {
          DashboardServiceGrpc.getDeleteAPIKeyMethod = getDeleteAPIKeyMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.APIKeyFindRequest, gooseai.Dashboard.APIKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAPIKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.APIKeyFindRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.APIKey.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("DeleteAPIKey"))
              .build();
        }
      }
    }
    return getDeleteAPIKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.UpdateDefaultOrganizationRequest,
      gooseai.Dashboard.User> getUpdateDefaultOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefaultOrganization",
      requestType = gooseai.Dashboard.UpdateDefaultOrganizationRequest.class,
      responseType = gooseai.Dashboard.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.UpdateDefaultOrganizationRequest,
      gooseai.Dashboard.User> getUpdateDefaultOrganizationMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.UpdateDefaultOrganizationRequest, gooseai.Dashboard.User> getUpdateDefaultOrganizationMethod;
    if ((getUpdateDefaultOrganizationMethod = DashboardServiceGrpc.getUpdateDefaultOrganizationMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getUpdateDefaultOrganizationMethod = DashboardServiceGrpc.getUpdateDefaultOrganizationMethod) == null) {
          DashboardServiceGrpc.getUpdateDefaultOrganizationMethod = getUpdateDefaultOrganizationMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.UpdateDefaultOrganizationRequest, gooseai.Dashboard.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefaultOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.UpdateDefaultOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.User.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("UpdateDefaultOrganization"))
              .build();
        }
      }
    }
    return getUpdateDefaultOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest,
      gooseai.Dashboard.ClientSettings> getGetClientSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientSettings",
      requestType = gooseai.Dashboard.EmptyRequest.class,
      responseType = gooseai.Dashboard.ClientSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest,
      gooseai.Dashboard.ClientSettings> getGetClientSettingsMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest, gooseai.Dashboard.ClientSettings> getGetClientSettingsMethod;
    if ((getGetClientSettingsMethod = DashboardServiceGrpc.getGetClientSettingsMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getGetClientSettingsMethod = DashboardServiceGrpc.getGetClientSettingsMethod) == null) {
          DashboardServiceGrpc.getGetClientSettingsMethod = getGetClientSettingsMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.EmptyRequest, gooseai.Dashboard.ClientSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClientSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.ClientSettings.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("GetClientSettings"))
              .build();
        }
      }
    }
    return getGetClientSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.ClientSettings,
      gooseai.Dashboard.ClientSettings> getSetClientSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetClientSettings",
      requestType = gooseai.Dashboard.ClientSettings.class,
      responseType = gooseai.Dashboard.ClientSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.ClientSettings,
      gooseai.Dashboard.ClientSettings> getSetClientSettingsMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.ClientSettings, gooseai.Dashboard.ClientSettings> getSetClientSettingsMethod;
    if ((getSetClientSettingsMethod = DashboardServiceGrpc.getSetClientSettingsMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getSetClientSettingsMethod = DashboardServiceGrpc.getSetClientSettingsMethod) == null) {
          DashboardServiceGrpc.getSetClientSettingsMethod = getSetClientSettingsMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.ClientSettings, gooseai.Dashboard.ClientSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetClientSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.ClientSettings.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.ClientSettings.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("SetClientSettings"))
              .build();
        }
      }
    }
    return getSetClientSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.UpdateUserInfoRequest,
      gooseai.Dashboard.User> getUpdateUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserInfo",
      requestType = gooseai.Dashboard.UpdateUserInfoRequest.class,
      responseType = gooseai.Dashboard.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.UpdateUserInfoRequest,
      gooseai.Dashboard.User> getUpdateUserInfoMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.UpdateUserInfoRequest, gooseai.Dashboard.User> getUpdateUserInfoMethod;
    if ((getUpdateUserInfoMethod = DashboardServiceGrpc.getUpdateUserInfoMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getUpdateUserInfoMethod = DashboardServiceGrpc.getUpdateUserInfoMethod) == null) {
          DashboardServiceGrpc.getUpdateUserInfoMethod = getUpdateUserInfoMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.UpdateUserInfoRequest, gooseai.Dashboard.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.UpdateUserInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.User.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("UpdateUserInfo"))
              .build();
        }
      }
    }
    return getUpdateUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest,
      gooseai.Dashboard.UserPasswordChangeTicket> getCreatePasswordChangeTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePasswordChangeTicket",
      requestType = gooseai.Dashboard.EmptyRequest.class,
      responseType = gooseai.Dashboard.UserPasswordChangeTicket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest,
      gooseai.Dashboard.UserPasswordChangeTicket> getCreatePasswordChangeTicketMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest, gooseai.Dashboard.UserPasswordChangeTicket> getCreatePasswordChangeTicketMethod;
    if ((getCreatePasswordChangeTicketMethod = DashboardServiceGrpc.getCreatePasswordChangeTicketMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getCreatePasswordChangeTicketMethod = DashboardServiceGrpc.getCreatePasswordChangeTicketMethod) == null) {
          DashboardServiceGrpc.getCreatePasswordChangeTicketMethod = getCreatePasswordChangeTicketMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.EmptyRequest, gooseai.Dashboard.UserPasswordChangeTicket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePasswordChangeTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.UserPasswordChangeTicket.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("CreatePasswordChangeTicket"))
              .build();
        }
      }
    }
    return getCreatePasswordChangeTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest,
      gooseai.Dashboard.User> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = gooseai.Dashboard.EmptyRequest.class,
      responseType = gooseai.Dashboard.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest,
      gooseai.Dashboard.User> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.EmptyRequest, gooseai.Dashboard.User> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = DashboardServiceGrpc.getDeleteAccountMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getDeleteAccountMethod = DashboardServiceGrpc.getDeleteAccountMethod) == null) {
          DashboardServiceGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.EmptyRequest, gooseai.Dashboard.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.User.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("DeleteAccount"))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.CreateChargeRequest,
      gooseai.Dashboard.Charge> getCreateChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCharge",
      requestType = gooseai.Dashboard.CreateChargeRequest.class,
      responseType = gooseai.Dashboard.Charge.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.CreateChargeRequest,
      gooseai.Dashboard.Charge> getCreateChargeMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.CreateChargeRequest, gooseai.Dashboard.Charge> getCreateChargeMethod;
    if ((getCreateChargeMethod = DashboardServiceGrpc.getCreateChargeMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getCreateChargeMethod = DashboardServiceGrpc.getCreateChargeMethod) == null) {
          DashboardServiceGrpc.getCreateChargeMethod = getCreateChargeMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.CreateChargeRequest, gooseai.Dashboard.Charge>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.CreateChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.Charge.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("CreateCharge"))
              .build();
        }
      }
    }
    return getCreateChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.GetChargesRequest,
      gooseai.Dashboard.Charges> getGetChargesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCharges",
      requestType = gooseai.Dashboard.GetChargesRequest.class,
      responseType = gooseai.Dashboard.Charges.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.GetChargesRequest,
      gooseai.Dashboard.Charges> getGetChargesMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.GetChargesRequest, gooseai.Dashboard.Charges> getGetChargesMethod;
    if ((getGetChargesMethod = DashboardServiceGrpc.getGetChargesMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getGetChargesMethod = DashboardServiceGrpc.getGetChargesMethod) == null) {
          DashboardServiceGrpc.getGetChargesMethod = getGetChargesMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.GetChargesRequest, gooseai.Dashboard.Charges>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCharges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.GetChargesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.Charges.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("GetCharges"))
              .build();
        }
      }
    }
    return getGetChargesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.CreateAutoChargeIntentRequest,
      gooseai.Dashboard.AutoChargeIntent> getCreateAutoChargeIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAutoChargeIntent",
      requestType = gooseai.Dashboard.CreateAutoChargeIntentRequest.class,
      responseType = gooseai.Dashboard.AutoChargeIntent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.CreateAutoChargeIntentRequest,
      gooseai.Dashboard.AutoChargeIntent> getCreateAutoChargeIntentMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.CreateAutoChargeIntentRequest, gooseai.Dashboard.AutoChargeIntent> getCreateAutoChargeIntentMethod;
    if ((getCreateAutoChargeIntentMethod = DashboardServiceGrpc.getCreateAutoChargeIntentMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getCreateAutoChargeIntentMethod = DashboardServiceGrpc.getCreateAutoChargeIntentMethod) == null) {
          DashboardServiceGrpc.getCreateAutoChargeIntentMethod = getCreateAutoChargeIntentMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.CreateAutoChargeIntentRequest, gooseai.Dashboard.AutoChargeIntent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAutoChargeIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.CreateAutoChargeIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.AutoChargeIntent.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("CreateAutoChargeIntent"))
              .build();
        }
      }
    }
    return getCreateAutoChargeIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.CreateAutoChargeIntentRequest,
      gooseai.Dashboard.AutoChargeIntent> getUpdateAutoChargeIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAutoChargeIntent",
      requestType = gooseai.Dashboard.CreateAutoChargeIntentRequest.class,
      responseType = gooseai.Dashboard.AutoChargeIntent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.CreateAutoChargeIntentRequest,
      gooseai.Dashboard.AutoChargeIntent> getUpdateAutoChargeIntentMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.CreateAutoChargeIntentRequest, gooseai.Dashboard.AutoChargeIntent> getUpdateAutoChargeIntentMethod;
    if ((getUpdateAutoChargeIntentMethod = DashboardServiceGrpc.getUpdateAutoChargeIntentMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getUpdateAutoChargeIntentMethod = DashboardServiceGrpc.getUpdateAutoChargeIntentMethod) == null) {
          DashboardServiceGrpc.getUpdateAutoChargeIntentMethod = getUpdateAutoChargeIntentMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.CreateAutoChargeIntentRequest, gooseai.Dashboard.AutoChargeIntent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAutoChargeIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.CreateAutoChargeIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.AutoChargeIntent.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("UpdateAutoChargeIntent"))
              .build();
        }
      }
    }
    return getUpdateAutoChargeIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gooseai.Dashboard.GetAutoChargeRequest,
      gooseai.Dashboard.AutoChargeIntent> getGetAutoChargeIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAutoChargeIntent",
      requestType = gooseai.Dashboard.GetAutoChargeRequest.class,
      responseType = gooseai.Dashboard.AutoChargeIntent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gooseai.Dashboard.GetAutoChargeRequest,
      gooseai.Dashboard.AutoChargeIntent> getGetAutoChargeIntentMethod() {
    io.grpc.MethodDescriptor<gooseai.Dashboard.GetAutoChargeRequest, gooseai.Dashboard.AutoChargeIntent> getGetAutoChargeIntentMethod;
    if ((getGetAutoChargeIntentMethod = DashboardServiceGrpc.getGetAutoChargeIntentMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getGetAutoChargeIntentMethod = DashboardServiceGrpc.getGetAutoChargeIntentMethod) == null) {
          DashboardServiceGrpc.getGetAutoChargeIntentMethod = getGetAutoChargeIntentMethod =
              io.grpc.MethodDescriptor.<gooseai.Dashboard.GetAutoChargeRequest, gooseai.Dashboard.AutoChargeIntent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAutoChargeIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.GetAutoChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gooseai.Dashboard.AutoChargeIntent.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("GetAutoChargeIntent"))
              .build();
        }
      }
    }
    return getGetAutoChargeIntentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DashboardServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DashboardServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DashboardServiceStub>() {
        @java.lang.Override
        public DashboardServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DashboardServiceStub(channel, callOptions);
        }
      };
    return DashboardServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DashboardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DashboardServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DashboardServiceBlockingStub>() {
        @java.lang.Override
        public DashboardServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DashboardServiceBlockingStub(channel, callOptions);
        }
      };
    return DashboardServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DashboardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DashboardServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DashboardServiceFutureStub>() {
        @java.lang.Override
        public DashboardServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DashboardServiceFutureStub(channel, callOptions);
        }
      };
    return DashboardServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DashboardServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get info
     * </pre>
     */
    public void getMe(gooseai.Dashboard.EmptyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMeMethod(), responseObserver);
    }

    /**
     */
    public void getOrganization(gooseai.Dashboard.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.Organization> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void getMetrics(gooseai.Dashboard.GetMetricsRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.Metrics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * API key management
     * </pre>
     */
    public void createAPIKey(gooseai.Dashboard.APIKeyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.APIKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAPIKeyMethod(), responseObserver);
    }

    /**
     */
    public void deleteAPIKey(gooseai.Dashboard.APIKeyFindRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.APIKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAPIKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * User settings
     * </pre>
     */
    public void updateDefaultOrganization(gooseai.Dashboard.UpdateDefaultOrganizationRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void getClientSettings(gooseai.Dashboard.EmptyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.ClientSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientSettingsMethod(), responseObserver);
    }

    /**
     */
    public void setClientSettings(gooseai.Dashboard.ClientSettings request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.ClientSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetClientSettingsMethod(), responseObserver);
    }

    /**
     */
    public void updateUserInfo(gooseai.Dashboard.UpdateUserInfoRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserInfoMethod(), responseObserver);
    }

    /**
     */
    public void createPasswordChangeTicket(gooseai.Dashboard.EmptyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.UserPasswordChangeTicket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePasswordChangeTicketMethod(), responseObserver);
    }

    /**
     */
    public void deleteAccount(gooseai.Dashboard.EmptyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Payment functions
     * </pre>
     */
    public void createCharge(gooseai.Dashboard.CreateChargeRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.Charge> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateChargeMethod(), responseObserver);
    }

    /**
     */
    public void getCharges(gooseai.Dashboard.GetChargesRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.Charges> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChargesMethod(), responseObserver);
    }

    /**
     */
    public void createAutoChargeIntent(gooseai.Dashboard.CreateAutoChargeIntentRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAutoChargeIntentMethod(), responseObserver);
    }

    /**
     */
    public void updateAutoChargeIntent(gooseai.Dashboard.CreateAutoChargeIntentRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAutoChargeIntentMethod(), responseObserver);
    }

    /**
     */
    public void getAutoChargeIntent(gooseai.Dashboard.GetAutoChargeRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAutoChargeIntentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.EmptyRequest,
                gooseai.Dashboard.User>(
                  this, METHODID_GET_ME)))
          .addMethod(
            getGetOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.GetOrganizationRequest,
                gooseai.Dashboard.Organization>(
                  this, METHODID_GET_ORGANIZATION)))
          .addMethod(
            getGetMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.GetMetricsRequest,
                gooseai.Dashboard.Metrics>(
                  this, METHODID_GET_METRICS)))
          .addMethod(
            getCreateAPIKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.APIKeyRequest,
                gooseai.Dashboard.APIKey>(
                  this, METHODID_CREATE_APIKEY)))
          .addMethod(
            getDeleteAPIKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.APIKeyFindRequest,
                gooseai.Dashboard.APIKey>(
                  this, METHODID_DELETE_APIKEY)))
          .addMethod(
            getUpdateDefaultOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.UpdateDefaultOrganizationRequest,
                gooseai.Dashboard.User>(
                  this, METHODID_UPDATE_DEFAULT_ORGANIZATION)))
          .addMethod(
            getGetClientSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.EmptyRequest,
                gooseai.Dashboard.ClientSettings>(
                  this, METHODID_GET_CLIENT_SETTINGS)))
          .addMethod(
            getSetClientSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.ClientSettings,
                gooseai.Dashboard.ClientSettings>(
                  this, METHODID_SET_CLIENT_SETTINGS)))
          .addMethod(
            getUpdateUserInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.UpdateUserInfoRequest,
                gooseai.Dashboard.User>(
                  this, METHODID_UPDATE_USER_INFO)))
          .addMethod(
            getCreatePasswordChangeTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.EmptyRequest,
                gooseai.Dashboard.UserPasswordChangeTicket>(
                  this, METHODID_CREATE_PASSWORD_CHANGE_TICKET)))
          .addMethod(
            getDeleteAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.EmptyRequest,
                gooseai.Dashboard.User>(
                  this, METHODID_DELETE_ACCOUNT)))
          .addMethod(
            getCreateChargeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.CreateChargeRequest,
                gooseai.Dashboard.Charge>(
                  this, METHODID_CREATE_CHARGE)))
          .addMethod(
            getGetChargesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.GetChargesRequest,
                gooseai.Dashboard.Charges>(
                  this, METHODID_GET_CHARGES)))
          .addMethod(
            getCreateAutoChargeIntentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.CreateAutoChargeIntentRequest,
                gooseai.Dashboard.AutoChargeIntent>(
                  this, METHODID_CREATE_AUTO_CHARGE_INTENT)))
          .addMethod(
            getUpdateAutoChargeIntentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.CreateAutoChargeIntentRequest,
                gooseai.Dashboard.AutoChargeIntent>(
                  this, METHODID_UPDATE_AUTO_CHARGE_INTENT)))
          .addMethod(
            getGetAutoChargeIntentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gooseai.Dashboard.GetAutoChargeRequest,
                gooseai.Dashboard.AutoChargeIntent>(
                  this, METHODID_GET_AUTO_CHARGE_INTENT)))
          .build();
    }
  }

  /**
   */
  public static final class DashboardServiceStub extends io.grpc.stub.AbstractAsyncStub<DashboardServiceStub> {
    private DashboardServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DashboardServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get info
     * </pre>
     */
    public void getMe(gooseai.Dashboard.EmptyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganization(gooseai.Dashboard.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.Organization> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetrics(gooseai.Dashboard.GetMetricsRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.Metrics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * API key management
     * </pre>
     */
    public void createAPIKey(gooseai.Dashboard.APIKeyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.APIKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAPIKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAPIKey(gooseai.Dashboard.APIKeyFindRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.APIKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAPIKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * User settings
     * </pre>
     */
    public void updateDefaultOrganization(gooseai.Dashboard.UpdateDefaultOrganizationRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientSettings(gooseai.Dashboard.EmptyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.ClientSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setClientSettings(gooseai.Dashboard.ClientSettings request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.ClientSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetClientSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserInfo(gooseai.Dashboard.UpdateUserInfoRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPasswordChangeTicket(gooseai.Dashboard.EmptyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.UserPasswordChangeTicket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePasswordChangeTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(gooseai.Dashboard.EmptyRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Payment functions
     * </pre>
     */
    public void createCharge(gooseai.Dashboard.CreateChargeRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.Charge> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCharges(gooseai.Dashboard.GetChargesRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.Charges> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChargesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAutoChargeIntent(gooseai.Dashboard.CreateAutoChargeIntentRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAutoChargeIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAutoChargeIntent(gooseai.Dashboard.CreateAutoChargeIntentRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAutoChargeIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAutoChargeIntent(gooseai.Dashboard.GetAutoChargeRequest request,
        io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAutoChargeIntentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DashboardServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DashboardServiceBlockingStub> {
    private DashboardServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DashboardServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get info
     * </pre>
     */
    public gooseai.Dashboard.User getMe(gooseai.Dashboard.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMeMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.Organization getOrganization(gooseai.Dashboard.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.Metrics getMetrics(gooseai.Dashboard.GetMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * API key management
     * </pre>
     */
    public gooseai.Dashboard.APIKey createAPIKey(gooseai.Dashboard.APIKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAPIKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.APIKey deleteAPIKey(gooseai.Dashboard.APIKeyFindRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAPIKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * User settings
     * </pre>
     */
    public gooseai.Dashboard.User updateDefaultOrganization(gooseai.Dashboard.UpdateDefaultOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.ClientSettings getClientSettings(gooseai.Dashboard.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.ClientSettings setClientSettings(gooseai.Dashboard.ClientSettings request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetClientSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.User updateUserInfo(gooseai.Dashboard.UpdateUserInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.UserPasswordChangeTicket createPasswordChangeTicket(gooseai.Dashboard.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePasswordChangeTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.User deleteAccount(gooseai.Dashboard.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Payment functions
     * </pre>
     */
    public gooseai.Dashboard.Charge createCharge(gooseai.Dashboard.CreateChargeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateChargeMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.Charges getCharges(gooseai.Dashboard.GetChargesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChargesMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.AutoChargeIntent createAutoChargeIntent(gooseai.Dashboard.CreateAutoChargeIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAutoChargeIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.AutoChargeIntent updateAutoChargeIntent(gooseai.Dashboard.CreateAutoChargeIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAutoChargeIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public gooseai.Dashboard.AutoChargeIntent getAutoChargeIntent(gooseai.Dashboard.GetAutoChargeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAutoChargeIntentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DashboardServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DashboardServiceFutureStub> {
    private DashboardServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DashboardServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.User> getMe(
        gooseai.Dashboard.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.Organization> getOrganization(
        gooseai.Dashboard.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.Metrics> getMetrics(
        gooseai.Dashboard.GetMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * API key management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.APIKey> createAPIKey(
        gooseai.Dashboard.APIKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAPIKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.APIKey> deleteAPIKey(
        gooseai.Dashboard.APIKeyFindRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAPIKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * User settings
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.User> updateDefaultOrganization(
        gooseai.Dashboard.UpdateDefaultOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.ClientSettings> getClientSettings(
        gooseai.Dashboard.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.ClientSettings> setClientSettings(
        gooseai.Dashboard.ClientSettings request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetClientSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.User> updateUserInfo(
        gooseai.Dashboard.UpdateUserInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.UserPasswordChangeTicket> createPasswordChangeTicket(
        gooseai.Dashboard.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePasswordChangeTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.User> deleteAccount(
        gooseai.Dashboard.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Payment functions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.Charge> createCharge(
        gooseai.Dashboard.CreateChargeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateChargeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.Charges> getCharges(
        gooseai.Dashboard.GetChargesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChargesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.AutoChargeIntent> createAutoChargeIntent(
        gooseai.Dashboard.CreateAutoChargeIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAutoChargeIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.AutoChargeIntent> updateAutoChargeIntent(
        gooseai.Dashboard.CreateAutoChargeIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAutoChargeIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gooseai.Dashboard.AutoChargeIntent> getAutoChargeIntent(
        gooseai.Dashboard.GetAutoChargeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAutoChargeIntentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ME = 0;
  private static final int METHODID_GET_ORGANIZATION = 1;
  private static final int METHODID_GET_METRICS = 2;
  private static final int METHODID_CREATE_APIKEY = 3;
  private static final int METHODID_DELETE_APIKEY = 4;
  private static final int METHODID_UPDATE_DEFAULT_ORGANIZATION = 5;
  private static final int METHODID_GET_CLIENT_SETTINGS = 6;
  private static final int METHODID_SET_CLIENT_SETTINGS = 7;
  private static final int METHODID_UPDATE_USER_INFO = 8;
  private static final int METHODID_CREATE_PASSWORD_CHANGE_TICKET = 9;
  private static final int METHODID_DELETE_ACCOUNT = 10;
  private static final int METHODID_CREATE_CHARGE = 11;
  private static final int METHODID_GET_CHARGES = 12;
  private static final int METHODID_CREATE_AUTO_CHARGE_INTENT = 13;
  private static final int METHODID_UPDATE_AUTO_CHARGE_INTENT = 14;
  private static final int METHODID_GET_AUTO_CHARGE_INTENT = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DashboardServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DashboardServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ME:
          serviceImpl.getMe((gooseai.Dashboard.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.User>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((gooseai.Dashboard.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.Organization>) responseObserver);
          break;
        case METHODID_GET_METRICS:
          serviceImpl.getMetrics((gooseai.Dashboard.GetMetricsRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.Metrics>) responseObserver);
          break;
        case METHODID_CREATE_APIKEY:
          serviceImpl.createAPIKey((gooseai.Dashboard.APIKeyRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.APIKey>) responseObserver);
          break;
        case METHODID_DELETE_APIKEY:
          serviceImpl.deleteAPIKey((gooseai.Dashboard.APIKeyFindRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.APIKey>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_ORGANIZATION:
          serviceImpl.updateDefaultOrganization((gooseai.Dashboard.UpdateDefaultOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.User>) responseObserver);
          break;
        case METHODID_GET_CLIENT_SETTINGS:
          serviceImpl.getClientSettings((gooseai.Dashboard.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.ClientSettings>) responseObserver);
          break;
        case METHODID_SET_CLIENT_SETTINGS:
          serviceImpl.setClientSettings((gooseai.Dashboard.ClientSettings) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.ClientSettings>) responseObserver);
          break;
        case METHODID_UPDATE_USER_INFO:
          serviceImpl.updateUserInfo((gooseai.Dashboard.UpdateUserInfoRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.User>) responseObserver);
          break;
        case METHODID_CREATE_PASSWORD_CHANGE_TICKET:
          serviceImpl.createPasswordChangeTicket((gooseai.Dashboard.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.UserPasswordChangeTicket>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((gooseai.Dashboard.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.User>) responseObserver);
          break;
        case METHODID_CREATE_CHARGE:
          serviceImpl.createCharge((gooseai.Dashboard.CreateChargeRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.Charge>) responseObserver);
          break;
        case METHODID_GET_CHARGES:
          serviceImpl.getCharges((gooseai.Dashboard.GetChargesRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.Charges>) responseObserver);
          break;
        case METHODID_CREATE_AUTO_CHARGE_INTENT:
          serviceImpl.createAutoChargeIntent((gooseai.Dashboard.CreateAutoChargeIntentRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent>) responseObserver);
          break;
        case METHODID_UPDATE_AUTO_CHARGE_INTENT:
          serviceImpl.updateAutoChargeIntent((gooseai.Dashboard.CreateAutoChargeIntentRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent>) responseObserver);
          break;
        case METHODID_GET_AUTO_CHARGE_INTENT:
          serviceImpl.getAutoChargeIntent((gooseai.Dashboard.GetAutoChargeRequest) request,
              (io.grpc.stub.StreamObserver<gooseai.Dashboard.AutoChargeIntent>) responseObserver);
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

  private static abstract class DashboardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DashboardServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gooseai.Dashboard.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DashboardService");
    }
  }

  private static final class DashboardServiceFileDescriptorSupplier
      extends DashboardServiceBaseDescriptorSupplier {
    DashboardServiceFileDescriptorSupplier() {}
  }

  private static final class DashboardServiceMethodDescriptorSupplier
      extends DashboardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DashboardServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DashboardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DashboardServiceFileDescriptorSupplier())
              .addMethod(getGetMeMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getGetMetricsMethod())
              .addMethod(getCreateAPIKeyMethod())
              .addMethod(getDeleteAPIKeyMethod())
              .addMethod(getUpdateDefaultOrganizationMethod())
              .addMethod(getGetClientSettingsMethod())
              .addMethod(getSetClientSettingsMethod())
              .addMethod(getUpdateUserInfoMethod())
              .addMethod(getCreatePasswordChangeTicketMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getCreateChargeMethod())
              .addMethod(getGetChargesMethod())
              .addMethod(getCreateAutoChargeIntentMethod())
              .addMethod(getUpdateAutoChargeIntentMethod())
              .addMethod(getGetAutoChargeIntentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
