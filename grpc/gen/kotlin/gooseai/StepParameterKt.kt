//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generation.proto

package gooseai;

@kotlin.jvm.JvmName("-initializestepParameter")
public inline fun stepParameter(block: gooseai.StepParameterKt.Dsl.() -> kotlin.Unit): gooseai.Generation.StepParameter =
  gooseai.StepParameterKt.Dsl._create(gooseai.Generation.StepParameter.newBuilder()).apply { block() }._build()
public object StepParameterKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Generation.StepParameter.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Generation.StepParameter.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Generation.StepParameter = _builder.build()

    /**
     * <code>float scaled_step = 1 [json_name = "scaledStep"];</code>
     */
    public var scaledStep: kotlin.Float
      @JvmName("getScaledStep")
      get() = _builder.getScaledStep()
      @JvmName("setScaledStep")
      set(value) {
        _builder.setScaledStep(value)
      }
    /**
     * <code>float scaled_step = 1 [json_name = "scaledStep"];</code>
     */
    public fun clearScaledStep() {
      _builder.clearScaledStep()
    }

    /**
     * <code>optional .gooseai.SamplerParameters sampler = 2 [json_name = "sampler"];</code>
     */
    public var sampler: gooseai.Generation.SamplerParameters
      @JvmName("getSampler")
      get() = _builder.getSampler()
      @JvmName("setSampler")
      set(value) {
        _builder.setSampler(value)
      }
    /**
     * <code>optional .gooseai.SamplerParameters sampler = 2 [json_name = "sampler"];</code>
     */
    public fun clearSampler() {
      _builder.clearSampler()
    }
    /**
     * <code>optional .gooseai.SamplerParameters sampler = 2 [json_name = "sampler"];</code>
     * @return Whether the sampler field is set.
     */
    public fun hasSampler(): kotlin.Boolean {
      return _builder.hasSampler()
    }
    public val StepParameterKt.Dsl.samplerOrNull: gooseai.Generation.SamplerParameters?
      get() = _builder.samplerOrNull

    /**
     * <code>optional .gooseai.ScheduleParameters schedule = 3 [json_name = "schedule"];</code>
     */
    public var schedule: gooseai.Generation.ScheduleParameters
      @JvmName("getSchedule")
      get() = _builder.getSchedule()
      @JvmName("setSchedule")
      set(value) {
        _builder.setSchedule(value)
      }
    /**
     * <code>optional .gooseai.ScheduleParameters schedule = 3 [json_name = "schedule"];</code>
     */
    public fun clearSchedule() {
      _builder.clearSchedule()
    }
    /**
     * <code>optional .gooseai.ScheduleParameters schedule = 3 [json_name = "schedule"];</code>
     * @return Whether the schedule field is set.
     */
    public fun hasSchedule(): kotlin.Boolean {
      return _builder.hasSchedule()
    }
    public val StepParameterKt.Dsl.scheduleOrNull: gooseai.Generation.ScheduleParameters?
      get() = _builder.scheduleOrNull

    /**
     * <code>optional .gooseai.GuidanceParameters guidance = 4 [json_name = "guidance"];</code>
     */
    public var guidance: gooseai.Generation.GuidanceParameters
      @JvmName("getGuidance")
      get() = _builder.getGuidance()
      @JvmName("setGuidance")
      set(value) {
        _builder.setGuidance(value)
      }
    /**
     * <code>optional .gooseai.GuidanceParameters guidance = 4 [json_name = "guidance"];</code>
     */
    public fun clearGuidance() {
      _builder.clearGuidance()
    }
    /**
     * <code>optional .gooseai.GuidanceParameters guidance = 4 [json_name = "guidance"];</code>
     * @return Whether the guidance field is set.
     */
    public fun hasGuidance(): kotlin.Boolean {
      return _builder.hasGuidance()
    }
    public val StepParameterKt.Dsl.guidanceOrNull: gooseai.Generation.GuidanceParameters?
      get() = _builder.guidanceOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Generation.StepParameter.copy(block: gooseai.StepParameterKt.Dsl.() -> kotlin.Unit): gooseai.Generation.StepParameter =
  gooseai.StepParameterKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val gooseai.Generation.StepParameterOrBuilder.samplerOrNull: gooseai.Generation.SamplerParameters?
  get() = if (hasSampler()) getSampler() else null

public val gooseai.Generation.StepParameterOrBuilder.scheduleOrNull: gooseai.Generation.ScheduleParameters?
  get() = if (hasSchedule()) getSchedule() else null

public val gooseai.Generation.StepParameterOrBuilder.guidanceOrNull: gooseai.Generation.GuidanceParameters?
  get() = if (hasGuidance()) getGuidance() else null
