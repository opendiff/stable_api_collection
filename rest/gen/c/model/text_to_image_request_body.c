#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "text_to_image_request_body.h"


char* clip_guidance_presettext_to_image_request_body_ToString(stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_e clip_guidance_preset) {
    char* clip_guidance_presetArray[] =  { "NULL", "FAST_BLUE", "FAST_GREEN", "NONE", "SIMPLE", "SLOW", "SLOWER", "SLOWEST" };
	return clip_guidance_presetArray[clip_guidance_preset];
}

stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_e clip_guidance_presettext_to_image_request_body_FromString(char* clip_guidance_preset){
    int stringToReturn = 0;
    char *clip_guidance_presetArray[] =  { "NULL", "FAST_BLUE", "FAST_GREEN", "NONE", "SIMPLE", "SLOW", "SLOWER", "SLOWEST" };
    size_t sizeofArray = sizeof(clip_guidance_presetArray) / sizeof(clip_guidance_presetArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(clip_guidance_preset, clip_guidance_presetArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* samplertext_to_image_request_body_ToString(stability_ai_rest_api_text_to_image_request_body_SAMPLER_e sampler) {
    char* samplerArray[] =  { "NULL", "DDIM", "DDPM", "K_DPMPP_2M", "K_DPMPP_2S_ANCESTRAL", "K_DPM_2", "K_DPM_2_ANCESTRAL", "K_EULER", "K_EULER_ANCESTRAL", "K_HEUN", "K_LMS" };
	return samplerArray[sampler];
}

stability_ai_rest_api_text_to_image_request_body_SAMPLER_e samplertext_to_image_request_body_FromString(char* sampler){
    int stringToReturn = 0;
    char *samplerArray[] =  { "NULL", "DDIM", "DDPM", "K_DPMPP_2M", "K_DPMPP_2S_ANCESTRAL", "K_DPM_2", "K_DPM_2_ANCESTRAL", "K_EULER", "K_EULER_ANCESTRAL", "K_HEUN", "K_LMS" };
    size_t sizeofArray = sizeof(samplerArray) / sizeof(samplerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(sampler, samplerArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

text_to_image_request_body_t *text_to_image_request_body_create(
    double cfg_scale,
    stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_e clip_guidance_preset,
    int height,
    stability_ai_rest_api_text_to_image_request_body_SAMPLER_e sampler,
    int samples,
    int seed,
    int steps,
    list_t *text_prompts,
    int width
    ) {
    text_to_image_request_body_t *text_to_image_request_body_local_var = malloc(sizeof(text_to_image_request_body_t));
    if (!text_to_image_request_body_local_var) {
        return NULL;
    }
    text_to_image_request_body_local_var->cfg_scale = cfg_scale;
    text_to_image_request_body_local_var->clip_guidance_preset = clip_guidance_preset;
    text_to_image_request_body_local_var->height = height;
    text_to_image_request_body_local_var->sampler = sampler;
    text_to_image_request_body_local_var->samples = samples;
    text_to_image_request_body_local_var->seed = seed;
    text_to_image_request_body_local_var->steps = steps;
    text_to_image_request_body_local_var->text_prompts = text_prompts;
    text_to_image_request_body_local_var->width = width;

    return text_to_image_request_body_local_var;
}


void text_to_image_request_body_free(text_to_image_request_body_t *text_to_image_request_body) {
    if(NULL == text_to_image_request_body){
        return ;
    }
    listEntry_t *listEntry;
    if (text_to_image_request_body->text_prompts) {
        list_ForEach(listEntry, text_to_image_request_body->text_prompts) {
            text_prompt_free(listEntry->data);
        }
        list_freeList(text_to_image_request_body->text_prompts);
        text_to_image_request_body->text_prompts = NULL;
    }
    free(text_to_image_request_body);
}

cJSON *text_to_image_request_body_convertToJSON(text_to_image_request_body_t *text_to_image_request_body) {
    cJSON *item = cJSON_CreateObject();

    // text_to_image_request_body->cfg_scale
    if(text_to_image_request_body->cfg_scale) {
    if(cJSON_AddNumberToObject(item, "cfg_scale", text_to_image_request_body->cfg_scale) == NULL) {
    goto fail; //Numeric
    }
    }


    // text_to_image_request_body->clip_guidance_preset
    if(text_to_image_request_body->clip_guidance_preset != stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_NULL) {
    if(cJSON_AddStringToObject(item, "clip_guidance_preset", clip_guidance_presettext_to_image_request_body_ToString(text_to_image_request_body->clip_guidance_preset)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // text_to_image_request_body->height
    if(text_to_image_request_body->height) {
    if(cJSON_AddNumberToObject(item, "height", text_to_image_request_body->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // text_to_image_request_body->sampler
    if(text_to_image_request_body->sampler != stability_ai_rest_api_text_to_image_request_body_SAMPLER_NULL) {
    if(cJSON_AddStringToObject(item, "sampler", samplertext_to_image_request_body_ToString(text_to_image_request_body->sampler)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // text_to_image_request_body->samples
    if(text_to_image_request_body->samples) {
    if(cJSON_AddNumberToObject(item, "samples", text_to_image_request_body->samples) == NULL) {
    goto fail; //Numeric
    }
    }


    // text_to_image_request_body->seed
    if(text_to_image_request_body->seed) {
    if(cJSON_AddNumberToObject(item, "seed", text_to_image_request_body->seed) == NULL) {
    goto fail; //Numeric
    }
    }


    // text_to_image_request_body->steps
    if(text_to_image_request_body->steps) {
    if(cJSON_AddNumberToObject(item, "steps", text_to_image_request_body->steps) == NULL) {
    goto fail; //Numeric
    }
    }


    // text_to_image_request_body->text_prompts
    if (!text_to_image_request_body->text_prompts) {
        goto fail;
    }
    cJSON *text_prompts = cJSON_AddArrayToObject(item, "text_prompts");
    if(text_prompts == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *text_promptsListEntry;
    if (text_to_image_request_body->text_prompts) {
    list_ForEach(text_promptsListEntry, text_to_image_request_body->text_prompts) {
    cJSON *itemLocal = text_prompt_convertToJSON(text_promptsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(text_prompts, itemLocal);
    }
    }


    // text_to_image_request_body->width
    if(text_to_image_request_body->width) {
    if(cJSON_AddNumberToObject(item, "width", text_to_image_request_body->width) == NULL) {
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

text_to_image_request_body_t *text_to_image_request_body_parseFromJSON(cJSON *text_to_image_request_bodyJSON){

    text_to_image_request_body_t *text_to_image_request_body_local_var = NULL;

    // define the local list for text_to_image_request_body->text_prompts
    list_t *text_promptsList = NULL;

    // text_to_image_request_body->cfg_scale
    cJSON *cfg_scale = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "cfg_scale");
    if (cfg_scale) { 
    if(!cJSON_IsNumber(cfg_scale))
    {
    goto end; //Numeric
    }
    }

    // text_to_image_request_body->clip_guidance_preset
    cJSON *clip_guidance_preset = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "clip_guidance_preset");
    stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_e clip_guidance_presetVariable;
    if (clip_guidance_preset) { 
    if(!cJSON_IsString(clip_guidance_preset))
    {
    goto end; //Enum
    }
    clip_guidance_presetVariable = clip_guidance_presettext_to_image_request_body_FromString(clip_guidance_preset->valuestring);
    }

    // text_to_image_request_body->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "height");
    if (height) { 
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    }

    // text_to_image_request_body->sampler
    cJSON *sampler = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "sampler");
    stability_ai_rest_api_text_to_image_request_body_SAMPLER_e samplerVariable;
    if (sampler) { 
    if(!cJSON_IsString(sampler))
    {
    goto end; //Enum
    }
    samplerVariable = samplertext_to_image_request_body_FromString(sampler->valuestring);
    }

    // text_to_image_request_body->samples
    cJSON *samples = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "samples");
    if (samples) { 
    if(!cJSON_IsNumber(samples))
    {
    goto end; //Numeric
    }
    }

    // text_to_image_request_body->seed
    cJSON *seed = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "seed");
    if (seed) { 
    if(!cJSON_IsNumber(seed))
    {
    goto end; //Numeric
    }
    }

    // text_to_image_request_body->steps
    cJSON *steps = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "steps");
    if (steps) { 
    if(!cJSON_IsNumber(steps))
    {
    goto end; //Numeric
    }
    }

    // text_to_image_request_body->text_prompts
    cJSON *text_prompts = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "text_prompts");
    if (!text_prompts) {
        goto end;
    }

    
    cJSON *text_prompts_local_nonprimitive = NULL;
    if(!cJSON_IsArray(text_prompts)){
        goto end; //nonprimitive container
    }

    text_promptsList = list_createList();

    cJSON_ArrayForEach(text_prompts_local_nonprimitive,text_prompts )
    {
        if(!cJSON_IsObject(text_prompts_local_nonprimitive)){
            goto end;
        }
        text_prompt_t *text_promptsItem = text_prompt_parseFromJSON(text_prompts_local_nonprimitive);

        list_addElement(text_promptsList, text_promptsItem);
    }

    // text_to_image_request_body->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(text_to_image_request_bodyJSON, "width");
    if (width) { 
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }
    }


    text_to_image_request_body_local_var = text_to_image_request_body_create (
        cfg_scale ? cfg_scale->valuedouble : 0,
        clip_guidance_preset ? clip_guidance_presetVariable : -1,
        height ? height->valuedouble : 0,
        sampler ? samplerVariable : -1,
        samples ? samples->valuedouble : 0,
        seed ? seed->valuedouble : 0,
        steps ? steps->valuedouble : 0,
        text_promptsList,
        width ? width->valuedouble : 0
        );

    return text_to_image_request_body_local_var;
end:
    if (text_promptsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, text_promptsList) {
            text_prompt_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(text_promptsList);
        text_promptsList = NULL;
    }
    return NULL;

}
