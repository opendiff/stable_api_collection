/*
 * balance_response_body.h
 *
 * 
 */

#ifndef _balance_response_body_H_
#define _balance_response_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct balance_response_body_t balance_response_body_t;




typedef struct balance_response_body_t {
    double credits; //numeric

} balance_response_body_t;

balance_response_body_t *balance_response_body_create(
    double credits
);

void balance_response_body_free(balance_response_body_t *balance_response_body);

balance_response_body_t *balance_response_body_parseFromJSON(cJSON *balance_response_bodyJSON);

cJSON *balance_response_body_convertToJSON(balance_response_body_t *balance_response_body);

#endif /* _balance_response_body_H_ */

