package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.ImageToImageOptions
import org.openapitools.model.MaskingOptions
import org.openapitools.model.TextToImageRequestBody

class V1alphaGenerationApi {
    String basePath = "https://api.stability.ai"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def v1alphaGenerationImageToImage ( String engineId, String accept, File initImage, ImageToImageOptions options, String organization, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/v1alpha/generation/${engine_id}/image-to-image"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (engineId == null) {
            throw new RuntimeException("missing required params engineId")
        }
        // verify required params are set
        if (accept == null) {
            throw new RuntimeException("missing required params accept")
        }
        // verify required params are set
        if (initImage == null) {
            throw new RuntimeException("missing required params initImage")
        }
        // verify required params are set
        if (options == null) {
            throw new RuntimeException("missing required params options")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (organization != null) {
            headerParams.put("Organization", organization)
        }


        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("init_image", initImage)
        bodyParams.put("options", options)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def v1alphaGenerationMasking ( String engineId, String accept, File initImage, MaskingOptions options, String organization, File maskImage, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/v1alpha/generation/${engine_id}/image-to-image/masking"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (engineId == null) {
            throw new RuntimeException("missing required params engineId")
        }
        // verify required params are set
        if (accept == null) {
            throw new RuntimeException("missing required params accept")
        }
        // verify required params are set
        if (initImage == null) {
            throw new RuntimeException("missing required params initImage")
        }
        // verify required params are set
        if (options == null) {
            throw new RuntimeException("missing required params options")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (organization != null) {
            headerParams.put("Organization", organization)
        }


        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("init_image", initImage)
        bodyParams.put("mask_image", maskImage)
        bodyParams.put("options", options)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def v1alphaGenerationTextToImage ( String engineId, String accept, TextToImageRequestBody textToImageRequestBody, String organization, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/v1alpha/generation/${engine_id}/text-to-image"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (engineId == null) {
            throw new RuntimeException("missing required params engineId")
        }
        // verify required params are set
        if (accept == null) {
            throw new RuntimeException("missing required params accept")
        }
        // verify required params are set
        if (textToImageRequestBody == null) {
            throw new RuntimeException("missing required params textToImageRequestBody")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (organization != null) {
            headerParams.put("Organization", organization)
        }

        contentType = 'application/json';
        bodyParams = textToImageRequestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

}
