package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import org.training.core.model.ManufacturerModel;

public class ManufacturerPrepareInterceptor implements PrepareInterceptor<ManufacturerModel> {

    @Override
    public void onPrepare(ManufacturerModel manufacturerModel, InterceptorContext interceptorContext) throws InterceptorException {
       String name= manufacturerModel.getName();

       String newName="Manufacturer"+name;

       manufacturerModel.setName(newName);
    }
}
