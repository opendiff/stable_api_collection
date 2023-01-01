# Documentation for Stability.ai REST API 0.1 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `openapi-generator`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Stability.ai REST API Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to https://api.stability.aihttps://api.stability.ai


### V1alphaEnginesManager
Method | HTTP request | Description
------------- | ------------- | -------------
*v1alphaEnginesListEnginesSync* | *GET* /v1alpha/engines/list | list.
*v1alphaEnginesListEnginesASync* | *GET* /v1alpha/engines/list | list.


### V1alphaGenerationManager
Method | HTTP request | Description
------------- | ------------- | -------------
*v1alphaGenerationImageToImageSync* | *POST* /v1alpha/generation/{engine_id}/image-to-image | image-to-image.
*v1alphaGenerationImageToImageASync* | *POST* /v1alpha/generation/{engine_id}/image-to-image | image-to-image.
*v1alphaGenerationMaskingSync* | *POST* /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking.
*v1alphaGenerationMaskingASync* | *POST* /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking.
*v1alphaGenerationTextToImageSync* | *POST* /v1alpha/generation/{engine_id}/text-to-image | text-to-image.
*v1alphaGenerationTextToImageASync* | *POST* /v1alpha/generation/{engine_id}/text-to-image | text-to-image.


### V1alphaUserManager
Method | HTTP request | Description
------------- | ------------- | -------------
*v1alphaUserAccountSync* | *GET* /v1alpha/user/account | account.
*v1alphaUserAccountASync* | *GET* /v1alpha/user/account | account.
*v1alphaUserBalanceSync* | *GET* /v1alpha/user/balance | balance.
*v1alphaUserBalanceASync* | *GET* /v1alpha/user/balance | balance.


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *AccountResponseBody* | 
 *BalanceResponseBody* | 
 *Engine* | 
 *Error* | 
 *ListEnginesResponseBody* | 
 *OrganizationMembership* | 
 *TextPrompt* | Text prompt for image generation
 *TextToImageRequestBody* | 

