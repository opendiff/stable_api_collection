// source: project.proto
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

goog.provide('proto.gooseai.QueryAssetsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gooseai.ProjectAsset');

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
proto.gooseai.QueryAssetsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gooseai.QueryAssetsResponse.repeatedFields_, null);
};
goog.inherits(proto.gooseai.QueryAssetsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.QueryAssetsResponse.displayName = 'proto.gooseai.QueryAssetsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gooseai.QueryAssetsResponse.repeatedFields_ = [1];



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
proto.gooseai.QueryAssetsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.QueryAssetsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.QueryAssetsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.QueryAssetsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    assetsList: jspb.Message.toObjectList(msg.getAssetsList(),
    proto.gooseai.ProjectAsset.toObject, includeInstance),
    lastKey: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.gooseai.QueryAssetsResponse}
 */
proto.gooseai.QueryAssetsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.QueryAssetsResponse;
  return proto.gooseai.QueryAssetsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.QueryAssetsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.QueryAssetsResponse}
 */
proto.gooseai.QueryAssetsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.gooseai.ProjectAsset;
      reader.readMessage(value,proto.gooseai.ProjectAsset.deserializeBinaryFromReader);
      msg.addAssets(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setLastKey(value);
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
proto.gooseai.QueryAssetsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.QueryAssetsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.QueryAssetsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.QueryAssetsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAssetsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.gooseai.ProjectAsset.serializeBinaryToWriter
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 2));
  if (f != null) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * repeated ProjectAsset assets = 1;
 * @return {!Array<!proto.gooseai.ProjectAsset>}
 */
proto.gooseai.QueryAssetsResponse.prototype.getAssetsList = function() {
  return /** @type{!Array<!proto.gooseai.ProjectAsset>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gooseai.ProjectAsset, 1));
};


/**
 * @param {!Array<!proto.gooseai.ProjectAsset>} value
 * @return {!proto.gooseai.QueryAssetsResponse} returns this
*/
proto.gooseai.QueryAssetsResponse.prototype.setAssetsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.gooseai.ProjectAsset=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gooseai.ProjectAsset}
 */
proto.gooseai.QueryAssetsResponse.prototype.addAssets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.gooseai.ProjectAsset, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.QueryAssetsResponse} returns this
 */
proto.gooseai.QueryAssetsResponse.prototype.clearAssetsList = function() {
  return this.setAssetsList([]);
};


/**
 * optional string last_key = 2;
 * @return {string}
 */
proto.gooseai.QueryAssetsResponse.prototype.getLastKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.gooseai.QueryAssetsResponse} returns this
 */
proto.gooseai.QueryAssetsResponse.prototype.setLastKey = function(value) {
  return jspb.Message.setField(this, 2, value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.gooseai.QueryAssetsResponse} returns this
 */
proto.gooseai.QueryAssetsResponse.prototype.clearLastKey = function() {
  return jspb.Message.setField(this, 2, undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.QueryAssetsResponse.prototype.hasLastKey = function() {
  return jspb.Message.getField(this, 2) != null;
};


