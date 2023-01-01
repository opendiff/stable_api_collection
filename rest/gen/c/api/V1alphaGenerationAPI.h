#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/image_to_image_options.h"
#include "../model/masking_options.h"
#include "../model/text_to_image_request_body.h"

// Enum ACCEPT for V1alphaGenerationAPI_v1alphaGenerationImageToImage
typedef enum  { stability_ai_rest_api_v1alphaGenerationImageToImage_ACCEPT_NULL = 0, stability_ai_rest_api_v1alphaGenerationImageToImage_ACCEPT_image/png, stability_ai_rest_api_v1alphaGenerationImageToImage_ACCEPT_application/json } stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e;

// Enum ACCEPT for V1alphaGenerationAPI_v1alphaGenerationMasking
typedef enum  { stability_ai_rest_api_v1alphaGenerationMasking_ACCEPT_NULL = 0, stability_ai_rest_api_v1alphaGenerationMasking_ACCEPT_image/png, stability_ai_rest_api_v1alphaGenerationMasking_ACCEPT_application/json } stability_ai_rest_api_v1alphaGenerationMasking_Accept_e;

// Enum ACCEPT for V1alphaGenerationAPI_v1alphaGenerationTextToImage
typedef enum  { stability_ai_rest_api_v1alphaGenerationTextToImage_ACCEPT_NULL = 0, stability_ai_rest_api_v1alphaGenerationTextToImage_ACCEPT_image/png, stability_ai_rest_api_v1alphaGenerationTextToImage_ACCEPT_application/json } stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e;


// image-to-image
//
// Generate big fancy pictures from small fancy pictures
//
void
V1alphaGenerationAPI_v1alphaGenerationImageToImage(apiClient_t *apiClient, char * engine_id , stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e Accept , binary_t* init_image , image_to_image_options_t * options , char * Organization );


// image-to-image/masking
//
// Paint fancy things into fancy pictures
//
void
V1alphaGenerationAPI_v1alphaGenerationMasking(apiClient_t *apiClient, char * engine_id , stability_ai_rest_api_v1alphaGenerationMasking_Accept_e Accept , binary_t* init_image , masking_options_t * options , char * Organization , binary_t* mask_image );


// text-to-image
//
// Generate an image from text
//
void
V1alphaGenerationAPI_v1alphaGenerationTextToImage(apiClient_t *apiClient, char * engine_id , stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e Accept , text_to_image_request_body_t * text_to_image_request_body , char * Organization );


