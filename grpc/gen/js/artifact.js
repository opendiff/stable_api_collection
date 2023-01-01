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

goog.provide('proto.gooseai.Artifact');
goog.provide('proto.gooseai.Artifact.DataCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gooseai.ClassifierParameters');
goog.require('proto.gooseai.Tokens');
goog.require('proto.tensors.Tensor');

goog.forwardDeclare('proto.gooseai.ArtifactType');
goog.forwardDeclare('proto.gooseai.FinishReason');
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
proto.gooseai.Artifact = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.gooseai.Artifact.oneofGroups_);
};
goog.inherits(proto.gooseai.Artifact, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.Artifact.displayName = 'proto.gooseai.Artifact';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.gooseai.Artifact.oneofGroups_ = [[5,6,7,11,14]];

/**
 * @enum {number}
 */
proto.gooseai.Artifact.DataCase = {
  DATA_NOT_SET: 0,
  BINARY: 5,
  TEXT: 6,
  TOKENS: 7,
  CLASSIFIER: 11,
  TENSOR: 14
};

/**
 * @return {proto.gooseai.Artifact.DataCase}
 */
proto.gooseai.Artifact.prototype.getDataCase = function() {
  return /** @type {proto.gooseai.Artifact.DataCase} */(jspb.Message.computeOneofCase(this, proto.gooseai.Artifact.oneofGroups_[0]));
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
proto.gooseai.Artifact.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.Artifact.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.Artifact} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Artifact.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    type: jspb.Message.getFieldWithDefault(msg, 2, 0),
    mime: jspb.Message.getFieldWithDefault(msg, 3, ""),
    magic: jspb.Message.getFieldWithDefault(msg, 4, ""),
    binary: msg.getBinary_asB64(),
    text: jspb.Message.getFieldWithDefault(msg, 6, ""),
    tokens: (f = msg.getTokens()) && proto.gooseai.Tokens.toObject(includeInstance, f),
    classifier: (f = msg.getClassifier()) && proto.gooseai.ClassifierParameters.toObject(includeInstance, f),
    tensor: (f = msg.getTensor()) && proto.tensors.Tensor.toObject(includeInstance, f),
    index: jspb.Message.getFieldWithDefault(msg, 8, 0),
    finishReason: jspb.Message.getFieldWithDefault(msg, 9, 0),
    seed: jspb.Message.getFieldWithDefault(msg, 10, 0),
    uuid: jspb.Message.getFieldWithDefault(msg, 12, ""),
    size: jspb.Message.getFieldWithDefault(msg, 13, 0)
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
 * @return {!proto.gooseai.Artifact}
 */
proto.gooseai.Artifact.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.Artifact;
  return proto.gooseai.Artifact.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.Artifact} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.Artifact}
 */
