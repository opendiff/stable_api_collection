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

goog.provide('proto.gooseai.Metrics');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gooseai.TotalMetricsData');
goog.require('proto.gooseai.UsageMetric');

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
proto.gooseai.Metrics = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gooseai.Metrics.repeatedFields_, null);
};
goog.inherits(proto.gooseai.Metrics, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gooseai.Metrics.displayName = 'proto.gooseai.Metrics';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gooseai.Metrics.repeatedFields_ = [1];



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
proto.gooseai.Metrics.prototype.toObject = function(opt_includeInstance) {
  return proto.gooseai.Metrics.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gooseai.Metrics} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Metrics.toObject = function(includeInstance, msg) {
  var f, obj = {
    metricsList: jspb.Message.toObjectList(msg.getMetricsList(),
    proto.gooseai.UsageMetric.toObject, includeInstance),
    total: (f = msg.getTotal()) && proto.gooseai.TotalMetricsData.toObject(includeInstance, f)
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
 * @return {!proto.gooseai.Metrics}
 */
proto.gooseai.Metrics.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gooseai.Metrics;
  return proto.gooseai.Metrics.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gooseai.Metrics} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gooseai.Metrics}
 */
proto.gooseai.Metrics.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.gooseai.UsageMetric;
      reader.readMessage(value,proto.gooseai.UsageMetric.deserializeBinaryFromReader);
      msg.addMetrics(value);
      break;
    case 2:
      var value = new proto.gooseai.TotalMetricsData;
      reader.readMessage(value,proto.gooseai.TotalMetricsData.deserializeBinaryFromReader);
      msg.setTotal(value);
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
proto.gooseai.Metrics.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gooseai.Metrics.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gooseai.Metrics} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gooseai.Metrics.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMetricsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.gooseai.UsageMetric.serializeBinaryToWriter
    );
  }
  f = message.getTotal();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.gooseai.TotalMetricsData.serializeBinaryToWriter
    );
  }
};


/**
 * repeated UsageMetric metrics = 1;
 * @return {!Array<!proto.gooseai.UsageMetric>}
 */
proto.gooseai.Metrics.prototype.getMetricsList = function() {
  return /** @type{!Array<!proto.gooseai.UsageMetric>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gooseai.UsageMetric, 1));
};


/**
 * @param {!Array<!proto.gooseai.UsageMetric>} value
 * @return {!proto.gooseai.Metrics} returns this
*/
proto.gooseai.Metrics.prototype.setMetricsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.gooseai.UsageMetric=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gooseai.UsageMetric}
 */
proto.gooseai.Metrics.prototype.addMetrics = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.gooseai.UsageMetric, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gooseai.Metrics} returns this
 */
proto.gooseai.Metrics.prototype.clearMetricsList = function() {
  return this.setMetricsList([]);
};


/**
 * optional TotalMetricsData total = 2;
 * @return {?proto.gooseai.TotalMetricsData}
 */
proto.gooseai.Metrics.prototype.getTotal = function() {
  return /** @type{?proto.gooseai.TotalMetricsData} */ (
    jspb.Message.getWrapperField(this, proto.gooseai.TotalMetricsData, 2));
};


/**
 * @param {?proto.gooseai.TotalMetricsData|undefined} value
 * @return {!proto.gooseai.Metrics} returns this
*/
proto.gooseai.Metrics.prototype.setTotal = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gooseai.Metrics} returns this
 */
proto.gooseai.Metrics.prototype.clearTotal = function() {
  return this.setTotal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gooseai.Metrics.prototype.hasTotal = function() {
  return jspb.Message.getField(this, 2) != null;
};


