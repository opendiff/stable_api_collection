#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/list_engines_response_body.h"


// list
//
// List all engines available to your organization/user
//
list_engines_response_body_t*
V1alphaEnginesAPI_v1alphaEnginesListEngines(apiClient_t *apiClient, char * Organization );


