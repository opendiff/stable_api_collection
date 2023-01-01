#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "balance_response_body.h"



balance_response_body_t *balance_response_body_create(
    double credits
    ) {
    balance_response_body_t *balance_response_body_local_var = malloc(sizeof(balance_response_body_t));
    if (!balance_response_body_local_var) {
        return NULL;
    }
    balance_response_body_local_var->credits = credits;

    return balance_response_body_local_var;
}


void balance_response_body_free(balance_response_body_t *balance_response_body) {
    if(NULL == balance_response_body){
        return ;
    }
    listEntry_t *listEntry;
    free(balance_response_body);
}

cJSON *balance_response_body_convertToJSON(balance_response_body_t *balance_response_body) {
    cJSON *item = cJSON_CreateObject();

    // balance_response_body->credits
    if (!balance_response_body->credits) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "credits", balance_response_body->credits) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

balance_response_body_t *balance_response_body_parseFromJSON(cJSON *balance_response_bodyJSON){

    balance_response_body_t *balance_response_body_local_var = NULL;

    // balance_response_body->credits
    cJSON *credits = cJSON_GetObjectItemCaseSensitive(balance_response_bodyJSON, "credits");
    if (!credits) {
        goto end;
    }

    
    if(!cJSON_IsNumber(credits))
    {
    goto end; //Numeric
    }


    balance_response_body_local_var = balance_response_body_create (
        credits->valuedouble
        );

    return balance_response_body_local_var;
end:
    return NULL;

}
