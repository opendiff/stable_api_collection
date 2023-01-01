#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "V1alphaUserManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


V1alphaUserManager::V1alphaUserManager()
{

}

V1alphaUserManager::~V1alphaUserManager()
{

}

static gboolean __V1alphaUserManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __V1alphaUserManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__V1alphaUserManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool v1alphaUserAccountProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AccountResponseBody, Error, void* )
	= reinterpret_cast<void(*)(AccountResponseBody, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AccountResponseBody out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AccountResponseBody")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AccountResponseBody", "AccountResponseBody");
			json_node_free(pJson);

			if ("AccountResponseBody" == "std::string") {
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

static bool v1alphaUserAccountHelper(char * accessToken,
	
	void(* handler)(AccountResponseBody, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/v1alpha/user/account");
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
		NetClient::easycurl(V1alphaUserManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = v1alphaUserAccountProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (V1alphaUserManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), v1alphaUserAccountProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __V1alphaUserManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool V1alphaUserManager::v1alphaUserAccountAsync(char * accessToken,
	
	void(* handler)(AccountResponseBody, Error, void* )
	, void* userData)
{
	return v1alphaUserAccountHelper(accessToken,
	
	handler, userData, true);
}

bool V1alphaUserManager::v1alphaUserAccountSync(char * accessToken,
	
	void(* handler)(AccountResponseBody, Error, void* )
	, void* userData)
{
	return v1alphaUserAccountHelper(accessToken,
	
	handler, userData, false);
}

static bool v1alphaUserBalanceProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BalanceResponseBody, Error, void* )
	= reinterpret_cast<void(*)(BalanceResponseBody, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BalanceResponseBody out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BalanceResponseBody")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BalanceResponseBody", "BalanceResponseBody");
			json_node_free(pJson);

			if ("BalanceResponseBody" == "std::string") {
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

static bool v1alphaUserBalanceHelper(char * accessToken,
	std::string organization, 
	void(* handler)(BalanceResponseBody, Error, void* )
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

	string url("/v1alpha/user/balance");
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
		NetClient::easycurl(V1alphaUserManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = v1alphaUserBalanceProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (V1alphaUserManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), v1alphaUserBalanceProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __V1alphaUserManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool V1alphaUserManager::v1alphaUserBalanceAsync(char * accessToken,
	std::string organization, 
	void(* handler)(BalanceResponseBody, Error, void* )
	, void* userData)
{
	return v1alphaUserBalanceHelper(accessToken,
	organization, 
	handler, userData, true);
}

bool V1alphaUserManager::v1alphaUserBalanceSync(char * accessToken,
	std::string organization, 
	void(* handler)(BalanceResponseBody, Error, void* )
	, void* userData)
{
	return v1alphaUserBalanceHelper(accessToken,
	organization, 
	handler, userData, false);
}

