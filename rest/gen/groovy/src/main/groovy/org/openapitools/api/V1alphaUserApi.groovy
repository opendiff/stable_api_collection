package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AccountResponseBody
import org.openapitools.model.BalanceResponseBody

class V1alphaUserApi {
    String basePath = "https://api.stability.ai"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def v1alphaUserAccount ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/v1alpha/user/account"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AccountResponseBody.class )

    }

    def v1alphaUserBalance ( String organization, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/v1alpha/user/balance"

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
                    BalanceResponseBody.class )

    }

}
