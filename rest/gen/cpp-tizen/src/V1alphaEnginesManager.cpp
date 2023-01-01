#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "V1alphaEnginesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


V1alphaEnginesManager::V1alphaEnginesManager()
{

}

V1alphaEnginesManager::~V1alphaEnginesManager()
{

}

static gboolean __V1alphaEnginesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __V1alphaEnginesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__V1alphaEnginesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool v1alphaEnginesListEnginesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListEnginesResponseBody, Error, void* )
	= reinterpret_cast<void(*)(ListEnginesResponseBody, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListEnginesResponseBody out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListEnginesResponseBody")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListEnginesResponseBody", "ListEnginesResponseBody");
			json_node_free(pJson);

			if ("ListEnginesResponseBody" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool v1alphaEnginesListEnginesHelper(char * accessToken,
	std::string organization, 
	void(* handler)(ListEnginesResponseBody, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
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

	string url("/v1alpha/engines/list");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(V1alphaEnginesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = v1alphaEnginesListEnginesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (V1alphaEnginesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), v1alphaEnginesListEnginesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __V1alphaEnginesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool V1alphaEnginesManager::v1alphaEnginesListEnginesAsync(char * accessToken,
	std::string organization, 
	void(* handler)(ListEnginesResponseBody, Error, void* )
	, void* userData)
{
	return v1alphaEnginesListEnginesHelper(accessToken,
	organization, 
	handler, userData, true);
}

bool V1alphaEnginesManager::v1alphaEnginesListEnginesSync(char * accessToken,
	std::string organization, 
	void(* handler)(ListEnginesResponseBody, Error, void* )
	, void* userData)
{
	return v1alphaEnginesListEnginesHelper(accessToken,
	organization, 
	handler, userData, false);
}

