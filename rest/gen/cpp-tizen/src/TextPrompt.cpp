#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TextPrompt.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TextPrompt::TextPrompt()
{
	//__init();
}

TextPrompt::~TextPrompt()
{
	//__cleanup();
}

void
TextPrompt::__init()
{
	//text = std::string();
	//weight = float(0);
}

void
TextPrompt::__cleanup()
{
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(weight != NULL) {
	//
	//delete weight;
	//weight = NULL;
	//}
	//
}

void
TextPrompt::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *weightKey = "weight";
	node = json_object_get_member(pJsonObject, weightKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weight, node, "float", "");
		} else {
			
		}
	}
}

TextPrompt::TextPrompt(char* json)
{
	this->fromJson(json);
}

char*
TextPrompt::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("float")) {
		float obj = getWeight();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weightKey = "weight";
	json_object_set_member(pJsonObject, weightKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


