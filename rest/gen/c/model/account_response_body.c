#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "account_response_body.h"



account_response_body_t *account_response_body_create(
    char *email,
    char *id,
    list_t *organizations,
    char *profile_picture
    ) {
    account_response_body_t *account_response_body_local_var = malloc(sizeof(account_response_body_t));
    if (!account_response_body_local_var) {
        return NULL;
    }
    account_response_body_local_var->email = email;
    account_response_body_local_var->id = id;
    account_response_body_local_var->organizations = organizations;
    account_response_body_local_var->profile_picture = profile_picture;

    return account_response_body_local_var;
}


void account_response_body_free(account_response_body_t *account_response_body) {
    if(NULL == account_response_body){
        return ;
    }
    listEntry_t *listEntry;
    if (account_response_body->email) {
        free(account_response_body->email);
        account_response_body->email = NULL;
    }
    if (account_response_body->id) {
        free(account_response_body->id);
        account_response_body->id = NULL;
    }
    if (account_response_body->organizations) {
        list_ForEach(listEntry, account_response_body->organizations) {
            organization_membership_free(listEntry->data);
        }
        list_freeList(account_response_body->organizations);
        account_response_body->organizations = NULL;
    }
    if (account_response_body->profile_picture) {
        free(account_response_body->profile_picture);
        account_response_body->profile_picture = NULL;
    }
    free(account_response_body);
}

cJSON *account_response_body_convertToJSON(account_response_body_t *account_response_body) {
    cJSON *item = cJSON_CreateObject();

    // account_response_body->email
    if (!account_response_body->email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "email", account_response_body->email) == NULL) {
    goto fail; //String
    }


    // account_response_body->id
    if (!account_response_body->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", account_response_body->id) == NULL) {
    goto fail; //String
    }


    // account_response_body->organizations
    if (!account_response_body->organizations) {
        goto fail;
    }
    cJSON *organizations = cJSON_AddArrayToObject(item, "organizations");
    if(organizations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *organizationsListEntry;
    if (account_response_body->organizations) {
    list_ForEach(organizationsListEntry, account_response_body->organizations) {
    cJSON *itemLocal = organization_membership_convertToJSON(organizationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(organizations, itemLocal);
    }
    }


    // account_response_body->profile_picture
    if(account_response_body->profile_picture) {
    if(cJSON_AddStringToObject(item, "profile_picture", account_response_body->profile_picture) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

account_response_body_t *account_response_body_parseFromJSON(cJSON *account_response_bodyJSON){

    account_response_body_t *account_response_body_local_var = NULL;

    // define the local list for account_response_body->organizations
    list_t *organizationsList = NULL;

    // account_response_body->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(account_response_bodyJSON, "email");
    if (!email) {
        goto end;
    }

    
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }

    // account_response_body->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(account_response_bodyJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // account_response_body->organizations
    cJSON *organizations = cJSON_GetObjectItemCaseSensitive(account_response_bodyJSON, "organizations");
    if (!organizations) {
        goto end;
    }

    
    cJSON *organizations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(organizations)){
        goto end; //nonprimitive container
    }

    organizationsList = list_createList();

    cJSON_ArrayForEach(organizations_local_nonprimitive,organizations )
    {
        if(!cJSON_IsObject(organizations_local_nonprimitive)){
            goto end;
        }
        organization_membership_t *organizationsItem = organization_membership_parseFromJSON(organizations_local_nonprimitive);

        list_addElement(organizationsList, organizationsItem);
    }

    // account_response_body->profile_picture
    cJSON *profile_picture = cJSON_GetObjectItemCaseSensitive(account_response_bodyJSON, "profile_picture");
    if (profile_picture) { 
    if(!cJSON_IsString(profile_picture))
    {
    goto end; //String
    }
    }


    account_response_body_local_var = account_response_body_create (
        strdup(email->valuestring),
        strdup(id->valuestring),
        organizationsList,
        profile_picture ? strdup(profile_picture->valuestring) : NULL
        );

    return account_response_body_local_var;
end:
    if (organizationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, organizationsList) {
            organization_membership_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(organizationsList);
        organizationsList = NULL;
    }
    return NULL;

}
