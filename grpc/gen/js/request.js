// source: generation.proto
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

goog.provide('proto.gooseai.Request');
goog.provide('proto.gooseai.Request.ParamsCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gooseai.AssetParameters');
goog.require('proto.gooseai.ClassifierParameters');
goog.require('proto.gooseai.ConditionerParameters');
goog.require('proto.gooseai.ImageParameters');
goog.require('proto.gooseai.Prompt');

goog.forwardDeclare('proto.gooseai.ArtifactType');
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
proto.gooseai.Request = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gooseai.Request.repeatedFields_, proto.gooseai.Request.oneofGroups_);
};
goog.inherits(proto.gooseai.Request, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.Request.displayName = 'proto.gooseai.Request';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gooseai.Request.repeatedFields_ = [4];

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.gooseai.Request.oneofGroups_ = [[5,7,8]];

/**
 * @enum {number}
 */
proto.gooseai.Request.ParamsCase = {
  PARAMS_NOT_SET: 0,
  IMAGE: 5,
  CLASSIFIER: 7,
  ASSET: 8
};

/**
 * @return {proto.gooseai.Request.ParamsCase}
 */
proto.gooseai.Request.prototype.getParamsCase = function() {
  return /** @type {proto.gooseai.Request.ParamsCase} */(jspb.Message.computeOneofCase(this, proto.gooseai.Request.oneofGroups_[0]));
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
proto.gooseai.Request.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.Request.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.Request} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Request.toObject = function(includeInstance, msg) {
  var f, obj = {
    engineId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    requestId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    requestedType: jspb.Message.getFieldWithDefault(msg, 3, 0),
    promptList: jspb.Message.toObjectList(msg.getPromptList(),
    proto.gooseai.Prompt.toObject, includeInstance),
    image: (f = msg.getImage()) && proto.gooseai.ImageParameters.toObject(includeInstance, f),
    classifier: (f = msg.getClassifier()) && proto.gooseai.ClassifierParameters.toObject(includeInstance, f),
    asset: (f = msg.getAsset()) && proto.gooseai.AssetParameters.toObject(includeInstance, f),
    conditioner: (f = msg.getConditioner()) && proto.gooseai.ConditionerParameters.toObject(includeInstance, f)
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
 * @return {!proto.gooseai.Request}
 */
proto.gooseai.Request.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.Request;
  return proto.gooseai.Request.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.Request} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.Request}
 */
proto.gooseai.Request.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setEngineId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setRequestId(value);
      break;
    case 3:
      var value = /** @type {!proto.gooseai.ArtifactType} */ (reader.readEnum());
      msg.setRequestedType(value);
      break;
    case 4:
      var value = new proto.gooseai.Prompt;
      reader.readMessage(value,proto.gooseai.Prompt.deserializeBinaryFromReader);
      msg.addPrompt(value);
      break;
    case 5:
      var value = new proto.gooseai.ImageParameters;
      reader.readMessage(value,proto.gooseai.ImageParameters.deserializeBinaryFromReader);
      msg.setImage(value);
      break;
    case 7:
      var value = new proto.gooseai.ClassifierParameters;
      reader.readMessage(value,proto.gooseai.ClassifierParameters.deserializeBinaryFromReader);
      msg.setClassifier(value);
      break;
    case 8:
      var value = new proto.gooseai.AssetParameters;
      reader.readMessage(value,proto.gooseai.AssetParameters.deserializeBinaryFromReader);
      msg.setAsset(value);
      break;
    case 6:
      var value = new proto.gooseai.ConditionerParameters;
      reader.readMessage(value,proto.gooseai.ConditionerParameters.deserializeBinaryFromReader);
      msg.setConditioner(value);
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
proto.gooseai.Request.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.Request.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.Request} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Request.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEngineId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getRequestId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRequestedType();
  if (f !== 0.0) {
    writer.writeEnum(
      3,
      f
    );
  }
  f = message.getPromptList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.gooseai.Prompt.serializeBinaryToWriter
    );
  }
  f = message.getImage();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.gooseai.ImageParameters.serializeBinaryToWriter
    );
  }
  f = message.getClassifier();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.gooseai.ClassifierParameters.serializeBinaryToWriter
    );
  }
  f = message.getAsset();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.gooseai.AssetParameters.serializeBinaryToWriter
    );
  }
  f = message.getConditioner();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.gooseai.ConditionerParameters.serializeBinaryToWriter
    );
  }
};


