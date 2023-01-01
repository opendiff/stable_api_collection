package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Text prompt for image generation
 **/
@ApiModel(description="Text prompt for image generation")

public class TextPrompt  {
  
  @ApiModelProperty(example = "jum", required = true, value = "")
  private String text;

  @ApiModelProperty(example = "0.80305135", value = "Weight of the prompt (use negative numbers for negative prompts)")
 /**
   * Weight of the prompt (use negative numbers for negative prompts)
  **/
  private Float weight;
 /**
   * Get text
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TextPrompt text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Weight of the prompt (use negative numbers for negative prompts)
   * @return weight
  **/
  @JsonProperty("weight")
  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public TextPrompt weight(Float weight) {
    this.weight = weight;
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
    TextPrompt textPrompt = (TextPrompt) o;
    return Objects.equals(text, textPrompt.text) &&
        Objects.equals(weight, textPrompt.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextPrompt {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

