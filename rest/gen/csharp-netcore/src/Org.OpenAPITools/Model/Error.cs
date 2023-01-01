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
    /// Error
    /// </summary>
    [DataContract(Name = "Error")]
    public partial class Error : IEquatable<Error>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Error" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Error() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Error" /> class.
        /// </summary>
        /// <param name="fault">Is the error a server-side fault? (required).</param>
        /// <param name="id">ID is a unique identifier for this particular occurrence of the problem. (required).</param>
        /// <param name="message">Message is a human-readable explanation specific to this occurrence of the problem. (required).</param>
        /// <param name="name">Name is the name of this class of errors. (required).</param>
        /// <param name="temporary">Is the error temporary? (required).</param>
        /// <param name="timeout">Is the error a timeout? (required).</param>
        public Error(bool fault = default(bool), string id = default(string), string message = default(string), string name = default(string), bool temporary = default(bool), bool timeout = default(bool))
        {
            this.Fault = fault;
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for Error and cannot be null");
            }
            this.Id = id;
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for Error and cannot be null");
            }
            this.Message = message;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for Error and cannot be null");
            }
            this.Name = name;
            this.Temporary = temporary;
            this.Timeout = timeout;
        }

        /// <summary>
        /// Is the error a server-side fault?
        /// </summary>
        /// <value>Is the error a server-side fault?</value>
        [DataMember(Name = "fault", IsRequired = true, EmitDefaultValue = true)]
        public bool Fault { get; set; }

        /// <summary>
        /// ID is a unique identifier for this particular occurrence of the problem.
        /// </summary>
        /// <value>ID is a unique identifier for this particular occurrence of the problem.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Message is a human-readable explanation specific to this occurrence of the problem.
        /// </summary>
        /// <value>Message is a human-readable explanation specific to this occurrence of the problem.</value>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// Name is the name of this class of errors.
        /// </summary>
        /// <value>Name is the name of this class of errors.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Is the error temporary?
        /// </summary>
        /// <value>Is the error temporary?</value>
        [DataMember(Name = "temporary", IsRequired = true, EmitDefaultValue = true)]
        public bool Temporary { get; set; }

        /// <summary>
        /// Is the error a timeout?
        /// </summary>
        /// <value>Is the error a timeout?</value>
        [DataMember(Name = "timeout", IsRequired = true, EmitDefaultValue = true)]
        public bool Timeout { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Error {\n");
            sb.Append("  Fault: ").Append(Fault).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Temporary: ").Append(Temporary).Append("\n");
            sb.Append("  Timeout: ").Append(Timeout).Append("\n");
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
            return this.Equals(input as Error);
        }

        /// <summary>
        /// Returns true if Error instances are equal
        /// </summary>
        /// <param name="input">Instance of Error to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Error input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Fault == input.Fault ||
                    this.Fault.Equals(input.Fault)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Temporary == input.Temporary ||
                    this.Temporary.Equals(input.Temporary)
                ) && 
                (
                    this.Timeout == input.Timeout ||
                    this.Timeout.Equals(input.Timeout)
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
                hashCode = (hashCode * 59) + this.Fault.GetHashCode();
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Temporary.GetHashCode();
                hashCode = (hashCode * 59) + this.Timeout.GetHashCode();
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
