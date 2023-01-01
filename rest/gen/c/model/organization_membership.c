#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "organization_membership.h"



organization_membership_t *organization_membership_create(
    char *id,
    int is_default,
    char *name,
    char *role
    ) {
    organization_membership_t *organization_membership_local_var = malloc(sizeof(organization_membership_t));
    if (!organization_membership_local_var) {
        return NULL;
    }
    organization_membership_local_var->id = id;
    organization_membership_local_var->is_default = is_default;
    organization_membership_local_var->name = name;
    organization_membership_local_var->role = role;

    return organization_membership_local_var;
}


void organization_membership_free(organization_membership_t *organization_membership) {
    if(NULL == organization_membership){
        return ;
    }
    listEntry_t *listEntry;
    if (organization_membership->id) {
        free(organization_membership->id);
        organization_membership->id = NULL;
    }
    if (organization_membership->name) {
        free(organization_membership->name);
        organization_membership->name = NULL;
    }
    if (organization_membership->role) {
        free(organization_membership->role);
        organization_membership->role = NULL;
    }
    free(organization_membership);
}

cJSON *organization_membership_convertToJSON(organization_membership_t *organization_membership) {
    cJSON *item = cJSON_CreateObject();

    // organization_membership->id
    if (!organization_membership->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", organization_membership->id) == NULL) {
    goto fail; //String
    }


    // organization_membership->is_default
    if (!organization_membership->is_default) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_default", organization_membership->is_default) == NULL) {
    goto fail; //Bool
    }


    // organization_membership->name
    if (!organization_membership->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", organization_membership->name) == NULL) {
    goto fail; //String
    }


    // organization_membership->role
    if (!organization_membership->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", organization_membership->role) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

organization_membership_t *organization_membership_parseFromJSON(cJSON *organization_membershipJSON){

    organization_membership_t *organization_membership_local_var = NULL;

    // organization_membership->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(organization_membershipJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // organization_membership->is_default
    cJSON *is_default = cJSON_GetObjectItemCaseSensitive(organization_membershipJSON, "is_default");
    if (!is_default) {
        goto end;
    }

    
    if(!cJSON_IsBool(is_default))
    {
    goto end; //Bool
    }

    // organization_membership->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(organization_membershipJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // organization_membership->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(organization_membershipJSON, "role");
    if (!role) {
        goto end;
    }

    
    if(!cJSON_IsString(role))
    {
    goto end; //String
    }


    organization_membership_local_var = organization_membership_create (
        strdup(id->valuestring),
        is_default->valueint,
        strdup(name->valuestring),
        strdup(role->valuestring)
        );

    return organization_membership_local_var;
end:
    return NULL;

}
