// source: tensors.proto
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

goog.provide('proto.tensors.Tensor');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.tensors.AttributeType');
goog.forwardDeclare('proto.tensors.Dtype');
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
proto.tensors.Tensor = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.tensors.Tensor.repeatedFields_, null);
};
goog.inherits(proto.tensors.Tensor, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tensors.Tensor.displayName = 'proto.tensors.Tensor';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.tensors.Tensor.repeatedFields_ = [2];



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
proto.tensors.Tensor.prototype.toObject = function(opt_includeInstance) {
  return proto.tensors.Tensor.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tensors.Tensor} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tensors.Tensor.toObject = function(includeInstance, msg) {
  var f, obj = {
    dtype: jspb.Message.getFieldWithDefault(msg, 1, 0),
    shapeList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    data: msg.getData_asB64(),
    attrType: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.tensors.Tensor}
 */
proto.tensors.Tensor.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tensors.Tensor;
  return proto.tensors.Tensor.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tensors.Tensor} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tensors.Tensor}
 */
proto.tensors.Tensor.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.tensors.Dtype} */ (reader.readEnum());
      msg.setDtype(value);
      break;
    case 2:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedInt64() : [reader.readInt64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addShape(values[i]);
      }
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setData(value);
      break;
    case 4:
      var value = /** @type {!proto.tensors.AttributeType} */ (reader.readEnum());
      msg.setAttrType(value);
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
proto.tensors.Tensor.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tensors.Tensor.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tensors.Tensor} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tensors.Tensor.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDtype();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getShapeList();
  if (f.length > 0) {
    writer.writePackedInt64(
      2,
      f
    );
  }
  f = message.getData_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = /** @type {!proto.tensors.AttributeType} */ (jspb.Message.getField(message, 4));
  if (f != null) {
    writer.writeEnum(
      4,
      f
    );
  }
};


/**
 * optional Dtype dtype = 1;
 * @return {!proto.tensors.Dtype}
 */
proto.tensors.Tensor.prototype.getDtype = function() {
  return /** @type {!proto.tensors.Dtype} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.tensors.Dtype} value
 * @return {!proto.tensors.Tensor} returns this
 */
proto.tensors.Tensor.prototype.setDtype = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * repeated int64 shape = 2;
 * @return {!Array<number>}
 */
proto.tensors.Tensor.prototype.getShapeList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.tensors.Tensor} returns this
 */
proto.tensors.Tensor.prototype.setShapeList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.tensors.Tensor} returns this
 */
proto.tensors.Tensor.prototype.addShape = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tensors.Tensor} returns this
 */
proto.tensors.Tensor.prototype.clearShapeList = function() {
  return this.setShapeList([]);
};


/**
 * optional bytes data = 3;
 * @return {string}
 */
proto.tensors.Tensor.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes data = 3;
 * This is a type-conversion wrapper around `getData()`
 * @return {string}
 */
proto.tensors.Tensor.prototype.getData_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getData()));
};


/**
 * optional bytes data = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getData()`
 * @return {!Uint8Array}
 */
proto.tensors.Tensor.prototype.getData_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getData()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.tensors.Tensor} returns this
 */
proto.tensors.Tensor.prototype.setData = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional AttributeType attr_type = 4;
 * @return {!proto.tensors.AttributeType}
 */
proto.tensors.Tensor.prototype.getAttrType = function() {
  return /** @type {!proto.tensors.AttributeType} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.tensors.AttributeType} value
 * @return {!proto.tensors.Tensor} returns this
 */
proto.tensors.Tensor.prototype.setAttrType = function(value) {
  return jspb.Message.setField(this, 4, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.tensors.Tensor} returns this
 */
proto.tensors.Tensor.prototype.clearAttrType = function() {
  return jspb.Message.setField(this, 4, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tensors.Tensor.prototype.hasAttrType = function() {
  return jspb.Message.getField(this, 4) != null;
};


