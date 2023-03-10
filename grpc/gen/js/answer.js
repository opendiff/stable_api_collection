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

goog.provide('proto.gooseai.Answer');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gooseai.AnswerMeta');
goog.require('proto.gooseai.Artifact');

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
proto.gooseai.Answer = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gooseai.Answer.repeatedFields_, null);
};
goog.inherits(proto.gooseai.Answer, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.Answer.displayName = 'proto.gooseai.Answer';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gooseai.Answer.repeatedFields_ = [7];



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
proto.gooseai.Answer.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.Answer.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.Answer} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Answer.toObject = function(includeInstance, msg) {
  var f, obj = {
    answerId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    requestId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    received: jspb.Message.getFieldWithDefault(msg, 3, 0),
    created: jspb.Message.getFieldWithDefault(msg, 4, 0),
    meta: (f = msg.getMeta()) && proto.gooseai.AnswerMeta.toObject(includeInstance, f),
    artifactsList: jspb.Message.toObjectList(msg.getArtifactsList(),
    proto.gooseai.Artifact.toObject, includeInstance)
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
 * @return {!proto.gooseai.Answer}
 */
proto.gooseai.Answer.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.Answer;
  return proto.gooseai.Answer.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.Answer} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.Answer}
 */
proto.gooseai.Answer.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAnswerId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setRequestId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setReceived(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCreated(value);
      break;
    case 6:
      var value = new proto.gooseai.AnswerMeta;
      reader.readMessage(value,proto.gooseai.AnswerMeta.deserializeBinaryFromReader);
      msg.setMeta(value);
      break;
    case 7:
      var value = new proto.gooseai.Artifact;
      reader.readMessage(value,proto.gooseai.Artifact.deserializeBinaryFromReader);
      msg.addArtifacts(value);
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
proto.gooseai.Answer.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.Answer.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.Answer} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Answer.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAnswerId();
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
  f = message.getReceived();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getCreated();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getMeta();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.gooseai.AnswerMeta.serializeBinaryToWriter
    );
  }
  f = message.getArtifactsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.gooseai.Artifact.serializeBinaryToWriter
    );
  }
};


/**
 * optional string answer_id = 1;
 * @return {string}
 */
proto.gooseai.Answer.prototype.getAnswerId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Answer} returns this
 */
proto.gooseai.Answer.prototype.setAnswerId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string request_id = 2;
 * @return {string}
 */
proto.gooseai.Answer.prototype.getRequestId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.Answer} returns this
 */
proto.gooseai.Answer.prototype.setRequestId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 received = 3;
 * @return {number}
 */
proto.gooseai.Answer.prototype.getReceived = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.Answer} returns this
 */
proto.gooseai.Answer.prototype.setReceived = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 created = 4;
 * @return {number}
 */
proto.gooseai.Answer.prototype.getCreated = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.Answer} returns this
 */
proto.gooseai.Answer.prototype.setCreated = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional AnswerMeta meta = 6;
 * @return {?proto.gooseai.AnswerMeta}
 */
proto.gooseai.Answer.prototype.getMeta = function() {
  return /** @type{?proto.gooseai.AnswerMeta} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.AnswerMeta, 6));
};


/**
 * @param {?proto.gooseai.AnswerMeta|undefined} value
 * @return {!proto.gooseai.Answer} returns this
*/
proto.gooseai.Answer.prototype.setMeta = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Answer} returns this
 */
proto.gooseai.Answer.prototype.clearMeta = function() {
  return this.setMeta(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Answer.prototype.hasMeta = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * repeated Artifact artifacts = 7;
 * @return {!Array<!proto.gooseai.Artifact>}
 */
proto.gooseai.Answer.prototype.getArtifactsList = function() {
  return /** @type{!Array<!proto.gooseai.Artifact>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gooseai.Artifact, 7));
};


/**
 * @param {!Array<!proto.gooseai.Artifact>} value
 * @return {!proto.gooseai.Answer} returns this
*/
proto.gooseai.Answer.prototype.setArtifactsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.gooseai.Artifact=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gooseai.Artifact}
 */
proto.gooseai.Answer.prototype.addArtifacts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.gooseai.Artifact, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.Answer} returns this
 */
proto.gooseai.Answer.prototype.clearArtifactsList = function() {
  return this.setArtifactsList([]);
};


