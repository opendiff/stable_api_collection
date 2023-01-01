package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Engine;

@Canonical
class ListEnginesResponseBody {
    /* The engines available to your user/organization */
    List<Engine> engines = new ArrayList<>()
}
