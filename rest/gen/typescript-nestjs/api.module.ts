import { DynamicModule, HttpService, HttpModule, Module, Global } from '@nestjs/common';
import { Configuration } from './configuration';

import { V1alphaEnginesService } from './api/v1alphaEngines.service';
import { V1alphaGenerationService } from './api/v1alphaGeneration.service';
import { V1alphaUserService } from './api/v1alphaUser.service';

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    V1alphaEnginesService,
    V1alphaGenerationService,
    V1alphaUserService
  ],
  providers: [
    V1alphaEnginesService,
    V1alphaGenerationService,
    V1alphaUserService
  ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): DynamicModule {
        return {
            module: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( httpService: HttpService) { }
}
