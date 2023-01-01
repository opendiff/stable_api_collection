package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OrganizationMembership {
    
    String id
    
    Boolean isDefault
    
    String name
    
    String role
}
