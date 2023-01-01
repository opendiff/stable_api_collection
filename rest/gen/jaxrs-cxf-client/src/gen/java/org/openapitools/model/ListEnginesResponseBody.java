package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Engine;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListEnginesResponseBody  {
  
  @ApiModelProperty(example = "[{\"description\":\"Stability-AI Stable Diffusion v1.5\",\"id\":\"stable-diffusion-v1-5\",\"name\":\"Stable Diffusion v1.5\",\"type\":\"PICTURE\"},{\"description\":\"Stability-AI Stable Diffusion v2.1\",\"id\":\"stable-diffusion-512-v2-1\",\"name\":\"Stable Diffusion v2.1\",\"type\":\"PICTURE\"},{\"description\":\"Stability-AI Stable Diffusion 768 v2.1\",\"id\":\"stable-diffusion-768-v2-1\",\"name\":\"Stable Diffusion v2.1-768\",\"type\":\"PICTURE\"}]", required = true, value = "The engines available to your user/organization")
 /**
   * The engines available to your user/organization
  **/
  private List<Engine> engines = new ArrayList<>();
 /**
   * The engines available to your user/organization
   * @return engines
  **/
  @JsonProperty("engines")
  public List<Engine> getEngines() {
    return engines;
  }

  public void setEngines(List<Engine> engines) {
    this.engines = engines;
  }

  public ListEnginesResponseBody engines(List<Engine> engines) {
    this.engines = engines;
    return this;
  }

  public ListEnginesResponseBody addEnginesItem(Engine enginesItem) {
    this.engines.add(enginesItem);
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
    ListEnginesResponseBody listEnginesResponseBody = (ListEnginesResponseBody) o;
    return Objects.equals(engines, listEnginesResponseBody.engines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEnginesResponseBody {\n");
    
    sb.append("    engines: ").append(toIndentedString(engines)).append("\n");
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

