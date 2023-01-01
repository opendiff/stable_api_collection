

#include "AccountResponseBody.h"

using namespace Tiny;

AccountResponseBody::AccountResponseBody()
{
	email = std::string();
	id = std::string();
	organizations = std::list<OrganizationMembership>();
	profile_picture = std::string();
}

AccountResponseBody::AccountResponseBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

AccountResponseBody::~AccountResponseBody()
{

}

void
AccountResponseBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emailKey = "email";

    if(object.has_key(emailKey))
    {
        bourne::json value = object[emailKey];



        jsonToValue(&email, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *organizationsKey = "organizations";

    if(object.has_key(organizationsKey))
    {
        bourne::json value = object[organizationsKey];


        std::list<OrganizationMembership> organizations_list;
        OrganizationMembership element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            organizations_list.push_back(element);
        }
        organizations = organizations_list;


    }

    const char *profile_pictureKey = "profile_picture";

    if(object.has_key(profile_pictureKey))
    {
        bourne::json value = object[profile_pictureKey];



        jsonToValue(&profile_picture, value, "std::string");


    }


}

bourne::json
AccountResponseBody::toJson()
{
    bourne::json object = bourne::json::object();





    object["email"] = getEmail();






    object["id"] = getId();





    std::list<OrganizationMembership> organizations_list = getOrganizations();
    bourne::json organizations_arr = bourne::json::array();

    for(auto& var : organizations_list)
    {
        OrganizationMembership obj = var;
        organizations_arr.append(obj.toJson());
    }
    object["organizations"] = organizations_arr;







    object["profile_picture"] = getProfilePicture();



    return object;

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



