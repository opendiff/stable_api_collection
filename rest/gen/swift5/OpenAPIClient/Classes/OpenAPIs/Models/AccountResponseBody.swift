//
// AccountResponseBody.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct AccountResponseBody: Codable, JSONEncodable, Hashable {

    /** The user's email */
    public var email: String
    /** The user's ID */
    public var id: String
    /** The user's organizations */
    public var organizations: [OrganizationMembership]
    /** The user's profile picture */
    public var profilePicture: String?

    public init(email: String, id: String, organizations: [OrganizationMembership], profilePicture: String? = nil) {
        self.email = email
        self.id = id
        self.organizations = organizations
        self.profilePicture = profilePicture
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case email
        case id
        case organizations
        case profilePicture = "profile_picture"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(email, forKey: .email)
        try container.encode(id, forKey: .id)
        try container.encode(organizations, forKey: .organizations)
        try container.encodeIfPresent(profilePicture, forKey: .profilePicture)
    }
}

