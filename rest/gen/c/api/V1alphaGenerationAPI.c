#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "V1alphaGenerationAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum ACCEPT for V1alphaGenerationAPI_v1alphaGenerationImageToImage

static char* v1alphaGenerationImageToImage_ACCEPT_ToString(stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e ACCEPT){
    char *ACCEPTArray[] =  { "NULL", "image/png", "application/json" };
    return ACCEPTArray[ACCEPT];
}

static stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e v1alphaGenerationImageToImage_ACCEPT_FromString(char* ACCEPT){
    int stringToReturn = 0;
    char *ACCEPTArray[] =  { "NULL", "image/png", "application/json" };
    size_t sizeofArray = sizeof(ACCEPTArray) / sizeof(ACCEPTArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ACCEPT, ACCEPTArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function v1alphaGenerationImageToImage_ACCEPT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *v1alphaGenerationImageToImage_ACCEPT_convertToJSON(stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e ACCEPT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "Accept", v1alphaGenerationImageToImage_ACCEPT_ToString(ACCEPT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function v1alphaGenerationImageToImage_ACCEPT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e v1alphaGenerationImageToImage_ACCEPT_parseFromJSON(cJSON* ACCEPTJSON) {
    stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e ACCEPTVariable = 0;
    cJSON *ACCEPTVar = cJSON_GetObjectItemCaseSensitive(ACCEPTJSON, "Accept");
    if(!cJSON_IsString(ACCEPTVar) || (ACCEPTVar->valuestring == NULL))
    {
        goto end;
    }
    ACCEPTVariable = v1alphaGenerationImageToImage_ACCEPT_FromString(ACCEPTVar->valuestring);
    return ACCEPTVariable;
end:
    return 0;
}
*/

// Functions for enum ACCEPT for V1alphaGenerationAPI_v1alphaGenerationMasking

static char* v1alphaGenerationMasking_ACCEPT_ToString(stability_ai_rest_api_v1alphaGenerationMasking_Accept_e ACCEPT){
    char *ACCEPTArray[] =  { "NULL", "image/png", "application/json" };
    return ACCEPTArray[ACCEPT];
}

static stability_ai_rest_api_v1alphaGenerationMasking_Accept_e v1alphaGenerationMasking_ACCEPT_FromString(char* ACCEPT){
    int stringToReturn = 0;
    char *ACCEPTArray[] =  { "NULL", "image/png", "application/json" };
    size_t sizeofArray = sizeof(ACCEPTArray) / sizeof(ACCEPTArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ACCEPT, ACCEPTArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function v1alphaGenerationMasking_ACCEPT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *v1alphaGenerationMasking_ACCEPT_convertToJSON(stability_ai_rest_api_v1alphaGenerationMasking_Accept_e ACCEPT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "Accept", v1alphaGenerationMasking_ACCEPT_ToString(ACCEPT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function v1alphaGenerationMasking_ACCEPT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static stability_ai_rest_api_v1alphaGenerationMasking_Accept_e v1alphaGenerationMasking_ACCEPT_parseFromJSON(cJSON* ACCEPTJSON) {
    stability_ai_rest_api_v1alphaGenerationMasking_Accept_e ACCEPTVariable = 0;
    cJSON *ACCEPTVar = cJSON_GetObjectItemCaseSensitive(ACCEPTJSON, "Accept");
    if(!cJSON_IsString(ACCEPTVar) || (ACCEPTVar->valuestring == NULL))
    {
        goto end;
    }
    ACCEPTVariable = v1alphaGenerationMasking_ACCEPT_FromString(ACCEPTVar->valuestring);
    return ACCEPTVariable;
end:
    return 0;
}
*/

// Functions for enum ACCEPT for V1alphaGenerationAPI_v1alphaGenerationTextToImage

static char* v1alphaGenerationTextToImage_ACCEPT_ToString(stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e ACCEPT){
    char *ACCEPTArray[] =  { "NULL", "image/png", "application/json" };
    return ACCEPTArray[ACCEPT];
}

static stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e v1alphaGenerationTextToImage_ACCEPT_FromString(char* ACCEPT){
    int stringToReturn = 0;
    char *ACCEPTArray[] =  { "NULL", "image/png", "application/json" };
    size_t sizeofArray = sizeof(ACCEPTArray) / sizeof(ACCEPTArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ACCEPT, ACCEPTArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function v1alphaGenerationTextToImage_ACCEPT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *v1alphaGenerationTextToImage_ACCEPT_convertToJSON(stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e ACCEPT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "Accept", v1alphaGenerationTextToImage_ACCEPT_ToString(ACCEPT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function v1alphaGenerationTextToImage_ACCEPT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e v1alphaGenerationTextToImage_ACCEPT_parseFromJSON(cJSON* ACCEPTJSON) {
    stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e ACCEPTVariable = 0;
    cJSON *ACCEPTVar = cJSON_GetObjectItemCaseSensitive(ACCEPTJSON, "Accept");
    if(!cJSON_IsString(ACCEPTVar) || (ACCEPTVar->valuestring == NULL))
    {
        goto end;
    }
    ACCEPTVariable = v1alphaGenerationTextToImage_ACCEPT_FromString(ACCEPTVar->valuestring);
    return ACCEPTVariable;
end:
    return 0;
}
*/


// image-to-image
//
// Generate big fancy pictures from small fancy pictures
//
void
V1alphaGenerationAPI_v1alphaGenerationImageToImage(apiClient_t *apiClient, char * engine_id , stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e Accept , binary_t* init_image , image_to_image_options_t * options , char * Organization )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_createList();
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/v1alpha/generation/{engine_id}/image-to-image")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/v1alpha/generation/{engine_id}/image-to-image");


    // Path Params
    long sizeOfPathParams_engine_id = strlen(engine_id)+3 + strlen("{ engine_id }");
    if(engine_id == NULL) {
        goto end;
    }
    char* localVarToReplace_engine_id = malloc(sizeOfPathParams_engine_id);
    sprintf(localVarToReplace_engine_id, "{%s}", "engine_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_engine_id, engine_id);



    // header parameters
    char *keyHeader_Accept = NULL;
    stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e valueHeader_Accept = 0;
    keyValuePair_t *keyPairHeader_Accept = 0;
    if (Accept) {
        keyHeader_Accept = strdup("Accept");
        valueHeader_Accept = (Accept);
        keyPairHeader_Accept = keyValuePair_create(keyHeader_Accept, (void *)valueHeader_Accept);
        list_addElement(localVarHeaderParameters,keyPairHeader_Accept);
    }


    // header parameters
    char *keyHeader_Organization = NULL;
    char * valueHeader_Organization = 0;
    keyValuePair_t *keyPairHeader_Organization = 0;
    if (Organization) {
        keyHeader_Organization = strdup("Organization");
        valueHeader_Organization = strdup((Organization));
        keyPairHeader_Organization = keyValuePair_create(keyHeader_Organization, valueHeader_Organization);
        list_addElement(localVarHeaderParameters,keyPairHeader_Organization);
    }


    // form parameters
    char *keyForm_init_image = NULL;
    binary_t* valueForm_init_image = 0;
    keyValuePair_t *keyPairForm_init_image = 0;
    if (init_image != NULL)
    {
        keyForm_init_image = strdup("init_image");
        valueForm_init_image = init_image;
        keyPairForm_init_image = keyValuePair_create(keyForm_init_image, &valueForm_init_image);
        list_addElement(localVarFormParameters,keyPairForm_init_image); //file adding
    }

    // form parameters
    char *keyForm_options = NULL;
    image_to_image_options_t * valueForm_options = 0;
    keyValuePair_t *keyPairForm_options = 0;
    if (options != NULL)
    {
        keyForm_options = strdup("options");
        valueForm_options = (options);
        keyPairForm_options = keyValuePair_create(keyForm_options,&valueForm_options);
        list_addElement(localVarFormParameters,keyPairForm_options);
    }
    list_addElement(localVarHeaderType,"application/vnd.goa.error"); //produces
    list_addElement(localVarContentType,"multipart/form-data"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK response.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words ");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","unauthorized: API key missing or invalid");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","permission_denied: You lack the necessary permissions to perform this action");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","not_found: The requested resource was not found (e.g. specifing a model that does not exist)");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    list_freeList(localVarHeaderParameters);
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_engine_id);
    if (keyHeader_Accept) {
        free(keyHeader_Accept);
        keyHeader_Accept = NULL;
    }
    if (valueHeader_Accept) {
        free(valueHeader_Accept);
        valueHeader_Accept = NULL;
    }
    free(keyPairHeader_Accept);
    if (keyHeader_Organization) {
        free(keyHeader_Organization);
        keyHeader_Organization = NULL;
    }
    if (valueHeader_Organization) {
        free(valueHeader_Organization);
        valueHeader_Organization = NULL;
    }
    free(keyPairHeader_Organization);
    if (keyForm_init_image) {
        free(keyForm_init_image);
        keyForm_init_image = NULL;
    }
//    free(fileVar_init_image->data);
//    free(fileVar_init_image);
    if (keyForm_options) {
        free(keyForm_options);
        keyForm_options = NULL;
    }
    free(keyPairForm_options);

}

// image-to-image/masking
//
// Paint fancy things into fancy pictures
//
void
V1alphaGenerationAPI_v1alphaGenerationMasking(apiClient_t *apiClient, char * engine_id , stability_ai_rest_api_v1alphaGenerationMasking_Accept_e Accept , binary_t* init_image , masking_options_t * options , char * Organization , binary_t* mask_image )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_createList();
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/v1alpha/generation/{engine_id}/image-to-image/masking")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/v1alpha/generation/{engine_id}/image-to-image/masking");


    // Path Params
    long sizeOfPathParams_engine_id = strlen(engine_id)+3 + strlen("{ engine_id }");
    if(engine_id == NULL) {
        goto end;
    }
    char* localVarToReplace_engine_id = malloc(sizeOfPathParams_engine_id);
    sprintf(localVarToReplace_engine_id, "{%s}", "engine_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_engine_id, engine_id);



    // header parameters
    char *keyHeader_Accept = NULL;
    stability_ai_rest_api_v1alphaGenerationMasking_Accept_e valueHeader_Accept = 0;
    keyValuePair_t *keyPairHeader_Accept = 0;
    if (Accept) {
        keyHeader_Accept = strdup("Accept");
        valueHeader_Accept = (Accept);
        keyPairHeader_Accept = keyValuePair_create(keyHeader_Accept, (void *)valueHeader_Accept);
        list_addElement(localVarHeaderParameters,keyPairHeader_Accept);
    }


    // header parameters
    char *keyHeader_Organization = NULL;
    char * valueHeader_Organization = 0;
    keyValuePair_t *keyPairHeader_Organization = 0;
    if (Organization) {
        keyHeader_Organization = strdup("Organization");
        valueHeader_Organization = strdup((Organization));
        keyPairHeader_Organization = keyValuePair_create(keyHeader_Organization, valueHeader_Organization);
        list_addElement(localVarHeaderParameters,keyPairHeader_Organization);
    }


    // form parameters
    char *keyForm_init_image = NULL;
    binary_t* valueForm_init_image = 0;
    keyValuePair_t *keyPairForm_init_image = 0;
    if (init_image != NULL)
    {
        keyForm_init_image = strdup("init_image");
        valueForm_init_image = init_image;
        keyPairForm_init_image = keyValuePair_create(keyForm_init_image, &valueForm_init_image);
        list_addElement(localVarFormParameters,keyPairForm_init_image); //file adding
    }

    // form parameters
    char *keyForm_mask_image = NULL;
    binary_t* valueForm_mask_image = 0;
    keyValuePair_t *keyPairForm_mask_image = 0;
    if (mask_image != NULL)
    {
        keyForm_mask_image = strdup("mask_image");
        valueForm_mask_image = mask_image;
        keyPairForm_mask_image = keyValuePair_create(keyForm_mask_image, &valueForm_mask_image);
        list_addElement(localVarFormParameters,keyPairForm_mask_image); //file adding
    }

    // form parameters
    char *keyForm_options = NULL;
    masking_options_t * valueForm_options = 0;
    keyValuePair_t *keyPairForm_options = 0;
    if (options != NULL)
    {
        keyForm_options = strdup("options");
        valueForm_options = (options);
        keyPairForm_options = keyValuePair_create(keyForm_options,&valueForm_options);
        list_addElement(localVarFormParameters,keyPairForm_options);
    }
    list_addElement(localVarHeaderType,"application/vnd.goa.error"); //produces
    list_addElement(localVarContentType,"multipart/form-data"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK response.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided &#x60;init_image&#x60; and &#x60;mask_image&#x60; do not match - invalid_mask_image: The parameter &#x60;mask_source&#x60; was set to &#x60;MASK_IMAGE_WHITE&#x60; or &#x60;MASK_IMAGE_BLACK&#x60; but no &#x60;mask_image&#x60; was provided - invalid_prompts: One or more of the prompts contains filtered words ");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","unauthorized: API key missing or invalid");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","permission_denied: You lack the necessary permissions to perform this action");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","not_found: The requested resource was not found (e.g. specifing a model that does not exist)");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    list_freeList(localVarHeaderParameters);
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_engine_id);
    if (keyHeader_Accept) {
        free(keyHeader_Accept);
        keyHeader_Accept = NULL;
    }
    if (valueHeader_Accept) {
        free(valueHeader_Accept);
        valueHeader_Accept = NULL;
    }
    free(keyPairHeader_Accept);
    if (keyHeader_Organization) {
        free(keyHeader_Organization);
        keyHeader_Organization = NULL;
    }
    if (valueHeader_Organization) {
        free(valueHeader_Organization);
        valueHeader_Organization = NULL;
    }
    free(keyPairHeader_Organization);
    if (keyForm_init_image) {
        free(keyForm_init_image);
        keyForm_init_image = NULL;
    }
//    free(fileVar_init_image->data);
//    free(fileVar_init_image);
    if (keyForm_mask_image) {
        free(keyForm_mask_image);
        keyForm_mask_image = NULL;
    }
//    free(fileVar_mask_image->data);
//    free(fileVar_mask_image);
    if (keyForm_options) {
        free(keyForm_options);
        keyForm_options = NULL;
    }
    free(keyPairForm_options);

}

// text-to-image
//
// Generate an image from text
//
void
V1alphaGenerationAPI_v1alphaGenerationTextToImage(apiClient_t *apiClient, char * engine_id , stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e Accept , text_to_image_request_body_t * text_to_image_request_body , char * Organization )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_createList();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/v1alpha/generation/{engine_id}/text-to-image")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/v1alpha/generation/{engine_id}/text-to-image");


    // Path Params
    long sizeOfPathParams_engine_id = strlen(engine_id)+3 + strlen("{ engine_id }");
    if(engine_id == NULL) {
        goto end;
    }
    char* localVarToReplace_engine_id = malloc(sizeOfPathParams_engine_id);
    sprintf(localVarToReplace_engine_id, "{%s}", "engine_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_engine_id, engine_id);



    // header parameters
    char *keyHeader_Accept = NULL;
    stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e valueHeader_Accept = 0;
    keyValuePair_t *keyPairHeader_Accept = 0;
    if (Accept) {
        keyHeader_Accept = strdup("Accept");
        valueHeader_Accept = (Accept);
        keyPairHeader_Accept = keyValuePair_create(keyHeader_Accept, (void *)valueHeader_Accept);
        list_addElement(localVarHeaderParameters,keyPairHeader_Accept);
    }


    // header parameters
    char *keyHeader_Organization = NULL;
    char * valueHeader_Organization = 0;
    keyValuePair_t *keyPairHeader_Organization = 0;
    if (Organization) {
        keyHeader_Organization = strdup("Organization");
        valueHeader_Organization = strdup((Organization));
        keyPairHeader_Organization = keyValuePair_create(keyHeader_Organization, valueHeader_Organization);
        list_addElement(localVarHeaderParameters,keyPairHeader_Organization);
    }


    // Body Param
    cJSON *localVarSingleItemJSON_text_to_image_request_body = NULL;
    if (text_to_image_request_body != NULL)
    {
        //string
        localVarSingleItemJSON_text_to_image_request_body = text_to_image_request_body_convertToJSON(text_to_image_request_body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_text_to_image_request_body);
    }
    list_addElement(localVarHeaderType,"application/vnd.goa.error"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK response.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words ");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","unauthorized: API key missing or invalid");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","permission_denied: You lack the necessary permissions to perform this action");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","not_found: The requested resource was not found (e.g. specifing a model that does not exist)");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    list_freeList(localVarHeaderParameters);
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_engine_id);
    if (keyHeader_Accept) {
        free(keyHeader_Accept);
        keyHeader_Accept = NULL;
    }
    if (valueHeader_Accept) {
        free(valueHeader_Accept);
        valueHeader_Accept = NULL;
    }
    free(keyPairHeader_Accept);
    if (keyHeader_Organization) {
        free(keyHeader_Organization);
        keyHeader_Organization = NULL;
    }
    if (valueHeader_Organization) {
        free(valueHeader_Organization);
        valueHeader_Organization = NULL;
    }
    free(keyPairHeader_Organization);
    if (localVarSingleItemJSON_text_to_image_request_body) {
        cJSON_Delete(localVarSingleItemJSON_text_to_image_request_body);
        localVarSingleItemJSON_text_to_image_request_body = NULL;
    }
    free(localVarBodyParameters);

}

