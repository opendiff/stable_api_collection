//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializegetOrganizationRequest")
public inline fun getOrganizationRequest(block: gooseai.GetOrganizationRequestKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.GetOrganizationRequest =
  gooseai.GetOrganizationRequestKt.Dsl._create(gooseai.Dashboard.GetOrganizationRequest.newBuilder()).apply { block() }._build()
public object GetOrganizationRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.GetOrganizationRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.GetOrganizationRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.GetOrganizationRequest = _builder.build()

    /**
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.GetOrganizationRequest.copy(block: gooseai.GetOrganizationRequestKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.GetOrganizationRequest =
  gooseai.GetOrganizationRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
