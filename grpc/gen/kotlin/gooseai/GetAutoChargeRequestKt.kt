//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializegetAutoChargeRequest")
public inline fun getAutoChargeRequest(block: gooseai.GetAutoChargeRequestKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.GetAutoChargeRequest =
  gooseai.GetAutoChargeRequestKt.Dsl._create(gooseai.Dashboard.GetAutoChargeRequest.newBuilder()).apply { block() }._build()
public object GetAutoChargeRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.GetAutoChargeRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.GetAutoChargeRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.GetAutoChargeRequest = _builder.build()

    /**
     * <code>string organization_id = 1 [json_name = "organizationId"];</code>
     */
    public var organizationId: kotlin.String
      @JvmName("getOrganizationId")
      get() = _builder.getOrganizationId()
      @JvmName("setOrganizationId")
      set(value) {
        _builder.setOrganizationId(value)
      }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId"];</code>
     */
    public fun clearOrganizationId() {
      _builder.clearOrganizationId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.GetAutoChargeRequest.copy(block: gooseai.GetAutoChargeRequestKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.GetAutoChargeRequest =
  gooseai.GetAutoChargeRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

