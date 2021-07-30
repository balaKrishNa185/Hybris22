package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.CustomersModel;
import org.training.facades.product.data.CustomersData;

public class CustomersPopulator implements Populator<CustomersModel, CustomersData> {

    @Override
    public void populate(CustomersModel source, CustomersData target) throws ConversionException {
        target.setCustomerCreated(source.getCustomerCreated());
        target.setName(source.getName());
        target.setPlace(source.getPlace());
        target.setIsNeworOld(source.getIsNeworOld());
    }
}
