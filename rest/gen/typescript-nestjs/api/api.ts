export * from './v1alphaEngines.service';
import { V1alphaEnginesService } from './v1alphaEngines.service';
export * from './v1alphaGeneration.service';
import { V1alphaGenerationService } from './v1alphaGeneration.service';
export * from './v1alphaUser.service';
import { V1alphaUserService } from './v1alphaUser.service';
export const APIS = [V1alphaEnginesService, V1alphaGenerationService, V1alphaUserService];
