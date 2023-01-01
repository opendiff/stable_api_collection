/*
 * engine.h
 *
 * 
 */

#ifndef _engine_H_
#define _engine_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct engine_t engine_t;


// Enum TYPE for engine

typedef enum  { stability_ai_rest_api_engine_TYPE_NULL = 0, stability_ai_rest_api_engine_TYPE_AUDIO, stability_ai_rest_api_engine_TYPE_CLASSIFICATION, stability_ai_rest_api_engine_TYPE_PICTURE, stability_ai_rest_api_engine_TYPE_STORAGE, stability_ai_rest_api_engine_TYPE_TEXT, stability_ai_rest_api_engine_TYPE_VIDEO } stability_ai_rest_api_engine_TYPE_e;

char* engine_type_ToString(stability_ai_rest_api_engine_TYPE_e type);

stability_ai_rest_api_engine_TYPE_e engine_type_FromString(char* type);



typedef struct engine_t {
    char *description; // string
    char *id; // string
    char *name; // string
    stability_ai_rest_api_engine_TYPE_e type; //enum

} engine_t;

engine_t *engine_create(
    char *description,
    char *id,
    char *name,
    stability_ai_rest_api_engine_TYPE_e type
);

void engine_free(engine_t *engine);

engine_t *engine_parseFromJSON(cJSON *engineJSON);

cJSON *engine_convertToJSON(engine_t *engine);

#endif /* _engine_H_ */

