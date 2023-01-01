/*
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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TextPrompt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * TextToImageRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-31T22:15:05.748293-05:00[America/New_York]")
public class TextToImageRequestBody {
  public static final String SERIALIZED_NAME_CFG_SCALE = "cfg_scale";
  @SerializedName(SERIALIZED_NAME_CFG_SCALE)
  private BigDecimal cfgScale = new BigDecimal("7");

  /**
   * Gets or Sets clipGuidancePreset
   */
  @JsonAdapter(ClipGuidancePresetEnum.Adapter.class)
  public enum ClipGuidancePresetEnum {
    FAST_BLUE("FAST_BLUE"),
    
    FAST_GREEN("FAST_GREEN"),
    
    NONE("NONE"),
    
    SIMPLE("SIMPLE"),
    
    SLOW("SLOW"),
    
    SLOWER("SLOWER"),
    
    SLOWEST("SLOWEST");

    private String value;

    ClipGuidancePresetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
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

    public static class Adapter extends TypeAdapter<ClipGuidancePresetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClipGuidancePresetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClipGuidancePresetEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClipGuidancePresetEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLIP_GUIDANCE_PRESET = "clip_guidance_preset";
  @SerializedName(SERIALIZED_NAME_CLIP_GUIDANCE_PRESET)
  private ClipGuidancePresetEnum clipGuidancePreset = ClipGuidancePresetEnum.NONE;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height = 512;

  /**
   * Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you.
   */
  @JsonAdapter(SamplerEnum.Adapter.class)
  public enum SamplerEnum {
    DDIM("DDIM"),
    
    DDPM("DDPM"),
    
    K_DPMPP_2M("K_DPMPP_2M"),
    
    K_DPMPP_2S_ANCESTRAL("K_DPMPP_2S_ANCESTRAL"),
    
    K_DPM_2("K_DPM_2"),
    
    K_DPM_2_ANCESTRAL("K_DPM_2_ANCESTRAL"),
    
    K_EULER("K_EULER"),
    
    K_EULER_ANCESTRAL("K_EULER_ANCESTRAL"),
    
    K_HEUN("K_HEUN"),
    
    K_LMS("K_LMS");

    private String value;

    SamplerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
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

    public static class Adapter extends TypeAdapter<SamplerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SamplerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SamplerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SamplerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SAMPLER = "sampler";
  @SerializedName(SERIALIZED_NAME_SAMPLER)
  private SamplerEnum sampler;

  public static final String SERIALIZED_NAME_SAMPLES = "samples";
  @SerializedName(SERIALIZED_NAME_SAMPLES)
  private Integer samples = 1;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Integer seed;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private Integer steps = 50;

  public static final String SERIALIZED_NAME_TEXT_PROMPTS = "text_prompts";
  @SerializedName(SERIALIZED_NAME_TEXT_PROMPTS)
  private List<TextPrompt> textPrompts = new ArrayList<>();

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width = 512;

  public TextToImageRequestBody() { 
  }

  public TextToImageRequestBody cfgScale(BigDecimal cfgScale) {
    
    this.cfgScale = cfgScale;
    return this;
  }

   /**
   * How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
   * minimum: 0
   * maximum: 35
   * @return cfgScale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)")

  public BigDecimal getCfgScale() {
    return cfgScale;
  }


  public void setCfgScale(BigDecimal cfgScale) {
    this.cfgScale = cfgScale;
  }


  public TextToImageRequestBody clipGuidancePreset(ClipGuidancePresetEnum clipGuidancePreset) {
    
    this.clipGuidancePreset = clipGuidancePreset;
    return this;
  }

   /**
   * Get clipGuidancePreset
   * @return clipGuidancePreset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FAST_BLUE", value = "")

  public ClipGuidancePresetEnum getClipGuidancePreset() {
    return clipGuidancePreset;
  }


  public void setClipGuidancePreset(ClipGuidancePresetEnum clipGuidancePreset) {
    this.clipGuidancePreset = clipGuidancePreset;
  }


  public TextToImageRequestBody height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel)
   * minimum: 512
   * maximum: 2048
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "512", value = "Height of the image (note: `height * width` must be <= 1 Megapixel)")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public TextToImageRequestBody sampler(SamplerEnum sampler) {
    
    this.sampler = sampler;
    return this;
  }

   /**
   * Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you.
   * @return sampler
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "K_DPM_2_ANCESTRAL", value = "Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.")

  public SamplerEnum getSampler() {
    return sampler;
  }


  public void setSampler(SamplerEnum sampler) {
    this.sampler = sampler;
  }


  public TextToImageRequestBody samples(Integer samples) {
    
    this.samples = samples;
    return this;
  }

   /**
   * Number of images to generate
   * minimum: 1
   * maximum: 10
   * @return samples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of images to generate")

  public Integer getSamples() {
    return samples;
  }


  public void setSamples(Integer samples) {
    this.samples = samples;
  }


  public TextToImageRequestBody seed(Integer seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * Random noise seed (omit this option or use &#x60;0&#x60; for a random seed)
   * minimum: 0
   * maximum: 2147483647
   * @return seed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Random noise seed (omit this option or use `0` for a random seed)")

  public Integer getSeed() {
    return seed;
  }


  public void setSeed(Integer seed) {
    this.seed = seed;
  }


  public TextToImageRequestBody steps(Integer steps) {
    
    this.steps = steps;
    return this;
  }

   /**
   * Number of diffusion steps to run
   * minimum: 10
   * maximum: 150
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "75", value = "Number of diffusion steps to run")

  public Integer getSteps() {
    return steps;
  }


  public void setSteps(Integer steps) {
    this.steps = steps;
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
   * Get textPrompts
   * @return textPrompts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{\"text\":\"A lighthouse on a cliff\",\"weight\":1}]", required = true, value = "")

  public List<TextPrompt> getTextPrompts() {
    return textPrompts;
  }


  public void setTextPrompts(List<TextPrompt> textPrompts) {
    this.textPrompts = textPrompts;
  }


  public TextToImageRequestBody width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel)
   * minimum: 512
   * maximum: 2048
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "512", value = "Width of the image (note: `height * width` must be <= 1 Megapixel)")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
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
    return Objects.equals(this.cfgScale, textToImageRequestBody.cfgScale) &&
        Objects.equals(this.clipGuidancePreset, textToImageRequestBody.clipGuidancePreset) &&
        Objects.equals(this.height, textToImageRequestBody.height) &&
        Objects.equals(this.sampler, textToImageRequestBody.sampler) &&
        Objects.equals(this.samples, textToImageRequestBody.samples) &&
        Objects.equals(this.seed, textToImageRequestBody.seed) &&
        Objects.equals(this.steps, textToImageRequestBody.steps) &&
        Objects.equals(this.textPrompts, textToImageRequestBody.textPrompts) &&
        Objects.equals(this.width, textToImageRequestBody.width);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cfg_scale");
    openapiFields.add("clip_guidance_preset");
    openapiFields.add("height");
    openapiFields.add("sampler");
    openapiFields.add("samples");
    openapiFields.add("seed");
    openapiFields.add("steps");
    openapiFields.add("text_prompts");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("text_prompts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TextToImageRequestBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TextToImageRequestBody.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextToImageRequestBody is not found in the empty JSON string", TextToImageRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TextToImageRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextToImageRequestBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TextToImageRequestBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("clip_guidance_preset") != null && !jsonObj.get("clip_guidance_preset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clip_guidance_preset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clip_guidance_preset").toString()));
      }
      if (jsonObj.get("sampler") != null && !jsonObj.get("sampler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sampler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sampler").toString()));
      }
      JsonArray jsonArraytextPrompts = jsonObj.getAsJsonArray("text_prompts");
      if (jsonArraytextPrompts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("text_prompts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `text_prompts` to be an array in the JSON string but got `%s`", jsonObj.get("text_prompts").toString()));
        }

        // validate the optional field `text_prompts` (array)
        for (int i = 0; i < jsonArraytextPrompts.size(); i++) {
          TextPrompt.validateJsonObject(jsonArraytextPrompts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextToImageRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextToImageRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextToImageRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextToImageRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<TextToImageRequestBody>() {
           @Override
           public void write(JsonWriter out, TextToImageRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextToImageRequestBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TextToImageRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TextToImageRequestBody
  * @throws IOException if the JSON string is invalid with respect to TextToImageRequestBody
  */
  public static TextToImageRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextToImageRequestBody.class);
  }

 /**
  * Convert an instance of TextToImageRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
