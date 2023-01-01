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

#include "OAIBalanceResponseBody.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBalanceResponseBody::OAIBalanceResponseBody(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBalanceResponseBody::OAIBalanceResponseBody() {
    this->initializeModel();
}

OAIBalanceResponseBody::~OAIBalanceResponseBody() {}

void OAIBalanceResponseBody::initializeModel() {

    m_credits_isSet = false;
    m_credits_isValid = false;
}

void OAIBalanceResponseBody::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBalanceResponseBody::fromJsonObject(QJsonObject json) {

    m_credits_isValid = ::OpenAPI::fromJsonValue(credits, json[QString("credits")]);
    m_credits_isSet = !json[QString("credits")].isNull() && m_credits_isValid;
}

QString OAIBalanceResponseBody::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBalanceResponseBody::asJsonObject() const {
    QJsonObject obj;
    if (m_credits_isSet) {
        obj.insert(QString("credits"), ::OpenAPI::toJsonValue(credits));
    }
    return obj;
}

double OAIBalanceResponseBody::getCredits() const {
    return credits;
}
void OAIBalanceResponseBody::setCredits(const double &credits) {
    this->credits = credits;
    this->m_credits_isSet = true;
}

bool OAIBalanceResponseBody::is_credits_Set() const{
    return m_credits_isSet;
}

bool OAIBalanceResponseBody::is_credits_Valid() const{
    return m_credits_isValid;
}

bool OAIBalanceResponseBody::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_credits_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBalanceResponseBody::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_credits_isValid && true;
}

} // namespace OpenAPI