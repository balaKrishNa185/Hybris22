package org.training.facades.facade;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.PracticeService.CustomersService;
import org.training.core.model.CustomersModel;
import org.training.facades.product.data.CustomersData;

import java.util.Date;
import java.util.List;

public class DefaultCustomersFacade implements CustomersFacade {

    private CustomersService customersService;
    private Converter<CustomersModel,CustomersData> customersDataConverter;

    @Override
    public List<CustomersData> getAllData(Date oldDate) {

      List<CustomersModel> models=  getCustomersService().getAllFromDao(oldDate);
        List<CustomersData> data= getCustomersDataConverter().convertAll(models);
        return data;
    }


    public CustomersService getCustomersService() {
        return customersService;
    }

    public void setCustomersService(CustomersService customersService) {
        this.customersService = customersService;
    }

    public Converter<CustomersModel, CustomersData> getCustomersDataConverter() {
        return customersDataConverter;
    }

    public void setCustomersDataConverter(Converter<CustomersModel, CustomersData> customersDataConverter) {
        this.customersDataConverter = customersDataConverter;
    }
}
