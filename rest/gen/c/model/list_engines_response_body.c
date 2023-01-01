#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_engines_response_body.h"



list_engines_response_body_t *list_engines_response_body_create(
    list_t *engines
    ) {
    list_engines_response_body_t *list_engines_response_body_local_var = malloc(sizeof(list_engines_response_body_t));
    if (!list_engines_response_body_local_var) {
        return NULL;
    }
    list_engines_response_body_local_var->engines = engines;

    return list_engines_response_body_local_var;
}


void list_engines_response_body_free(list_engines_response_body_t *list_engines_response_body) {
    if(NULL == list_engines_response_body){
        return ;
    }
    listEntry_t *listEntry;
    if (list_engines_response_body->engines) {
        list_ForEach(listEntry, list_engines_response_body->engines) {
            engine_free(listEntry->data);
        }
        list_freeList(list_engines_response_body->engines);
        list_engines_response_body->engines = NULL;
    }
    free(list_engines_response_body);
}

cJSON *list_engines_response_body_convertToJSON(list_engines_response_body_t *list_engines_response_body) {
    cJSON *item = cJSON_CreateObject();

    // list_engines_response_body->engines
    if (!list_engines_response_body->engines) {
        goto fail;
    }
    cJSON *engines = cJSON_AddArrayToObject(item, "engines");
    if(engines == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *enginesListEntry;
    if (list_engines_response_body->engines) {
    list_ForEach(enginesListEntry, list_engines_response_body->engines) {
    cJSON *itemLocal = engine_convertToJSON(enginesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(engines, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

list_engines_response_body_t *list_engines_response_body_parseFromJSON(cJSON *list_engines_response_bodyJSON){

    list_engines_response_body_t *list_engines_response_body_local_var = NULL;

    // define the local list for list_engines_response_body->engines
    list_t *enginesList = NULL;

    // list_engines_response_body->engines
    cJSON *engines = cJSON_GetObjectItemCaseSensitive(list_engines_response_bodyJSON, "engines");
    if (!engines) {
        goto end;
    }

    
    cJSON *engines_local_nonprimitive = NULL;
    if(!cJSON_IsArray(engines)){
        goto end; //nonprimitive container
    }

    enginesList = list_createList();

    cJSON_ArrayForEach(engines_local_nonprimitive,engines )
    {
        if(!cJSON_IsObject(engines_local_nonprimitive)){
            goto end;
        }
        engine_t *enginesItem = engine_parseFromJSON(engines_local_nonprimitive);

        list_addElement(enginesList, enginesItem);
    }


    list_engines_response_body_local_var = list_engines_response_body_create (
        enginesList
        );

    return list_engines_response_body_local_var;
end:
    if (enginesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, enginesList) {
            engine_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(enginesList);
        enginesList = NULL;
    }
    return NULL;

}
