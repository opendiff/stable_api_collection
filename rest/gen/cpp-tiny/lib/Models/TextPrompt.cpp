

#include "TextPrompt.h"

using namespace Tiny;

TextPrompt::TextPrompt()
{
	text = std::string();
	weight = float(0);
}

TextPrompt::TextPrompt(std::string jsonString)
{
	this->fromJson(jsonString);
}

TextPrompt::~TextPrompt()
{

}

void
TextPrompt::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *weightKey = "weight";

    if(object.has_key(weightKey))
    {
        bourne::json value = object[weightKey];



        jsonToValue(&weight, value, "float");


    }


}

bourne::json
TextPrompt::toJson()
{
    bourne::json object = bourne::json::object();





    object["text"] = getText();






    object["weight"] = getWeight();



    return object;

}

std::string
TextPrompt::getText()
{
	return text;
}

void
TextPrompt::setText(std::string  text)
{
	this->text = text;
}

float
TextPrompt::getWeight()
{
	return weight;
}

void
TextPrompt::setWeight(float  weight)
{
	this->weight = weight;
}



