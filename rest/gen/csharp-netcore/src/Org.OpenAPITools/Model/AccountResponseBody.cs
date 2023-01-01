/*
 * Stability.ai REST API
 *
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// AccountResponseBody
    /// </summary>
    [DataContract(Name = "AccountResponseBody")]
    public partial class AccountResponseBody : IEquatable<AccountResponseBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountResponseBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AccountResponseBody() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountResponseBody" /> class.
        /// </summary>
        /// <param name="email">The user&#39;s email (required).</param>
        /// <param name="id">The user&#39;s ID (required).</param>
        /// <param name="organizations">The user&#39;s organizations (required).</param>
        /// <param name="profilePicture">The user&#39;s profile picture.</param>
        public AccountResponseBody(string email = default(string), string id = default(string), List<OrganizationMembership> organizations = default(List<OrganizationMembership>), string profilePicture = default(string))
        {
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new ArgumentNullException("email is a required property for AccountResponseBody and cannot be null");
            }
            this.Email = email;
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for AccountResponseBody and cannot be null");
            }
            this.Id = id;
            // to ensure "organizations" is required (not null)
            if (organizations == null)
            {
                throw new ArgumentNullException("organizations is a required property for AccountResponseBody and cannot be null");
            }
            this.Organizations = organizations;
            this.ProfilePicture = profilePicture;
        }

        /// <summary>
        /// The user&#39;s email
        /// </summary>
        /// <value>The user&#39;s email</value>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// The user&#39;s ID
        /// </summary>
        /// <value>The user&#39;s ID</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The user&#39;s organizations
        /// </summary>
        /// <value>The user&#39;s organizations</value>
        [DataMember(Name = "organizations", IsRequired = true, EmitDefaultValue = false)]
        public List<OrganizationMembership> Organizations { get; set; }

        /// <summary>
        /// The user&#39;s profile picture
        /// </summary>
        /// <value>The user&#39;s profile picture</value>
        [DataMember(Name = "profile_picture", EmitDefaultValue = false)]
        public string ProfilePicture { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AccountResponseBody {\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Organizations: ").Append(Organizations).Append("\n");
            sb.Append("  ProfilePicture: ").Append(ProfilePicture).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AccountResponseBody);
        }

        /// <summary>
        /// Returns true if AccountResponseBody instances are equal
        /// </summary>
        /// <param name="input">Instance of AccountResponseBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AccountResponseBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Organizations == input.Organizations ||
                    this.Organizations != null &&
                    input.Organizations != null &&
                    this.Organizations.SequenceEqual(input.Organizations)
                ) && 
                (
                    this.ProfilePicture == input.ProfilePicture ||
                    (this.ProfilePicture != null &&
                    this.ProfilePicture.Equals(input.ProfilePicture))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Organizations != null)
                {
                    hashCode = (hashCode * 59) + this.Organizations.GetHashCode();
                }
                if (this.ProfilePicture != null)
                {
                    hashCode = (hashCode * 59) + this.ProfilePicture.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}