package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Error  {
  
  @ApiModelProperty(example = "true", required = true, value = "Is the error a server-side fault?")
 /**
   * Is the error a server-side fault?
  **/
  private Boolean fault;

  @ApiModelProperty(example = "123abc", required = true, value = "ID is a unique identifier for this particular occurrence of the problem.")
 /**
   * ID is a unique identifier for this particular occurrence of the problem.
  **/
  private String id;

  @ApiModelProperty(example = "parameter 'p' must be an integer", required = true, value = "Message is a human-readable explanation specific to this occurrence of the problem.")
 /**
   * Message is a human-readable explanation specific to this occurrence of the problem.
  **/
  private String message;

  @ApiModelProperty(example = "bad_request", required = true, value = "Name is the name of this class of errors.")
 /**
   * Name is the name of this class of errors.
  **/
  private String name;

  @ApiModelProperty(example = "true", required = true, value = "Is the error temporary?")
 /**
   * Is the error temporary?
  **/
  private Boolean temporary;

  @ApiModelProperty(example = "false", required = true, value = "Is the error a timeout?")
 /**
   * Is the error a timeout?
  **/
  private Boolean timeout;
 /**
   * Is the error a server-side fault?
   * @return fault
  **/
  @JsonProperty("fault")
  public Boolean getFault() {
    return fault;
  }

  public void setFault(Boolean fault) {
    this.fault = fault;
  }

  public Error fault(Boolean fault) {
    this.fault = fault;
    return this;
  }

 /**
   * ID is a unique identifier for this particular occurrence of the problem.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Error id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Message is a human-readable explanation specific to this occurrence of the problem.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Name is the name of this class of errors.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Error name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Is the error temporary?
   * @return temporary
  **/
  @JsonProperty("temporary")
  public Boolean getTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }

  public Error temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

 /**
   * Is the error a timeout?
   * @return timeout
  **/
  @JsonProperty("timeout")
  public Boolean getTimeout() {
    return timeout;
  }

  public void setTimeout(Boolean timeout) {
    this.timeout = timeout;
  }

  public Error timeout(Boolean timeout) {
    this.timeout = timeout;
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
    Error error = (Error) o;
    return Objects.equals(fault, error.fault) &&
        Objects.equals(id, error.id) &&
        Objects.equals(message, error.message) &&
        Objects.equals(name, error.name) &&
        Objects.equals(temporary, error.temporary) &&
        Objects.equals(timeout, error.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fault, id, message, name, temporary, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

