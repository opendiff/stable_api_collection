# C++ API client

Welcome to the Stability.ai REST API developer preview!

Please note, this is an alpha version of our new REST API, and is subject to change according to
your feedback.

Feedback during this test is crucial for us to understand what the pain points are and how we can
improve it going forward.

Changes will be communicated here, as well as on our online REST API documentation, which can be
found at: https://api.stability.ai/docs

Your DreamStudio API key will be required for authentication. You can learn more about API keys
here: https://platform.stability.ai/docs/getting-started/authentication

If you encounter any issues, please let us know in the #API discord channel:
https://discord.gg/stablediffusion


## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project. By using the [OpenAPI spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 0.1
- Package version: 
- Build package: org.openapitools.codegen.languages.CppRestSdkClientCodegen
For more information, please visit [https://stability.ai/](https://stability.ai/)

- API namespace: org.openapitools.client.api
- Model namespace: org.openapitools.client.model

## Installation

### Prerequisites

Install [cpprestsdk](https://github.com/Microsoft/cpprestsdk).

- Windows: `vcpkg install cpprestsdk cpprestsdk:x64-windows boost-uuid boost-uuid:x64-windows`
- Mac: `brew install cpprestsdk`
- Linux: `sudo apt-get install libcpprest-dev`

### Build

```sh
cmake -DCPPREST_ROOT=/usr -DCMAKE_CXX_FLAGS="-I/usr/local/opt/openssl/include" -DCMAKE_MODULE_LINKER_FLAGS="-L/usr/local/opt/openssl/lib"
make
```

### Build on Windows with Visual Studio (VS2017)

- Right click on folder containing source code
- Select 'Open in visual studio'
- Once visual studio opens, CMake should show up in top menu bar.
- Select CMake > Build All.

*Note: If the CMake menu item doesn't show up in Visual Studio, CMake
for Visual Studio must be installed. In this case, open the 'Visual Studio
Installer' application. Select 'modify' Visual Studio 2017. Make sure
'Desktop Development with C++' is installed, and specifically that 'Visual
C++ tools for CMake' is selected in the 'Installation Details' section.

Also be sure to review the CMakeLists.txt file. Edits are likely required.*

## Author

info@stability.ai

