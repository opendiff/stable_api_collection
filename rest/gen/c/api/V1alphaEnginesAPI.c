#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "V1alphaEnginesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// list
//
// List all engines available to your organization/user
//
list_engines_response_body_t*
V1alphaEnginesAPI_v1alphaEnginesListEngines(apiClient_t *apiClient, char * Organization )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_createList();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/v1alpha/engines/list")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/v1alpha/engines/list");




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

    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK response.");
    //}
    //nonprimitive not container
    cJSON *V1alphaEnginesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    list_engines_response_body_t *elementToReturn = list_engines_response_body_parseFromJSON(V1alphaEnginesAPIlocalVarJSON);
    cJSON_Delete(V1alphaEnginesAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    list_freeList(localVarHeaderParameters);
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if (keyHeader_Organization) {
        free(keyHeader_Organization);
        keyHeader_Organization = NULL;
    }
    if (valueHeader_Organization) {
        free(valueHeader_Organization);
        valueHeader_Organization = NULL;
    }
    free(keyPairHeader_Organization);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

