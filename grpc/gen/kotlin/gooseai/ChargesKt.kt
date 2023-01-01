//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializecharges")
public inline fun charges(block: gooseai.ChargesKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.Charges =
  gooseai.ChargesKt.Dsl._create(gooseai.Dashboard.Charges.newBuilder()).apply { block() }._build()
public object ChargesKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.Charges.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.Charges.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.Charges = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ChargesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .gooseai.Charge charges = 1 [json_name = "charges"];</code>
     */
     public val charges: com.google.protobuf.kotlin.DslList<gooseai.Dashboard.Charge, ChargesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getChargesList()
      )
    /**
     * <code>repeated .gooseai.Charge charges = 1 [json_name = "charges"];</code>
     * @param value The charges to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCharges")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.Charge, ChargesProxy>.add(value: gooseai.Dashboard.Charge) {
      _builder.addCharges(value)
    }
    /**
     * <code>repeated .gooseai.Charge charges = 1 [json_name = "charges"];</code>
     * @param value The charges to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCharges")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.Charge, ChargesProxy>.plusAssign(value: gooseai.Dashboard.Charge) {
      add(value)
    }
    /**
     * <code>repeated .gooseai.Charge charges = 1 [json_name = "charges"];</code>
     * @param values The charges to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCharges")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.Charge, ChargesProxy>.addAll(values: kotlin.collections.Iterable<gooseai.Dashboard.Charge>) {
      _builder.addAllCharges(values)
    }
    /**
     * <code>repeated .gooseai.Charge charges = 1 [json_name = "charges"];</code>
     * @param values The charges to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCharges")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.Charge, ChargesProxy>.plusAssign(values: kotlin.collections.Iterable<gooseai.Dashboard.Charge>) {
      addAll(values)
    }
    /**
     * <code>repeated .gooseai.Charge charges = 1 [json_name = "charges"];</code>
     * @param index The index to set the value at.
     * @param value The charges to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCharges")
    public operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.Charge, ChargesProxy>.set(index: kotlin.Int, value: gooseai.Dashboard.Charge) {
      _builder.setCharges(index, value)
    }
    /**
     * <code>repeated .gooseai.Charge charges = 1 [json_name = "charges"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCharges")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.Charge, ChargesProxy>.clear() {
      _builder.clearCharges()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.Charges.copy(block: gooseai.ChargesKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.Charges =
  gooseai.ChargesKt.Dsl._create(this.toBuilder()).apply { block() }._build()