proto.gooseai.Artifact.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {!proto.gooseai.ArtifactType} */ (reader.readEnum());
      msg.setType(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMime(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setMagic(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setBinary(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setText(value);
      break;
    case 7:
      var value = new proto.gooseai.Tokens;
      reader.readMessage(value,proto.gooseai.Tokens.deserializeBinaryFromReader);
      msg.setTokens(value);
      break;
    case 11:
      var value = new proto.gooseai.ClassifierParameters;
      reader.readMessage(value,proto.gooseai.ClassifierParameters.deserializeBinaryFromReader);
      msg.setClassifier(value);
      break;
    case 14:
      var value = new proto.tensors.Tensor;
      reader.readMessage(value,proto.tensors.Tensor.deserializeBinaryFromReader);
      msg.setTensor(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setIndex(value);
      break;
    case 9:
      var value = /** @type {!proto.gooseai.FinishReason} */ (reader.readEnum());
      msg.setFinishReason(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setSeed(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setUuid(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSize(value);
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
proto.gooseai.Artifact.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.Artifact.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.Artifact} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Artifact.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getType();
  if (f !== 0.0) {
    writer.writeEnum(
      2,
      f
    );
  }
  f = message.getMime();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 4));
  if (f != null) {
    writer.writeString(
      4,
      f
    );
  }
  f = /** @type {!(string|Uint8Array)} */ (jspb.Message.getField(message, 5));
  if (f != null) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 6));
  if (f != null) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getTokens();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.gooseai.Tokens.serializeBinaryToWriter
    );
  }
  f = message.getClassifier();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.gooseai.ClassifierParameters.serializeBinaryToWriter
    );
  }
  f = message.getTensor();
  if (f != null) {
    writer.writeMessage(
      14,
      f,
      proto.tensors.Tensor.serializeBinaryToWriter
    );
  }
  f = message.getIndex();
  if (f !== 0) {
    writer.writeUint32(
      8,
      f
    );
  }
  f = message.getFinishReason();
  if (f !== 0.0) {
    writer.writeEnum(
      9,
      f
    );
  }
  f = message.getSeed();
  if (f !== 0) {
    writer.writeUint32(
      10,
      f
    );
  }
  f = message.getUuid();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getSize();
  if (f !== 0) {
    writer.writeUint64(
      13,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.gooseai.Artifact.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional ArtifactType type = 2;
 * @return {!proto.gooseai.ArtifactType}
 */
proto.gooseai.Artifact.prototype.getType = function() {
  return /** @type {!proto.gooseai.ArtifactType} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {!proto.gooseai.ArtifactType} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setType = function(value) {
  return jspb.Message.setProto3EnumField(this, 2, value);
};


/**
 * optional string mime = 3;
 * @return {string}
 */
proto.gooseai.Artifact.prototype.getMime = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setMime = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string magic = 4;
 * @return {string}
 */
proto.gooseai.Artifact.prototype.getMagic = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setMagic = function(value) {
  return jspb.Message.setField(this, 4, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.clearMagic = function() {
  return jspb.Message.setField(this, 4, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Artifact.prototype.hasMagic = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional bytes binary = 5;
 * @return {string}
 */
proto.gooseai.Artifact.prototype.getBinary = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes binary = 5;
 * This is a type-conversion wrapper around `getBinary()`
 * @return {string}
 */
proto.gooseai.Artifact.prototype.getBinary_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getBinary()));
};


/**
 * optional bytes binary = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getBinary()`
 * @return {!Uint8Array}
 */
proto.gooseai.Artifact.prototype.getBinary_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getBinary()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setBinary = function(value) {
  return jspb.Message.setOneofField(this, 5, proto.gooseai.Artifact.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.clearBinary = function() {
  return jspb.Message.setOneofField(this, 5, proto.gooseai.Artifact.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Artifact.prototype.hasBinary = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string text = 6;
 * @return {string}
 */
proto.gooseai.Artifact.prototype.getText = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setText = function(value) {
  return jspb.Message.setOneofField(this, 6, proto.gooseai.Artifact.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.clearText = function() {
  return jspb.Message.setOneofField(this, 6, proto.gooseai.Artifact.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Artifact.prototype.hasText = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional Tokens tokens = 7;
 * @return {?proto.gooseai.Tokens}
 */
proto.gooseai.Artifact.prototype.getTokens = function() {
  return /** @type{?proto.gooseai.Tokens} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.Tokens, 7));
};


/**
 * @param {?proto.gooseai.Tokens|undefined} value
 * @return {!proto.gooseai.Artifact} returns this
*/
proto.gooseai.Artifact.prototype.setTokens = function(value) {
  return jspb.Message.setOneofWrapperField(this, 7, proto.gooseai.Artifact.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.clearTokens = function() {
  return this.setTokens(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Artifact.prototype.hasTokens = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional ClassifierParameters classifier = 11;
 * @return {?proto.gooseai.ClassifierParameters}
 */
proto.gooseai.Artifact.prototype.getClassifier = function() {
  return /** @type{?proto.gooseai.ClassifierParameters} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.ClassifierParameters, 11));
};


/**
 * @param {?proto.gooseai.ClassifierParameters|undefined} value
 * @return {!proto.gooseai.Artifact} returns this
*/
proto.gooseai.Artifact.prototype.setClassifier = function(value) {
  return jspb.Message.setOneofWrapperField(this, 11, proto.gooseai.Artifact.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.clearClassifier = function() {
  return this.setClassifier(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Artifact.prototype.hasClassifier = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional tensors.Tensor tensor = 14;
 * @return {?proto.tensors.Tensor}
 */
proto.gooseai.Artifact.prototype.getTensor = function() {
  return /** @type{?proto.tensors.Tensor} */ (
    jspb.Message.getWrapperField(this, proto.tensors.Tensor, 14));
};


/**
 * @param {?proto.tensors.Tensor|undefined} value
 * @return {!proto.gooseai.Artifact} returns this
*/
proto.gooseai.Artifact.prototype.setTensor = function(value) {
  return jspb.Message.setOneofWrapperField(this, 14, proto.gooseai.Artifact.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.clearTensor = function() {
  return this.setTensor(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Artifact.prototype.hasTensor = function() {
  return jspb.Message.getField(this, 14) != null;
};


/**
 * optional uint32 index = 8;
 * @return {number}
 */
proto.gooseai.Artifact.prototype.getIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional FinishReason finish_reason = 9;
 * @return {!proto.gooseai.FinishReason}
 */
proto.gooseai.Artifact.prototype.getFinishReason = function() {
  return /** @type {!proto.gooseai.FinishReason} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {!proto.gooseai.FinishReason} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setFinishReason = function(value) {
  return jspb.Message.setProto3EnumField(this, 9, value);
};


/**
 * optional uint32 seed = 10;
 * @return {number}
 */
proto.gooseai.Artifact.prototype.getSeed = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setSeed = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional string uuid = 12;
 * @return {string}
 */
proto.gooseai.Artifact.prototype.getUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setUuid = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * optional uint64 size = 13;
 * @return {number}
 */
proto.gooseai.Artifact.prototype.getSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 13, 0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.Artifact} returns this
 */
proto.gooseai.Artifact.prototype.setSize = function(value) {
  return jspb.Message.setProto3IntField(this, 13, value);
};


