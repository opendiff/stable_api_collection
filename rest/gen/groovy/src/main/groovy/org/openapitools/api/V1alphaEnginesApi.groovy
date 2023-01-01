package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ListEnginesResponseBody

class V1alphaEnginesApi {
    String basePath = "https://api.stability.ai"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def v1alphaEnginesListEngines ( String organization, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/v1alpha/engines/list"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (organization != null) {
            headerParams.put("Organization", organization)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListEnginesResponseBody.class )

    }

}
