//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: project.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeupdateProjectRequest")
public inline fun updateProjectRequest(block: gooseai.UpdateProjectRequestKt.Dsl.() -> kotlin.Unit): gooseai.ProjectOuterClass.UpdateProjectRequest =
  gooseai.UpdateProjectRequestKt.Dsl._create(gooseai.ProjectOuterClass.UpdateProjectRequest.newBuilder()).apply { block() }._build()
public object UpdateProjectRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.ProjectOuterClass.UpdateProjectRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.ProjectOuterClass.UpdateProjectRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.ProjectOuterClass.UpdateProjectRequest = _builder.build()

    /**
     * <pre>
     * ID of the project, UUIDv4
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
     * ID of the project, UUIDv4
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

    /**
     * <pre>
     * Title of the project
     * </pre>
     *
     * <code>optional string title = 3 [json_name = "title"];</code>
     */
    public var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <pre>
     * Title of the project
     * </pre>
     *
     * <code>optional string title = 3 [json_name = "title"];</code>
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }
    /**
     * <pre>
     * Title of the project
     * </pre>
     *
     * <code>optional string title = 3 [json_name = "title"];</code>
     * @return Whether the title field is set.
     */
    public fun hasTitle(): kotlin.Boolean {
      return _builder.hasTitle()
    }

    /**
     * <pre>
     * The access of the project (such as public vs private)
     * </pre>
     *
     * <code>optional .gooseai.ProjectAccess access = 4 [json_name = "access"];</code>
     */
    public var access: gooseai.ProjectOuterClass.ProjectAccess
      @JvmName("getAccess")
      get() = _builder.getAccess()
      @JvmName("setAccess")
      set(value) {
        _builder.setAccess(value)
      }
    /**
     * <pre>
     * The access of the project (such as public vs private)
     * </pre>
     *
     * <code>optional .gooseai.ProjectAccess access = 4 [json_name = "access"];</code>
     */
    public fun clearAccess() {
      _builder.clearAccess()
    }
    /**
     * <pre>
     * The access of the project (such as public vs private)
     * </pre>
     *
     * <code>optional .gooseai.ProjectAccess access = 4 [json_name = "access"];</code>
     * @return Whether the access field is set.
     */
    public fun hasAccess(): kotlin.Boolean {
      return _builder.hasAccess()
    }

    /**
     * <pre>
     * The status of the project (such as active vs inactive)
     * </pre>
     *
     * <code>optional .gooseai.ProjectStatus status = 5 [json_name = "status"];</code>
     */
    public var status: gooseai.ProjectOuterClass.ProjectStatus
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    /**
     * <pre>
     * The status of the project (such as active vs inactive)
     * </pre>
     *
     * <code>optional .gooseai.ProjectStatus status = 5 [json_name = "status"];</code>
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
    /**
     * <pre>
     * The status of the project (such as active vs inactive)
     * </pre>
     *
     * <code>optional .gooseai.ProjectStatus status = 5 [json_name = "status"];</code>
     * @return Whether the status field is set.
     */
    public fun hasStatus(): kotlin.Boolean {
      return _builder.hasStatus()
    }

    /**
     * <pre>
     * Project file for the project
     * </pre>
     *
     * <code>optional .gooseai.ProjectAsset file = 6 [json_name = "file"];</code>
     */
    public var file: gooseai.ProjectOuterClass.ProjectAsset
      @JvmName("getFile")
      get() = _builder.getFile()
      @JvmName("setFile")
      set(value) {
        _builder.setFile(value)
      }
    /**
     * <pre>
     * Project file for the project
     * </pre>
     *
     * <code>optional .gooseai.ProjectAsset file = 6 [json_name = "file"];</code>
     */
    public fun clearFile() {
      _builder.clearFile()
    }
    /**
     * <pre>
     * Project file for the project
     * </pre>
     *
     * <code>optional .gooseai.ProjectAsset file = 6 [json_name = "file"];</code>
     * @return Whether the file field is set.
     */
    public fun hasFile(): kotlin.Boolean {
      return _builder.hasFile()
    }
    public val UpdateProjectRequestKt.Dsl.fileOrNull: gooseai.ProjectOuterClass.ProjectAsset?
      get() = _builder.fileOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.ProjectOuterClass.UpdateProjectRequest.copy(block: gooseai.UpdateProjectRequestKt.Dsl.() -> kotlin.Unit): gooseai.ProjectOuterClass.UpdateProjectRequest =
  gooseai.UpdateProjectRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val gooseai.ProjectOuterClass.UpdateProjectRequestOrBuilder.fileOrNull: gooseai.ProjectOuterClass.ProjectAsset?
  get() = if (hasFile()) getFile() else null

