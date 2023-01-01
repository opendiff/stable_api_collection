// source: dashboard.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.gooseai.Organization');
goog.provide('proto.gooseai.OrganizationMember');
goog.provide('proto.gooseai.User');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gooseai.APIKey');
goog.require('proto.gooseai.OrganizationAutoCharge');
goog.require('proto.gooseai.OrganizationPaymentInfo');

goog.forwardDeclare('proto.gooseai.OrganizationRole');
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.gooseai.Organization = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gooseai.Organization.repeatedFields_, null);
};
goog.inherits(proto.gooseai.Organization, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.Organization.displayName = 'proto.gooseai.Organization';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.gooseai.OrganizationMember = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.gooseai.OrganizationMember, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.OrganizationMember.displayName = 'proto.gooseai.OrganizationMember';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.gooseai.User = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gooseai.User.repeatedFields_, null);
};
goog.inherits(proto.gooseai.User, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.User.displayName = 'proto.gooseai.User';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gooseai.Organization.repeatedFields_ = [4];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.gooseai.Organization.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.Organization.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.Organization} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Organization.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    description: jspb.Message.getFieldWithDefault(msg, 3, ""),
    membersList: jspb.Message.toObjectList(msg.getMembersList(),
    proto.gooseai.OrganizationMember.toObject, includeInstance),
    paymentInfo: (f = msg.getPaymentInfo()) && proto.gooseai.OrganizationPaymentInfo.toObject(includeInstance, f),
    stripeCustomerId: jspb.Message.getFieldWithDefault(msg, 6, ""),
    autoCharge: (f = msg.getAutoCharge()) && proto.gooseai.OrganizationAutoCharge.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.gooseai.Organization}
 */
proto.gooseai.Organization.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.Organization;
  return proto.gooseai.Organization.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.Organization} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.Organization}
 */
proto.gooseai.Organization.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 4:
      var value = new proto.gooseai.OrganizationMember;
      reader.readMessage(value,proto.gooseai.OrganizationMember.deserializeBinaryFromReader);
      msg.addMembers(value);
      break;
    case 5:
      var value = new proto.gooseai.OrganizationPaymentInfo;
      reader.readMessage(value,proto.gooseai.OrganizationPaymentInfo.deserializeBinaryFromReader);
      msg.setPaymentInfo(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setStripeCustomerId(value);
      break;
    case 7:
      var value = new proto.gooseai.OrganizationAutoCharge;
      reader.readMessage(value,proto.gooseai.OrganizationAutoCharge.deserializeBinaryFromReader);
      msg.setAutoCharge(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.gooseai.Organization.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.Organization.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.Organization} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Organization.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMembersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.gooseai.OrganizationMember.serializeBinaryToWriter
    );
  }
  f = message.getPaymentInfo();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.gooseai.OrganizationPaymentInfo.serializeBinaryToWriter
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 6));
  if (f != null) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getAutoCharge();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.gooseai.OrganizationAutoCharge.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.gooseai.Organization.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Organization} returns this
 */
proto.gooseai.Organization.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.gooseai.Organization.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Organization} returns this
 */
proto.gooseai.Organization.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string description = 3;
 * @return {string}
 */
proto.gooseai.Organization.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Organization} returns this
 */
proto.gooseai.Organization.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated OrganizationMember members = 4;
 * @return {!Array<!proto.gooseai.OrganizationMember>}
 */
proto.gooseai.Organization.prototype.getMembersList = function() {
  return /** @type{!Array<!proto.gooseai.OrganizationMember>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gooseai.OrganizationMember, 4));
};


/**
 * @param {!Array<!proto.gooseai.OrganizationMember>} value
 * @return {!proto.gooseai.Organization} returns this
*/
proto.gooseai.Organization.prototype.setMembersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.gooseai.OrganizationMember=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gooseai.OrganizationMember}
 */
proto.gooseai.Organization.prototype.addMembers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.gooseai.OrganizationMember, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.Organization} returns this
 */
proto.gooseai.Organization.prototype.clearMembersList = function() {
  return this.setMembersList([]);
};


/**
 * optional OrganizationPaymentInfo payment_info = 5;
 * @return {?proto.gooseai.OrganizationPaymentInfo}
 */
proto.gooseai.Organization.prototype.getPaymentInfo = function() {
  return /** @type{?proto.gooseai.OrganizationPaymentInfo} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.OrganizationPaymentInfo, 5));
};


/**
 * @param {?proto.gooseai.OrganizationPaymentInfo|undefined} value
 * @return {!proto.gooseai.Organization} returns this
*/
proto.gooseai.Organization.prototype.setPaymentInfo = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Organization} returns this
 */
proto.gooseai.Organization.prototype.clearPaymentInfo = function() {
  return this.setPaymentInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Organization.prototype.hasPaymentInfo = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string stripe_customer_id = 6;
 * @return {string}
 */
proto.gooseai.Organization.prototype.getStripeCustomerId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Organization} returns this
 */
