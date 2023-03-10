/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class TextToImageRequestBody (
  /* How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) */
  cfgScale: Option[BigDecimal] = None,
  clipGuidancePreset: Option[TextToImageRequestBodyEnums.ClipGuidancePreset] = None,
  /* Height of the image (note: `height * width` must be <= 1 Megapixel) */
  height: Option[Int] = None,
  /* Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you. */
  sampler: Option[TextToImageRequestBodyEnums.Sampler] = None,
  /* Number of images to generate */
  samples: Option[Int] = None,
  /* Random noise seed (omit this option or use `0` for a random seed) */
  seed: Option[Int] = None,
  /* Number of diffusion steps to run */
  steps: Option[Int] = None,
  textPrompts: Seq[TextPrompt],
  /* Width of the image (note: `height * width` must be <= 1 Megapixel) */
  width: Option[Int] = None
) extends ApiModel

object TextToImageRequestBodyEnums {

  type ClipGuidancePreset = ClipGuidancePreset.Value
  type Sampler = Sampler.Value
  object ClipGuidancePreset extends Enumeration {
    val FASTBLUE = Value("FAST_BLUE")
    val FASTGREEN = Value("FAST_GREEN")
    val NONE = Value("NONE")
    val SIMPLE = Value("SIMPLE")
    val SLOW = Value("SLOW")
    val SLOWER = Value("SLOWER")
    val SLOWEST = Value("SLOWEST")
  }

  object Sampler extends Enumeration {
    val DDIM = Value("DDIM")
    val DDPM = Value("DDPM")
    val KDPMPP2M = Value("K_DPMPP_2M")
    val KDPMPP2SANCESTRAL = Value("K_DPMPP_2S_ANCESTRAL")
    val KDPM2 = Value("K_DPM_2")
    val KDPM2ANCESTRAL = Value("K_DPM_2_ANCESTRAL")
    val KEULER = Value("K_EULER")
    val KEULERANCESTRAL = Value("K_EULER_ANCESTRAL")
    val KHEUN = Value("K_HEUN")
    val KLMS = Value("K_LMS")
  }

}
