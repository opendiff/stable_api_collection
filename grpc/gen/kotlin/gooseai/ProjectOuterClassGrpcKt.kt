package gooseai

import gooseai.ProjectServiceGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for gooseai.ProjectService.
 */
public object ProjectServiceGrpcKt {
  public const val SERVICE_NAME: String = ProjectServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = ProjectServiceGrpc.getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<ProjectOuterClass.CreateProjectRequest, ProjectOuterClass.Project>
    @JvmStatic
    get() = ProjectServiceGrpc.getCreateMethod()

  public val updateMethod:
      MethodDescriptor<ProjectOuterClass.UpdateProjectRequest, ProjectOuterClass.Project>
    @JvmStatic
    get() = ProjectServiceGrpc.getUpdateMethod()

  public val listMethod:
      MethodDescriptor<ProjectOuterClass.ListProjectRequest, ProjectOuterClass.Project>
    @JvmStatic
    get() = ProjectServiceGrpc.getListMethod()

  public val getMethod:
      MethodDescriptor<ProjectOuterClass.GetProjectRequest, ProjectOuterClass.Project>
    @JvmStatic
    get() = ProjectServiceGrpc.getGetMethod()

  public val deleteMethod:
      MethodDescriptor<ProjectOuterClass.DeleteProjectRequest, ProjectOuterClass.Project>
    @JvmStatic
    get() = ProjectServiceGrpc.getDeleteMethod()

  public val queryAssetsMethod:
      MethodDescriptor<ProjectOuterClass.QueryAssetsRequest, ProjectOuterClass.QueryAssetsResponse>
    @JvmStatic
    get() = ProjectServiceGrpc.getQueryAssetsMethod()

  /**
   * A stub for issuing RPCs to a(n) gooseai.ProjectService service as suspending coroutines.
   */
  @StubFor(ProjectServiceGrpc::class)
  public class ProjectServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ProjectServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        ProjectServiceCoroutineStub = ProjectServiceCoroutineStub(channel, callOptions)

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
    public suspend fun create(request: ProjectOuterClass.CreateProjectRequest, headers: Metadata =
        Metadata()): ProjectOuterClass.Project = unaryRpc(
      channel,
      ProjectServiceGrpc.getCreateMethod(),
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
    public suspend fun update(request: ProjectOuterClass.UpdateProjectRequest, headers: Metadata =
        Metadata()): ProjectOuterClass.Project = unaryRpc(
      channel,
      ProjectServiceGrpc.getUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun list(request: ProjectOuterClass.ListProjectRequest, headers: Metadata = Metadata()):
        Flow<ProjectOuterClass.Project> = serverStreamingRpc(
      channel,
      ProjectServiceGrpc.getListMethod(),
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
    public suspend fun `get`(request: ProjectOuterClass.GetProjectRequest, headers: Metadata =
        Metadata()): ProjectOuterClass.Project = unaryRpc(
      channel,
      ProjectServiceGrpc.getGetMethod(),
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
    public suspend fun delete(request: ProjectOuterClass.DeleteProjectRequest, headers: Metadata =
        Metadata()): ProjectOuterClass.Project = unaryRpc(
      channel,
      ProjectServiceGrpc.getDeleteMethod(),
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
    public suspend fun queryAssets(request: ProjectOuterClass.QueryAssetsRequest, headers: Metadata
        = Metadata()): ProjectOuterClass.QueryAssetsResponse = unaryRpc(
      channel,
      ProjectServiceGrpc.getQueryAssetsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the gooseai.ProjectService service based on Kotlin coroutines.
   */
  public abstract class ProjectServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for gooseai.ProjectService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: ProjectOuterClass.CreateProjectRequest):
        ProjectOuterClass.Project = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.ProjectService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.ProjectService.Update.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun update(request: ProjectOuterClass.UpdateProjectRequest):
        ProjectOuterClass.Project = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.ProjectService.Update is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for gooseai.ProjectService.List.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun list(request: ProjectOuterClass.ListProjectRequest):
        Flow<ProjectOuterClass.Project> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.ProjectService.List is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.ProjectService.Get.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun `get`(request: ProjectOuterClass.GetProjectRequest):
        ProjectOuterClass.Project = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.ProjectService.Get is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.ProjectService.Delete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun delete(request: ProjectOuterClass.DeleteProjectRequest):
        ProjectOuterClass.Project = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.ProjectService.Delete is unimplemented"))

    /**
     * Returns the response to an RPC for gooseai.ProjectService.QueryAssets.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun queryAssets(request: ProjectOuterClass.QueryAssetsRequest):
        ProjectOuterClass.QueryAssetsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.ProjectService.QueryAssets is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getUpdateMethod(),
      implementation = ::update
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getListMethod(),
      implementation = ::list
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getGetMethod(),
      implementation = ::`get`
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getDeleteMethod(),
      implementation = ::delete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProjectServiceGrpc.getQueryAssetsMethod(),
      implementation = ::queryAssets
    )).build()
  }
}
