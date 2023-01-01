/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIV1alphaGenerationApi.h"
#include "OAIServerConfiguration.h"
#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIV1alphaGenerationApi::OAIV1alphaGenerationApi(const int timeOut)
    : _timeOut(timeOut),
      _manager(nullptr),
      _isResponseCompressionEnabled(false),
      _isRequestCompressionEnabled(false) {
    initializeServerConfigs();
}

OAIV1alphaGenerationApi::~OAIV1alphaGenerationApi() {
}

void OAIV1alphaGenerationApi::initializeServerConfigs() {
    //Default server
    QList<OAIServerConfiguration> defaultConf = QList<OAIServerConfiguration>();
    //varying endpoint server
    defaultConf.append(OAIServerConfiguration(
    QUrl("https://api.stability.ai"),
    "No description provided",
    QMap<QString, OAIServerVariable>()));
    _serverConfigs.insert("v1alpha_generationImageToImage", defaultConf);
    _serverIndices.insert("v1alpha_generationImageToImage", 0);
    _serverConfigs.insert("v1alpha_generationMasking", defaultConf);
    _serverIndices.insert("v1alpha_generationMasking", 0);
    _serverConfigs.insert("v1alpha_generationTextToImage", defaultConf);
    _serverIndices.insert("v1alpha_generationTextToImage", 0);
}

/**
* returns 0 on success and -1, -2 or -3 on failure.
* -1 when the variable does not exist and -2 if the value is not defined in the enum and -3 if the operation or server index is not found
*/
int OAIV1alphaGenerationApi::setDefaultServerValue(int serverIndex, const QString &operation, const QString &variable, const QString &value) {
    auto it = _serverConfigs.find(operation);
    if (it != _serverConfigs.end() && serverIndex < it.value().size()) {
      return _serverConfigs[operation][serverIndex].setDefaultValue(variable,value);
    }
    return -3;
}
void OAIV1alphaGenerationApi::setServerIndex(const QString &operation, int serverIndex) {
    if (_serverIndices.contains(operation) && serverIndex < _serverConfigs.find(operation).value().size()) {
        _serverIndices[operation] = serverIndex;
    }
}

void OAIV1alphaGenerationApi::setApiKey(const QString &apiKeyName, const QString &apiKey) {
    _apiKeys.insert(apiKeyName,apiKey);
}

void OAIV1alphaGenerationApi::setBearerToken(const QString &token) {
    _bearerToken = token;
}

void OAIV1alphaGenerationApi::setUsername(const QString &username) {
    _username = username;
}

void OAIV1alphaGenerationApi::setPassword(const QString &password) {
    _password = password;
}


void OAIV1alphaGenerationApi::setTimeOut(const int timeOut) {
    _timeOut = timeOut;
}

void OAIV1alphaGenerationApi::setWorkingDirectory(const QString &path) {
    _workingDirectory = path;
}

void OAIV1alphaGenerationApi::setNetworkAccessManager(QNetworkAccessManager* manager) {
    _manager = manager;
}

/**
    * Appends a new ServerConfiguration to the config map for a specific operation.
    * @param operation The id to the target operation.
    * @param url A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    * returns the index of the new server config on success and -1 if the operation is not found
    */
int OAIV1alphaGenerationApi::addServerConfiguration(const QString &operation, const QUrl &url, const QString &description, const QMap<QString, OAIServerVariable> &variables) {
    if (_serverConfigs.contains(operation)) {
        _serverConfigs[operation].append(OAIServerConfiguration(
                    url,
                    description,
                    variables));
        return _serverConfigs[operation].size()-1;
    } else {
        return -1;
    }
}

/**
    * Appends a new ServerConfiguration to the config map for a all operations and sets the index to that server.
    * @param url A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    */
void OAIV1alphaGenerationApi::setNewServerForAllOperations(const QUrl &url, const QString &description, const QMap<QString, OAIServerVariable> &variables) {
#if QT_VERSION >= QT_VERSION_CHECK(5, 12, 0)
    for (auto keyIt = _serverIndices.keyBegin(); keyIt != _serverIndices.keyEnd(); keyIt++) {
        setServerIndex(*keyIt, addServerConfiguration(*keyIt, url, description, variables));
    }
#else
    for (auto &e : _serverIndices.keys()) {
        setServerIndex(e, addServerConfiguration(e, url, description, variables));
    }
#endif
}

