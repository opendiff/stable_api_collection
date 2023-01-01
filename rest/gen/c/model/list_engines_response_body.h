/*
 * list_engines_response_body.h
 *
 * 
 */

#ifndef _list_engines_response_body_H_
#define _list_engines_response_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_engines_response_body_t list_engines_response_body_t;

#include "engine.h"



typedef struct list_engines_response_body_t {
    list_t *engines; //nonprimitive container

} list_engines_response_body_t;

list_engines_response_body_t *list_engines_response_body_create(
    list_t *engines
);

void list_engines_response_body_free(list_engines_response_body_t *list_engines_response_body);

list_engines_response_body_t *list_engines_response_body_parseFromJSON(cJSON *list_engines_response_bodyJSON);

cJSON *list_engines_response_body_convertToJSON(list_engines_response_body_t *list_engines_response_body);

#endif /* _list_engines_response_body_H_ */

