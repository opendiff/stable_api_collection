/*
 * error.h
 *
 * 
 */

#ifndef _error_H_
#define _error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct error_t error_t;




typedef struct error_t {
    int fault; //boolean
    char *id; // string
    char *message; // string
    char *name; // string
    int temporary; //boolean
    int timeout; //boolean

} error_t;

error_t *error_create(
    int fault,
    char *id,
    char *message,
    char *name,
    int temporary,
    int timeout
);

void error_free(error_t *error);

error_t *error_parseFromJSON(cJSON *errorJSON);

cJSON *error_convertToJSON(error_t *error);

#endif /* _error_H_ */

