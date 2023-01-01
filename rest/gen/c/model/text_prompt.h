/*
 * text_prompt.h
 *
 * Text prompt for image generation
 */

#ifndef _text_prompt_H_
#define _text_prompt_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct text_prompt_t text_prompt_t;




typedef struct text_prompt_t {
    char *text; // string
    float weight; //numeric

} text_prompt_t;

text_prompt_t *text_prompt_create(
    char *text,
    float weight
);

void text_prompt_free(text_prompt_t *text_prompt);

text_prompt_t *text_prompt_parseFromJSON(cJSON *text_promptJSON);

cJSON *text_prompt_convertToJSON(text_prompt_t *text_prompt);

#endif /* _text_prompt_H_ */

