//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generation.proto

package gooseai;

@kotlin.jvm.JvmName("-initializetransformType")
public inline fun transformType(block: gooseai.TransformTypeKt.Dsl.() -> kotlin.Unit): gooseai.Generation.TransformType =
  gooseai.TransformTypeKt.Dsl._create(gooseai.Generation.TransformType.newBuilder()).apply { block() }._build()
public object TransformTypeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Generation.TransformType.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Generation.TransformType.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Generation.TransformType = _builder.build()

    /**
     * <code>.gooseai.DiffusionSampler diffusion = 1 [json_name = "diffusion"];</code>
     */
    public var diffusion: gooseai.Generation.DiffusionSampler
      @JvmName("getDiffusion")
      get() = _builder.getDiffusion()
      @JvmName("setDiffusion")
      set(value) {
        _builder.setDiffusion(value)
      }
    /**
     * <code>.gooseai.DiffusionSampler diffusion = 1 [json_name = "diffusion"];</code>
     */
    public fun clearDiffusion() {
      _builder.clearDiffusion()
    }
    /**
     * <code>.gooseai.DiffusionSampler diffusion = 1 [json_name = "diffusion"];</code>
     * @return Whether the diffusion field is set.
     */
    public fun hasDiffusion(): kotlin.Boolean {
      return _builder.hasDiffusion()
    }

    /**
     * <code>.gooseai.Upscaler upscaler = 2 [json_name = "upscaler"];</code>
     */
    public var upscaler: gooseai.Generation.Upscaler
      @JvmName("getUpscaler")
      get() = _builder.getUpscaler()
      @JvmName("setUpscaler")
      set(value) {
        _builder.setUpscaler(value)
      }
    /**
     * <code>.gooseai.Upscaler upscaler = 2 [json_name = "upscaler"];</code>
     */
    public fun clearUpscaler() {
      _builder.clearUpscaler()
    }
    /**
     * <code>.gooseai.Upscaler upscaler = 2 [json_name = "upscaler"];</code>
     * @return Whether the upscaler field is set.
     */
    public fun hasUpscaler(): kotlin.Boolean {
      return _builder.hasUpscaler()
    }
    public val typeCase: gooseai.Generation.TransformType.TypeCase
      @JvmName("getTypeCase")
      get() = _builder.getTypeCase()

    public fun clearType() {
      _builder.clearType()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Generation.TransformType.copy(block: gooseai.TransformTypeKt.Dsl.() -> kotlin.Unit): gooseai.Generation.TransformType =
  gooseai.TransformTypeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
