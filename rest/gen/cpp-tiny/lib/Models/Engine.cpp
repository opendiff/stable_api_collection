

#include "Engine.h"

using namespace Tiny;

Engine::Engine()
{
	description = std::string();
	id = std::string();
	name = std::string();
	type = std::string();
}

Engine::Engine(std::string jsonString)
{
	this->fromJson(jsonString);
}

Engine::~Engine()
{

}

void
Engine::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
Engine::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["id"] = getId();






    object["name"] = getName();






    object["type"] = getType();



    return object;

}

std::string
Engine::getDescription()
{
	return description;
}

void
Engine::setDescription(std::string  description)
{
	this->description = description;
}

std::string
Engine::getId()
{
	return id;
}

void
Engine::setId(std::string  id)
{
	this->id = id;
}

std::string
Engine::getName()
{
	return name;
}

void
Engine::setName(std::string  name)
{
	this->name = name;
}

std::string
Engine::getType()
{
	return type;
}

void
Engine::setType(std::string  type)
{
	this->type = type;
}



