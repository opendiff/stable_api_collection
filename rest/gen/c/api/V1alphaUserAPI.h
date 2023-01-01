#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/account_response_body.h"
#include "../model/balance_response_body.h"


// account
//
// Get information about the account associated with the provided API key
//
account_response_body_t*
V1alphaUserAPI_v1alphaUserAccount(apiClient_t *apiClient);


// balance
//
// Get the credit balance of the account/organization associated with the API key
//
balance_response_body_t*
V1alphaUserAPI_v1alphaUserBalance(apiClient_t *apiClient, char * Organization );


