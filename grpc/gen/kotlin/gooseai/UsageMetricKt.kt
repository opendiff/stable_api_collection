//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeusageMetric")
public inline fun usageMetric(block: gooseai.UsageMetricKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.UsageMetric =
  gooseai.UsageMetricKt.Dsl._create(gooseai.Dashboard.UsageMetric.newBuilder()).apply { block() }._build()
public object UsageMetricKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.UsageMetric.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.UsageMetric.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.UsageMetric = _builder.build()

    /**
     * <code>string operation = 1 [json_name = "operation"];</code>
     */
    public var operation: kotlin.String
      @JvmName("getOperation")
      get() = _builder.getOperation()
      @JvmName("setOperation")
      set(value) {
        _builder.setOperation(value)
      }
    /**
     * <code>string operation = 1 [json_name = "operation"];</code>
     */
    public fun clearOperation() {
      _builder.clearOperation()
    }

    /**
     * <code>string engine = 2 [json_name = "engine"];</code>
     */
    public var engine: kotlin.String
      @JvmName("getEngine")
      get() = _builder.getEngine()
      @JvmName("setEngine")
      set(value) {
        _builder.setEngine(value)
      }
    /**
     * <code>string engine = 2 [json_name = "engine"];</code>
     */
    public fun clearEngine() {
      _builder.clearEngine()
    }

    /**
     * <code>.gooseai.CostData input_cost = 3 [json_name = "inputCost"];</code>
     */
    public var inputCost: gooseai.Dashboard.CostData
      @JvmName("getInputCost")
      get() = _builder.getInputCost()
      @JvmName("setInputCost")
      set(value) {
        _builder.setInputCost(value)
      }
    /**
     * <code>.gooseai.CostData input_cost = 3 [json_name = "inputCost"];</code>
     */
    public fun clearInputCost() {
      _builder.clearInputCost()
    }
    /**
     * <code>.gooseai.CostData input_cost = 3 [json_name = "inputCost"];</code>
     * @return Whether the inputCost field is set.
     */
    public fun hasInputCost(): kotlin.Boolean {
      return _builder.hasInputCost()
    }

    /**
     * <code>.gooseai.CostData output_cost = 4 [json_name = "outputCost"];</code>
     */
    public var outputCost: gooseai.Dashboard.CostData
      @JvmName("getOutputCost")
      get() = _builder.getOutputCost()
      @JvmName("setOutputCost")
      set(value) {
        _builder.setOutputCost(value)
      }
    /**
     * <code>.gooseai.CostData output_cost = 4 [json_name = "outputCost"];</code>
     */
    public fun clearOutputCost() {
      _builder.clearOutputCost()
    }
    /**
     * <code>.gooseai.CostData output_cost = 4 [json_name = "outputCost"];</code>
     * @return Whether the outputCost field is set.
     */
    public fun hasOutputCost(): kotlin.Boolean {
      return _builder.hasOutputCost()
    }

    /**
     * <code>optional string user = 5 [json_name = "user"];</code>
     */
    public var user: kotlin.String
      @JvmName("getUser")
      get() = _builder.getUser()
      @JvmName("setUser")
      set(value) {
        _builder.setUser(value)
      }
    /**
     * <code>optional string user = 5 [json_name = "user"];</code>
     */
    public fun clearUser() {
      _builder.clearUser()
    }
    /**
     * <code>optional string user = 5 [json_name = "user"];</code>
     * @return Whether the user field is set.
     */
    public fun hasUser(): kotlin.Boolean {
      return _builder.hasUser()
    }

    /**
     * <code>uint64 aggregation_timestamp = 6 [json_name = "aggregationTimestamp"];</code>
     */
    public var aggregationTimestamp: kotlin.Long
      @JvmName("getAggregationTimestamp")
      get() = _builder.getAggregationTimestamp()
      @JvmName("setAggregationTimestamp")
      set(value) {
        _builder.setAggregationTimestamp(value)
      }
    /**
     * <code>uint64 aggregation_timestamp = 6 [json_name = "aggregationTimestamp"];</code>
     */
    public fun clearAggregationTimestamp() {
      _builder.clearAggregationTimestamp()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.UsageMetric.copy(block: gooseai.UsageMetricKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.UsageMetric =
  gooseai.UsageMetricKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val gooseai.Dashboard.UsageMetricOrBuilder.inputCostOrNull: gooseai.Dashboard.CostData?
  get() = if (hasInputCost()) getInputCost() else null

public val gooseai.Dashboard.UsageMetricOrBuilder.outputCostOrNull: gooseai.Dashboard.CostData?
  get() = if (hasOutputCost()) getOutputCost() else null

