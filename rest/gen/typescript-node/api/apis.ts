export * from './v1alphaEnginesApi';
import { V1alphaEnginesApi } from './v1alphaEnginesApi';
export * from './v1alphaGenerationApi';
import { V1alphaGenerationApi } from './v1alphaGenerationApi';
export * from './v1alphaUserApi';
import { V1alphaUserApi } from './v1alphaUserApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [V1alphaEnginesApi, V1alphaGenerationApi, V1alphaUserApi];
