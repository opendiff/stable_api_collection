

#include "ListEnginesResponseBody.h"

using namespace Tiny;

ListEnginesResponseBody::ListEnginesResponseBody()
{
	engines = std::list<Engine>();
}

ListEnginesResponseBody::ListEnginesResponseBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

ListEnginesResponseBody::~ListEnginesResponseBody()
{

}

void
ListEnginesResponseBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enginesKey = "engines";

    if(object.has_key(enginesKey))
    {
        bourne::json value = object[enginesKey];


        std::list<Engine> engines_list;
        Engine element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            engines_list.push_back(element);
        }
        engines = engines_list;


    }


}

bourne::json
ListEnginesResponseBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<Engine> engines_list = getEngines();
    bourne::json engines_arr = bourne::json::array();

    for(auto& var : engines_list)
    {
        Engine obj = var;
        engines_arr.append(obj.toJson());
    }
    object["engines"] = engines_arr;




    return object;

}

std::list<Engine>
ListEnginesResponseBody::getEngines()
{
	return engines;
}

void
ListEnginesResponseBody::setEngines(std::list <Engine> engines)
{
	this->engines = engines;
}



