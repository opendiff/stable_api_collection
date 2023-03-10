#' Stability.ai REST API
#'
#' Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
#'
#' The version of the OpenAPI document: 0.1
#' Contact: info@stability.ai
#' Generated by: https://openapi-generator.tech
#'

#' @docType class
#' @title V1alphaGeneration operations
#' @description openapi.V1alphaGeneration
#' @format An \code{R6Class} generator object
#' @field api_client Handles the client-server communication.
#'
#' @section Methods:
#' \describe{
#' \strong{ V1alphaGenerationImageToImage } \emph{ image-to-image }
#' Generate big fancy pictures from small fancy pictures
#'
#' \itemize{
#' \item \emph{ @param } engine_id character
#' \item \emph{ @param } accept Enum < [image/png, application/json] >
#' \item \emph{ @param } init_image data.frame
#' \item \emph{ @param } options \link{ImageToImageOptions}
#' \item \emph{ @param } organization character
#'
#'
#' \item status code : 200 | OK response.
#'
#'
#' \item response headers :
#'
#' \tabular{ll}{
#' Content-Length \tab  \cr
#' Content-Type \tab  \cr
#' Finish-Reason \tab The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. \cr
#' Seed \tab  \cr
#' }
#' \item status code : 400 | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words 
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 401 | unauthorized: API key missing or invalid
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 403 | permission_denied: You lack the necessary permissions to perform this action
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 404 | not_found: The requested resource was not found (e.g. specifing a model that does not exist)
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' }
#'
#' \strong{ V1alphaGenerationMasking } \emph{ image-to-image/masking }
#' Paint fancy things into fancy pictures
#'
#' \itemize{
#' \item \emph{ @param } engine_id character
#' \item \emph{ @param } accept Enum < [image/png, application/json] >
#' \item \emph{ @param } init_image data.frame
#' \item \emph{ @param } options \link{MaskingOptions}
#' \item \emph{ @param } organization character
#' \item \emph{ @param } mask_image data.frame
#'
#'
#' \item status code : 200 | OK response.
#'
#'
#' \item response headers :
#'
#' \tabular{ll}{
#' Content-Length \tab  \cr
#' Content-Type \tab  \cr
#' Finish-Reason \tab The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. \cr
#' Seed \tab  \cr
#' }
#' \item status code : 400 | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided &#x60;init_image&#x60; and &#x60;mask_image&#x60; do not match - invalid_mask_image: The parameter &#x60;mask_source&#x60; was set to &#x60;MASK_IMAGE_WHITE&#x60; or &#x60;MASK_IMAGE_BLACK&#x60; but no &#x60;mask_image&#x60; was provided - invalid_prompts: One or more of the prompts contains filtered words 
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 401 | unauthorized: API key missing or invalid
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 403 | permission_denied: You lack the necessary permissions to perform this action
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 404 | not_found: The requested resource was not found (e.g. specifing a model that does not exist)
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' }
#'
#' \strong{ V1alphaGenerationTextToImage } \emph{ text-to-image }
#' Generate an image from text
#'
#' \itemize{
#' \item \emph{ @param } engine_id character
#' \item \emph{ @param } accept Enum < [image/png, application/json] >
#' \item \emph{ @param } text_to_image_request_body \link{TextToImageRequestBody}
#' \item \emph{ @param } organization character
#'
#'
#' \item status code : 200 | OK response.
#'
#'
#' \item response headers :
#'
#' \tabular{ll}{
#' Content-Length \tab  \cr
#' Content-Type \tab  \cr
#' Finish-Reason \tab The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. \cr
#' Seed \tab  \cr
#' }
#' \item status code : 400 | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words 
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 401 | unauthorized: API key missing or invalid
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 403 | permission_denied: You lack the necessary permissions to perform this action
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' \item status code : 404 | not_found: The requested resource was not found (e.g. specifing a model that does not exist)
#'
#' \item return type : Error 
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' }
#'
#' }
#'
#'
#' @examples
#' \dontrun{
#' ####################  V1alphaGenerationImageToImage  ####################
#'
#' library(openapi)
#' var.engine_id <- "stable-diffusion-512-v2-0" # character |  
#' var.accept <- "application/json" # character |  
#' var.init_image <- File.new('/path/to/file') # data.frame | Initial image to use for the image-to-image generation
#' var.options <- ImageToImageOptions$new() # ImageToImageOptions | 
#' var.organization <- "org-123456" # character | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
#'
#' #image-to-image
#' api.instance <- V1alphaGenerationApi$new()
#'
#' #Configure API key authorization: api_key_header_Authorization
#' api.instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
#'
#' result <- api.instance$V1alphaGenerationImageToImage(var.engine_id, var.accept, var.init_image, var.options, organization=var.organization)
#'
#'
#' ####################  V1alphaGenerationMasking  ####################
#'
#' library(openapi)
#' var.engine_id <- "stable-diffusion-512-v2-0" # character |  
#' var.accept <- "application/json" # character |  
#' var.init_image <- File.new('/path/to/file') # data.frame | Initial image to use for the image-to-image generation
#' var.options <- MaskingOptions$new() # MaskingOptions | 
#' var.organization <- "org-123456" # character | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
#' var.mask_image <- File.new('/path/to/file') # data.frame | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
#'
#' #image-to-image/masking
#' api.instance <- V1alphaGenerationApi$new()
#'
#' #Configure API key authorization: api_key_header_Authorization
#' api.instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
#'
#' result <- api.instance$V1alphaGenerationMasking(var.engine_id, var.accept, var.init_image, var.options, organization=var.organization, mask_image=var.mask_image)
#'
#'
#' ####################  V1alphaGenerationTextToImage  ####################
#'
#' library(openapi)
#' var.engine_id <- "stable-diffusion-512-v2-0" # character |  
#' var.accept <- "application/json" # character |  
#' var.text_to_image_request_body <- {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512} # TextToImageRequestBody | 
#' var.organization <- "org-123456" # character | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
#'
#' #text-to-image
#' api.instance <- V1alphaGenerationApi$new()
#'
#' #Configure API key authorization: api_key_header_Authorization
#' api.instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
#'
#' result <- api.instance$V1alphaGenerationTextToImage(var.engine_id, var.accept, var.text_to_image_request_body, organization=var.organization)
#'
#'
#' }
#' @importFrom R6 R6Class
#' @importFrom base64enc base64encode
#' @export
V1alphaGenerationApi <- R6::R6Class(
  "V1alphaGenerationApi",
  public = list(
    api_client = NULL,
    #' Initialize a new V1alphaGenerationApi.
    #'
    #' @description
    #' Initialize a new V1alphaGenerationApi.
    #'
    #' @param api_client An instance of API client.
    #' @export
    initialize = function(api_client) {
      if (!missing(api_client)) {
        self$api_client <- api_client
      } else {
        self$api_client <- ApiClient$new()
      }
    },
    #' image-to-image
    #'
    #' @description
    #' image-to-image
    #'
    #' @param engine_id  
    #' @param accept  
    #' @param init_image Initial image to use for the image-to-image generation
    #' @param options 
    #' @param organization (optional)Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. 
    #' @param ... Other optional arguments
    #' @return void
    #' @export
    V1alphaGenerationImageToImage = function(engine_id, accept, init_image, options, organization=NULL, ...) {
      api_response <- self$V1alphaGenerationImageToImageWithHttpInfo(engine_id, accept, init_image, options, organization, ...)
      resp <- api_response$response
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        api_response$content
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        api_response
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        api_response
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        api_response
      }
    },
    #' image-to-image
    #'
    #' @description
    #' image-to-image
    #'
    #' @param engine_id  
    #' @param accept  
    #' @param init_image Initial image to use for the image-to-image generation
    #' @param options 
    #' @param organization (optional) Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    #' @param ... Other optional arguments
    #' @return API response (void) with additional information such as HTTP status code, headers
    #' @export
    V1alphaGenerationImageToImageWithHttpInfo = function(engine_id, accept, init_image, options, organization=NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()

      if (missing(`engine_id`)) {
        stop("Missing required parameter `engine_id`.")
      }

      if (missing(`accept`)) {
        stop("Missing required parameter `accept`.")
      }

      if (missing(`init_image`)) {
        stop("Missing required parameter `init_image`.")
      }

      if (missing(`options`)) {
        stop("Missing required parameter `options`.")
      }

      body <- list(
        "init_image" = httr::upload_file(init_image),
        "options" = options
      )

      url_path <- "/v1alpha/generation/{engine_id}/image-to-image"
      if (!missing(`engine_id`)) {
        url_path <- gsub(paste0("\\{", "engine_id", "\\}"), URLencode(as.character(`engine_id`), reserved = TRUE), url_path)
      }

      # API key authentication
      if ("Authorization" %in% names(self$api_client$api_keys) && nchar(self$api_client$api_keys["Authorization"]) > 0) {
        header_params["Authorization"] <- paste(unlist(self$api_client$api_keys["Authorization"]), collapse = "")
      }

      resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, url_path),
                                 method = "POST",
                                 query_params = query_params,
                                 header_params = header_params,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        ApiResponse$new(NULL, resp)
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        ApiResponse$new(paste("Server returned ", httr::status_code(resp), " response status code."), resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }
    },
    #' image-to-image/masking
    #'
    #' @description
    #' image-to-image/masking
    #'
    #' @param engine_id  
    #' @param accept  
    #' @param init_image Initial image to use for the image-to-image generation
    #' @param options 
    #' @param organization (optional)Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. 
    #' @param mask_image (optional)Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) 
    #' @param ... Other optional arguments
    #' @return void
    #' @export
    V1alphaGenerationMasking = function(engine_id, accept, init_image, options, organization=NULL, mask_image=NULL, ...) {
      api_response <- self$V1alphaGenerationMaskingWithHttpInfo(engine_id, accept, init_image, options, organization, mask_image, ...)
      resp <- api_response$response
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        api_response$content
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        api_response
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        api_response
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        api_response
      }
    },
    #' image-to-image/masking
    #'
    #' @description
    #' image-to-image/masking
    #'
    #' @param engine_id  
    #' @param accept  
    #' @param init_image Initial image to use for the image-to-image generation
    #' @param options 
    #' @param organization (optional) Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    #' @param mask_image (optional) Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
    #' @param ... Other optional arguments
    #' @return API response (void) with additional information such as HTTP status code, headers
    #' @export
    V1alphaGenerationMaskingWithHttpInfo = function(engine_id, accept, init_image, options, organization=NULL, mask_image=NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()

      if (missing(`engine_id`)) {
        stop("Missing required parameter `engine_id`.")
      }

      if (missing(`accept`)) {
        stop("Missing required parameter `accept`.")
      }

      if (missing(`init_image`)) {
        stop("Missing required parameter `init_image`.")
      }

      if (missing(`options`)) {
        stop("Missing required parameter `options`.")
      }

      body <- list(
        "init_image" = httr::upload_file(init_image),
        "mask_image" = httr::upload_file(mask_image),
        "options" = options
      )

      url_path <- "/v1alpha/generation/{engine_id}/image-to-image/masking"
      if (!missing(`engine_id`)) {
        url_path <- gsub(paste0("\\{", "engine_id", "\\}"), URLencode(as.character(`engine_id`), reserved = TRUE), url_path)
      }

      # API key authentication
      if ("Authorization" %in% names(self$api_client$api_keys) && nchar(self$api_client$api_keys["Authorization"]) > 0) {
        header_params["Authorization"] <- paste(unlist(self$api_client$api_keys["Authorization"]), collapse = "")
      }

      resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, url_path),
                                 method = "POST",
                                 query_params = query_params,
                                 header_params = header_params,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        ApiResponse$new(NULL, resp)
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        ApiResponse$new(paste("Server returned ", httr::status_code(resp), " response status code."), resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }
    },
    #' text-to-image
    #'
    #' @description
    #' text-to-image
    #'
    #' @param engine_id  
    #' @param accept  
    #' @param text_to_image_request_body 
    #' @param organization (optional)Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. 
    #' @param ... Other optional arguments
    #' @return void
    #' @export
    V1alphaGenerationTextToImage = function(engine_id, accept, text_to_image_request_body, organization=NULL, ...) {
      api_response <- self$V1alphaGenerationTextToImageWithHttpInfo(engine_id, accept, text_to_image_request_body, organization, ...)
      resp <- api_response$response
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        api_response$content
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        api_response
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        api_response
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        api_response
      }
    },
    #' text-to-image
    #'
    #' @description
    #' text-to-image
    #'
    #' @param engine_id  
    #' @param accept  
    #' @param text_to_image_request_body 
    #' @param organization (optional) Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    #' @param ... Other optional arguments
    #' @return API response (void) with additional information such as HTTP status code, headers
    #' @export
    V1alphaGenerationTextToImageWithHttpInfo = function(engine_id, accept, text_to_image_request_body, organization=NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()

      if (missing(`engine_id`)) {
        stop("Missing required parameter `engine_id`.")
      }

      if (missing(`accept`)) {
        stop("Missing required parameter `accept`.")
      }

      if (missing(`text_to_image_request_body`)) {
        stop("Missing required parameter `text_to_image_request_body`.")
      }

      if (!missing(`text_to_image_request_body`)) {
        body <- `text_to_image_request_body`$toJSONString()
      } else {
        body <- NULL
      }

      url_path <- "/v1alpha/generation/{engine_id}/text-to-image"
      if (!missing(`engine_id`)) {
        url_path <- gsub(paste0("\\{", "engine_id", "\\}"), URLencode(as.character(`engine_id`), reserved = TRUE), url_path)
      }

      # API key authentication
      if ("Authorization" %in% names(self$api_client$api_keys) && nchar(self$api_client$api_keys["Authorization"]) > 0) {
        header_params["Authorization"] <- paste(unlist(self$api_client$api_keys["Authorization"]), collapse = "")
      }

      resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, url_path),
                                 method = "POST",
                                 query_params = query_params,
                                 header_params = header_params,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        ApiResponse$new(NULL, resp)
      } else if (httr::status_code(resp) >= 300 && httr::status_code(resp) <= 399) {
        ApiResponse$new(paste("Server returned ", httr::status_code(resp), " response status code."), resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }
    }
  )
)
