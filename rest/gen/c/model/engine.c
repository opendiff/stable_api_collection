#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "engine.h"


char* typeengine_ToString(stability_ai_rest_api_engine_TYPE_e type) {
    char* typeArray[] =  { "NULL", "AUDIO", "CLASSIFICATION", "PICTURE", "STORAGE", "TEXT", "VIDEO" };
	return typeArray[type];
}

stability_ai_rest_api_engine_TYPE_e typeengine_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "AUDIO", "CLASSIFICATION", "PICTURE", "STORAGE", "TEXT", "VIDEO" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

engine_t *engine_create(
    char *description,
    char *id,
    char *name,
    stability_ai_rest_api_engine_TYPE_e type
    ) {
    engine_t *engine_local_var = malloc(sizeof(engine_t));
    if (!engine_local_var) {
        return NULL;
    }
    engine_local_var->description = description;
    engine_local_var->id = id;
    engine_local_var->name = name;
    engine_local_var->type = type;

    return engine_local_var;
}


void engine_free(engine_t *engine) {
    if(NULL == engine){
        return ;
    }
    listEntry_t *listEntry;
    if (engine->description) {
        free(engine->description);
        engine->description = NULL;
    }
    if (engine->id) {
        free(engine->id);
        engine->id = NULL;
    }
    if (engine->name) {
        free(engine->name);
        engine->name = NULL;
    }
    free(engine);
}

cJSON *engine_convertToJSON(engine_t *engine) {
    cJSON *item = cJSON_CreateObject();

    // engine->description
    if (!engine->description) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "description", engine->description) == NULL) {
    goto fail; //String
    }


    // engine->id
    if (!engine->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", engine->id) == NULL) {
    goto fail; //String
    }


    // engine->name
    if (!engine->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", engine->name) == NULL) {
    goto fail; //String
    }


    // engine->type
    if (stability_ai_rest_api_engine_TYPE_NULL == engine->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typeengine_ToString(engine->type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

engine_t *engine_parseFromJSON(cJSON *engineJSON){

    engine_t *engine_local_var = NULL;

    // engine->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(engineJSON, "description");
    if (!description) {
        goto end;
    }

    
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }

    // engine->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(engineJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // engine->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(engineJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // engine->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(engineJSON, "type");
    if (!type) {
        goto end;
    }

    stability_ai_rest_api_engine_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = typeengine_FromString(type->valuestring);


    engine_local_var = engine_create (
        strdup(description->valuestring),
        strdup(id->valuestring),
        strdup(name->valuestring),
        typeVariable
        );

    return engine_local_var;
end:
    return NULL;

}
