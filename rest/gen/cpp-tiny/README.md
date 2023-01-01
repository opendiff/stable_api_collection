# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Stability.ai REST API 0.1 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://api.stability.aihttps://api.stability.ai

### V1alphaEnginesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*v1alpha_enginesListEngines* | *GET* /v1alpha/engines/list | list.|

### V1alphaGenerationApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*v1alpha_generationImageToImage* | *POST* /v1alpha/generation/{engine_id}/image-to-image | image-to-image.|
|*v1alpha_generationMasking* | *POST* /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking.|
|*v1alpha_generationTextToImage* | *POST* /v1alpha/generation/{engine_id}/text-to-image | text-to-image.|

### V1alphaUserApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*v1alpha_userAccount* | *GET* /v1alpha/user/account | account.|
|*v1alpha_userBalance* | *GET* /v1alpha/user/balance | balance.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*AccountResponseBody* | |
|*BalanceResponseBody* | |
|*Engine* | |
|*Error* | |
|*ListEnginesResponseBody* | |
|*OrganizationMembership* | |
|*TextPrompt* | Text prompt for image generation|
|*TextToImageRequestBody* | |