/**
    * Appends a new ServerConfiguration to the config map for an operations and sets the index to that server.
    * @param URL A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    */
void OAIV1alphaGenerationApi::setNewServer(const QString &operation, const QUrl &url, const QString &description, const QMap<QString, OAIServerVariable> &variables) {
    setServerIndex(operation, addServerConfiguration(operation, url, description, variables));
}

void OAIV1alphaGenerationApi::addHeaders(const QString &key, const QString &value) {
    _defaultHeaders.insert(key, value);
}

void OAIV1alphaGenerationApi::enableRequestCompression() {
    _isRequestCompressionEnabled = true;
}

void OAIV1alphaGenerationApi::enableResponseCompression() {
    _isResponseCompressionEnabled = true;
}

void OAIV1alphaGenerationApi::abortRequests() {
    emit abortRequestsSignal();
}

QString OAIV1alphaGenerationApi::getParamStylePrefix(const QString &style) {
    if (style == "matrix") {
        return ";";
    } else if (style == "label") {
        return ".";
    } else if (style == "form") {
        return "&";
    } else if (style == "simple") {
        return "";
    } else if (style == "spaceDelimited") {
        return "&";
    } else if (style == "pipeDelimited") {
        return "&";
    } else {
        return "none";
    }
}

QString OAIV1alphaGenerationApi::getParamStyleSuffix(const QString &style) {
    if (style == "matrix") {
        return "=";
    } else if (style == "label") {
        return "";
    } else if (style == "form") {
        return "=";
    } else if (style == "simple") {
        return "";
    } else if (style == "spaceDelimited") {
        return "=";
    } else if (style == "pipeDelimited") {
        return "=";
    } else {
        return "none";
    }
}

QString OAIV1alphaGenerationApi::getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode) {

    if (style == "matrix") {
        return (isExplode) ? ";" + name + "=" : ",";

    } else if (style == "label") {
        return (isExplode) ? "." : ",";

    } else if (style == "form") {
        return (isExplode) ? "&" + name + "=" : ",";

    } else if (style == "simple") {
        return ",";
    } else if (style == "spaceDelimited") {
        return (isExplode) ? "&" + name + "=" : " ";

    } else if (style == "pipeDelimited") {
        return (isExplode) ? "&" + name + "=" : "|";

    } else if (style == "deepObject") {
        return (isExplode) ? "&" : "none";

    } else {
        return "none";
    }
}

void OAIV1alphaGenerationApi::v1alpha_generationImageToImage(const QString &engine_id, const QString &accept, const OAIHttpFileElement &init_image, const OAIImageToImageOptions &options, const ::OpenAPI::OptionalParam<QString> &organization) {
    QString fullPath = QString(_serverConfigs["v1alpha_generationImageToImage"][_serverIndices.value("v1alpha_generationImageToImage")].URL()+"/v1alpha/generation/{engine_id}/image-to-image");
    
    if (_apiKeys.contains("api_key_header_Authorization")) {
        addHeaders("api_key_header_Authorization",_apiKeys.find("api_key_header_Authorization").value());
    }
    
    
    {
        QString engine_idPathParam("{");
        engine_idPathParam.append("engine_id").append("}");
        QString pathPrefix, pathSuffix, pathDelimiter;
        QString pathStyle = "simple";
        if (pathStyle == "")
            pathStyle = "simple";
        pathPrefix = getParamStylePrefix(pathStyle);
        pathSuffix = getParamStyleSuffix(pathStyle);
        pathDelimiter = getParamStyleDelimiter(pathStyle, "engine_id", false);
        QString paramString = (pathStyle == "matrix") ? pathPrefix+"engine_id"+pathSuffix : pathPrefix;
        fullPath.replace(engine_idPathParam, paramString+QUrl::toPercentEncoding(::OpenAPI::toStringValue(engine_id)));
    }
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "POST");

    
    {
        input.add_file("init_image", init_image.local_filename, init_image.request_filename, init_image.mime_type);
    }
    
    {
        input.add_var("options", ::OpenAPI::toStringValue(options));
    }

    
    {
        if (!::OpenAPI::toStringValue(accept).isEmpty()) {
            input.headers.insert("Accept", ::OpenAPI::toStringValue(accept));
        }
        }
    if (organization.hasValue())
    {
        if (!::OpenAPI::toStringValue(organization.value()).isEmpty()) {
            input.headers.insert("Organization", ::OpenAPI::toStringValue(organization.value()));
        }
        }
