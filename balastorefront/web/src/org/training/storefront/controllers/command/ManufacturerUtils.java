package org.training.storefront.controllers.command;

import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.training.core.model.ManufacturerModel;

@Component("manufacturerUtils")
public class ManufacturerUtils {


    @Autowired
    private ModelService modelService;

    public ManufacturerModel convertDataToModel(final ManufacturerForm manufacturerForm)
    {
        final ManufacturerModel model=modelService.create(ManufacturerModel.class);

        model.setId(manufacturerForm.getId());
        model.setName(manufacturerForm.getName());
        model.setState(manufacturerForm.getState());


        return model;
    }
}
