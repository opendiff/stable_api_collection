//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generation.proto

package gooseai;

@kotlin.jvm.JvmName("-initializecutoutParameters")
public inline fun cutoutParameters(block: gooseai.CutoutParametersKt.Dsl.() -> kotlin.Unit): gooseai.Generation.CutoutParameters =
  gooseai.CutoutParametersKt.Dsl._create(gooseai.Generation.CutoutParameters.newBuilder()).apply { block() }._build()
public object CutoutParametersKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Generation.CutoutParameters.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Generation.CutoutParameters.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Generation.CutoutParameters = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class CutoutsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Nested cutouts, unsupported
     * </pre>
     *
     * <code>repeated .gooseai.CutoutParameters cutouts = 1 [json_name = "cutouts"];</code>
     */
     public val cutouts: com.google.protobuf.kotlin.DslList<gooseai.Generation.CutoutParameters, CutoutsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getCutoutsList()
      )
    /**
     * <pre>
     * Nested cutouts, unsupported
     * </pre>
     *
     * <code>repeated .gooseai.CutoutParameters cutouts = 1 [json_name = "cutouts"];</code>
     * @param value The cutouts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCutouts")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.CutoutParameters, CutoutsProxy>.add(value: gooseai.Generation.CutoutParameters) {
      _builder.addCutouts(value)
    }
    /**
     * <pre>
     * Nested cutouts, unsupported
     * </pre>
     *
     * <code>repeated .gooseai.CutoutParameters cutouts = 1 [json_name = "cutouts"];</code>
     * @param value The cutouts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCutouts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.CutoutParameters, CutoutsProxy>.plusAssign(value: gooseai.Generation.CutoutParameters) {
      add(value)
    }
    /**
     * <pre>
     * Nested cutouts, unsupported
     * </pre>
     *
     * <code>repeated .gooseai.CutoutParameters cutouts = 1 [json_name = "cutouts"];</code>
     * @param values The cutouts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCutouts")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.CutoutParameters, CutoutsProxy>.addAll(values: kotlin.collections.Iterable<gooseai.Generation.CutoutParameters>) {
      _builder.addAllCutouts(values)
    }
    /**
     * <pre>
     * Nested cutouts, unsupported
     * </pre>
     *
     * <code>repeated .gooseai.CutoutParameters cutouts = 1 [json_name = "cutouts"];</code>
     * @param values The cutouts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCutouts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.CutoutParameters, CutoutsProxy>.plusAssign(values: kotlin.collections.Iterable<gooseai.Generation.CutoutParameters>) {
      addAll(values)
    }
    /**
     * <pre>
     * Nested cutouts, unsupported
     * </pre>
     *
     * <code>repeated .gooseai.CutoutParameters cutouts = 1 [json_name = "cutouts"];</code>
     * @param index The index to set the value at.
     * @param value The cutouts to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCutouts")
    public operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.CutoutParameters, CutoutsProxy>.set(index: kotlin.Int, value: gooseai.Generation.CutoutParameters) {
      _builder.setCutouts(index, value)
    }
    /**
     * <pre>
     * Nested cutouts, unsupported
     * </pre>
     *
     * <code>repeated .gooseai.CutoutParameters cutouts = 1 [json_name = "cutouts"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCutouts")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.CutoutParameters, CutoutsProxy>.clear() {
      _builder.clearCutouts()
    }


    /**
     * <pre>
     * 0 to n, usually 8 to 32, 0 inner
     * </pre>
     *
     * <code>optional uint32 count = 2 [json_name = "count"];</code>
     */
    public var count: kotlin.Int
      @JvmName("getCount")
      get() = _builder.getCount()
      @JvmName("setCount")
      set(value) {
        _builder.setCount(value)
      }
    /**
     * <pre>
     * 0 to n, usually 8 to 32, 0 inner
     * </pre>
     *
     * <code>optional uint32 count = 2 [json_name = "count"];</code>
     */
    public fun clearCount() {
      _builder.clearCount()
    }
    /**
     * <pre>
     * 0 to n, usually 8 to 32, 0 inner
     * </pre>
     *
     * <code>optional uint32 count = 2 [json_name = "count"];</code>
     * @return Whether the count field is set.
     */
    public fun hasCount(): kotlin.Boolean {
      return _builder.hasCount()
    }

    /**
     * <pre>
     * 0.0 to 1.0, defaults to 0.2
     * </pre>
     *
     * <code>optional float gray = 3 [json_name = "gray"];</code>
     */
    public var gray: kotlin.Float
      @JvmName("getGray")
      get() = _builder.getGray()
      @JvmName("setGray")
      set(value) {
        _builder.setGray(value)
      }
    /**
     * <pre>
     * 0.0 to 1.0, defaults to 0.2
     * </pre>
     *
     * <code>optional float gray = 3 [json_name = "gray"];</code>
     */
    public fun clearGray() {
      _builder.clearGray()
    }
    /**
     * <pre>
     * 0.0 to 1.0, defaults to 0.2
     * </pre>
     *
     * <code>optional float gray = 3 [json_name = "gray"];</code>
     * @return Whether the gray field is set.
     */
    public fun hasGray(): kotlin.Boolean {
      return _builder.hasGray()
    }

    /**
     * <pre>
     * percentage of cutouts to blur
     * </pre>
     *
     * <code>optional float blur = 4 [json_name = "blur"];</code>
     */
    public var blur: kotlin.Float
      @JvmName("getBlur")
      get() = _builder.getBlur()
      @JvmName("setBlur")
      set(value) {
        _builder.setBlur(value)
      }
    /**
     * <pre>
     * percentage of cutouts to blur
     * </pre>
     *
     * <code>optional float blur = 4 [json_name = "blur"];</code>
     */
    public fun clearBlur() {
      _builder.clearBlur()
    }
    /**
     * <pre>
     * percentage of cutouts to blur
     * </pre>
     *
     * <code>optional float blur = 4 [json_name = "blur"];</code>
     * @return Whether the blur field is set.
     */
    public fun hasBlur(): kotlin.Boolean {
      return _builder.hasBlur()
    }

    /**
     * <pre>
     * defaults to inner: 0.5, outer: 0.0
     * </pre>
     *
     * <code>optional float size_power = 5 [json_name = "sizePower"];</code>
     */
    public var sizePower: kotlin.Float
      @JvmName("getSizePower")
      get() = _builder.getSizePower()
      @JvmName("setSizePower")
      set(value) {
        _builder.setSizePower(value)
      }
    /**
     * <pre>
     * defaults to inner: 0.5, outer: 0.0
     * </pre>
     *
     * <code>optional float size_power = 5 [json_name = "sizePower"];</code>
     */
    public fun clearSizePower() {
      _builder.clearSizePower()
    }
    /**
     * <pre>
     * defaults to inner: 0.5, outer: 0.0
     * </pre>
     *
     * <code>optional float size_power = 5 [json_name = "sizePower"];</code>
     * @return Whether the sizePower field is set.
     */
    public fun hasSizePower(): kotlin.Boolean {
      return _builder.hasSizePower()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Generation.CutoutParameters.copy(block: gooseai.CutoutParametersKt.Dsl.() -> kotlin.Unit): gooseai.Generation.CutoutParameters =
  gooseai.CutoutParametersKt.Dsl._create(this.toBuilder()).apply { block() }._build()
