package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrganizationMembership  {
  
  @ApiModelProperty(example = "org-123456", required = true, value = "")
  private String id;

  @ApiModelProperty(example = "false", required = true, value = "")
  private Boolean isDefault;

  @ApiModelProperty(example = "My Organization", required = true, value = "")
  private String name;

  @ApiModelProperty(example = "MEMBER", required = true, value = "")
  private String role;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrganizationMembership id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get isDefault
   * @return isDefault
  **/
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public OrganizationMembership isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationMembership name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get role
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public OrganizationMembership role(String role) {
    this.role = role;
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
    OrganizationMembership organizationMembership = (OrganizationMembership) o;
    return Objects.equals(id, organizationMembership.id) &&
        Objects.equals(isDefault, organizationMembership.isDefault) &&
        Objects.equals(name, organizationMembership.name) &&
        Objects.equals(role, organizationMembership.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isDefault, name, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationMembership {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

