//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeuser")
public inline fun user(block: gooseai.UserKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.User =
  gooseai.UserKt.Dsl._create(gooseai.Dashboard.User.newBuilder()).apply { block() }._build()
public object UserKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.User.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.User.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.User = _builder.build()

    /**
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
     * <code>string id = 1 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>optional string auth_id = 2 [json_name = "authId"];</code>
     */
    public var authId: kotlin.String
      @JvmName("getAuthId")
      get() = _builder.getAuthId()
      @JvmName("setAuthId")
      set(value) {
        _builder.setAuthId(value)
      }
    /**
     * <code>optional string auth_id = 2 [json_name = "authId"];</code>
     */
    public fun clearAuthId() {
      _builder.clearAuthId()
    }
    /**
     * <code>optional string auth_id = 2 [json_name = "authId"];</code>
     * @return Whether the authId field is set.
     */
    public fun hasAuthId(): kotlin.Boolean {
      return _builder.hasAuthId()
    }

    /**
     * <code>string profile_picture = 3 [json_name = "profilePicture"];</code>
     */
    public var profilePicture: kotlin.String
      @JvmName("getProfilePicture")
      get() = _builder.getProfilePicture()
      @JvmName("setProfilePicture")
      set(value) {
        _builder.setProfilePicture(value)
      }
    /**
     * <code>string profile_picture = 3 [json_name = "profilePicture"];</code>
     */
    public fun clearProfilePicture() {
      _builder.clearProfilePicture()
    }

    /**
     * <code>string email = 4 [json_name = "email"];</code>
     */
    public var email: kotlin.String
      @JvmName("getEmail")
      get() = _builder.getEmail()
      @JvmName("setEmail")
      set(value) {
        _builder.setEmail(value)
      }
    /**
     * <code>string email = 4 [json_name = "email"];</code>
     */
    public fun clearEmail() {
      _builder.clearEmail()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OrganizationsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .gooseai.OrganizationMember organizations = 5 [json_name = "organizations"];</code>
     */
     public val organizations: com.google.protobuf.kotlin.DslList<gooseai.Dashboard.OrganizationMember, OrganizationsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOrganizationsList()
      )
    /**
     * <code>repeated .gooseai.OrganizationMember organizations = 5 [json_name = "organizations"];</code>
     * @param value The organizations to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOrganizations")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.OrganizationMember, OrganizationsProxy>.add(value: gooseai.Dashboard.OrganizationMember) {
      _builder.addOrganizations(value)
    }
    /**
     * <code>repeated .gooseai.OrganizationMember organizations = 5 [json_name = "organizations"];</code>
     * @param value The organizations to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOrganizations")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.OrganizationMember, OrganizationsProxy>.plusAssign(value: gooseai.Dashboard.OrganizationMember) {
      add(value)
    }
    /**
     * <code>repeated .gooseai.OrganizationMember organizations = 5 [json_name = "organizations"];</code>
     * @param values The organizations to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOrganizations")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.OrganizationMember, OrganizationsProxy>.addAll(values: kotlin.collections.Iterable<gooseai.Dashboard.OrganizationMember>) {
      _builder.addAllOrganizations(values)
    }
    /**
     * <code>repeated .gooseai.OrganizationMember organizations = 5 [json_name = "organizations"];</code>
     * @param values The organizations to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOrganizations")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.OrganizationMember, OrganizationsProxy>.plusAssign(values: kotlin.collections.Iterable<gooseai.Dashboard.OrganizationMember>) {
      addAll(values)
    }
    /**
     * <code>repeated .gooseai.OrganizationMember organizations = 5 [json_name = "organizations"];</code>
     * @param index The index to set the value at.
     * @param value The organizations to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOrganizations")
    public operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.OrganizationMember, OrganizationsProxy>.set(index: kotlin.Int, value: gooseai.Dashboard.OrganizationMember) {
      _builder.setOrganizations(index, value)
    }
    /**
     * <code>repeated .gooseai.OrganizationMember organizations = 5 [json_name = "organizations"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOrganizations")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.OrganizationMember, OrganizationsProxy>.clear() {
      _builder.clearOrganizations()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ApiKeysProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .gooseai.APIKey api_keys = 7 [json_name = "apiKeys"];</code>
     */
     public val apiKeys: com.google.protobuf.kotlin.DslList<gooseai.Dashboard.APIKey, ApiKeysProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getApiKeysList()
      )
    /**
     * <code>repeated .gooseai.APIKey api_keys = 7 [json_name = "apiKeys"];</code>
     * @param value The apiKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addApiKeys")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.APIKey, ApiKeysProxy>.add(value: gooseai.Dashboard.APIKey) {
      _builder.addApiKeys(value)
    }
    /**
     * <code>repeated .gooseai.APIKey api_keys = 7 [json_name = "apiKeys"];</code>
     * @param value The apiKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignApiKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.APIKey, ApiKeysProxy>.plusAssign(value: gooseai.Dashboard.APIKey) {
      add(value)
    }
    /**
     * <code>repeated .gooseai.APIKey api_keys = 7 [json_name = "apiKeys"];</code>
     * @param values The apiKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllApiKeys")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.APIKey, ApiKeysProxy>.addAll(values: kotlin.collections.Iterable<gooseai.Dashboard.APIKey>) {
      _builder.addAllApiKeys(values)
    }
    /**
     * <code>repeated .gooseai.APIKey api_keys = 7 [json_name = "apiKeys"];</code>
     * @param values The apiKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllApiKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.APIKey, ApiKeysProxy>.plusAssign(values: kotlin.collections.Iterable<gooseai.Dashboard.APIKey>) {
      addAll(values)
    }
    /**
     * <code>repeated .gooseai.APIKey api_keys = 7 [json_name = "apiKeys"];</code>
     * @param index The index to set the value at.
     * @param value The apiKeys to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setApiKeys")
    public operator fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.APIKey, ApiKeysProxy>.set(index: kotlin.Int, value: gooseai.Dashboard.APIKey) {
      _builder.setApiKeys(index, value)
    }
    /**
     * <code>repeated .gooseai.APIKey api_keys = 7 [json_name = "apiKeys"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearApiKeys")
    public fun com.google.protobuf.kotlin.DslList<gooseai.Dashboard.APIKey, ApiKeysProxy>.clear() {
      _builder.clearApiKeys()
    }


    /**
     * <code>uint64 created_at = 8 [json_name = "createdAt"];</code>
     */
    public var createdAt: kotlin.Long
      @JvmName("getCreatedAt")
      get() = _builder.getCreatedAt()
      @JvmName("setCreatedAt")
      set(value) {
        _builder.setCreatedAt(value)
      }
    /**
     * <code>uint64 created_at = 8 [json_name = "createdAt"];</code>
     */
    public fun clearCreatedAt() {
      _builder.clearCreatedAt()
    }

    /**
     * <code>optional bool email_verified = 9 [json_name = "emailVerified"];</code>
     */
    public var emailVerified: kotlin.Boolean
      @JvmName("getEmailVerified")
      get() = _builder.getEmailVerified()
      @JvmName("setEmailVerified")
      set(value) {
        _builder.setEmailVerified(value)
      }
    /**
     * <code>optional bool email_verified = 9 [json_name = "emailVerified"];</code>
     */
    public fun clearEmailVerified() {
      _builder.clearEmailVerified()
    }
    /**
     * <code>optional bool email_verified = 9 [json_name = "emailVerified"];</code>
     * @return Whether the emailVerified field is set.
     */
    public fun hasEmailVerified(): kotlin.Boolean {
      return _builder.hasEmailVerified()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.User.copy(block: gooseai.UserKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.User =
  gooseai.UserKt.Dsl._create(this.toBuilder()).apply { block() }._build()
