#include "V1alphaGenerationApi.h"

using namespace Tiny;



        Response<
            String
        >
        V1alphaGenerationApi::
        v1alpha_generationImageToImage(
            
            std::string engineId
            , 
            
            std::string accept
            , 
            
            std::string initImage
            , 
            
            ImageToImageOptions options
            , 
            
            std::string organization
            
        )
        {
            std::string url = basepath + "/v1alpha/generation/{engine_id}/image-to-image"; //engineId 


            // Headers  |  accept  organization 
            addHeader("Accept",accept);
            addHeader("Organization",organization);

            // Query    | 

            // Form     | initImage options 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("init_image",initImage);
            addFormParam("options",options);


                std::string s_engineId("{");
                s_engineId.append("engine_id");
                s_engineId.append("}");

                int pos = url.find(s_engineId);

                url.erase(pos, s_engineId.length());
                url.insert(pos, stringify(engineId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        V1alphaGenerationApi::
        v1alpha_generationMasking(
            
            std::string engineId
            , 
            
            std::string accept
            , 
            
            std::string initImage
            , 
            
            MaskingOptions options
            , 
            
            std::string organization
            , 
            
            std::string maskImage
            
        )
        {
            std::string url = basepath + "/v1alpha/generation/{engine_id}/image-to-image/masking"; //engineId 


            // Headers  |  accept  organization 
            addHeader("Accept",accept);
            addHeader("Organization",organization);

            // Query    | 

            // Form     | initImage maskImage options 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("init_image",initImage);
            addFormParam("mask_image",maskImage);
            addFormParam("options",options);


                std::string s_engineId("{");
                s_engineId.append("engine_id");
                s_engineId.append("}");

                int pos = url.find(s_engineId);

                url.erase(pos, s_engineId.length());
                url.insert(pos, stringify(engineId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        V1alphaGenerationApi::
        v1alpha_generationTextToImage(
            
            std::string engineId
            , 
            
            std::string accept
            , 
            
            TextToImageRequestBody textToImageRequestBody
            , 
            
            std::string organization
            
        )
        {
            std::string url = basepath + "/v1alpha/generation/{engine_id}/text-to-image"; //engineId 


            // Headers  |  accept  organization 
            addHeader("Accept",accept);
            addHeader("Organization",organization);

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_engineId("{");
                s_engineId.append("engine_id");
                s_engineId.append("}");

                int pos = url.find(s_engineId);

                url.erase(pos, s_engineId.length());
                url.insert(pos, stringify(engineId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | textToImageRequestBody



            payload = textToImageRequestBody.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }



