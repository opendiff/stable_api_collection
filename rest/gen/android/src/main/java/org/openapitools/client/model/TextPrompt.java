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

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Text prompt for image generation
 **/
@ApiModel(description = "Text prompt for image generation")
public class TextPrompt {
  
  @SerializedName("text")
  private String text = null;
  @SerializedName("weight")
  private Float weight = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Weight of the prompt (use negative numbers for negative prompts)
   **/
  @ApiModelProperty(value = "Weight of the prompt (use negative numbers for negative prompts)")
  public Float getWeight() {
    return weight;
  }
  public void setWeight(Float weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextPrompt textPrompt = (TextPrompt) o;
    return (this.text == null ? textPrompt.text == null : this.text.equals(textPrompt.text)) &&
        (this.weight == null ? textPrompt.weight == null : this.weight.equals(textPrompt.weight));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    result = 31 * result + (this.weight == null ? 0: this.weight.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextPrompt {\n");
    
    sb.append("  text: ").append(text).append("\n");
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}