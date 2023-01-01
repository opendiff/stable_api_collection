package gooseai

import gooseai.DashboardServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for gooseai.DashboardService.
 */
public object DashboardServiceGrpcKt {
  public const val SERVICE_NAME: String = DashboardServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = DashboardServiceGrpc.getServiceDescriptor()

  public val getMeMethod: MethodDescriptor<Dashboard.EmptyRequest, Dashboard.User>
    @JvmStatic
    get() = DashboardServiceGrpc.getGetMeMethod()

  public val getOrganizationMethod:
      MethodDescriptor<Dashboard.GetOrganizationRequest, Dashboard.Organization>
    @JvmStatic
    get() = DashboardServiceGrpc.getGetOrganizationMethod()

  public val getMetricsMethod: MethodDescriptor<Dashboard.GetMetricsRequest, Dashboard.Metrics>
    @JvmStatic
    get() = DashboardServiceGrpc.getGetMetricsMethod()

  public val createAPIKeyMethod: MethodDescriptor<Dashboard.APIKeyRequest, Dashboard.APIKey>
    @JvmStatic
    get() = DashboardServiceGrpc.getCreateAPIKeyMethod()

  public val deleteAPIKeyMethod: MethodDescriptor<Dashboard.APIKeyFindRequest, Dashboard.APIKey>
    @JvmStatic
    get() = DashboardServiceGrpc.getDeleteAPIKeyMethod()

  public val updateDefaultOrganizationMethod:
      MethodDescriptor<Dashboard.UpdateDefaultOrganizationRequest, Dashboard.User>
    @JvmStatic
    get() = DashboardServiceGrpc.getUpdateDefaultOrganizationMethod()

  public val getClientSettingsMethod:
      MethodDescriptor<Dashboard.EmptyRequest, Dashboard.ClientSettings>
    @JvmStatic
    get() = DashboardServiceGrpc.getGetClientSettingsMethod()

  public val setClientSettingsMethod:
      MethodDescriptor<Dashboard.ClientSettings, Dashboard.ClientSettings>
    @JvmStatic
    get() = DashboardServiceGrpc.getSetClientSettingsMethod()

  public val updateUserInfoMethod: MethodDescriptor<Dashboard.UpdateUserInfoRequest, Dashboard.User>
    @JvmStatic
    get() = DashboardServiceGrpc.getUpdateUserInfoMethod()

  public val createPasswordChangeTicketMethod:
      MethodDescriptor<Dashboard.EmptyRequest, Dashboard.UserPasswordChangeTicket>
    @JvmStatic
    get() = DashboardServiceGrpc.getCreatePasswordChangeTicketMethod()

  public val deleteAccountMethod: MethodDescriptor<Dashboard.EmptyRequest, Dashboard.User>
    @JvmStatic
    get() = DashboardServiceGrpc.getDeleteAccountMethod()

  public val createChargeMethod: MethodDescriptor<Dashboard.CreateChargeRequest, Dashboard.Charge>
    @JvmStatic
    get() = DashboardServiceGrpc.getCreateChargeMethod()

  public val getChargesMethod: MethodDescriptor<Dashboard.GetChargesRequest, Dashboard.Charges>
    @JvmStatic
    get() = DashboardServiceGrpc.getGetChargesMethod()

  public val createAutoChargeIntentMethod:
      MethodDescriptor<Dashboard.CreateAutoChargeIntentRequest, Dashboard.AutoChargeIntent>
    @JvmStatic
    get() = DashboardServiceGrpc.getCreateAutoChargeIntentMethod()

  public val updateAutoChargeIntentMethod:
      MethodDescriptor<Dashboard.CreateAutoChargeIntentRequest, Dashboard.AutoChargeIntent>
    @JvmStatic
    get() = DashboardServiceGrpc.getUpdateAutoChargeIntentMethod()

  public val getAutoChargeIntentMethod:
      MethodDescriptor<Dashboard.GetAutoChargeRequest, Dashboard.AutoChargeIntent>
    @JvmStatic
    get() = DashboardServiceGrpc.getGetAutoChargeIntentMethod()

