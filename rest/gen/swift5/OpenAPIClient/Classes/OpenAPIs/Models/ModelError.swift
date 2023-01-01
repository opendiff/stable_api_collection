//
// ModelError.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ModelError: Codable, JSONEncodable, Hashable {

    /** Is the error a server-side fault? */
    public var fault: Bool
    /** ID is a unique identifier for this particular occurrence of the problem. */
    public var id: String
    /** Message is a human-readable explanation specific to this occurrence of the problem. */
    public var message: String
    /** Name is the name of this class of errors. */
    public var name: String
    /** Is the error temporary? */
    public var temporary: Bool
    /** Is the error a timeout? */
    public var timeout: Bool

    public init(fault: Bool, id: String, message: String, name: String, temporary: Bool, timeout: Bool) {
        self.fault = fault
        self.id = id
        self.message = message
        self.name = name
        self.temporary = temporary
        self.timeout = timeout
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case fault
        case id
        case message
        case name
        case temporary
        case timeout
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(fault, forKey: .fault)
        try container.encode(id, forKey: .id)
        try container.encode(message, forKey: .message)
        try container.encode(name, forKey: .name)
        try container.encode(temporary, forKey: .temporary)
        try container.encode(timeout, forKey: .timeout)
    }
}