proto.gooseai.Organization.prototype.setStripeCustomerId = function(value) {
  return jspb.Message.setField(this, 6, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.gooseai.Organization} returns this
 */
proto.gooseai.Organization.prototype.clearStripeCustomerId = function() {
  return jspb.Message.setField(this, 6, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Organization.prototype.hasStripeCustomerId = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional OrganizationAutoCharge auto_charge = 7;
 * @return {?proto.gooseai.OrganizationAutoCharge}
 */
proto.gooseai.Organization.prototype.getAutoCharge = function() {
  return /** @type{?proto.gooseai.OrganizationAutoCharge} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.OrganizationAutoCharge, 7));
};


/**
 * @param {?proto.gooseai.OrganizationAutoCharge|undefined} value
 * @return {!proto.gooseai.Organization} returns this
*/
proto.gooseai.Organization.prototype.setAutoCharge = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Organization} returns this
 */
proto.gooseai.Organization.prototype.clearAutoCharge = function() {
  return this.setAutoCharge(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Organization.prototype.hasAutoCharge = function() {
  return jspb.Message.getField(this, 7) != null;
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.gooseai.OrganizationMember.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.OrganizationMember.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.OrganizationMember} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.OrganizationMember.toObject = function(includeInstance, msg) {
  var f, obj = {
    organization: (f = msg.getOrganization()) && proto.gooseai.Organization.toObject(includeInstance, f),
    user: (f = msg.getUser()) && proto.gooseai.User.toObject(includeInstance, f),
    role: jspb.Message.getFieldWithDefault(msg, 3, 0),
    isDefault: jspb.Message.getBooleanFieldWithDefault(msg, 4, false)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.gooseai.OrganizationMember}
 */
proto.gooseai.OrganizationMember.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.OrganizationMember;
  return proto.gooseai.OrganizationMember.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.OrganizationMember} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.OrganizationMember}
 */
proto.gooseai.OrganizationMember.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.gooseai.Organization;
      reader.readMessage(value,proto.gooseai.Organization.deserializeBinaryFromReader);
      msg.setOrganization(value);
      break;
    case 2:
      var value = new proto.gooseai.User;
      reader.readMessage(value,proto.gooseai.User.deserializeBinaryFromReader);
      msg.setUser(value);
      break;
    case 3:
      var value = /** @type {!proto.gooseai.OrganizationRole} */ (reader.readEnum());
      msg.setRole(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsDefault(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.gooseai.OrganizationMember.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.OrganizationMember.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.OrganizationMember} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.OrganizationMember.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrganization();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.gooseai.Organization.serializeBinaryToWriter
    );
  }
  f = message.getUser();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.gooseai.User.serializeBinaryToWriter
    );
  }
  f = message.getRole();
  if (f !== 0.0) {
    writer.writeEnum(
      3,
      f
    );
  }
  f = message.getIsDefault();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
};


/**
 * optional Organization organization = 1;
 * @return {?proto.gooseai.Organization}
 */
proto.gooseai.OrganizationMember.prototype.getOrganization = function() {
  return /** @type{?proto.gooseai.Organization} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.Organization, 1));
};


/**
 * @param {?proto.gooseai.Organization|undefined} value
 * @return {!proto.gooseai.OrganizationMember} returns this
*/
proto.gooseai.OrganizationMember.prototype.setOrganization = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.OrganizationMember} returns this
 */
proto.gooseai.OrganizationMember.prototype.clearOrganization = function() {
  return this.setOrganization(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.OrganizationMember.prototype.hasOrganization = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional User user = 2;
 * @return {?proto.gooseai.User}
 */
proto.gooseai.OrganizationMember.prototype.getUser = function() {
  return /** @type{?proto.gooseai.User} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.User, 2));
};


/**
 * @param {?proto.gooseai.User|undefined} value
 * @return {!proto.gooseai.OrganizationMember} returns this
*/
proto.gooseai.OrganizationMember.prototype.setUser = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.OrganizationMember} returns this
 */
proto.gooseai.OrganizationMember.prototype.clearUser = function() {
  return this.setUser(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.OrganizationMember.prototype.hasUser = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional OrganizationRole role = 3;
 * @return {!proto.gooseai.OrganizationRole}
 */
proto.gooseai.OrganizationMember.prototype.getRole = function() {
  return /** @type {!proto.gooseai.OrganizationRole} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.gooseai.OrganizationRole} value
 * @return {!proto.gooseai.OrganizationMember} returns this
 */
proto.gooseai.OrganizationMember.prototype.setRole = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};


/**
 * optional bool is_default = 4;
 * @return {boolean}
 */
proto.gooseai.OrganizationMember.prototype.getIsDefault = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.gooseai.OrganizationMember} returns this
 */
proto.gooseai.OrganizationMember.prototype.setIsDefault = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gooseai.User.repeatedFields_ = [5,7];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.gooseai.User.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.User.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.User} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.User.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    authId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    profilePicture: jspb.Message.getFieldWithDefault(msg, 3, ""),
    email: jspb.Message.getFieldWithDefault(msg, 4, ""),
    organizationsList: jspb.Message.toObjectList(msg.getOrganizationsList(),
    proto.gooseai.OrganizationMember.toObject, includeInstance),
    apiKeysList: jspb.Message.toObjectList(msg.getApiKeysList(),
    proto.gooseai.APIKey.toObject, includeInstance),
    createdAt: jspb.Message.getFieldWithDefault(msg, 8, 0),
    emailVerified: jspb.Message.getBooleanFieldWithDefault(msg, 9, false)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.gooseai.User}
 */
proto.gooseai.User.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.User;
  return proto.gooseai.User.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.User} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.User}
 */
