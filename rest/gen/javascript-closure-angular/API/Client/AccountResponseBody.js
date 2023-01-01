goog.provide('API.Client.AccountResponseBody');

/**
 * @record
 */
API.Client.AccountResponseBody = function() {}

/**
 * The user's email
 * @type {!string}
 * @export
 */
API.Client.AccountResponseBody.prototype.email;

/**
 * The user's ID
 * @type {!string}
 * @export
 */
API.Client.AccountResponseBody.prototype.id;

/**
 * The user's organizations
 * @type {!Array<!API.Client.OrganizationMembership>}
 * @export
 */
API.Client.AccountResponseBody.prototype.organizations;

/**
 * The user's profile picture
 * @type {!API.Client.URI}
 * @export
 */
API.Client.AccountResponseBody.prototype.profilePicture;

