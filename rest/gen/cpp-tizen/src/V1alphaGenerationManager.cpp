#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "V1alphaGenerationManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


V1alphaGenerationManager::V1alphaGenerationManager()
{

}

V1alphaGenerationManager::~V1alphaGenerationManager()
{

}

static gboolean __V1alphaGenerationManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __V1alphaGenerationManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__V1alphaGenerationManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool v1alphaGenerationImageToImageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool v1alphaGenerationImageToImageHelper(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, ImageToImageOptions options, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("Accept: ");
		headerString.append(stringify(&accept, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Organization: ");
		headerString.append(stringify(&organization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/v1alpha/generation/{engine_id}/image-to-image");
	int pos;

	string s_engineId("{");
	s_engineId.append("engine_id");
	s_engineId.append("}");
	pos = url.find(s_engineId);
	url.erase(pos, s_engineId.length());
	url.insert(pos, stringify(&engineId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(V1alphaGenerationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = v1alphaGenerationImageToImageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (V1alphaGenerationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), v1alphaGenerationImageToImageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __V1alphaGenerationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool V1alphaGenerationManager::v1alphaGenerationImageToImageAsync(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, ImageToImageOptions options, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return v1alphaGenerationImageToImageHelper(accessToken,
	engineId, accept, initImage, options, organization, 
	handler, userData, true);
}

bool V1alphaGenerationManager::v1alphaGenerationImageToImageSync(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, ImageToImageOptions options, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return v1alphaGenerationImageToImageHelper(accessToken,
	engineId, accept, initImage, options, organization, 
	handler, userData, false);
}

static bool v1alphaGenerationMaskingProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool v1alphaGenerationMaskingHelper(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, MaskingOptions options, std::string organization, std::string maskImage, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("Accept: ");
		headerString.append(stringify(&accept, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Organization: ");
		headerString.append(stringify(&organization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/v1alpha/generation/{engine_id}/image-to-image/masking");
	int pos;

	string s_engineId("{");
	s_engineId.append("engine_id");
	s_engineId.append("}");
	pos = url.find(s_engineId);
	url.erase(pos, s_engineId.length());
	url.insert(pos, stringify(&engineId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(V1alphaGenerationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = v1alphaGenerationMaskingProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (V1alphaGenerationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), v1alphaGenerationMaskingProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __V1alphaGenerationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool V1alphaGenerationManager::v1alphaGenerationMaskingAsync(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, MaskingOptions options, std::string organization, std::string maskImage, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return v1alphaGenerationMaskingHelper(accessToken,
	engineId, accept, initImage, options, organization, maskImage, 
	handler, userData, true);
}

bool V1alphaGenerationManager::v1alphaGenerationMaskingSync(char * accessToken,
	std::string engineId, std::string accept, std::string initImage, MaskingOptions options, std::string organization, std::string maskImage, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return v1alphaGenerationMaskingHelper(accessToken,
	engineId, accept, initImage, options, organization, maskImage, 
	handler, userData, false);
}

static bool v1alphaGenerationTextToImageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool v1alphaGenerationTextToImageHelper(char * accessToken,
	std::string engineId, std::string accept, std::shared_ptr<TextToImageRequestBody> textToImageRequestBody, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("Accept: ");
		headerString.append(stringify(&accept, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Organization: ");
		headerString.append(stringify(&organization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("TextToImageRequestBody")) {
		node = converttoJson(&textToImageRequestBody, "TextToImageRequestBody", "");
	}
	
	char *jsonStr =  textToImageRequestBody.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/v1alpha/generation/{engine_id}/text-to-image");
	int pos;

	string s_engineId("{");
	s_engineId.append("engine_id");
	s_engineId.append("}");
	pos = url.find(s_engineId);
	url.erase(pos, s_engineId.length());
	url.insert(pos, stringify(&engineId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(V1alphaGenerationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = v1alphaGenerationTextToImageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (V1alphaGenerationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), v1alphaGenerationTextToImageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __V1alphaGenerationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool V1alphaGenerationManager::v1alphaGenerationTextToImageAsync(char * accessToken,
	std::string engineId, std::string accept, std::shared_ptr<TextToImageRequestBody> textToImageRequestBody, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return v1alphaGenerationTextToImageHelper(accessToken,
	engineId, accept, textToImageRequestBody, organization, 
	handler, userData, true);
}

bool V1alphaGenerationManager::v1alphaGenerationTextToImageSync(char * accessToken,
	std::string engineId, std::string accept, std::shared_ptr<TextToImageRequestBody> textToImageRequestBody, std::string organization, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return v1alphaGenerationTextToImageHelper(accessToken,
	engineId, accept, textToImageRequestBody, organization, 
	handler, userData, false);
}

