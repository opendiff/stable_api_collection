/*
Stability.ai REST API

Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 

API version: 0.1
Contact: info@stability.ai
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// OrganizationMembership struct for OrganizationMembership
type OrganizationMembership struct {
	Id string `json:"id"`
	IsDefault bool `json:"is_default"`
	Name string `json:"name"`
	Role string `json:"role"`
}

// NewOrganizationMembership instantiates a new OrganizationMembership object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOrganizationMembership(id string, isDefault bool, name string, role string) *OrganizationMembership {
	this := OrganizationMembership{}
	this.Id = id
	this.IsDefault = isDefault
	this.Name = name
	this.Role = role
	return &this
}

// NewOrganizationMembershipWithDefaults instantiates a new OrganizationMembership object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOrganizationMembershipWithDefaults() *OrganizationMembership {
	this := OrganizationMembership{}
	return &this
}

// GetId returns the Id field value
func (o *OrganizationMembership) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *OrganizationMembership) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *OrganizationMembership) SetId(v string) {
	o.Id = v
}

// GetIsDefault returns the IsDefault field value
func (o *OrganizationMembership) GetIsDefault() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsDefault
}

// GetIsDefaultOk returns a tuple with the IsDefault field value
// and a boolean to check if the value has been set.
func (o *OrganizationMembership) GetIsDefaultOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.IsDefault, true
}

// SetIsDefault sets field value
func (o *OrganizationMembership) SetIsDefault(v bool) {
	o.IsDefault = v
}

// GetName returns the Name field value
func (o *OrganizationMembership) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *OrganizationMembership) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *OrganizationMembership) SetName(v string) {
	o.Name = v
}

// GetRole returns the Role field value
func (o *OrganizationMembership) GetRole() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Role
}

// GetRoleOk returns a tuple with the Role field value
// and a boolean to check if the value has been set.
func (o *OrganizationMembership) GetRoleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Role, true
}

// SetRole sets field value
func (o *OrganizationMembership) SetRole(v string) {
	o.Role = v
}

func (o OrganizationMembership) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["is_default"] = o.IsDefault
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["role"] = o.Role
	}
	return json.Marshal(toSerialize)
}

type NullableOrganizationMembership struct {
	value *OrganizationMembership
	isSet bool
}

func (v NullableOrganizationMembership) Get() *OrganizationMembership {
	return v.value
}

func (v *NullableOrganizationMembership) Set(val *OrganizationMembership) {
	v.value = val
	v.isSet = true
}

func (v NullableOrganizationMembership) IsSet() bool {
	return v.isSet
}

func (v *NullableOrganizationMembership) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrganizationMembership(val *OrganizationMembership) *NullableOrganizationMembership {
	return &NullableOrganizationMembership{value: val, isSet: true}
}

func (v NullableOrganizationMembership) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrganizationMembership) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


