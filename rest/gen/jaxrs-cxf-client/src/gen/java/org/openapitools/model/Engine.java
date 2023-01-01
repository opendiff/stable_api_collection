package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Engine  {
  
  @ApiModelProperty(example = "Saepe nam magni deserunt eligendi ducimus.", required = true, value = "")
  private String description;

  @ApiModelProperty(example = "Sunt ut recusandae perspiciatis.", required = true, value = "Unique identifier for the engine")
 /**
   * Unique identifier for the engine
  **/
  private String id;

  @ApiModelProperty(example = "Eos repellendus est.", required = true, value = "Name of the engine")
 /**
   * Name of the engine
  **/
  private String name;

public enum TypeEnum {

AUDIO(String.valueOf("AUDIO")), CLASSIFICATION(String.valueOf("CLASSIFICATION")), PICTURE(String.valueOf("PICTURE")), STORAGE(String.valueOf("STORAGE")), TEXT(String.valueOf("TEXT")), VIDEO(String.valueOf("VIDEO"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "PICTURE", required = true, value = "The type of content this engine produces")
 /**
   * The type of content this engine produces
  **/
  private TypeEnum type;
 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Engine description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Unique identifier for the engine
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Engine id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Name of the engine
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Engine name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The type of content this engine produces
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Engine type(TypeEnum type) {
    this.type = type;
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
    Engine engine = (Engine) o;
    return Objects.equals(description, engine.description) &&
        Objects.equals(id, engine.id) &&
        Objects.equals(name, engine.name) &&
        Objects.equals(type, engine.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Engine {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