proto.gooseai.User.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuthId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setProfilePicture(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setEmail(value);
      break;
    case 5:
      var value = new proto.gooseai.OrganizationMember;
      reader.readMessage(value,proto.gooseai.OrganizationMember.deserializeBinaryFromReader);
      msg.addOrganizations(value);
      break;
    case 7:
      var value = new proto.gooseai.APIKey;
      reader.readMessage(value,proto.gooseai.APIKey.deserializeBinaryFromReader);
      msg.addApiKeys(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCreatedAt(value);
      break;
    case 9:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setEmailVerified(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.gooseai.User.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.User.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.User} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.User.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 2));
  if (f != null) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getProfilePicture();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getEmail();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getOrganizationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.gooseai.OrganizationMember.serializeBinaryToWriter
    );
  }
  f = message.getApiKeysList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.gooseai.APIKey.serializeBinaryToWriter
    );
  }
  f = message.getCreatedAt();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
  f = /** @type {boolean} */ (jspb.Message.getField(message, 9));
  if (f != null) {
    writer.writeBool(
      9,
      f
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.gooseai.User.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string auth_id = 2;
 * @return {string}
 */
proto.gooseai.User.prototype.getAuthId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.setAuthId = function(value) {
  return jspb.Message.setField(this, 2, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.clearAuthId = function() {
  return jspb.Message.setField(this, 2, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.User.prototype.hasAuthId = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string profile_picture = 3;
 * @return {string}
 */
proto.gooseai.User.prototype.getProfilePicture = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.setProfilePicture = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string email = 4;
 * @return {string}
 */
proto.gooseai.User.prototype.getEmail = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.setEmail = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * repeated OrganizationMember organizations = 5;
 * @return {!Array<!proto.gooseai.OrganizationMember>}
 */
proto.gooseai.User.prototype.getOrganizationsList = function() {
  return /** @type{!Array<!proto.gooseai.OrganizationMember>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gooseai.OrganizationMember, 5));
};


/**
 * @param {!Array<!proto.gooseai.OrganizationMember>} value
 * @return {!proto.gooseai.User} returns this
*/
proto.gooseai.User.prototype.setOrganizationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.gooseai.OrganizationMember=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gooseai.OrganizationMember}
 */
proto.gooseai.User.prototype.addOrganizations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.gooseai.OrganizationMember, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.clearOrganizationsList = function() {
  return this.setOrganizationsList([]);
};


/**
 * repeated APIKey api_keys = 7;
 * @return {!Array<!proto.gooseai.APIKey>}
 */
proto.gooseai.User.prototype.getApiKeysList = function() {
  return /** @type{!Array<!proto.gooseai.APIKey>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gooseai.APIKey, 7));
};


/**
 * @param {!Array<!proto.gooseai.APIKey>} value
 * @return {!proto.gooseai.User} returns this
*/
proto.gooseai.User.prototype.setApiKeysList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.gooseai.APIKey=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gooseai.APIKey}
 */
proto.gooseai.User.prototype.addApiKeys = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.gooseai.APIKey, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.clearApiKeysList = function() {
  return this.setApiKeysList([]);
};


/**
 * optional uint64 created_at = 8;
 * @return {number}
 */
proto.gooseai.User.prototype.getCreatedAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.setCreatedAt = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional bool email_verified = 9;
 * @return {boolean}
 */
proto.gooseai.User.prototype.getEmailVerified = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 9, false));
};


/**
 * @param {boolean} value
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.setEmailVerified = function(value) {
  return jspb.Message.setField(this, 9, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.gooseai.User} returns this
 */
proto.gooseai.User.prototype.clearEmailVerified = function() {
  return jspb.Message.setField(this, 9, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.User.prototype.hasEmailVerified = function() {
  return jspb.Message.getField(this, 9) != null;
};

