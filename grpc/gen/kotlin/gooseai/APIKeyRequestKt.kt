//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeaPIKeyRequest")
public inline fun aPIKeyRequest(block: gooseai.APIKeyRequestKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.APIKeyRequest =
  gooseai.APIKeyRequestKt.Dsl._create(gooseai.Dashboard.APIKeyRequest.newBuilder()).apply { block() }._build()
public object APIKeyRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.APIKeyRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.APIKeyRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.APIKeyRequest = _builder.build()

    /**
     * <code>bool is_secret = 1 [json_name = "isSecret"];</code>
     */
    public var isSecret: kotlin.Boolean
      @JvmName("getIsSecret")
      get() = _builder.getIsSecret()
      @JvmName("setIsSecret")
      set(value) {
        _builder.setIsSecret(value)
      }
    /**
     * <code>bool is_secret = 1 [json_name = "isSecret"];</code>
     */
    public fun clearIsSecret() {
      _builder.clearIsSecret()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.APIKeyRequest.copy(block: gooseai.APIKeyRequestKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.APIKeyRequest =
  gooseai.APIKeyRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