#if QT_VERSION >= QT_VERSION_CHECK(5, 15, 0)
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }
#else
    for (auto key : _defaultHeaders.keys()) {
        input.headers.insert(key, _defaultHeaders[key]);
    }
#endif

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIV1alphaGenerationApi::v1alpha_generationImageToImageCallback);
    connect(this, &OAIV1alphaGenerationApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<OAIHttpRequestWorker*>().count() == 0) {
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void OAIV1alphaGenerationApi::v1alpha_generationImageToImageCallback(OAIHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1alpha_generationImageToImageSignal();
        emit v1alpha_generationImageToImageSignalFull(worker);
    } else {
        emit v1alpha_generationImageToImageSignalE(error_type, error_str);
        emit v1alpha_generationImageToImageSignalEFull(worker, error_type, error_str);
    }
}

void OAIV1alphaGenerationApi::v1alpha_generationMasking(const QString &engine_id, const QString &accept, const OAIHttpFileElement &init_image, const OAIMaskingOptions &options, const ::OpenAPI::OptionalParam<QString> &organization, const ::OpenAPI::OptionalParam<OAIHttpFileElement> &mask_image) {
    QString fullPath = QString(_serverConfigs["v1alpha_generationMasking"][_serverIndices.value("v1alpha_generationMasking")].URL()+"/v1alpha/generation/{engine_id}/image-to-image/masking");
    
    if (_apiKeys.contains("api_key_header_Authorization")) {
        addHeaders("api_key_header_Authorization",_apiKeys.find("api_key_header_Authorization").value());
    }
    
    
    {
        QString engine_idPathParam("{");
        engine_idPathParam.append("engine_id").append("}");
        QString pathPrefix, pathSuffix, pathDelimiter;
        QString pathStyle = "simple";
        if (pathStyle == "")
            pathStyle = "simple";
        pathPrefix = getParamStylePrefix(pathStyle);
        pathSuffix = getParamStyleSuffix(pathStyle);
        pathDelimiter = getParamStyleDelimiter(pathStyle, "engine_id", false);
        QString paramString = (pathStyle == "matrix") ? pathPrefix+"engine_id"+pathSuffix : pathPrefix;
        fullPath.replace(engine_idPathParam, paramString+QUrl::toPercentEncoding(::OpenAPI::toStringValue(engine_id)));
    }
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "POST");

    
    {
        input.add_file("init_image", init_image.local_filename, init_image.request_filename, init_image.mime_type);
    }
    if (mask_image.hasValue())
    {
        input.add_file("mask_image", mask_image.value().local_filename, mask_image.value().request_filename, mask_image.value().mime_type);
    }
    
    {
        input.add_var("options", ::OpenAPI::toStringValue(options));
    }

    
    {
        if (!::OpenAPI::toStringValue(accept).isEmpty()) {
            input.headers.insert("Accept", ::OpenAPI::toStringValue(accept));
        }
        }
    if (organization.hasValue())
    {
        if (!::OpenAPI::toStringValue(organization.value()).isEmpty()) {
            input.headers.insert("Organization", ::OpenAPI::toStringValue(organization.value()));
        }
        }
#if QT_VERSION >= QT_VERSION_CHECK(5, 15, 0)
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }
#else
    for (auto key : _defaultHeaders.keys()) {
        input.headers.insert(key, _defaultHeaders[key]);
    }
