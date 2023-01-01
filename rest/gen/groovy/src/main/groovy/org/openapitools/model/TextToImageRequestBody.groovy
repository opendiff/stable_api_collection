package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TextPrompt;

@Canonical
class TextToImageRequestBody {
    /* How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) */
    BigDecimal cfgScale = new BigDecimal("7")
    
    String clipGuidancePreset = ClipGuidancePresetEnum.NONE
    /* Height of the image (note: `height * width` must be <= 1 Megapixel) */
    Integer height = 512
    /* Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you. */
    String sampler
    /* Number of images to generate */
    Integer samples = 1
    /* Random noise seed (omit this option or use `0` for a random seed) */
    Integer seed
    /* Number of diffusion steps to run */
    Integer steps = 50
    
    List<TextPrompt> textPrompts = new ArrayList<>()
    /* Width of the image (note: `height * width` must be <= 1 Megapixel) */
    Integer width = 512
}
