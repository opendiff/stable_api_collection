#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrganizationMembership.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrganizationMembership::OrganizationMembership()
{
	//__init();
}

OrganizationMembership::~OrganizationMembership()
{
	//__cleanup();
}

void
OrganizationMembership::__init()
{
	//id = std::string();
	//is_default = bool(false);
	//name = std::string();
	//role = std::string();
}

void
OrganizationMembership::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(is_default != NULL) {
	//
	//delete is_default;
	//is_default = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//
}

void
OrganizationMembership::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_defaultKey = "is_default";
	node = json_object_get_member(pJsonObject, is_defaultKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_default, node, "bool", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
}

OrganizationMembership::OrganizationMembership(char* json)
{
	this->fromJson(json);
}

char*
OrganizationMembership::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDefault();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_defaultKey = "is_default";
	json_object_set_member(pJsonObject, is_defaultKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OrganizationMembership::getId()
{
	return id;
}

void
OrganizationMembership::setId(std::string  id)
{
	this->id = id;
}

bool
OrganizationMembership::getIsDefault()
{
	return is_default;
}

void
OrganizationMembership::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

std::string
OrganizationMembership::getName()
{
	return name;
}

void
OrganizationMembership::setName(std::string  name)
{
	this->name = name;
}

std::string
OrganizationMembership::getRole()
{
	return role;
}

void
OrganizationMembership::setRole(std::string  role)
{
	this->role = role;
}