#endif

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIV1alphaGenerationApi::v1alpha_generationMaskingCallback);
    connect(this, &OAIV1alphaGenerationApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<OAIHttpRequestWorker*>().count() == 0) {
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void OAIV1alphaGenerationApi::v1alpha_generationMaskingCallback(OAIHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1alpha_generationMaskingSignal();
        emit v1alpha_generationMaskingSignalFull(worker);
    } else {
        emit v1alpha_generationMaskingSignalE(error_type, error_str);
        emit v1alpha_generationMaskingSignalEFull(worker, error_type, error_str);
    }
}

void OAIV1alphaGenerationApi::v1alpha_generationTextToImage(const QString &engine_id, const QString &accept, const OAITextToImageRequestBody &oai_text_to_image_request_body, const ::OpenAPI::OptionalParam<QString> &organization) {
    QString fullPath = QString(_serverConfigs["v1alpha_generationTextToImage"][_serverIndices.value("v1alpha_generationTextToImage")].URL()+"/v1alpha/generation/{engine_id}/text-to-image");
    
    if (_apiKeys.contains("api_key_header_Authorization")) {
        addHeaders("api_key_header_Authorization",_apiKeys.find("api_key_header_Authorization").value());
    }
    
    
    {
        QString engine_idPathParam("{");
        engine_idPathParam.append("engine_id").append("}");
        QString pathPrefix, pathSuffix, pathDelimiter;
        QString pathStyle = "simple";
        if (pathStyle == "")
            pathStyle = "simple";
        pathPrefix = getParamStylePrefix(pathStyle);
        pathSuffix = getParamStyleSuffix(pathStyle);
        pathDelimiter = getParamStyleDelimiter(pathStyle, "engine_id", false);
        QString paramString = (pathStyle == "matrix") ? pathPrefix+"engine_id"+pathSuffix : pathPrefix;
        fullPath.replace(engine_idPathParam, paramString+QUrl::toPercentEncoding(::OpenAPI::toStringValue(engine_id)));
    }
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "POST");

    {

        
        QByteArray output = oai_text_to_image_request_body.asJson().toUtf8();
        input.request_body.append(output);
    }
    
    {
        if (!::OpenAPI::toStringValue(accept).isEmpty()) {
            input.headers.insert("Accept", ::OpenAPI::toStringValue(accept));
        }
        }
    if (organization.hasValue())
    {
        if (!::OpenAPI::toStringValue(organization.value()).isEmpty()) {
            input.headers.insert("Organization", ::OpenAPI::toStringValue(organization.value()));
        }
        }
#if QT_VERSION >= QT_VERSION_CHECK(5, 15, 0)
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }
#else
    for (auto key : _defaultHeaders.keys()) {
        input.headers.insert(key, _defaultHeaders[key]);
    }
#endif

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIV1alphaGenerationApi::v1alpha_generationTextToImageCallback);
    connect(this, &OAIV1alphaGenerationApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<OAIHttpRequestWorker*>().count() == 0) {
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void OAIV1alphaGenerationApi::v1alpha_generationTextToImageCallback(OAIHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1alpha_generationTextToImageSignal();
        emit v1alpha_generationTextToImageSignalFull(worker);
    } else {
        emit v1alpha_generationTextToImageSignalE(error_type, error_str);
        emit v1alpha_generationTextToImageSignalEFull(worker, error_type, error_str);
    }
}

void OAIV1alphaGenerationApi::tokenAvailable(){
  
    oauthToken token; 
    switch (_OauthMethod) {
    case 1: //implicit flow
        token = _implicitFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _implicitFlow.removeToken(_latestScope.join(" "));
            qDebug() << "Could not retrieve a valid token";
        }
        break;
    case 2: //authorization flow
        token = _authFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _authFlow.removeToken(_latestScope.join(" "));    
            qDebug() << "Could not retrieve a valid token";
        }
        break;
    case 3: //client credentials flow
        token = _credentialFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _credentialFlow.removeToken(_latestScope.join(" "));    
            qDebug() << "Could not retrieve a valid token";
        }
        break;
    case 4: //resource owner password flow
        token = _passwordFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _credentialFlow.removeToken(_latestScope.join(" "));    
            qDebug() << "Could not retrieve a valid token";
        }
        break;
    default:
        qDebug() << "No Oauth method set!";
        break;
    }
}
} // namespace OpenAPI
