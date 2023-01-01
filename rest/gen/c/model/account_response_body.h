/*
 * account_response_body.h
 *
 * 
 */

#ifndef _account_response_body_H_
#define _account_response_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct account_response_body_t account_response_body_t;

#include "organization_membership.h"



typedef struct account_response_body_t {
    char *email; // string
    char *id; // string
    list_t *organizations; //nonprimitive container
    char *profile_picture; // string

} account_response_body_t;

account_response_body_t *account_response_body_create(
    char *email,
    char *id,
    list_t *organizations,
    char *profile_picture
);

void account_response_body_free(account_response_body_t *account_response_body);

account_response_body_t *account_response_body_parseFromJSON(cJSON *account_response_bodyJSON);

cJSON *account_response_body_convertToJSON(account_response_body_t *account_response_body);

#endif /* _account_response_body_H_ */

