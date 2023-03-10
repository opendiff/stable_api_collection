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

goog.provide('proto.gooseai.Model');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.gooseai.ModelArchitecture');
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
proto.gooseai.Model = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.gooseai.Model, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.Model.displayName = 'proto.gooseai.Model';
}



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
proto.gooseai.Model.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.Model.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.Model} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Model.toObject = function(includeInstance, msg) {
  var f, obj = {
    architecture: jspb.Message.getFieldWithDefault(msg, 1, 0),
    publisher: jspb.Message.getFieldWithDefault(msg, 2, ""),
    dataset: jspb.Message.getFieldWithDefault(msg, 3, ""),
    version: jspb.Message.getFloatingPointFieldWithDefault(msg, 4, 0.0),
    semanticVersion: jspb.Message.getFieldWithDefault(msg, 5, ""),
    alias: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.gooseai.Model}
 */
proto.gooseai.Model.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.Model;
  return proto.gooseai.Model.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.Model} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.Model}
 */
proto.gooseai.Model.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.gooseai.ModelArchitecture} */ (reader.readEnum());
      msg.setArchitecture(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPublisher(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDataset(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setVersion(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSemanticVersion(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setAlias(value);
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
proto.gooseai.Model.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.Model.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.Model} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Model.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getArchitecture();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getPublisher();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDataset();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getVersion();
  if (f !== 0.0) {
    writer.writeFloat(
      4,
      f
    );
  }
  f = message.getSemanticVersion();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getAlias();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional ModelArchitecture architecture = 1;
 * @return {!proto.gooseai.ModelArchitecture}
 */
proto.gooseai.Model.prototype.getArchitecture = function() {
  return /** @type {!proto.gooseai.ModelArchitecture} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.gooseai.ModelArchitecture} value
 * @return {!proto.gooseai.Model} returns this
 */
proto.gooseai.Model.prototype.setArchitecture = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional string publisher = 2;
 * @return {string}
 */
proto.gooseai.Model.prototype.getPublisher = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Model} returns this
 */
proto.gooseai.Model.prototype.setPublisher = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string dataset = 3;
 * @return {string}
 */
proto.gooseai.Model.prototype.getDataset = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Model} returns this
 */
proto.gooseai.Model.prototype.setDataset = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional float version = 4;
 * @return {number}
 */
proto.gooseai.Model.prototype.getVersion = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 4, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.Model} returns this
 */
proto.gooseai.Model.prototype.setVersion = function(value) {
  return jspb.Message.setProto3FloatField(this, 4, value);
};


/**
 * optional string semantic_version = 5;
 * @return {string}
 */
proto.gooseai.Model.prototype.getSemanticVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Model} returns this
 */
proto.gooseai.Model.prototype.setSemanticVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string alias = 6;
 * @return {string}
 */
proto.gooseai.Model.prototype.getAlias = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Model} returns this
 */
proto.gooseai.Model.prototype.setAlias = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


