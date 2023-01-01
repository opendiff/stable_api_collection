goog.provide('API.Client.TextToImageRequestBody');

/**
 * @record
 */
API.Client.TextToImageRequestBody = function() {}

/**
 * How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
 * @type {!number}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.cfgScale;

/**
 * @type {!string}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.clipGuidancePreset;

/**
 * Height of the image (note: `height * width` must be <= 1 Megapixel)
 * @type {!number}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.height;

/**
 * Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
 * @type {!string}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.sampler;

/**
 * Number of images to generate
 * @type {!number}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.samples;

/**
 * Random noise seed (omit this option or use `0` for a random seed)
 * @type {!number}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.seed;

/**
 * Number of diffusion steps to run
 * @type {!number}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.steps;

/**
 * @type {!Array<!API.Client.TextPrompt>}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.textPrompts;

/**
 * Width of the image (note: `height * width` must be <= 1 Megapixel)
 * @type {!number}
 * @export
 */
API.Client.TextToImageRequestBody.prototype.width;

/** @enum {string} */
API.Client.TextToImageRequestBody.ClipGuidancePresetEnum = { 
  FAST_BLUE: 'FAST_BLUE',
  FAST_GREEN: 'FAST_GREEN',
  NONE: 'NONE',
  SIMPLE: 'SIMPLE',
  SLOW: 'SLOW',
  SLOWER: 'SLOWER',
  SLOWEST: 'SLOWEST',
}
/** @enum {string} */
API.Client.TextToImageRequestBody.SamplerEnum = { 
  DDIM: 'DDIM',
  DDPM: 'DDPM',
  K_DPMPP_2M: 'K_DPMPP_2M',
  K_DPMPP_2S_ANCESTRAL: 'K_DPMPP_2S_ANCESTRAL',
  K_DPM_2: 'K_DPM_2',
  K_DPM_2_ANCESTRAL: 'K_DPM_2_ANCESTRAL',
  K_EULER: 'K_EULER',
  K_EULER_ANCESTRAL: 'K_EULER_ANCESTRAL',
  K_HEUN: 'K_HEUN',
  K_LMS: 'K_LMS',
}
