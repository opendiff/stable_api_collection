#' Stability.ai REST API
#'
#' Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
#'
#' The version of the OpenAPI document: 0.1
#' Contact: info@stability.ai
#' Generated by: https://openapi-generator.tech
#'

#' @docType class
#' @title ListEnginesResponseBody
#' @description ListEnginesResponseBody Class
#' @format An \code{R6Class} generator object
#' @field engines  list( \link{Engine} )
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ListEnginesResponseBody <- R6::R6Class(
  "ListEnginesResponseBody",
  public = list(
    `engines` = NULL,
    #' Initialize a new ListEnginesResponseBody class.
    #'
    #' @description
    #' Initialize a new ListEnginesResponseBody class.
    #'
    #' @param engines The engines available to your user/organization
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(
        `engines`, ...
    ) {
      if (!missing(`engines`)) {
        stopifnot(is.vector(`engines`), length(`engines`) != 0)
        sapply(`engines`, function(x) stopifnot(R6::is.R6(x)))
        self$`engines` <- `engines`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ListEnginesResponseBody in JSON format
    #' @export
    toJSON = function() {
      ListEnginesResponseBodyObject <- list()
      if (!is.null(self$`engines`)) {
        ListEnginesResponseBodyObject[["engines"]] <-
          lapply(self$`engines`, function(x) x$toJSON())
      }

      ListEnginesResponseBodyObject
    },
    #' Deserialize JSON string into an instance of ListEnginesResponseBody
    #'
    #' @description
    #' Deserialize JSON string into an instance of ListEnginesResponseBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListEnginesResponseBody
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`engines`)) {
        self$`engines` <- ApiClient$new()$deserializeObj(this_object$`engines`, "array[Engine]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ListEnginesResponseBody in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`engines`)) {
          sprintf(
          '"engines":
          [%s]
',
          paste(sapply(self$`engines`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE, digits = NA)), collapse=",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ListEnginesResponseBody
    #'
    #' @description
    #' Deserialize JSON string into an instance of ListEnginesResponseBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListEnginesResponseBody
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`engines` <- ApiClient$new()$deserializeObj(this_object$`engines`, "array[Engine]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to ListEnginesResponseBody
    #'
    #' @description
    #' Validate JSON input with respect to ListEnginesResponseBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `engines`
      if (!is.null(input_json$`engines`)) {
        stopifnot(is.vector(input_json$`engines`), length(json_input$`engines`) != 0)
        tmp <- sapply(input_json$`engines`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListEnginesResponseBody: the required field `engines` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ListEnginesResponseBody
    #' @export
    toString = function() {
      self$toJSONString()
    }
  )
)

