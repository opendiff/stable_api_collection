#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "text_prompt.h"



text_prompt_t *text_prompt_create(
    char *text,
    float weight
    ) {
    text_prompt_t *text_prompt_local_var = malloc(sizeof(text_prompt_t));
    if (!text_prompt_local_var) {
        return NULL;
    }
    text_prompt_local_var->text = text;
    text_prompt_local_var->weight = weight;

    return text_prompt_local_var;
}


void text_prompt_free(text_prompt_t *text_prompt) {
    if(NULL == text_prompt){
        return ;
    }
    listEntry_t *listEntry;
    if (text_prompt->text) {
        free(text_prompt->text);
        text_prompt->text = NULL;
    }
    free(text_prompt);
}

cJSON *text_prompt_convertToJSON(text_prompt_t *text_prompt) {
    cJSON *item = cJSON_CreateObject();

    // text_prompt->text
    if (!text_prompt->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", text_prompt->text) == NULL) {
    goto fail; //String
    }


    // text_prompt->weight
    if(text_prompt->weight) {
    if(cJSON_AddNumberToObject(item, "weight", text_prompt->weight) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

text_prompt_t *text_prompt_parseFromJSON(cJSON *text_promptJSON){

    text_prompt_t *text_prompt_local_var = NULL;

    // text_prompt->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(text_promptJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // text_prompt->weight
    cJSON *weight = cJSON_GetObjectItemCaseSensitive(text_promptJSON, "weight");
    if (weight) { 
    if(!cJSON_IsNumber(weight))
    {
    goto end; //Numeric
    }
    }


    text_prompt_local_var = text_prompt_create (
        strdup(text->valuestring),
        weight ? weight->valuedouble : 0
        );

    return text_prompt_local_var;
end:
    return NULL;

}
