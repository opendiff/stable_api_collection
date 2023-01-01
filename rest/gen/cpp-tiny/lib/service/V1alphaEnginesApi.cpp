#include "V1alphaEnginesApi.h"

using namespace Tiny;



        Response<
            ListEnginesResponseBody
        >
        V1alphaEnginesApi::
        v1alpha_enginesListEngines(
            
            std::string organization
            
        )
        {
            std::string url = basepath + "/v1alpha/engines/list"; //


            // Headers  |  organization 
            addHeader("Organization",organization);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListEnginesResponseBody obj(output_string);


            Response<ListEnginesResponseBody> response(obj, httpCode);
            return response;
        }



