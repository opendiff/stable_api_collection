/*
 * text_to_image_request_body.h
 *
 * 
 */

#ifndef _text_to_image_request_body_H_
#define _text_to_image_request_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct text_to_image_request_body_t text_to_image_request_body_t;

#include "text_prompt.h"

// Enum CLIPGUIDANCEPRESET for text_to_image_request_body

typedef enum  { stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_NULL = 0, stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_FAST_BLUE, stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_FAST_GREEN, stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_NONE, stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_SIMPLE, stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_SLOW, stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_SLOWER, stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_SLOWEST } stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_e;

char* text_to_image_request_body_clip_guidance_preset_ToString(stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_e clip_guidance_preset);

stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_e text_to_image_request_body_clip_guidance_preset_FromString(char* clip_guidance_preset);

// Enum SAMPLER for text_to_image_request_body

typedef enum  { stability_ai_rest_api_text_to_image_request_body_SAMPLER_NULL = 0, stability_ai_rest_api_text_to_image_request_body_SAMPLER_DDIM, stability_ai_rest_api_text_to_image_request_body_SAMPLER_DDPM, stability_ai_rest_api_text_to_image_request_body_SAMPLER_K_DPMPP_2M, stability_ai_rest_api_text_to_image_request_body_SAMPLER_K_DPMPP_2S_ANCESTRAL, stability_ai_rest_api_text_to_image_request_body_SAMPLER_K_DPM_2, stability_ai_rest_api_text_to_image_request_body_SAMPLER_K_DPM_2_ANCESTRAL, stability_ai_rest_api_text_to_image_request_body_SAMPLER_K_EULER, stability_ai_rest_api_text_to_image_request_body_SAMPLER_K_EULER_ANCESTRAL, stability_ai_rest_api_text_to_image_request_body_SAMPLER_K_HEUN, stability_ai_rest_api_text_to_image_request_body_SAMPLER_K_LMS } stability_ai_rest_api_text_to_image_request_body_SAMPLER_e;

char* text_to_image_request_body_sampler_ToString(stability_ai_rest_api_text_to_image_request_body_SAMPLER_e sampler);

stability_ai_rest_api_text_to_image_request_body_SAMPLER_e text_to_image_request_body_sampler_FromString(char* sampler);



typedef struct text_to_image_request_body_t {
    double cfg_scale; //numeric
    stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_e clip_guidance_preset; //enum
    int height; //numeric
    stability_ai_rest_api_text_to_image_request_body_SAMPLER_e sampler; //enum
    int samples; //numeric
    int seed; //numeric
    int steps; //numeric
    list_t *text_prompts; //nonprimitive container
    int width; //numeric

} text_to_image_request_body_t;

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
);

void text_to_image_request_body_free(text_to_image_request_body_t *text_to_image_request_body);

text_to_image_request_body_t *text_to_image_request_body_parseFromJSON(cJSON *text_to_image_request_bodyJSON);

cJSON *text_to_image_request_body_convertToJSON(text_to_image_request_body_t *text_to_image_request_body);

#endif /* _text_to_image_request_body_H_ */

