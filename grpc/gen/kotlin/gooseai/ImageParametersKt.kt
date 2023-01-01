//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generation.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeimageParameters")
public inline fun imageParameters(block: gooseai.ImageParametersKt.Dsl.() -> kotlin.Unit): gooseai.Generation.ImageParameters =
  gooseai.ImageParametersKt.Dsl._create(gooseai.Generation.ImageParameters.newBuilder()).apply { block() }._build()
public object ImageParametersKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Generation.ImageParameters.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Generation.ImageParameters.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Generation.ImageParameters = _builder.build()

    /**
     * <code>optional uint64 height = 1 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>optional uint64 height = 1 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
    /**
     * <code>optional uint64 height = 1 [json_name = "height"];</code>
     * @return Whether the height field is set.
     */
    public fun hasHeight(): kotlin.Boolean {
      return _builder.hasHeight()
    }

    /**
     * <code>optional uint64 width = 2 [json_name = "width"];</code>
     */
    public var width: kotlin.Long
      @JvmName("getWidth")
      get() = _builder.getWidth()
      @JvmName("setWidth")
      set(value) {
        _builder.setWidth(value)
      }
    /**
     * <code>optional uint64 width = 2 [json_name = "width"];</code>
     */
    public fun clearWidth() {
      _builder.clearWidth()
    }
    /**
     * <code>optional uint64 width = 2 [json_name = "width"];</code>
     * @return Whether the width field is set.
     */
    public fun hasWidth(): kotlin.Boolean {
      return _builder.hasWidth()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SeedProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint32 seed = 3 [json_name = "seed"];</code>
     */
     public val seed: com.google.protobuf.kotlin.DslList<kotlin.Int, SeedProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSeedList()
      )
    /**
     * <code>repeated uint32 seed = 3 [json_name = "seed"];</code>
     * @param value The seed to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSeed")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, SeedProxy>.add(value: kotlin.Int) {
      _builder.addSeed(value)
    }/**
     * <code>repeated uint32 seed = 3 [json_name = "seed"];</code>
     * @param value The seed to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSeed")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, SeedProxy>.plusAssign(value: kotlin.Int) {
      add(value)
    }/**
     * <code>repeated uint32 seed = 3 [json_name = "seed"];</code>
     * @param values The seed to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSeed")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, SeedProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Int>) {
      _builder.addAllSeed(values)
    }/**
     * <code>repeated uint32 seed = 3 [json_name = "seed"];</code>
     * @param values The seed to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSeed")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, SeedProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Int>) {
      addAll(values)
    }/**
     * <code>repeated uint32 seed = 3 [json_name = "seed"];</code>
     * @param index The index to set the value at.
     * @param value The seed to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSeed")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, SeedProxy>.set(index: kotlin.Int, value: kotlin.Int) {
      _builder.setSeed(index, value)
    }/**
     * <code>repeated uint32 seed = 3 [json_name = "seed"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSeed")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, SeedProxy>.clear() {
      _builder.clearSeed()
    }
    /**
     * <code>optional uint64 samples = 4 [json_name = "samples"];</code>
     */
    public var samples: kotlin.Long
      @JvmName("getSamples")
      get() = _builder.getSamples()
      @JvmName("setSamples")
      set(value) {
        _builder.setSamples(value)
      }
    /**
     * <code>optional uint64 samples = 4 [json_name = "samples"];</code>
     */
    public fun clearSamples() {
      _builder.clearSamples()
    }
    /**
     * <code>optional uint64 samples = 4 [json_name = "samples"];</code>
     * @return Whether the samples field is set.
     */
    public fun hasSamples(): kotlin.Boolean {
      return _builder.hasSamples()
    }

    /**
     * <code>optional uint64 steps = 5 [json_name = "steps"];</code>
     */
    public var steps: kotlin.Long
      @JvmName("getSteps")
      get() = _builder.getSteps()
      @JvmName("setSteps")
      set(value) {
        _builder.setSteps(value)
      }
    /**
     * <code>optional uint64 steps = 5 [json_name = "steps"];</code>
     */
    public fun clearSteps() {
      _builder.clearSteps()
    }
    /**
     * <code>optional uint64 steps = 5 [json_name = "steps"];</code>
     * @return Whether the steps field is set.
     */
    public fun hasSteps(): kotlin.Boolean {
      return _builder.hasSteps()
    }

    /**
     * <code>optional .gooseai.TransformType transform = 6 [json_name = "transform"];</code>
     */
    public var transform: gooseai.Generation.TransformType
      @JvmName("getTransform")
      get() = _builder.getTransform()
      @JvmName("setTransform")
      set(value) {
        _builder.setTransform(value)
      }
    /**
     * <code>optional .gooseai.TransformType transform = 6 [json_name = "transform"];</code>
     */
    public fun clearTransform() {
      _builder.clearTransform()
    }
    /**
     * <code>optional .gooseai.TransformType transform = 6 [json_name = "transform"];</code>
     * @return Whether the transform field is set.
     */
    public fun hasTransform(): kotlin.Boolean {
      return _builder.hasTransform()
    }
    public val ImageParametersKt.Dsl.transformOrNull: gooseai.Generation.TransformType?
      get() = _builder.transformOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ParametersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .gooseai.StepParameter parameters = 7 [json_name = "parameters"];</code>
     */
     public val parameters: com.google.protobuf.kotlin.DslList<gooseai.Generation.StepParameter, ParametersProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getParametersList()
      )
    /**
     * <code>repeated .gooseai.StepParameter parameters = 7 [json_name = "parameters"];</code>
     * @param value The parameters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addParameters")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.StepParameter, ParametersProxy>.add(value: gooseai.Generation.StepParameter) {
      _builder.addParameters(value)
    }
    /**
     * <code>repeated .gooseai.StepParameter parameters = 7 [json_name = "parameters"];</code>
     * @param value The parameters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignParameters")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.StepParameter, ParametersProxy>.plusAssign(value: gooseai.Generation.StepParameter) {
      add(value)
    }
    /**
     * <code>repeated .gooseai.StepParameter parameters = 7 [json_name = "parameters"];</code>
     * @param values The parameters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllParameters")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.StepParameter, ParametersProxy>.addAll(values: kotlin.collections.Iterable<gooseai.Generation.StepParameter>) {
      _builder.addAllParameters(values)
    }
    /**
     * <code>repeated .gooseai.StepParameter parameters = 7 [json_name = "parameters"];</code>
     * @param values The parameters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllParameters")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.StepParameter, ParametersProxy>.plusAssign(values: kotlin.collections.Iterable<gooseai.Generation.StepParameter>) {
      addAll(values)
    }
    /**
     * <code>repeated .gooseai.StepParameter parameters = 7 [json_name = "parameters"];</code>
     * @param index The index to set the value at.
     * @param value The parameters to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setParameters")
    public operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.StepParameter, ParametersProxy>.set(index: kotlin.Int, value: gooseai.Generation.StepParameter) {
      _builder.setParameters(index, value)
    }
    /**
     * <code>repeated .gooseai.StepParameter parameters = 7 [json_name = "parameters"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearParameters")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.StepParameter, ParametersProxy>.clear() {
      _builder.clearParameters()
    }


    /**
     * <pre>
     * defaults to MASKED_AREA_INIT_ZERO 
     * </pre>
     *
     * <code>optional .gooseai.MaskedAreaInit masked_area_init = 8 [json_name = "maskedAreaInit"];</code>
     */
    public var maskedAreaInit: gooseai.Generation.MaskedAreaInit
      @JvmName("getMaskedAreaInit")
      get() = _builder.getMaskedAreaInit()
      @JvmName("setMaskedAreaInit")
      set(value) {
        _builder.setMaskedAreaInit(value)
      }
    /**
     * <pre>
     * defaults to MASKED_AREA_INIT_ZERO 
     * </pre>
     *
     * <code>optional .gooseai.MaskedAreaInit masked_area_init = 8 [json_name = "maskedAreaInit"];</code>
     */
    public fun clearMaskedAreaInit() {
      _builder.clearMaskedAreaInit()
    }
    /**
     * <pre>
     * defaults to MASKED_AREA_INIT_ZERO 
     * </pre>
     *
     * <code>optional .gooseai.MaskedAreaInit masked_area_init = 8 [json_name = "maskedAreaInit"];</code>
     * @return Whether the maskedAreaInit field is set.
     */
    public fun hasMaskedAreaInit(): kotlin.Boolean {
      return _builder.hasMaskedAreaInit()
    }

    /**
     * <pre>
     *defaults to TEXT_ENCODER
     * </pre>
     *
     * <code>optional .gooseai.WeightMethod weight_method = 9 [json_name = "weightMethod"];</code>
     */
    public var weightMethod: gooseai.Generation.WeightMethod
      @JvmName("getWeightMethod")
      get() = _builder.getWeightMethod()
      @JvmName("setWeightMethod")
      set(value) {
        _builder.setWeightMethod(value)
      }
    /**
     * <pre>
     *defaults to TEXT_ENCODER
     * </pre>
     *
     * <code>optional .gooseai.WeightMethod weight_method = 9 [json_name = "weightMethod"];</code>
     */
    public fun clearWeightMethod() {
      _builder.clearWeightMethod()
    }
    /**
     * <pre>
     *defaults to TEXT_ENCODER
     * </pre>
     *
     * <code>optional .gooseai.WeightMethod weight_method = 9 [json_name = "weightMethod"];</code>
     * @return Whether the weightMethod field is set.
     */
    public fun hasWeightMethod(): kotlin.Boolean {
      return _builder.hasWeightMethod()
    }

    /**
     * <pre>
     *defaults to true
     * </pre>
     *
     * <code>optional bool quantize = 10 [json_name = "quantize"];</code>
     */
    public var quantize: kotlin.Boolean
      @JvmName("getQuantize")
      get() = _builder.getQuantize()
      @JvmName("setQuantize")
      set(value) {
        _builder.setQuantize(value)
      }
    /**
     * <pre>
     *defaults to true
     * </pre>
     *
     * <code>optional bool quantize = 10 [json_name = "quantize"];</code>
     */
    public fun clearQuantize() {
      _builder.clearQuantize()
    }
    /**
     * <pre>
     *defaults to true
     * </pre>
     *
     * <code>optional bool quantize = 10 [json_name = "quantize"];</code>
     * @return Whether the quantize field is set.
     */
    public fun hasQuantize(): kotlin.Boolean {
      return _builder.hasQuantize()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Generation.ImageParameters.copy(block: gooseai.ImageParametersKt.Dsl.() -> kotlin.Unit): gooseai.Generation.ImageParameters =
  gooseai.ImageParametersKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val gooseai.Generation.ImageParametersOrBuilder.transformOrNull: gooseai.Generation.TransformType?
  get() = if (hasTransform()) getTransform() else null

