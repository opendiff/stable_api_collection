#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AccountResponseBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AccountResponseBody::AccountResponseBody()
{
	//__init();
}

AccountResponseBody::~AccountResponseBody()
{
	//__cleanup();
}

void
AccountResponseBody::__init()
{
	//email = std::string();
	//id = std::string();
	//new std::list()std::list> organizations;
	//profile_picture = std::string();
}

void
AccountResponseBody::__cleanup()
{
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(organizations != NULL) {
	//organizations.RemoveAll(true);
	//delete organizations;
	//organizations = NULL;
	//}
	//if(profile_picture != NULL) {
	//
	//delete profile_picture;
	//profile_picture = NULL;
	//}
	//
}

void
AccountResponseBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *organizationsKey = "organizations";
	node = json_object_get_member(pJsonObject, organizationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrganizationMembership> new_list;
			OrganizationMembership inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrganizationMembership")) {
					jsonToValue(&inst, temp_json, "OrganizationMembership", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			organizations = new_list;
		}
		
	}
	const gchar *profile_pictureKey = "profile_picture";
	node = json_object_get_member(pJsonObject, profile_pictureKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&profile_picture, node, "std::string", "");
		} else {
			
		}
	}
}

AccountResponseBody::AccountResponseBody(char* json)
{
	this->fromJson(json);
}

char*
AccountResponseBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("OrganizationMembership")) {
		list<OrganizationMembership> new_list = static_cast<list <OrganizationMembership> > (getOrganizations());
		node = converttoJson(&new_list, "OrganizationMembership", "array");
	} else {
		node = json_node_alloc();
		list<OrganizationMembership> new_list = static_cast<list <OrganizationMembership> > (getOrganizations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrganizationMembership>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrganizationMembership obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *organizationsKey = "organizations";
	json_object_set_member(pJsonObject, organizationsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProfilePicture();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *profile_pictureKey = "profile_picture";
	json_object_set_member(pJsonObject, profile_pictureKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AccountResponseBody::getEmail()
{
	return email;
}

void
AccountResponseBody::setEmail(std::string  email)
{
	this->email = email;
}

std::string
AccountResponseBody::getId()
{
	return id;
}

void
AccountResponseBody::setId(std::string  id)
{
	this->id = id;
}

std::list<OrganizationMembership>
AccountResponseBody::getOrganizations()
{
	return organizations;
}

void
AccountResponseBody::setOrganizations(std::list <OrganizationMembership> organizations)
{
	this->organizations = organizations;
}

std::string
AccountResponseBody::getProfilePicture()
{
	return profile_picture;
}

void
AccountResponseBody::setProfilePicture(std::string  profile_picture)
{
	this->profile_picture = profile_picture;
}


