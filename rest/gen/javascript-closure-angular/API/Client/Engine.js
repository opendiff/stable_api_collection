goog.provide('API.Client.Engine');

/**
 * @record
 */
API.Client.Engine = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Engine.prototype.description;

/**
 * Unique identifier for the engine
 * @type {!string}
 * @export
 */
API.Client.Engine.prototype.id;

/**
 * Name of the engine
 * @type {!string}
 * @export
 */
API.Client.Engine.prototype.name;

/**
 * The type of content this engine produces
 * @type {!string}
 * @export
 */
API.Client.Engine.prototype.type;

/** @enum {string} */
API.Client.Engine.TypeEnum = { 
  AUDIO: 'AUDIO',
  CLASSIFICATION: 'CLASSIFICATION',
  PICTURE: 'PICTURE',
  STORAGE: 'STORAGE',
  TEXT: 'TEXT',
  VIDEO: 'VIDEO',
}
