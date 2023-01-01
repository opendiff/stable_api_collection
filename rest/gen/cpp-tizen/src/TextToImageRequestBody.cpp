#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TextToImageRequestBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TextToImageRequestBody::TextToImageRequestBody()
{
	//__init();
}

TextToImageRequestBody::~TextToImageRequestBody()
{
	//__cleanup();
}

void
TextToImageRequestBody::__init()
{
	//cfg_scale = double(0);
	//clip_guidance_preset = std::string();
	//height = int(0);
	//sampler = std::string();
	//samples = int(0);
	//seed = int(0);
	//steps = int(0);
	//new std::list()std::list> text_prompts;
	//width = int(0);
}

void
TextToImageRequestBody::__cleanup()
{
	//if(cfg_scale != NULL) {
	//
	//delete cfg_scale;
	//cfg_scale = NULL;
	//}
	//if(clip_guidance_preset != NULL) {
	//
	//delete clip_guidance_preset;
	//clip_guidance_preset = NULL;
	//}
	//if(height != NULL) {
	//
	//delete height;
	//height = NULL;
	//}
	//if(sampler != NULL) {
	//
	//delete sampler;
	//sampler = NULL;
	//}
	//if(samples != NULL) {
	//
	//delete samples;
	//samples = NULL;
	//}
	//if(seed != NULL) {
	//
	//delete seed;
	//seed = NULL;
	//}
	//if(steps != NULL) {
	//
	//delete steps;
	//steps = NULL;
	//}
	//if(text_prompts != NULL) {
	//text_prompts.RemoveAll(true);
	//delete text_prompts;
	//text_prompts = NULL;
	//}
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//
}

void
TextToImageRequestBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cfg_scaleKey = "cfg_scale";
	node = json_object_get_member(pJsonObject, cfg_scaleKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&cfg_scale, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&cfg_scale);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *clip_guidance_presetKey = "clip_guidance_preset";
	node = json_object_get_member(pJsonObject, clip_guidance_presetKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&clip_guidance_preset, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *heightKey = "height";
	node = json_object_get_member(pJsonObject, heightKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&height, node, "int", "");
		} else {
			
		}
	}
	const gchar *samplerKey = "sampler";
	node = json_object_get_member(pJsonObject, samplerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sampler, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *samplesKey = "samples";
	node = json_object_get_member(pJsonObject, samplesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&samples, node, "int", "");
		} else {
			
		}
	}
	const gchar *seedKey = "seed";
	node = json_object_get_member(pJsonObject, seedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&seed, node, "int", "");
		} else {
			
		}
	}
	const gchar *stepsKey = "steps";
	node = json_object_get_member(pJsonObject, stepsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&steps, node, "int", "");
		} else {
			
		}
	}
	const gchar *text_promptsKey = "text_prompts";
	node = json_object_get_member(pJsonObject, text_promptsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TextPrompt> new_list;
			TextPrompt inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TextPrompt")) {
					jsonToValue(&inst, temp_json, "TextPrompt", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			text_prompts = new_list;
		}
		
	}
	const gchar *widthKey = "width";
	node = json_object_get_member(pJsonObject, widthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&width, node, "int", "");
		} else {
			
		}
	}
}

TextToImageRequestBody::TextToImageRequestBody(char* json)
{
	this->fromJson(json);
}

char*
TextToImageRequestBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCfgScale();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCfgScale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cfg_scaleKey = "cfg_scale";
	json_object_set_member(pJsonObject, cfg_scaleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClipGuidancePreset();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *clip_guidance_presetKey = "clip_guidance_preset";
	json_object_set_member(pJsonObject, clip_guidance_presetKey, node);
	if (isprimitive("int")) {
		int obj = getHeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *heightKey = "height";
	json_object_set_member(pJsonObject, heightKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSampler();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *samplerKey = "sampler";
	json_object_set_member(pJsonObject, samplerKey, node);
	if (isprimitive("int")) {
		int obj = getSamples();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *samplesKey = "samples";
	json_object_set_member(pJsonObject, samplesKey, node);
	if (isprimitive("int")) {
		int obj = getSeed();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *seedKey = "seed";
	json_object_set_member(pJsonObject, seedKey, node);
	if (isprimitive("int")) {
		int obj = getSteps();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stepsKey = "steps";
	json_object_set_member(pJsonObject, stepsKey, node);
	if (isprimitive("TextPrompt")) {
		list<TextPrompt> new_list = static_cast<list <TextPrompt> > (getTextPrompts());
		node = converttoJson(&new_list, "TextPrompt", "array");
	} else {
		node = json_node_alloc();
		list<TextPrompt> new_list = static_cast<list <TextPrompt> > (getTextPrompts());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TextPrompt>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TextPrompt obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *text_promptsKey = "text_prompts";
	json_object_set_member(pJsonObject, text_promptsKey, node);
	if (isprimitive("int")) {
		int obj = getWidth();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *widthKey = "width";
	json_object_set_member(pJsonObject, widthKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
TextToImageRequestBody::getCfgScale()
{
	return cfg_scale;
}

void
TextToImageRequestBody::setCfgScale(long long  cfg_scale)
{
	this->cfg_scale = cfg_scale;
}

std::string
TextToImageRequestBody::getClipGuidancePreset()
{
	return clip_guidance_preset;
}

void
TextToImageRequestBody::setClipGuidancePreset(std::string  clip_guidance_preset)
{
	this->clip_guidance_preset = clip_guidance_preset;
}

int
TextToImageRequestBody::getHeight()
{
	return height;
}

void
TextToImageRequestBody::setHeight(int  height)
{
	this->height = height;
}

std::string
TextToImageRequestBody::getSampler()
{
	return sampler;
}

void
TextToImageRequestBody::setSampler(std::string  sampler)
{
	this->sampler = sampler;
}

int
TextToImageRequestBody::getSamples()
{
	return samples;
}

void
TextToImageRequestBody::setSamples(int  samples)
{
	this->samples = samples;
}

int
TextToImageRequestBody::getSeed()
{
	return seed;
}

void
TextToImageRequestBody::setSeed(int  seed)
{
	this->seed = seed;
}

int
TextToImageRequestBody::getSteps()
{
	return steps;
}

void
TextToImageRequestBody::setSteps(int  steps)
{
	this->steps = steps;
}

std::list<TextPrompt>
TextToImageRequestBody::getTextPrompts()
{
	return text_prompts;
}

void
TextToImageRequestBody::setTextPrompts(std::list <TextPrompt> text_prompts)
{
	this->text_prompts = text_prompts;
}

int
TextToImageRequestBody::getWidth()
{
	return width;
}

void
TextToImageRequestBody::setWidth(int  width)
{
	this->width = width;
}


