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

#ifndef OAI_OAIV1alphaGenerationApi_H
#define OAI_OAIV1alphaGenerationApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIError.h"
#include "OAIHttpFileElement.h"
#include "OAIImageToImageOptions.h"
#include "OAIMaskingOptions.h"
#include "OAITextToImageRequestBody.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIV1alphaGenerationApi : public QObject {
    Q_OBJECT

public:
    OAIV1alphaGenerationApi(const int timeOut = 0);
    ~OAIV1alphaGenerationApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);

    /**
    * @param[in]  engine_id QString [required]
    * @param[in]  accept QString [required]
    * @param[in]  init_image OAIHttpFileElement [required]
    * @param[in]  options OAIImageToImageOptions [required]
    * @param[in]  organization QString [optional]
    */
    void v1alpha_generationImageToImage(const QString &engine_id, const QString &accept, const OAIHttpFileElement &init_image, const OAIImageToImageOptions &options, const ::OpenAPI::OptionalParam<QString> &organization = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  engine_id QString [required]
    * @param[in]  accept QString [required]
    * @param[in]  init_image OAIHttpFileElement [required]
    * @param[in]  options OAIMaskingOptions [required]
    * @param[in]  organization QString [optional]
    * @param[in]  mask_image OAIHttpFileElement [optional]
    */
    void v1alpha_generationMasking(const QString &engine_id, const QString &accept, const OAIHttpFileElement &init_image, const OAIMaskingOptions &options, const ::OpenAPI::OptionalParam<QString> &organization = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<OAIHttpFileElement> &mask_image = ::OpenAPI::OptionalParam<OAIHttpFileElement>());

    /**
    * @param[in]  engine_id QString [required]
    * @param[in]  accept QString [required]
    * @param[in]  oai_text_to_image_request_body OAITextToImageRequestBody [required]
    * @param[in]  organization QString [optional]
    */
    void v1alpha_generationTextToImage(const QString &engine_id, const QString &accept, const OAITextToImageRequestBody &oai_text_to_image_request_body, const ::OpenAPI::OptionalParam<QString> &organization = ::OpenAPI::OptionalParam<QString>());


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void v1alpha_generationImageToImageCallback(OAIHttpRequestWorker *worker);
    void v1alpha_generationMaskingCallback(OAIHttpRequestWorker *worker);
    void v1alpha_generationTextToImageCallback(OAIHttpRequestWorker *worker);

signals:

    void v1alpha_generationImageToImageSignal();
    void v1alpha_generationMaskingSignal();
    void v1alpha_generationTextToImageSignal();

    void v1alpha_generationImageToImageSignalFull(OAIHttpRequestWorker *worker);
    void v1alpha_generationMaskingSignalFull(OAIHttpRequestWorker *worker);
    void v1alpha_generationTextToImageSignalFull(OAIHttpRequestWorker *worker);

    void v1alpha_generationImageToImageSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void v1alpha_generationMaskingSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void v1alpha_generationTextToImageSignalE(QNetworkReply::NetworkError error_type, QString error_str);

    void v1alpha_generationImageToImageSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void v1alpha_generationMaskingSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void v1alpha_generationTextToImageSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public slots:
    void tokenAvailable();
    
};

} // namespace OpenAPI
#endif
