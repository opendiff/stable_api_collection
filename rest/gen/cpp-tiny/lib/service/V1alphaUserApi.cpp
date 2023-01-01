#include "V1alphaUserApi.h"

using namespace Tiny;



        Response<
            AccountResponseBody
        >
        V1alphaUserApi::
        v1alpha_userAccount(
        )
        {
            std::string url = basepath + "/v1alpha/user/account"; //


            // Headers  | 

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




            AccountResponseBody obj(output_string);


            Response<AccountResponseBody> response(obj, httpCode);
            return response;
        }

        Response<
            BalanceResponseBody
        >
        V1alphaUserApi::
        v1alpha_userBalance(
            
            std::string organization
            
        )
        {
            std::string url = basepath + "/v1alpha/user/balance"; //


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




            BalanceResponseBody obj(output_string);


            Response<BalanceResponseBody> response(obj, httpCode);
            return response;
        }



