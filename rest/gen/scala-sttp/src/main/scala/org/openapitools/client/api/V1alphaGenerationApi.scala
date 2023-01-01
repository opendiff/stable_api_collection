/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.Error
import java.io.File
import org.openapitools.client.model.ImageToImageOptions
import org.openapitools.client.model.MaskingOptions
import org.openapitools.client.model.TextToImageRequestBody
import org.openapitools.client.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object V1alphaGenerationApi {

def apply(baseUrl: String = "https://api.stability.ai") = new V1alphaGenerationApi(baseUrl)
}

class V1alphaGenerationApi(baseUrl: String) {

  /**
   * Generate big fancy pictures from small fancy pictures
   * 
   * Expected answers:
   *   code 200 :  (OK response.)
   *              Headers :
   *                Content-Length - 
   *                Content-Type - 
   *                Finish-Reason - The result of the generation process. - `SUCCESS` indicates success - `ERROR` indicates an error - `CONTENT_FILTERED` indicates the result affected by the content filter and may be blurred.
   *                Seed - 
   *   code 400 : Error (bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words )
   *   code 401 : Error (unauthorized: API key missing or invalid)
   *   code 403 : Error (permission_denied: You lack the necessary permissions to perform this action)
   *   code 404 : Error (not_found: The requested resource was not found (e.g. specifing a model that does not exist))
   * 
   * Available security schemes:
   *   api_key_header_Authorization (apiKey)
   * 
   * @param engineId  
   * @param accept  
   * @param initImage Initial image to use for the image-to-image generation
   * @param options 
   * @param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
   */
  def v1alphaGenerationImageToImage(apiKey: String)(engineId: String, accept: String, initImage: File, options: ImageToImageOptions, organization: Option[String] = None
): Request[Either[ResponseException[String, Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/v1alpha/generation/${engineId}/image-to-image")
      .contentType("multipart/form-data")
      .header("Accept", accept.toString)
      .header("Organization", organization.toString)
      .header("Authorization", apiKey)
      .multipartBody(Seq(
                multipartFile("init_image", initImage)
, 
                multipart("options", options)

      ).flatten)
      .response(asJson[Unit])

  /**
   * Paint fancy things into fancy pictures
   * 
   * Expected answers:
   *   code 200 :  (OK response.)
   *              Headers :
   *                Content-Length - 
   *                Content-Type - 
   *                Finish-Reason - The result of the generation process. - `SUCCESS` indicates success - `ERROR` indicates an error - `CONTENT_FILTERED` indicates the result affected by the content filter and may be blurred.
   *                Seed - 
   *   code 400 : Error (bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided `init_image` and `mask_image` do not match - invalid_mask_image: The parameter `mask_source` was set to `MASK_IMAGE_WHITE` or `MASK_IMAGE_BLACK` but no `mask_image` was provided - invalid_prompts: One or more of the prompts contains filtered words )
   *   code 401 : Error (unauthorized: API key missing or invalid)
   *   code 403 : Error (permission_denied: You lack the necessary permissions to perform this action)
   *   code 404 : Error (not_found: The requested resource was not found (e.g. specifing a model that does not exist))
   * 
   * Available security schemes:
   *   api_key_header_Authorization (apiKey)
   * 
   * @param engineId  
   * @param accept  
   * @param initImage Initial image to use for the image-to-image generation
   * @param options 
   * @param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
   * @param maskImage Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
   */
  def v1alphaGenerationMasking(apiKey: String)(engineId: String, accept: String, initImage: File, options: MaskingOptions, organization: Option[String] = None, maskImage: Option[File] = None
): Request[Either[ResponseException[String, Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/v1alpha/generation/${engineId}/image-to-image/masking")
      .contentType("multipart/form-data")
      .header("Accept", accept.toString)
      .header("Organization", organization.toString)
      .header("Authorization", apiKey)
      .multipartBody(Seq(
                multipartFile("init_image", initImage)
, 
                maskImage.map(multipartFile("mask_image", _))
, 
                multipart("options", options)

      ).flatten)
      .response(asJson[Unit])

  /**
   * Generate an image from text
   * 
   * Expected answers:
   *   code 200 :  (OK response.)
   *              Headers :
   *                Content-Length - 
   *                Content-Type - 
   *                Finish-Reason - The result of the generation process. - `SUCCESS` indicates success - `ERROR` indicates an error - `CONTENT_FILTERED` indicates the result affected by the content filter and may be blurred.
   *                Seed - 
   *   code 400 : Error (bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words )
   *   code 401 : Error (unauthorized: API key missing or invalid)
   *   code 403 : Error (permission_denied: You lack the necessary permissions to perform this action)
   *   code 404 : Error (not_found: The requested resource was not found (e.g. specifing a model that does not exist))
   * 
   * Available security schemes:
   *   api_key_header_Authorization (apiKey)
   * 
   * @param engineId  
   * @param accept  
   * @param textToImageRequestBody 
   * @param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
   */
  def v1alphaGenerationTextToImage(apiKey: String)(engineId: String, accept: String, textToImageRequestBody: TextToImageRequestBody, organization: Option[String] = None
): Request[Either[ResponseException[String, Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/v1alpha/generation/${engineId}/text-to-image")
      .contentType("application/json")
      .header("Accept", accept.toString)
      .header("Organization", organization.toString)
      .header("Authorization", apiKey)
      .body(textToImageRequestBody)
      .response(asJson[Unit])

}
