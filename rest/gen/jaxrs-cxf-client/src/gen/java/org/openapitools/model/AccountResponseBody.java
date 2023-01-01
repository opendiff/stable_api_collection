package org.openapitools.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OrganizationMembership;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountResponseBody  {
  
  @ApiModelProperty(example = "example@stability.ai", required = true, value = "The user's email")
 /**
   * The user's email
  **/
  private String email;

  @ApiModelProperty(example = "user-1234", required = true, value = "The user's ID")
 /**
   * The user's ID
  **/
  private String id;

  @ApiModelProperty(example = "[{\"id\":\"org-123456\",\"is_default\":false,\"name\":\"My Organization\",\"role\":\"MEMBER\"},{\"id\":\"org-123456\",\"is_default\":false,\"name\":\"My Organization\",\"role\":\"MEMBER\"},{\"id\":\"org-123456\",\"is_default\":false,\"name\":\"My Organization\",\"role\":\"MEMBER\"}]", required = true, value = "The user's organizations")
 /**
   * The user's organizations
  **/
  private List<OrganizationMembership> organizations = new ArrayList<>();

  @ApiModelProperty(example = "https://api.stability.ai/example.png", value = "The user's profile picture")
 /**
   * The user's profile picture
  **/
  private URI profilePicture;
 /**
   * The user&#39;s email
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountResponseBody email(String email) {
    this.email = email;
    return this;
  }

 /**
   * The user&#39;s ID
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountResponseBody id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The user&#39;s organizations
   * @return organizations
  **/
  @JsonProperty("organizations")
  public List<OrganizationMembership> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<OrganizationMembership> organizations) {
    this.organizations = organizations;
  }

  public AccountResponseBody organizations(List<OrganizationMembership> organizations) {
    this.organizations = organizations;
    return this;
  }

  public AccountResponseBody addOrganizationsItem(OrganizationMembership organizationsItem) {
    this.organizations.add(organizationsItem);
    return this;
  }

 /**
   * The user&#39;s profile picture
   * @return profilePicture
  **/
  @JsonProperty("profile_picture")
  public URI getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(URI profilePicture) {
    this.profilePicture = profilePicture;
  }

  public AccountResponseBody profilePicture(URI profilePicture) {
    this.profilePicture = profilePicture;
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
    AccountResponseBody accountResponseBody = (AccountResponseBody) o;
    return Objects.equals(email, accountResponseBody.email) &&
        Objects.equals(id, accountResponseBody.id) &&
        Objects.equals(organizations, accountResponseBody.organizations) &&
        Objects.equals(profilePicture, accountResponseBody.profilePicture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, organizations, profilePicture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResponseBody {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
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

