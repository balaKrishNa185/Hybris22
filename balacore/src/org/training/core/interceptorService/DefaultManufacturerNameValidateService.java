package org.training.core.interceptorService;

import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.model.ManufacturerModel;

public class DefaultManufacturerNameValidateService implements ManufacturerNameValidateService {


    private ModelService modelService;


    @Override
    public void saveModel(ManufacturerModel manufacturerModel) {
        getModelService().save(manufacturerModel);
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
