package org.training.core.interceptor;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import org.apache.log4j.Logger;

public class CustomDescriptionInitDefaultInterceptor implements InitDefaultsInterceptor {

    private static final Logger LOG =Logger.getLogger(CustomDescriptionInitDefaultInterceptor.class);

    @Override
    public void onInitDefaults(Object o, InterceptorContext interceptorContext) throws InterceptorException {

        if(o instanceof CustomerModel)
        {
            LOG.info("CustomDescriptionInitDefaultInterceptor is called");
            CustomerModel customerModel=(CustomerModel) o;
            customerModel.setDescription("default description given by bala");
            LOG.info("Descriptionvalue is added");
        }

    }
}
