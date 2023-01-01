package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Engine {
    
    String description
    /* Unique identifier for the engine */
    String id
    /* Name of the engine */
    String name
    /* The type of content this engine produces */
    String type
}
