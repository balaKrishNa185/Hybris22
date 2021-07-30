package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.apache.commons.lang.StringUtils;
import org.training.core.model.ManufacturerModel;

public class ManufacturerNameValidateInterceptor implements ValidateInterceptor<ManufacturerModel> {




    @Override
    public void onValidate(ManufacturerModel manufacturerModel, InterceptorContext interceptorContext) throws InterceptorException {

       String name= manufacturerModel.getName();

        if(!StringUtils.isAlphanumeric(name))
        {
            throw new InterceptorException("Name should be alphanumeric");
        }
    }
}
