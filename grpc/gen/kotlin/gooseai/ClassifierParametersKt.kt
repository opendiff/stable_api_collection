//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generation.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeclassifierParameters")
public inline fun classifierParameters(block: gooseai.ClassifierParametersKt.Dsl.() -> kotlin.Unit): gooseai.Generation.ClassifierParameters =
  gooseai.ClassifierParametersKt.Dsl._create(gooseai.Generation.ClassifierParameters.newBuilder()).apply { block() }._build()
public object ClassifierParametersKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Generation.ClassifierParameters.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Generation.ClassifierParameters.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Generation.ClassifierParameters = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class CategoriesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     */
     public val categories: com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, CategoriesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getCategoriesList()
      )
    /**
     * <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     * @param value The categories to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCategories")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, CategoriesProxy>.add(value: gooseai.Generation.ClassifierCategory) {
      _builder.addCategories(value)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     * @param value The categories to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCategories")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, CategoriesProxy>.plusAssign(value: gooseai.Generation.ClassifierCategory) {
      add(value)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     * @param values The categories to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCategories")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, CategoriesProxy>.addAll(values: kotlin.collections.Iterable<gooseai.Generation.ClassifierCategory>) {
      _builder.addAllCategories(values)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     * @param values The categories to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCategories")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, CategoriesProxy>.plusAssign(values: kotlin.collections.Iterable<gooseai.Generation.ClassifierCategory>) {
      addAll(values)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     * @param index The index to set the value at.
     * @param value The categories to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCategories")
    public operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, CategoriesProxy>.set(index: kotlin.Int, value: gooseai.Generation.ClassifierCategory) {
      _builder.setCategories(index, value)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCategories")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, CategoriesProxy>.clear() {
      _builder.clearCategories()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ExceedsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     */
     public val exceeds: com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, ExceedsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getExceedsList()
      )
    /**
     * <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     * @param value The exceeds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addExceeds")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, ExceedsProxy>.add(value: gooseai.Generation.ClassifierCategory) {
      _builder.addExceeds(value)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     * @param value The exceeds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignExceeds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, ExceedsProxy>.plusAssign(value: gooseai.Generation.ClassifierCategory) {
      add(value)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     * @param values The exceeds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllExceeds")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, ExceedsProxy>.addAll(values: kotlin.collections.Iterable<gooseai.Generation.ClassifierCategory>) {
      _builder.addAllExceeds(values)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     * @param values The exceeds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllExceeds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, ExceedsProxy>.plusAssign(values: kotlin.collections.Iterable<gooseai.Generation.ClassifierCategory>) {
      addAll(values)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     * @param index The index to set the value at.
     * @param value The exceeds to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setExceeds")
    public operator fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, ExceedsProxy>.set(index: kotlin.Int, value: gooseai.Generation.ClassifierCategory) {
      _builder.setExceeds(index, value)
    }
    /**
     * <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearExceeds")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Generation.ClassifierCategory, ExceedsProxy>.clear() {
      _builder.clearExceeds()
    }


    /**
     * <code>optional .gooseai.Action realized_action = 3 [json_name = "realizedAction"];</code>
     */
    public var realizedAction: gooseai.Generation.Action
      @JvmName("getRealizedAction")
      get() = _builder.getRealizedAction()
      @JvmName("setRealizedAction")
      set(value) {
        _builder.setRealizedAction(value)
      }
    /**
     * <code>optional .gooseai.Action realized_action = 3 [json_name = "realizedAction"];</code>
     */
    public fun clearRealizedAction() {
      _builder.clearRealizedAction()
    }
    /**
     * <code>optional .gooseai.Action realized_action = 3 [json_name = "realizedAction"];</code>
     * @return Whether the realizedAction field is set.
     */
    public fun hasRealizedAction(): kotlin.Boolean {
      return _builder.hasRealizedAction()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Generation.ClassifierParameters.copy(block: gooseai.ClassifierParametersKt.Dsl.() -> kotlin.Unit): gooseai.Generation.ClassifierParameters =
  gooseai.ClassifierParametersKt.Dsl._create(this.toBuilder()).apply { block() }._build()

