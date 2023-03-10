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

#include "OAIOrganizationMembership.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrganizationMembership::OAIOrganizationMembership(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrganizationMembership::OAIOrganizationMembership() {
    this->initializeModel();
}

OAIOrganizationMembership::~OAIOrganizationMembership() {}

void OAIOrganizationMembership::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_is_default_isSet = false;
    m_is_default_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_role_isSet = false;
    m_role_isValid = false;
}

void OAIOrganizationMembership::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrganizationMembership::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_is_default_isValid = ::OpenAPI::fromJsonValue(is_default, json[QString("is_default")]);
    m_is_default_isSet = !json[QString("is_default")].isNull() && m_is_default_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_role_isValid = ::OpenAPI::fromJsonValue(role, json[QString("role")]);
    m_role_isSet = !json[QString("role")].isNull() && m_role_isValid;
}

QString OAIOrganizationMembership::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrganizationMembership::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_is_default_isSet) {
        obj.insert(QString("is_default"), ::OpenAPI::toJsonValue(is_default));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_role_isSet) {
        obj.insert(QString("role"), ::OpenAPI::toJsonValue(role));
    }
    return obj;
}

QString OAIOrganizationMembership::getId() const {
    return id;
}
void OAIOrganizationMembership::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIOrganizationMembership::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrganizationMembership::is_id_Valid() const{
    return m_id_isValid;
}

bool OAIOrganizationMembership::isIsDefault() const {
    return is_default;
}
void OAIOrganizationMembership::setIsDefault(const bool &is_default) {
    this->is_default = is_default;
    this->m_is_default_isSet = true;
}

bool OAIOrganizationMembership::is_is_default_Set() const{
    return m_is_default_isSet;
}

bool OAIOrganizationMembership::is_is_default_Valid() const{
    return m_is_default_isValid;
}

QString OAIOrganizationMembership::getName() const {
    return name;
}
void OAIOrganizationMembership::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIOrganizationMembership::is_name_Set() const{
    return m_name_isSet;
}

bool OAIOrganizationMembership::is_name_Valid() const{
    return m_name_isValid;
}

QString OAIOrganizationMembership::getRole() const {
    return role;
}
void OAIOrganizationMembership::setRole(const QString &role) {
    this->role = role;
    this->m_role_isSet = true;
}

bool OAIOrganizationMembership::is_role_Set() const{
    return m_role_isSet;
}

bool OAIOrganizationMembership::is_role_Valid() const{
    return m_role_isValid;
}

bool OAIOrganizationMembership::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_default_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_role_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrganizationMembership::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_is_default_isValid && m_name_isValid && m_role_isValid && true;
}

} // namespace OpenAPI
