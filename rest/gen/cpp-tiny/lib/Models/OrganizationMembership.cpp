

#include "OrganizationMembership.h"

using namespace Tiny;

OrganizationMembership::OrganizationMembership()
{
	id = std::string();
	is_default = bool(false);
	name = std::string();
	role = std::string();
}

OrganizationMembership::OrganizationMembership(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrganizationMembership::~OrganizationMembership()
{

}

void
OrganizationMembership::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *is_defaultKey = "is_default";

    if(object.has_key(is_defaultKey))
    {
        bourne::json value = object[is_defaultKey];



        jsonToValue(&is_default, value, "bool");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }


}

bourne::json
OrganizationMembership::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["is_default"] = isIsDefault();






    object["name"] = getName();






    object["role"] = getRole();



    return object;

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
OrganizationMembership::isIsDefault()
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



