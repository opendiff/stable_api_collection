goog.provide('API.Client.TextPrompt');

/**
 * Text prompt for image generation
 * @record
 */
API.Client.TextPrompt = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TextPrompt.prototype.text;

/**
 * Weight of the prompt (use negative numbers for negative prompts)
 * @type {!number}
 * @export
 */
API.Client.TextPrompt.prototype.weight;

