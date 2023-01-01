# AccountResponseBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **string** | The user&#39;s email | 
**Id** | **string** | The user&#39;s ID | 
**Organizations** | [**[]OrganizationMembership**](OrganizationMembership.md) | The user&#39;s organizations | 
**ProfilePicture** | Pointer to **string** | The user&#39;s profile picture | [optional] 

## Methods

### NewAccountResponseBody

`func NewAccountResponseBody(email string, id string, organizations []OrganizationMembership, ) *AccountResponseBody`

NewAccountResponseBody instantiates a new AccountResponseBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAccountResponseBodyWithDefaults

`func NewAccountResponseBodyWithDefaults() *AccountResponseBody`

NewAccountResponseBodyWithDefaults instantiates a new AccountResponseBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *AccountResponseBody) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *AccountResponseBody) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *AccountResponseBody) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetId

`func (o *AccountResponseBody) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AccountResponseBody) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AccountResponseBody) SetId(v string)`

SetId sets Id field to given value.


### GetOrganizations

`func (o *AccountResponseBody) GetOrganizations() []OrganizationMembership`

GetOrganizations returns the Organizations field if non-nil, zero value otherwise.

### GetOrganizationsOk

`func (o *AccountResponseBody) GetOrganizationsOk() (*[]OrganizationMembership, bool)`

GetOrganizationsOk returns a tuple with the Organizations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrganizations

`func (o *AccountResponseBody) SetOrganizations(v []OrganizationMembership)`

SetOrganizations sets Organizations field to given value.


### GetProfilePicture

`func (o *AccountResponseBody) GetProfilePicture() string`

GetProfilePicture returns the ProfilePicture field if non-nil, zero value otherwise.

### GetProfilePictureOk

`func (o *AccountResponseBody) GetProfilePictureOk() (*string, bool)`

GetProfilePictureOk returns a tuple with the ProfilePicture field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfilePicture

`func (o *AccountResponseBody) SetProfilePicture(v string)`

SetProfilePicture sets ProfilePicture field to given value.

### HasProfilePicture

`func (o *AccountResponseBody) HasProfilePicture() bool`

HasProfilePicture returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


