package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Error {
    /* Is the error a server-side fault? */
    Boolean fault
    /* ID is a unique identifier for this particular occurrence of the problem. */
    String id
    /* Message is a human-readable explanation specific to this occurrence of the problem. */
    String message
    /* Name is the name of this class of errors. */
    String name
    /* Is the error temporary? */
    Boolean temporary
    /* Is the error a timeout? */
    Boolean timeout
}
