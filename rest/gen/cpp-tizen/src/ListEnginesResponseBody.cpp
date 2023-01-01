#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ListEnginesResponseBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ListEnginesResponseBody::ListEnginesResponseBody()
{
	//__init();
}

ListEnginesResponseBody::~ListEnginesResponseBody()
{
	//__cleanup();
}

void
ListEnginesResponseBody::__init()
{
	//new std::list()std::list> engines;
}

void
ListEnginesResponseBody::__cleanup()
{
	//if(engines != NULL) {
	//engines.RemoveAll(true);
	//delete engines;
	//engines = NULL;
	//}
	//
}

void
ListEnginesResponseBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enginesKey = "engines";
	node = json_object_get_member(pJsonObject, enginesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Engine> new_list;
			Engine inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Engine")) {
					jsonToValue(&inst, temp_json, "Engine", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			engines = new_list;
		}
		
	}
}

ListEnginesResponseBody::ListEnginesResponseBody(char* json)
{
	this->fromJson(json);
}

char*
ListEnginesResponseBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Engine")) {
		list<Engine> new_list = static_cast<list <Engine> > (getEngines());
		node = converttoJson(&new_list, "Engine", "array");
	} else {
		node = json_node_alloc();
		list<Engine> new_list = static_cast<list <Engine> > (getEngines());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Engine>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Engine obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *enginesKey = "engines";
	json_object_set_member(pJsonObject, enginesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


