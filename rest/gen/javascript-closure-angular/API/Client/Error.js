goog.provide('API.Client.Error');

/**
 * @record
 */
API.Client.Error = function() {}

/**
 * Is the error a server-side fault?
 * @type {!boolean}
 * @export
 */
API.Client.Error.prototype.fault;

/**
 * ID is a unique identifier for this particular occurrence of the problem.
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.id;

/**
 * Message is a human-readable explanation specific to this occurrence of the problem.
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.message;

/**
 * Name is the name of this class of errors.
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.name;

/**
 * Is the error temporary?
 * @type {!boolean}
 * @export
 */
API.Client.Error.prototype.temporary;

/**
 * Is the error a timeout?
 * @type {!boolean}
 * @export
 */
API.Client.Error.prototype.timeout;

