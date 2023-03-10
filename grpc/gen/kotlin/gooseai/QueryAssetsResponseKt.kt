//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: project.proto

package gooseai;

@kotlin.jvm.JvmName("-initializequeryAssetsResponse")
public inline fun queryAssetsResponse(block: gooseai.QueryAssetsResponseKt.Dsl.() -> kotlin.Unit): gooseai.ProjectOuterClass.QueryAssetsResponse =
  gooseai.QueryAssetsResponseKt.Dsl._create(gooseai.ProjectOuterClass.QueryAssetsResponse.newBuilder()).apply { block() }._build()
public object QueryAssetsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.ProjectOuterClass.QueryAssetsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.ProjectOuterClass.QueryAssetsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.ProjectOuterClass.QueryAssetsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AssetsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * The assets returned by the query
     * </pre>
     *
     * <code>repeated .gooseai.ProjectAsset assets = 1 [json_name = "assets"];</code>
     */
     public val assets: com.google.protobuf.kotlin.DslList<gooseai.ProjectOuterClass.ProjectAsset, AssetsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAssetsList()
      )
    /**
     * <pre>
     * The assets returned by the query
     * </pre>
     *
     * <code>repeated .gooseai.ProjectAsset assets = 1 [json_name = "assets"];</code>
     * @param value The assets to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAssets")
    public fun com.google.protobuf.kotlin.DslList<gooseai.ProjectOuterClass.ProjectAsset, AssetsProxy>.add(value: gooseai.ProjectOuterClass.ProjectAsset) {
      _builder.addAssets(value)
    }
    /**
     * <pre>
     * The assets returned by the query
     * </pre>
     *
     * <code>repeated .gooseai.ProjectAsset assets = 1 [json_name = "assets"];</code>
     * @param value The assets to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAssets")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.ProjectOuterClass.ProjectAsset, AssetsProxy>.plusAssign(value: gooseai.ProjectOuterClass.ProjectAsset) {
      add(value)
    }
    /**
     * <pre>
     * The assets returned by the query
     * </pre>
     *
     * <code>repeated .gooseai.ProjectAsset assets = 1 [json_name = "assets"];</code>
     * @param values The assets to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAssets")
    public fun com.google.protobuf.kotlin.DslList<gooseai.ProjectOuterClass.ProjectAsset, AssetsProxy>.addAll(values: kotlin.collections.Iterable<gooseai.ProjectOuterClass.ProjectAsset>) {
      _builder.addAllAssets(values)
    }
    /**
     * <pre>
     * The assets returned by the query
     * </pre>
     *
     * <code>repeated .gooseai.ProjectAsset assets = 1 [json_name = "assets"];</code>
     * @param values The assets to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAssets")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.ProjectOuterClass.ProjectAsset, AssetsProxy>.plusAssign(values: kotlin.collections.Iterable<gooseai.ProjectOuterClass.ProjectAsset>) {
      addAll(values)
    }
    /**
     * <pre>
     * The assets returned by the query
     * </pre>
     *
     * <code>repeated .gooseai.ProjectAsset assets = 1 [json_name = "assets"];</code>
     * @param index The index to set the value at.
     * @param value The assets to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAssets")
    public operator fun com.google.protobuf.kotlin.DslList<gooseai.ProjectOuterClass.ProjectAsset, AssetsProxy>.set(index: kotlin.Int, value: gooseai.ProjectOuterClass.ProjectAsset) {
      _builder.setAssets(index, value)
    }
    /**
     * <pre>
     * The assets returned by the query
     * </pre>
     *
     * <code>repeated .gooseai.ProjectAsset assets = 1 [json_name = "assets"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAssets")
    public fun com.google.protobuf.kotlin.DslList<gooseai.ProjectOuterClass.ProjectAsset, AssetsProxy>.clear() {
      _builder.clearAssets()
    }


    /**
     * <pre>
     * The last asset key returned when the results were limited, unset when not limited
     * </pre>
     *
     * <code>optional string last_key = 2 [json_name = "lastKey"];</code>
     */
    public var lastKey: kotlin.String
      @JvmName("getLastKey")
      get() = _builder.getLastKey()
      @JvmName("setLastKey")
      set(value) {
        _builder.setLastKey(value)
      }
    /**
     * <pre>
     * The last asset key returned when the results were limited, unset when not limited
     * </pre>
     *
     * <code>optional string last_key = 2 [json_name = "lastKey"];</code>
     */
    public fun clearLastKey() {
      _builder.clearLastKey()
    }
    /**
     * <pre>
     * The last asset key returned when the results were limited, unset when not limited
     * </pre>
     *
     * <code>optional string last_key = 2 [json_name = "lastKey"];</code>
     * @return Whether the lastKey field is set.
     */
    public fun hasLastKey(): kotlin.Boolean {
      return _builder.hasLastKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.ProjectOuterClass.QueryAssetsResponse.copy(block: gooseai.QueryAssetsResponseKt.Dsl.() -> kotlin.Unit): gooseai.ProjectOuterClass.QueryAssetsResponse =
  gooseai.QueryAssetsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

