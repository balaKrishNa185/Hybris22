package org.training.facades.facade;


import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;

public class DefaultCustomCustomerFacade extends DefaultCustomerFacade {

    @Override
    protected void setCommonPropertiesForRegister(RegisterData registerData, de.hybris.platform.core.model.user.CustomerModel customerModel) {

        customerModel.setPlace(registerData.getPlace());
        customerModel.setNewBusinessUser(registerData.isNewBusinessUser());
        super.setCommonPropertiesForRegister(registerData, customerModel);
    }
}