  /**
   * A stub for issuing RPCs to a(n) gooseai.DashboardService service as suspending coroutines.
   */
  @StubFor(DashboardServiceGrpc::class)
  public class DashboardServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<DashboardServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        DashboardServiceCoroutineStub = DashboardServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getMe(request: Dashboard.EmptyRequest, headers: Metadata = Metadata()):
        Dashboard.User = unaryRpc(
      channel,
      DashboardServiceGrpc.getGetMeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getOrganization(request: Dashboard.GetOrganizationRequest, headers: Metadata
        = Metadata()): Dashboard.Organization = unaryRpc(
      channel,
      DashboardServiceGrpc.getGetOrganizationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getMetrics(request: Dashboard.GetMetricsRequest, headers: Metadata =
        Metadata()): Dashboard.Metrics = unaryRpc(
      channel,
      DashboardServiceGrpc.getGetMetricsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createAPIKey(request: Dashboard.APIKeyRequest, headers: Metadata =
        Metadata()): Dashboard.APIKey = unaryRpc(
      channel,
      DashboardServiceGrpc.getCreateAPIKeyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteAPIKey(request: Dashboard.APIKeyFindRequest, headers: Metadata =
        Metadata()): Dashboard.APIKey = unaryRpc(
      channel,
      DashboardServiceGrpc.getDeleteAPIKeyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend
        fun updateDefaultOrganization(request: Dashboard.UpdateDefaultOrganizationRequest,
        headers: Metadata = Metadata()): Dashboard.User = unaryRpc(
      channel,
      DashboardServiceGrpc.getUpdateDefaultOrganizationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getClientSettings(request: Dashboard.EmptyRequest, headers: Metadata =
        Metadata()): Dashboard.ClientSettings = unaryRpc(
      channel,
      DashboardServiceGrpc.getGetClientSettingsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun setClientSettings(request: Dashboard.ClientSettings, headers: Metadata =
        Metadata()): Dashboard.ClientSettings = unaryRpc(
      channel,
      DashboardServiceGrpc.getSetClientSettingsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateUserInfo(request: Dashboard.UpdateUserInfoRequest, headers: Metadata =
        Metadata()): Dashboard.User = unaryRpc(
      channel,
      DashboardServiceGrpc.getUpdateUserInfoMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createPasswordChangeTicket(request: Dashboard.EmptyRequest, headers: Metadata
        = Metadata()): Dashboard.UserPasswordChangeTicket = unaryRpc(
      channel,
      DashboardServiceGrpc.getCreatePasswordChangeTicketMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteAccount(request: Dashboard.EmptyRequest, headers: Metadata =
        Metadata()): Dashboard.User = unaryRpc(
      channel,
      DashboardServiceGrpc.getDeleteAccountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createCharge(request: Dashboard.CreateChargeRequest, headers: Metadata =
        Metadata()): Dashboard.Charge = unaryRpc(
      channel,
      DashboardServiceGrpc.getCreateChargeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getCharges(request: Dashboard.GetChargesRequest, headers: Metadata =
        Metadata()): Dashboard.Charges = unaryRpc(
      channel,
      DashboardServiceGrpc.getGetChargesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createAutoChargeIntent(request: Dashboard.CreateAutoChargeIntentRequest,
        headers: Metadata = Metadata()): Dashboard.AutoChargeIntent = unaryRpc(
      channel,
      DashboardServiceGrpc.getCreateAutoChargeIntentMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateAutoChargeIntent(request: Dashboard.CreateAutoChargeIntentRequest,
        headers: Metadata = Metadata()): Dashboard.AutoChargeIntent = unaryRpc(
      channel,
      DashboardServiceGrpc.getUpdateAutoChargeIntentMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getAutoChargeIntent(request: Dashboard.GetAutoChargeRequest,
        headers: Metadata = Metadata()): Dashboard.AutoChargeIntent = unaryRpc(
      channel,
      DashboardServiceGrpc.getGetAutoChargeIntentMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the gooseai.DashboardService service based on Kotlin coroutines.
   */
  public abstract class DashboardServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for gooseai.DashboardService.GetMe.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMe(request: Dashboard.EmptyRequest): Dashboard.User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.GetMe is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.GetOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getOrganization(request: Dashboard.GetOrganizationRequest):
        Dashboard.Organization = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.GetOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.GetMetrics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMetrics(request: Dashboard.GetMetricsRequest): Dashboard.Metrics =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.GetMetrics is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.CreateAPIKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createAPIKey(request: Dashboard.APIKeyRequest): Dashboard.APIKey = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.CreateAPIKey is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.DeleteAPIKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteAPIKey(request: Dashboard.APIKeyFindRequest): Dashboard.APIKey =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.DeleteAPIKey is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.UpdateDefaultOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun updateDefaultOrganization(request: Dashboard.UpdateDefaultOrganizationRequest):
        Dashboard.User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.UpdateDefaultOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.GetClientSettings.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getClientSettings(request: Dashboard.EmptyRequest):
        Dashboard.ClientSettings = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.GetClientSettings is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.SetClientSettings.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setClientSettings(request: Dashboard.ClientSettings):
        Dashboard.ClientSettings = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.SetClientSettings is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.UpdateUserInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateUserInfo(request: Dashboard.UpdateUserInfoRequest): Dashboard.User
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.UpdateUserInfo is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.CreatePasswordChangeTicket.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createPasswordChangeTicket(request: Dashboard.EmptyRequest):
        Dashboard.UserPasswordChangeTicket = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.CreatePasswordChangeTicket is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.DeleteAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteAccount(request: Dashboard.EmptyRequest): Dashboard.User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.DeleteAccount is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.CreateCharge.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createCharge(request: Dashboard.CreateChargeRequest): Dashboard.Charge =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.CreateCharge is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.GetCharges.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getCharges(request: Dashboard.GetChargesRequest): Dashboard.Charges =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.GetCharges is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.CreateAutoChargeIntent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun createAutoChargeIntent(request: Dashboard.CreateAutoChargeIntentRequest):
        Dashboard.AutoChargeIntent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.CreateAutoChargeIntent is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.UpdateAutoChargeIntent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun updateAutoChargeIntent(request: Dashboard.CreateAutoChargeIntentRequest):
        Dashboard.AutoChargeIntent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.UpdateAutoChargeIntent is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.DashboardService.GetAutoChargeIntent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAutoChargeIntent(request: Dashboard.GetAutoChargeRequest):
        Dashboard.AutoChargeIntent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.DashboardService.GetAutoChargeIntent is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getGetMeMethod(),
      implementation = ::getMe
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getGetOrganizationMethod(),
      implementation = ::getOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getGetMetricsMethod(),
      implementation = ::getMetrics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getCreateAPIKeyMethod(),
      implementation = ::createAPIKey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getDeleteAPIKeyMethod(),
      implementation = ::deleteAPIKey
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getUpdateDefaultOrganizationMethod(),
      implementation = ::updateDefaultOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getGetClientSettingsMethod(),
      implementation = ::getClientSettings
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getSetClientSettingsMethod(),
      implementation = ::setClientSettings
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getUpdateUserInfoMethod(),
      implementation = ::updateUserInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getCreatePasswordChangeTicketMethod(),
      implementation = ::createPasswordChangeTicket
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getDeleteAccountMethod(),
      implementation = ::deleteAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getCreateChargeMethod(),
      implementation = ::createCharge
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getGetChargesMethod(),
      implementation = ::getCharges
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getCreateAutoChargeIntentMethod(),
      implementation = ::createAutoChargeIntent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getUpdateAutoChargeIntentMethod(),
      implementation = ::updateAutoChargeIntent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DashboardServiceGrpc.getGetAutoChargeIntentMethod(),
      implementation = ::getAutoChargeIntent
    )).build()
  }
}
