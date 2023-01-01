package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BalanceResponseBody  {
  
  @ApiModelProperty(example = "0.11570747925644202", required = true, value = "The balance of the account/organization associated with the API key")
 /**
   * The balance of the account/organization associated with the API key
  **/
  private Double credits;
 /**
   * The balance of the account/organization associated with the API key
   * @return credits
  **/
  @JsonProperty("credits")
  public Double getCredits() {
    return credits;
  }

  public void setCredits(Double credits) {
    this.credits = credits;
  }

  public BalanceResponseBody credits(Double credits) {
    this.credits = credits;
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
    BalanceResponseBody balanceResponseBody = (BalanceResponseBody) o;
    return Objects.equals(credits, balanceResponseBody.credits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceResponseBody {\n");
    
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
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

