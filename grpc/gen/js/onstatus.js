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

goog.provide('proto.gooseai.OnStatus');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.gooseai.FinishReason');
goog.forwardDeclare('proto.gooseai.StageAction');
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
proto.gooseai.OnStatus = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gooseai.OnStatus.repeatedFields_, null);
};
goog.inherits(proto.gooseai.OnStatus, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.OnStatus.displayName = 'proto.gooseai.OnStatus';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gooseai.OnStatus.repeatedFields_ = [1,3];



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
proto.gooseai.OnStatus.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.OnStatus.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.OnStatus} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.OnStatus.toObject = function(includeInstance, msg) {
  var f, obj = {
    reasonList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    target: jspb.Message.getFieldWithDefault(msg, 2, ""),
    actionList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.gooseai.OnStatus}
 */
proto.gooseai.OnStatus.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.OnStatus;
  return proto.gooseai.OnStatus.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.OnStatus} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.OnStatus}
 */
proto.gooseai.OnStatus.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var values = /** @type {!Array<!proto.gooseai.FinishReason>} */ (reader.isDelimited() ? reader.readPackedEnum() : [reader.readEnum()]);
      for (var i = 0; i < values.length; i++) {
        msg.addReason(values[i]);
      }
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTarget(value);
      break;
    case 3:
      var values = /** @type {!Array<!proto.gooseai.StageAction>} */ (reader.isDelimited() ? reader.readPackedEnum() : [reader.readEnum()]);
      for (var i = 0; i < values.length; i++) {
        msg.addAction(values[i]);
      }
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
proto.gooseai.OnStatus.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.OnStatus.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.OnStatus} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.OnStatus.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getReasonList();
  if (f.length > 0) {
    writer.writePackedEnum(
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
  f = message.getActionList();
  if (f.length > 0) {
    writer.writePackedEnum(
      3,
      f
    );
  }
};


/**
 * repeated FinishReason reason = 1;
 * @return {!Array<!proto.gooseai.FinishReason>}
 */
proto.gooseai.OnStatus.prototype.getReasonList = function() {
  return /** @type {!Array<!proto.gooseai.FinishReason>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<!proto.gooseai.FinishReason>} value
 * @return {!proto.gooseai.OnStatus} returns this
 */
proto.gooseai.OnStatus.prototype.setReasonList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {!proto.gooseai.FinishReason} value
 * @param {number=} opt_index
 * @return {!proto.gooseai.OnStatus} returns this
 */
proto.gooseai.OnStatus.prototype.addReason = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.OnStatus} returns this
 */
proto.gooseai.OnStatus.prototype.clearReasonList = function() {
  return this.setReasonList([]);
};


/**
 * optional string target = 2;
 * @return {string}
 */
proto.gooseai.OnStatus.prototype.getTarget = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.OnStatus} returns this
 */
proto.gooseai.OnStatus.prototype.setTarget = function(value) {
  return jspb.Message.setField(this, 2, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.gooseai.OnStatus} returns this
 */
proto.gooseai.OnStatus.prototype.clearTarget = function() {
  return jspb.Message.setField(this, 2, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.OnStatus.prototype.hasTarget = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated StageAction action = 3;
 * @return {!Array<!proto.gooseai.StageAction>}
 */
proto.gooseai.OnStatus.prototype.getActionList = function() {
  return /** @type {!Array<!proto.gooseai.StageAction>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<!proto.gooseai.StageAction>} value
 * @return {!proto.gooseai.OnStatus} returns this
 */
proto.gooseai.OnStatus.prototype.setActionList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {!proto.gooseai.StageAction} value
 * @param {number=} opt_index
 * @return {!proto.gooseai.OnStatus} returns this
 */
proto.gooseai.OnStatus.prototype.addAction = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.OnStatus} returns this
 */
proto.gooseai.OnStatus.prototype.clearActionList = function() {
  return this.setActionList([]);
};


