/*
 * organization_membership.h
 *
 * 
 */

#ifndef _organization_membership_H_
#define _organization_membership_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct organization_membership_t organization_membership_t;




typedef struct organization_membership_t {
    char *id; // string
    int is_default; //boolean
    char *name; // string
    char *role; // string

} organization_membership_t;

organization_membership_t *organization_membership_create(
    char *id,
    int is_default,
    char *name,
    char *role
);

void organization_membership_free(organization_membership_t *organization_membership);

organization_membership_t *organization_membership_parseFromJSON(cJSON *organization_membershipJSON);

cJSON *organization_membership_convertToJSON(organization_membership_t *organization_membership);

#endif /* _organization_membership_H_ */

