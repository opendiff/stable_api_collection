

#include "Error.h"

using namespace Tiny;

Error::Error()
{
	fault = bool(false);
	id = std::string();
	message = std::string();
	name = std::string();
	temporary = bool(false);
	timeout = bool(false);
}

Error::Error(std::string jsonString)
{
	this->fromJson(jsonString);
}

Error::~Error()
{

}

void
Error::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *faultKey = "fault";

    if(object.has_key(faultKey))
    {
        bourne::json value = object[faultKey];



        jsonToValue(&fault, value, "bool");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *temporaryKey = "temporary";

    if(object.has_key(temporaryKey))
    {
        bourne::json value = object[temporaryKey];



        jsonToValue(&temporary, value, "bool");


    }

    const char *timeoutKey = "timeout";

    if(object.has_key(timeoutKey))
    {
        bourne::json value = object[timeoutKey];



        jsonToValue(&timeout, value, "bool");


    }


}

bourne::json
Error::toJson()
{
    bourne::json object = bourne::json::object();





    object["fault"] = isFault();






    object["id"] = getId();






    object["message"] = getMessage();






    object["name"] = getName();






    object["temporary"] = isTemporary();






    object["timeout"] = isTimeout();



    return object;

}

bool
Error::isFault()
{
	return fault;
}

void
Error::setFault(bool  fault)
{
	this->fault = fault;
}

std::string
Error::getId()
{
	return id;
}

void
Error::setId(std::string  id)
{
	this->id = id;
}

std::string
Error::getMessage()
{
	return message;
}

void
Error::setMessage(std::string  message)
{
	this->message = message;
}

std::string
Error::getName()
{
	return name;
}

void
Error::setName(std::string  name)
{
	this->name = name;
}

bool
Error::isTemporary()
{
	return temporary;
}

void
Error::setTemporary(bool  temporary)
{
	this->temporary = temporary;
}

bool
Error::isTimeout()
{
	return timeout;
}

void
Error::setTimeout(bool  timeout)
{
	this->timeout = timeout;
}



