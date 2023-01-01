#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BalanceResponseBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BalanceResponseBody::BalanceResponseBody()
{
	//__init();
}

BalanceResponseBody::~BalanceResponseBody()
{
	//__cleanup();
}

void
BalanceResponseBody::__init()
{
	//credits = double(0);
}

void
BalanceResponseBody::__cleanup()
{
	//if(credits != NULL) {
	//
	//delete credits;
	//credits = NULL;
	//}
	//
}

void
BalanceResponseBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *creditsKey = "credits";
	node = json_object_get_member(pJsonObject, creditsKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&credits, node, "double", "");
		} else {
			
		}
	}
}

BalanceResponseBody::BalanceResponseBody(char* json)
{
	this->fromJson(json);
}

char*
BalanceResponseBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getCredits();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *creditsKey = "credits";
	json_object_set_member(pJsonObject, creditsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


