#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "V1alphaUserAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// account
//
// Get information about the account associated with the provided API key
//
account_response_body_t*
V1alphaUserAPI_v1alphaUserAccount(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/v1alpha/user/account")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/v1alpha/user/account");



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
    cJSON *V1alphaUserAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    account_response_body_t *elementToReturn = account_response_body_parseFromJSON(V1alphaUserAPIlocalVarJSON);
    cJSON_Delete(V1alphaUserAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// balance
//
// Get the credit balance of the account/organization associated with the API key
//
balance_response_body_t*
V1alphaUserAPI_v1alphaUserBalance(apiClient_t *apiClient, char * Organization )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_createList();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/v1alpha/user/balance")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/v1alpha/user/balance");




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
    cJSON *V1alphaUserAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    balance_response_body_t *elementToReturn = balance_response_body_parseFromJSON(V1alphaUserAPIlocalVarJSON);
    cJSON_Delete(V1alphaUserAPIlocalVarJSON);
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

