package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TextPrompt;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TextToImageRequestBody  {
  
  @ApiModelProperty(example = "7", value = "How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)")
 /**
   * How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
  **/
  private BigDecimal cfgScale = new BigDecimal("7");

public enum ClipGuidancePresetEnum {

FAST_BLUE(String.valueOf("FAST_BLUE")), FAST_GREEN(String.valueOf("FAST_GREEN")), NONE(String.valueOf("NONE")), SIMPLE(String.valueOf("SIMPLE")), SLOW(String.valueOf("SLOW")), SLOWER(String.valueOf("SLOWER")), SLOWEST(String.valueOf("SLOWEST"));


    private String value;

    ClipGuidancePresetEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ClipGuidancePresetEnum fromValue(String value) {
        for (ClipGuidancePresetEnum b : ClipGuidancePresetEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "FAST_BLUE", value = "")
  private ClipGuidancePresetEnum clipGuidancePreset = ClipGuidancePresetEnum.NONE;

  @ApiModelProperty(example = "512", value = "Height of the image (note: `height * width` must be <= 1 Megapixel)")
 /**
   * Height of the image (note: `height * width` must be <= 1 Megapixel)
  **/
  private Integer height = 512;

public enum SamplerEnum {

DDIM(String.valueOf("DDIM")), DDPM(String.valueOf("DDPM")), K_DPMPP_2M(String.valueOf("K_DPMPP_2M")), K_DPMPP_2S_ANCESTRAL(String.valueOf("K_DPMPP_2S_ANCESTRAL")), K_DPM_2(String.valueOf("K_DPM_2")), K_DPM_2_ANCESTRAL(String.valueOf("K_DPM_2_ANCESTRAL")), K_EULER(String.valueOf("K_EULER")), K_EULER_ANCESTRAL(String.valueOf("K_EULER_ANCESTRAL")), K_HEUN(String.valueOf("K_HEUN")), K_LMS(String.valueOf("K_LMS"));


    private String value;

    SamplerEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SamplerEnum fromValue(String value) {
        for (SamplerEnum b : SamplerEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "K_DPM_2_ANCESTRAL", value = "Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.")
 /**
   * Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  **/
  private SamplerEnum sampler;

  @ApiModelProperty(example = "1", value = "Number of images to generate")
 /**
   * Number of images to generate
  **/
  private Integer samples = 1;

  @ApiModelProperty(example = "0", value = "Random noise seed (omit this option or use `0` for a random seed)")
 /**
   * Random noise seed (omit this option or use `0` for a random seed)
  **/
  private Integer seed;

  @ApiModelProperty(example = "75", value = "Number of diffusion steps to run")
 /**
   * Number of diffusion steps to run
  **/
  private Integer steps = 50;

  @ApiModelProperty(example = "[{\"text\":\"A lighthouse on a cliff\",\"weight\":1}]", required = true, value = "")
  private List<TextPrompt> textPrompts = new ArrayList<>();

  @ApiModelProperty(example = "512", value = "Width of the image (note: `height * width` must be <= 1 Megapixel)")
 /**
   * Width of the image (note: `height * width` must be <= 1 Megapixel)
  **/
  private Integer width = 512;
 /**
   * How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
   * minimum: 0
   * maximum: 35
   * @return cfgScale
  **/
  @JsonProperty("cfg_scale")
  public BigDecimal getCfgScale() {
    return cfgScale;
  }

  public void setCfgScale(BigDecimal cfgScale) {
    this.cfgScale = cfgScale;
  }

  public TextToImageRequestBody cfgScale(BigDecimal cfgScale) {
    this.cfgScale = cfgScale;
    return this;
  }

 /**
   * Get clipGuidancePreset
   * @return clipGuidancePreset
  **/
  @JsonProperty("clip_guidance_preset")
  public String getClipGuidancePreset() {
    if (clipGuidancePreset == null) {
      return null;
    }
    return clipGuidancePreset.value();
  }

  public void setClipGuidancePreset(ClipGuidancePresetEnum clipGuidancePreset) {
    this.clipGuidancePreset = clipGuidancePreset;
  }

  public TextToImageRequestBody clipGuidancePreset(ClipGuidancePresetEnum clipGuidancePreset) {
    this.clipGuidancePreset = clipGuidancePreset;
    return this;
  }

 /**
   * Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel)
   * minimum: 512
   * maximum: 2048
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TextToImageRequestBody height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you.
   * @return sampler
  **/
  @JsonProperty("sampler")
  public String getSampler() {
    if (sampler == null) {
      return null;
    }
    return sampler.value();
  }

  public void setSampler(SamplerEnum sampler) {
    this.sampler = sampler;
  }

  public TextToImageRequestBody sampler(SamplerEnum sampler) {
    this.sampler = sampler;
    return this;
  }

 /**
   * Number of images to generate
   * minimum: 1
   * maximum: 10
   * @return samples
  **/
  @JsonProperty("samples")
  public Integer getSamples() {
    return samples;
  }

  public void setSamples(Integer samples) {
    this.samples = samples;
  }

  public TextToImageRequestBody samples(Integer samples) {
    this.samples = samples;
    return this;
  }

 /**
   * Random noise seed (omit this option or use &#x60;0&#x60; for a random seed)
   * minimum: 0
   * maximum: 2147483647
   * @return seed
  **/
  @JsonProperty("seed")
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  public TextToImageRequestBody seed(Integer seed) {
    this.seed = seed;
    return this;
  }

 /**
   * Number of diffusion steps to run
   * minimum: 10
   * maximum: 150
   * @return steps
  **/
  @JsonProperty("steps")
  public Integer getSteps() {
    return steps;
  }

  public void setSteps(Integer steps) {
    this.steps = steps;
  }

  public TextToImageRequestBody steps(Integer steps) {
    this.steps = steps;
    return this;
  }

 /**
   * Get textPrompts
   * @return textPrompts
  **/
  @JsonProperty("text_prompts")
  public List<TextPrompt> getTextPrompts() {
    return textPrompts;
  }

  public void setTextPrompts(List<TextPrompt> textPrompts) {
    this.textPrompts = textPrompts;
  }

  public TextToImageRequestBody textPrompts(List<TextPrompt> textPrompts) {
    this.textPrompts = textPrompts;
    return this;
  }

  public TextToImageRequestBody addTextPromptsItem(TextPrompt textPromptsItem) {
    this.textPrompts.add(textPromptsItem);
    return this;
  }

 /**
   * Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel)
   * minimum: 512
   * maximum: 2048
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public TextToImageRequestBody width(Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextToImageRequestBody textToImageRequestBody = (TextToImageRequestBody) o;
    return Objects.equals(cfgScale, textToImageRequestBody.cfgScale) &&
        Objects.equals(clipGuidancePreset, textToImageRequestBody.clipGuidancePreset) &&
        Objects.equals(height, textToImageRequestBody.height) &&
        Objects.equals(sampler, textToImageRequestBody.sampler) &&
        Objects.equals(samples, textToImageRequestBody.samples) &&
        Objects.equals(seed, textToImageRequestBody.seed) &&
        Objects.equals(steps, textToImageRequestBody.steps) &&
        Objects.equals(textPrompts, textToImageRequestBody.textPrompts) &&
        Objects.equals(width, textToImageRequestBody.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfgScale, clipGuidancePreset, height, sampler, samples, seed, steps, textPrompts, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextToImageRequestBody {\n");
    
    sb.append("    cfgScale: ").append(toIndentedString(cfgScale)).append("\n");
    sb.append("    clipGuidancePreset: ").append(toIndentedString(clipGuidancePreset)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    sampler: ").append(toIndentedString(sampler)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    textPrompts: ").append(toIndentedString(textPrompts)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

