package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OrganizationMembership;

@Canonical
class AccountResponseBody {
    /* The user's email */
    String email
    /* The user's ID */
    String id
    /* The user's organizations */
    List<OrganizationMembership> organizations = new ArrayList<>()
    /* The user's profile picture */
    URI profilePicture
}
