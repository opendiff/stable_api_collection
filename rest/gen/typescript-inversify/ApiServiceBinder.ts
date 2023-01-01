import {interfaces} from 'inversify';

import { V1alphaEnginesService } from './api/v1alphaEngines.service';
import { V1alphaGenerationService } from './api/v1alphaGeneration.service';
import { V1alphaUserService } from './api/v1alphaUser.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<V1alphaEnginesService>('V1alphaEnginesService').to(V1alphaEnginesService).inSingletonScope();
        container.bind<V1alphaGenerationService>('V1alphaGenerationService').to(V1alphaGenerationService).inSingletonScope();
        container.bind<V1alphaUserService>('V1alphaUserService').to(V1alphaUserService).inSingletonScope();
    }
}