/**
 * optional string engine_id = 1;
 * @return {string}
 */
proto.gooseai.Request.prototype.getEngineId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Request} returns this
 */
proto.gooseai.Request.prototype.setEngineId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string request_id = 2;
 * @return {string}
 */
proto.gooseai.Request.prototype.getRequestId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Request} returns this
 */
proto.gooseai.Request.prototype.setRequestId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional ArtifactType requested_type = 3;
 * @return {!proto.gooseai.ArtifactType}
 */
proto.gooseai.Request.prototype.getRequestedType = function() {
  return /** @type {!proto.gooseai.ArtifactType} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.gooseai.ArtifactType} value
 * @return {!proto.gooseai.Request} returns this
 */
proto.gooseai.Request.prototype.setRequestedType = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};


/**
 * repeated Prompt prompt = 4;
 * @return {!Array<!proto.gooseai.Prompt>}
 */
proto.gooseai.Request.prototype.getPromptList = function() {
  return /** @type{!Array<!proto.gooseai.Prompt>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gooseai.Prompt, 4));
};


/**
 * @param {!Array<!proto.gooseai.Prompt>} value
 * @return {!proto.gooseai.Request} returns this
*/
proto.gooseai.Request.prototype.setPromptList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.gooseai.Prompt=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gooseai.Prompt}
 */
proto.gooseai.Request.prototype.addPrompt = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.gooseai.Prompt, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.Request} returns this
 */
proto.gooseai.Request.prototype.clearPromptList = function() {
  return this.setPromptList([]);
};


/**
 * optional ImageParameters image = 5;
 * @return {?proto.gooseai.ImageParameters}
 */
proto.gooseai.Request.prototype.getImage = function() {
  return /** @type{?proto.gooseai.ImageParameters} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.ImageParameters, 5));
};


/**
 * @param {?proto.gooseai.ImageParameters|undefined} value
 * @return {!proto.gooseai.Request} returns this
*/
proto.gooseai.Request.prototype.setImage = function(value) {
  return jspb.Message.setOneofWrapperField(this, 5, proto.gooseai.Request.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Request} returns this
 */
proto.gooseai.Request.prototype.clearImage = function() {
  return this.setImage(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Request.prototype.hasImage = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional ClassifierParameters classifier = 7;
 * @return {?proto.gooseai.ClassifierParameters}
 */
proto.gooseai.Request.prototype.getClassifier = function() {
  return /** @type{?proto.gooseai.ClassifierParameters} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.ClassifierParameters, 7));
};


/**
 * @param {?proto.gooseai.ClassifierParameters|undefined} value
 * @return {!proto.gooseai.Request} returns this
*/
proto.gooseai.Request.prototype.setClassifier = function(value) {
  return jspb.Message.setOneofWrapperField(this, 7, proto.gooseai.Request.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Request} returns this
 */
proto.gooseai.Request.prototype.clearClassifier = function() {
  return this.setClassifier(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Request.prototype.hasClassifier = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional AssetParameters asset = 8;
 * @return {?proto.gooseai.AssetParameters}
 */
proto.gooseai.Request.prototype.getAsset = function() {
  return /** @type{?proto.gooseai.AssetParameters} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.AssetParameters, 8));
};


/**
 * @param {?proto.gooseai.AssetParameters|undefined} value
 * @return {!proto.gooseai.Request} returns this
*/
proto.gooseai.Request.prototype.setAsset = function(value) {
  return jspb.Message.setOneofWrapperField(this, 8, proto.gooseai.Request.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Request} returns this
 */
proto.gooseai.Request.prototype.clearAsset = function() {
  return this.setAsset(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Request.prototype.hasAsset = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional ConditionerParameters conditioner = 6;
 * @return {?proto.gooseai.ConditionerParameters}
 */
proto.gooseai.Request.prototype.getConditioner = function() {
  return /** @type{?proto.gooseai.ConditionerParameters} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.ConditionerParameters, 6));
};


/**
 * @param {?proto.gooseai.ConditionerParameters|undefined} value
 * @return {!proto.gooseai.Request} returns this
*/
proto.gooseai.Request.prototype.setConditioner = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Request} returns this
 */
proto.gooseai.Request.prototype.clearConditioner = function() {
  return this.setConditioner(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Request.prototype.hasConditioner = function() {
  return jspb.Message.getField(this, 6) != null;
};


