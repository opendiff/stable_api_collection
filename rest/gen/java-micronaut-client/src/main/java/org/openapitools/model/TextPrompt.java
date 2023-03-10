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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Text prompt for image generation
 */
@JsonPropertyOrder({
  TextPrompt.JSON_PROPERTY_TEXT,
  TextPrompt.JSON_PROPERTY_WEIGHT
})
@JsonTypeName("TextPrompt")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-12-31T22:15:06.514954-05:00[America/New_York]")
@Introspected
public class TextPrompt {
    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public static final String JSON_PROPERTY_WEIGHT = "weight";
    private Float weight;

    public TextPrompt(String text) {
        this.text = text;
    }

    public TextPrompt text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     * @return text
     **/
    @NotNull
    @Size(max=2000)
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setText(String text) {
        this.text = text;
    }

    public TextPrompt weight(Float weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Weight of the prompt (use negative numbers for negative prompts)
     * @return weight
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_WEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Float getWeight() {
        return weight;
    }

    @JsonProperty(JSON_PROPERTY_WEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        return Objects.equals(this.text, textPrompt.text) &&
            Objects.equals(this.weight, textPrompt.weight);
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
