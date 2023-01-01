//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: project.proto

package gooseai;

@kotlin.jvm.JvmName("-initializegetProjectRequest")
public inline fun getProjectRequest(block: gooseai.GetProjectRequestKt.Dsl.() -> kotlin.Unit): gooseai.ProjectOuterClass.GetProjectRequest =
  gooseai.GetProjectRequestKt.Dsl._create(gooseai.ProjectOuterClass.GetProjectRequest.newBuilder()).apply { block() }._build()
public object GetProjectRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.ProjectOuterClass.GetProjectRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.ProjectOuterClass.GetProjectRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.ProjectOuterClass.GetProjectRequest = _builder.build()

    /**
     * <pre>
     * ID of the project to request, UUIDv4, empty string uses default project
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * ID of the project to request, UUIDv4, empty string uses default project
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <pre>
     * The ID of the organization owning the project, empty for default org for user
     * </pre>
     *
     * <code>optional string owner_id = 2 [json_name = "ownerId"];</code>
     */
    public var ownerId: kotlin.String
      @JvmName("getOwnerId")
      get() = _builder.getOwnerId()
      @JvmName("setOwnerId")
      set(value) {
        _builder.setOwnerId(value)
      }
    /**
     * <pre>
     * The ID of the organization owning the project, empty for default org for user
     * </pre>
     *
     * <code>optional string owner_id = 2 [json_name = "ownerId"];</code>
     */
    public fun clearOwnerId() {
      _builder.clearOwnerId()
    }
    /**
     * <pre>
     * The ID of the organization owning the project, empty for default org for user
     * </pre>
     *
     * <code>optional string owner_id = 2 [json_name = "ownerId"];</code>
     * @return Whether the ownerId field is set.
     */
    public fun hasOwnerId(): kotlin.Boolean {
      return _builder.hasOwnerId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.ProjectOuterClass.GetProjectRequest.copy(block: gooseai.GetProjectRequestKt.Dsl.() -> kotlin.Unit): gooseai.ProjectOuterClass.GetProjectRequest =
  gooseai.GetProjectRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

