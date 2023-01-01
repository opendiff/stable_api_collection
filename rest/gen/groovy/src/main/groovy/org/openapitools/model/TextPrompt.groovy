package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TextPrompt {
    
    String text
    /* Weight of the prompt (use negative numbers for negative prompts) */
    Float weight
}
