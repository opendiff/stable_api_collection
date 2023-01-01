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

import { HttpClient } from 'aurelia-http-client';
import { AuthStorage } from './AuthStorage';

const BASE_PATH = 'https://api.stability.ai'.replace(/\/+$/, '');

export class Api {
  basePath: string;
  httpClient: HttpClient;
  authStorage: AuthStorage;

  constructor(httpClient: HttpClient, authStorage: AuthStorage, basePath: string = BASE_PATH) {
    this.basePath = basePath;
    this.httpClient = httpClient;
    this.authStorage = authStorage;
  }

  /**
   * Encodes a query string.
   *
   * @param params The params to encode.
   * @return An encoded query string.
   */
  protected queryString(params: { [key: string]: any }): string {
    const queries = [];
    for (let key in params) {
      const value = this.toString(params[key]);
      if (value != null) {
        queries.push(`${key}=${encodeURIComponent(value)}`);
      }
    }

    return queries.join('&');
  }

  /**
   * Converts a value to string.
   *
   * @param value The value to convert.
   */
  protected toString(value: any): string | null {
    if (value === null) {
      return null;
    }
    switch (typeof value) {
      case 'undefined': return null;
      case 'boolean': return value ? 'true' : 'false';
      case 'string': return value;
      default: return '' + value;
    }
  }

  /**
   * Ensures that a given parameter is set.
   *
   * @param context A name for the callee's context.
   * @param params The parameters being set.
   * @param paramName The required parameter to check.
   */
  protected ensureParamIsSet<T>(context: string, params: T, paramName: keyof T): void {
    if (null === params[paramName]) {
      throw new Error(`Missing required parameter ${paramName} when calling ${context}`);
    }
  }
}