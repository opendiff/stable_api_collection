package gooseai

import gooseai.GenerationServiceGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for gooseai.GenerationService.
 */
public object GenerationServiceGrpcKt {
  public const val SERVICE_NAME: String = GenerationServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = GenerationServiceGrpc.getServiceDescriptor()

  public val generateMethod: MethodDescriptor<Generation.Request, Generation.Answer>
    @JvmStatic
    get() = GenerationServiceGrpc.getGenerateMethod()

  public val chainGenerateMethod: MethodDescriptor<Generation.ChainRequest, Generation.Answer>
    @JvmStatic
    get() = GenerationServiceGrpc.getChainGenerateMethod()

  /**
   * A stub for issuing RPCs to a(n) gooseai.GenerationService service as suspending coroutines.
   */
  @StubFor(GenerationServiceGrpc::class)
  public class GenerationServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GenerationServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        GenerationServiceCoroutineStub = GenerationServiceCoroutineStub(channel, callOptions)

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
    public fun generate(request: Generation.Request, headers: Metadata = Metadata()):
        Flow<Generation.Answer> = serverStreamingRpc(
      channel,
      GenerationServiceGrpc.getGenerateMethod(),
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
    public fun chainGenerate(request: Generation.ChainRequest, headers: Metadata = Metadata()):
        Flow<Generation.Answer> = serverStreamingRpc(
      channel,
      GenerationServiceGrpc.getChainGenerateMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the gooseai.GenerationService service based on Kotlin coroutines.
   */
  public abstract class GenerationServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for gooseai.GenerationService.Generate.
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
    public open fun generate(request: Generation.Request): Flow<Generation.Answer> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.GenerationService.Generate is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for gooseai.GenerationService.ChainGenerate.
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
    public open fun chainGenerate(request: Generation.ChainRequest): Flow<Generation.Answer> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method gooseai.GenerationService.ChainGenerate is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = GenerationServiceGrpc.getGenerateMethod(),
      implementation = ::generate
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = GenerationServiceGrpc.getChainGenerateMethod(),
      implementation = ::chainGenerate
    )).build()
  }
}
