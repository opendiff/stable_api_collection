//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeorganizationAutoCharge")
public inline fun organizationAutoCharge(block: gooseai.OrganizationAutoChargeKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.OrganizationAutoCharge =
  gooseai.OrganizationAutoChargeKt.Dsl._create(gooseai.Dashboard.OrganizationAutoCharge.newBuilder()).apply { block() }._build()
public object OrganizationAutoChargeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.OrganizationAutoCharge.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.OrganizationAutoCharge.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.OrganizationAutoCharge = _builder.build()

    /**
     * <code>bool enabled = 1 [json_name = "enabled"];</code>
     */
    public var enabled: kotlin.Boolean
      @JvmName("getEnabled")
      get() = _builder.getEnabled()
      @JvmName("setEnabled")
      set(value) {
        _builder.setEnabled(value)
      }
    /**
     * <code>bool enabled = 1 [json_name = "enabled"];</code>
     */
    public fun clearEnabled() {
      _builder.clearEnabled()
    }

    /**
     * <code>string id = 2 [json_name = "id"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 2 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>uint64 created_at = 3 [json_name = "createdAt"];</code>
     */
    public var createdAt: kotlin.Long
      @JvmName("getCreatedAt")
      get() = _builder.getCreatedAt()
      @JvmName("setCreatedAt")
      set(value) {
        _builder.setCreatedAt(value)
      }
    /**
     * <code>uint64 created_at = 3 [json_name = "createdAt"];</code>
     */
    public fun clearCreatedAt() {
      _builder.clearCreatedAt()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.OrganizationAutoCharge.copy(block: gooseai.OrganizationAutoChargeKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.OrganizationAutoCharge =
  gooseai.OrganizationAutoChargeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
