# OrganizationMembership

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**IsDefault** | **bool** |  | 
**Name** | **string** |  | 
**Role** | **string** |  | 

## Methods

### NewOrganizationMembership

`func NewOrganizationMembership(id string, isDefault bool, name string, role string, ) *OrganizationMembership`

NewOrganizationMembership instantiates a new OrganizationMembership object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrganizationMembershipWithDefaults

`func NewOrganizationMembershipWithDefaults() *OrganizationMembership`

NewOrganizationMembershipWithDefaults instantiates a new OrganizationMembership object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrganizationMembership) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrganizationMembership) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrganizationMembership) SetId(v string)`

SetId sets Id field to given value.


### GetIsDefault

`func (o *OrganizationMembership) GetIsDefault() bool`

GetIsDefault returns the IsDefault field if non-nil, zero value otherwise.

### GetIsDefaultOk

`func (o *OrganizationMembership) GetIsDefaultOk() (*bool, bool)`

GetIsDefaultOk returns a tuple with the IsDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDefault

`func (o *OrganizationMembership) SetIsDefault(v bool)`

SetIsDefault sets IsDefault field to given value.


### GetName

`func (o *OrganizationMembership) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OrganizationMembership) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OrganizationMembership) SetName(v string)`

SetName sets Name field to given value.


### GetRole

`func (o *OrganizationMembership) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *OrganizationMembership) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *OrganizationMembership) SetRole(v string)`

SetRole sets Role field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


