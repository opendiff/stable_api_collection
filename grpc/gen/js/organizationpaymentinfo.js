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

goog.provide('proto.gooseai.OrganizationPaymentInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gooseai.OrganizationGrant');

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
proto.gooseai.OrganizationPaymentInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gooseai.OrganizationPaymentInfo.repeatedFields_, null);
};
goog.inherits(proto.gooseai.OrganizationPaymentInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.OrganizationPaymentInfo.displayName = 'proto.gooseai.OrganizationPaymentInfo';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gooseai.OrganizationPaymentInfo.repeatedFields_ = [2];



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
proto.gooseai.OrganizationPaymentInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.OrganizationPaymentInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.OrganizationPaymentInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.OrganizationPaymentInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    balance: jspb.Message.getFloatingPointFieldWithDefault(msg, 1, 0.0),
    grantsList: jspb.Message.toObjectList(msg.getGrantsList(),
    proto.gooseai.OrganizationGrant.toObject, includeInstance)
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
 * @return {!proto.gooseai.OrganizationPaymentInfo}
 */
proto.gooseai.OrganizationPaymentInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.OrganizationPaymentInfo;
  return proto.gooseai.OrganizationPaymentInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.OrganizationPaymentInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.OrganizationPaymentInfo}
 */
proto.gooseai.OrganizationPaymentInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setBalance(value);
      break;
    case 2:
      var value = new proto.gooseai.OrganizationGrant;
      reader.readMessage(value,proto.gooseai.OrganizationGrant.deserializeBinaryFromReader);
      msg.addGrants(value);
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
proto.gooseai.OrganizationPaymentInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.OrganizationPaymentInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.OrganizationPaymentInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.OrganizationPaymentInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBalance();
  if (f !== 0.0) {
    writer.writeDouble(
      1,
      f
    );
  }
  f = message.getGrantsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.gooseai.OrganizationGrant.serializeBinaryToWriter
    );
  }
};


/**
 * optional double balance = 1;
 * @return {number}
 */
proto.gooseai.OrganizationPaymentInfo.prototype.getBalance = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 1, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.gooseai.OrganizationPaymentInfo} returns this
 */
proto.gooseai.OrganizationPaymentInfo.prototype.setBalance = function(value) {
  return jspb.Message.setProto3FloatField(this, 1, value);
};


/**
 * repeated OrganizationGrant grants = 2;
 * @return {!Array<!proto.gooseai.OrganizationGrant>}
 */
proto.gooseai.OrganizationPaymentInfo.prototype.getGrantsList = function() {
  return /** @type{!Array<!proto.gooseai.OrganizationGrant>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gooseai.OrganizationGrant, 2));
};


/**
 * @param {!Array<!proto.gooseai.OrganizationGrant>} value
 * @return {!proto.gooseai.OrganizationPaymentInfo} returns this
*/
proto.gooseai.OrganizationPaymentInfo.prototype.setGrantsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.gooseai.OrganizationGrant=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gooseai.OrganizationGrant}
 */
proto.gooseai.OrganizationPaymentInfo.prototype.addGrants = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.gooseai.OrganizationGrant, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.OrganizationPaymentInfo} returns this
 */
proto.gooseai.OrganizationPaymentInfo.prototype.clearGrantsList = function() {
  return this.setGrantsList([]);
};


