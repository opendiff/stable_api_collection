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
 *
 */

import ApiClient from '../ApiClient';
import OrganizationMembership from './OrganizationMembership';

/**
 * The AccountResponseBody model module.
 * @module model/AccountResponseBody
 * @version 0.1
 */
class AccountResponseBody {
    /**
     * @member {String} email
     * @type {String}
     */
    email;
    /**
     * @member {String} id
     * @type {String}
     */
    id;
    /**
     * @member {Array.<CodegenProperty{openApiType='OrganizationMembership', baseName='organizations', complexType='OrganizationMembership', getter='getOrganizations', setter='setOrganizations', description='null', dataType='OrganizationMembership', datatypeWithEnum='OrganizationMembership', dataFormat='null', name='organizations', min='null', max='null', defaultValue='null', defaultValueWithParam=' = OrganizationMembership.constructFromObject(data['organizations']);', baseType='OrganizationMembership', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/OrganizationMembership"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Organizations', nameInSnakeCase='ORGANIZATIONS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>} organizations
     * @type {Array.<CodegenProperty{openApiType='OrganizationMembership', baseName='organizations', complexType='OrganizationMembership', getter='getOrganizations', setter='setOrganizations', description='null', dataType='OrganizationMembership', datatypeWithEnum='OrganizationMembership', dataFormat='null', name='organizations', min='null', max='null', defaultValue='null', defaultValueWithParam=' = OrganizationMembership.constructFromObject(data['organizations']);', baseType='OrganizationMembership', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/OrganizationMembership"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Organizations', nameInSnakeCase='ORGANIZATIONS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>}
     */
    organizations;
    /**
     * @member {String} profile_picture
     * @type {String}
     */
    profile_picture;

    

    /**
     * Constructs a new <code>AccountResponseBody</code>.
     * @alias module:model/AccountResponseBody
     * @param email {String} The user's email
     * @param id {String} The user's ID
     * @param organizations {Array.<CodegenProperty{openApiType='OrganizationMembership', baseName='organizations', complexType='OrganizationMembership', getter='getOrganizations', setter='setOrganizations', description='null', dataType='OrganizationMembership', datatypeWithEnum='OrganizationMembership', dataFormat='null', name='organizations', min='null', max='null', defaultValue='null', defaultValueWithParam=' = OrganizationMembership.constructFromObject(data['organizations']);', baseType='OrganizationMembership', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/OrganizationMembership"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Organizations', nameInSnakeCase='ORGANIZATIONS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>} The user's organizations
     */
    constructor(email, id, organizations) { 
        
        AccountResponseBody.initialize(this, email, id, organizations);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, email, id, organizations) { 
        obj['email'] = email;
        obj['id'] = id;
        obj['organizations'] = organizations;
    }

    /**
     * Constructs a <code>AccountResponseBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AccountResponseBody} obj Optional instance to populate.
     * @return {module:model/AccountResponseBody} The populated <code>AccountResponseBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AccountResponseBody();

            if (data.hasOwnProperty('email')) {
                obj['email'] = ApiClient.convertToType(data['email'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('organizations')) {
                obj['organizations'] = ApiClient.convertToType(data['organizations'], [OrganizationMembership]);
            }
            if (data.hasOwnProperty('profile_picture')) {
                obj['profile_picture'] = ApiClient.convertToType(data['profile_picture'], 'String');
            }
        }
        return obj;
    }
}



export default AccountResponseBody;

