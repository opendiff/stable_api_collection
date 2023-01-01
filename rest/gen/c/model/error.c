#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "error.h"



error_t *error_create(
    int fault,
    char *id,
    char *message,
    char *name,
    int temporary,
    int timeout
    ) {
    error_t *error_local_var = malloc(sizeof(error_t));
    if (!error_local_var) {
        return NULL;
    }
    error_local_var->fault = fault;
    error_local_var->id = id;
    error_local_var->message = message;
    error_local_var->name = name;
    error_local_var->temporary = temporary;
    error_local_var->timeout = timeout;

    return error_local_var;
}


void error_free(error_t *error) {
    if(NULL == error){
        return ;
    }
    listEntry_t *listEntry;
    if (error->id) {
        free(error->id);
        error->id = NULL;
    }
    if (error->message) {
        free(error->message);
        error->message = NULL;
    }
    if (error->name) {
        free(error->name);
        error->name = NULL;
    }
    free(error);
}

cJSON *error_convertToJSON(error_t *error) {
    cJSON *item = cJSON_CreateObject();

    // error->fault
    if (!error->fault) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "fault", error->fault) == NULL) {
    goto fail; //Bool
    }


    // error->id
    if (!error->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", error->id) == NULL) {
    goto fail; //String
    }


    // error->message
    if (!error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", error->message) == NULL) {
    goto fail; //String
    }


    // error->name
    if (!error->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", error->name) == NULL) {
    goto fail; //String
    }


    // error->temporary
    if (!error->temporary) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "temporary", error->temporary) == NULL) {
    goto fail; //Bool
    }


    // error->timeout
    if (!error->timeout) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "timeout", error->timeout) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

error_t *error_parseFromJSON(cJSON *errorJSON){

    error_t *error_local_var = NULL;

    // error->fault
    cJSON *fault = cJSON_GetObjectItemCaseSensitive(errorJSON, "fault");
    if (!fault) {
        goto end;
    }

    
    if(!cJSON_IsBool(fault))
    {
    goto end; //Bool
    }

    // error->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(errorJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(errorJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }

    // error->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(errorJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // error->temporary
    cJSON *temporary = cJSON_GetObjectItemCaseSensitive(errorJSON, "temporary");
    if (!temporary) {
        goto end;
    }

    
    if(!cJSON_IsBool(temporary))
    {
    goto end; //Bool
    }

    // error->timeout
    cJSON *timeout = cJSON_GetObjectItemCaseSensitive(errorJSON, "timeout");
    if (!timeout) {
        goto end;
    }

    
    if(!cJSON_IsBool(timeout))
    {
    goto end; //Bool
    }


    error_local_var = error_create (
        fault->valueint,
        strdup(id->valuestring),
        strdup(message->valuestring),
        strdup(name->valuestring),
        temporary->valueint,
        timeout->valueint
        );

    return error_local_var;
end:
    return NULL;

}
