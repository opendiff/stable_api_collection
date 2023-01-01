
package org.openapitools.client.model


case class TextToImageRequestBody (
    /* How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) */
    _cfgScale: Option[Number],
    _clipGuidancePreset: Option[String],
    /* Height of the image (note: `height * width` must be <= 1 Megapixel) */
    _height: Option[Integer],
    /* Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you. */
    _sampler: Option[String],
    /* Number of images to generate */
    _samples: Option[Integer],
    /* Random noise seed (omit this option or use `0` for a random seed) */
    _seed: Option[Integer],
    /* Number of diffusion steps to run */
    _steps: Option[Integer],
    _textPrompts: List[TextPrompt],
    /* Width of the image (note: `height * width` must be <= 1 Megapixel) */
    _width: Option[Integer]
)
object TextToImageRequestBody {
    def toStringBody(var_cfgScale: Object, var_clipGuidancePreset: Object, var_height: Object, var_sampler: Object, var_samples: Object, var_seed: Object, var_steps: Object, var_textPrompts: Object, var_width: Object) =
        s"""
        | {
        | "cfgScale":$var_cfgScale,"clipGuidancePreset":$var_clipGuidancePreset,"height":$var_height,"sampler":$var_sampler,"samples":$var_samples,"seed":$var_seed,"steps":$var_steps,"textPrompts":$var_textPrompts,"width":$var_width
        | }
        """.stripMargin
}
