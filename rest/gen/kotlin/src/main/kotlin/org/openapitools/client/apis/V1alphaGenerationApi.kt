/**
 * Stability.ai REST API
 *
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.OkHttpClient

import org.openapitools.client.models.Error
import org.openapitools.client.models.ImageToImageOptions
import org.openapitools.client.models.MaskingOptions
import org.openapitools.client.models.TextToImageRequestBody

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class V1alphaGenerationApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.stability.ai")
        }
    }

    /**
     * enum for parameter accept
     */
     enum class Accept_v1alphaGenerationImageToImage(val value: kotlin.String) {
         @Json(name = "image/png") imageSlashPng("image/png"),
         @Json(name = "application/json") applicationSlashJson("application/json")
     }

    /**
     * image-to-image
     * Generate big fancy pictures from small fancy pictures
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun v1alphaGenerationImageToImage(engineId: kotlin.String, accept: Accept_v1alphaGenerationImageToImage, initImage: java.io.File, options: ImageToImageOptions, organization: kotlin.String? = null) : Unit {
        val localVarResponse = v1alphaGenerationImageToImageWithHttpInfo(engineId = engineId, accept = accept, initImage = initImage, options = options, organization = organization)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * image-to-image
     * Generate big fancy pictures from small fancy pictures
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun v1alphaGenerationImageToImageWithHttpInfo(engineId: kotlin.String, accept: Accept_v1alphaGenerationImageToImage, initImage: java.io.File, options: ImageToImageOptions, organization: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = v1alphaGenerationImageToImageRequestConfig(engineId = engineId, accept = accept, initImage = initImage, options = options, organization = organization)

        return request<Map<String, PartConfig<*>>, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation v1alphaGenerationImageToImage
     *
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @return RequestConfig
     */
    fun v1alphaGenerationImageToImageRequestConfig(engineId: kotlin.String, accept: Accept_v1alphaGenerationImageToImage, initImage: java.io.File, options: ImageToImageOptions, organization: kotlin.String?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "init_image" to PartConfig(body = initImage, headers = mutableMapOf()),
            "options" to PartConfig(body = options, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        organization?.apply { localVariableHeaders["Organization"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1alpha/generation/{engine_id}/image-to-image".replace("{"+"engine_id"+"}", engineId.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter accept
     */
     enum class Accept_v1alphaGenerationMasking(val value: kotlin.String) {
         @Json(name = "image/png") imageSlashPng("image/png"),
         @Json(name = "application/json") applicationSlashJson("application/json")
     }

    /**
     * image-to-image/masking
     * Paint fancy things into fancy pictures
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @param maskImage Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun v1alphaGenerationMasking(engineId: kotlin.String, accept: Accept_v1alphaGenerationMasking, initImage: java.io.File, options: MaskingOptions, organization: kotlin.String? = null, maskImage: java.io.File? = null) : Unit {
        val localVarResponse = v1alphaGenerationMaskingWithHttpInfo(engineId = engineId, accept = accept, initImage = initImage, options = options, organization = organization, maskImage = maskImage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * image-to-image/masking
     * Paint fancy things into fancy pictures
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @param maskImage Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun v1alphaGenerationMaskingWithHttpInfo(engineId: kotlin.String, accept: Accept_v1alphaGenerationMasking, initImage: java.io.File, options: MaskingOptions, organization: kotlin.String?, maskImage: java.io.File?) : ApiResponse<Unit?> {
        val localVariableConfig = v1alphaGenerationMaskingRequestConfig(engineId = engineId, accept = accept, initImage = initImage, options = options, organization = organization, maskImage = maskImage)

        return request<Map<String, PartConfig<*>>, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation v1alphaGenerationMasking
     *
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @param maskImage Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) (optional)
     * @return RequestConfig
     */
    fun v1alphaGenerationMaskingRequestConfig(engineId: kotlin.String, accept: Accept_v1alphaGenerationMasking, initImage: java.io.File, options: MaskingOptions, organization: kotlin.String?, maskImage: java.io.File?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "init_image" to PartConfig(body = initImage, headers = mutableMapOf()),
            "mask_image" to PartConfig(body = maskImage, headers = mutableMapOf()),
            "options" to PartConfig(body = options, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        organization?.apply { localVariableHeaders["Organization"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1alpha/generation/{engine_id}/image-to-image/masking".replace("{"+"engine_id"+"}", engineId.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter accept
     */
     enum class Accept_v1alphaGenerationTextToImage(val value: kotlin.String) {
         @Json(name = "image/png") imageSlashPng("image/png"),
         @Json(name = "application/json") applicationSlashJson("application/json")
     }

    /**
     * text-to-image
     * Generate an image from text
     * @param engineId  
     * @param accept  
     * @param textToImageRequestBody 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun v1alphaGenerationTextToImage(engineId: kotlin.String, accept: Accept_v1alphaGenerationTextToImage, textToImageRequestBody: TextToImageRequestBody, organization: kotlin.String? = null) : Unit {
        val localVarResponse = v1alphaGenerationTextToImageWithHttpInfo(engineId = engineId, accept = accept, textToImageRequestBody = textToImageRequestBody, organization = organization)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * text-to-image
     * Generate an image from text
     * @param engineId  
     * @param accept  
     * @param textToImageRequestBody 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun v1alphaGenerationTextToImageWithHttpInfo(engineId: kotlin.String, accept: Accept_v1alphaGenerationTextToImage, textToImageRequestBody: TextToImageRequestBody, organization: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = v1alphaGenerationTextToImageRequestConfig(engineId = engineId, accept = accept, textToImageRequestBody = textToImageRequestBody, organization = organization)

        return request<TextToImageRequestBody, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation v1alphaGenerationTextToImage
     *
     * @param engineId  
     * @param accept  
     * @param textToImageRequestBody 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     * @return RequestConfig
     */
    fun v1alphaGenerationTextToImageRequestConfig(engineId: kotlin.String, accept: Accept_v1alphaGenerationTextToImage, textToImageRequestBody: TextToImageRequestBody, organization: kotlin.String?) : RequestConfig<TextToImageRequestBody> {
        val localVariableBody = textToImageRequestBody
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        organization?.apply { localVariableHeaders["Organization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1alpha/generation/{engine_id}/text-to-image".replace("{"+"engine_id"+"}", engineId.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
