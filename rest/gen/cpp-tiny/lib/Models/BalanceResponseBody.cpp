

#include "BalanceResponseBody.h"

using namespace Tiny;

BalanceResponseBody::BalanceResponseBody()
{
	credits = float(0);
}

BalanceResponseBody::BalanceResponseBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

BalanceResponseBody::~BalanceResponseBody()
{

}

void
BalanceResponseBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *creditsKey = "credits";

    if(object.has_key(creditsKey))
    {
        bourne::json value = object[creditsKey];



        jsonToValue(&credits, value, "double");


    }


}

bourne::json
BalanceResponseBody::toJson()
{
    bourne::json object = bourne::json::object();





    object["credits"] = getCredits();



    return object;

}

double
BalanceResponseBody::getCredits()
{
	return credits;
}

void
BalanceResponseBody::setCredits(double  credits)
{
	this->credits = credits;
}



