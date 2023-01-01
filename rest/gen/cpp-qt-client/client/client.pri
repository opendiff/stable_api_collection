QT += network

HEADERS += \
# Models
    $${PWD}/OAIAccountResponseBody.h \
    $${PWD}/OAIBalanceResponseBody.h \
    $${PWD}/OAIEngine.h \
    $${PWD}/OAIError.h \
    $${PWD}/OAIListEnginesResponseBody.h \
    $${PWD}/OAIOrganizationMembership.h \
    $${PWD}/OAITextPrompt.h \
    $${PWD}/OAITextToImageRequestBody.h \
# APIs
    $${PWD}/OAIV1alphaEnginesApi.h \
    $${PWD}/OAIV1alphaGenerationApi.h \
    $${PWD}/OAIV1alphaUserApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIEnum.h \
    $${PWD}/OAIHttpFileElement.h \
    $${PWD}/OAIServerConfiguration.h \
    $${PWD}/OAIServerVariable.h \
    $${PWD}/OAIOauth.h

SOURCES += \
# Models
    $${PWD}/OAIAccountResponseBody.cpp \
    $${PWD}/OAIBalanceResponseBody.cpp \
    $${PWD}/OAIEngine.cpp \
    $${PWD}/OAIError.cpp \
    $${PWD}/OAIListEnginesResponseBody.cpp \
    $${PWD}/OAIOrganizationMembership.cpp \
    $${PWD}/OAITextPrompt.cpp \
    $${PWD}/OAITextToImageRequestBody.cpp \
# APIs
    $${PWD}/OAIV1alphaEnginesApi.cpp \
    $${PWD}/OAIV1alphaGenerationApi.cpp \
    $${PWD}/OAIV1alphaUserApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp \
    $${PWD}/OAIOauth.cpp
