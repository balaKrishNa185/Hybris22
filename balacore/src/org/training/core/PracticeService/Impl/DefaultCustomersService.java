package org.training.core.PracticeService.Impl;

import org.training.core.PracticeDAO.CustomersDao;
import org.training.core.PracticeService.CustomersService;
import org.training.core.model.CustomersModel;

import java.util.Date;
import java.util.List;

public class DefaultCustomersService implements CustomersService {

   private CustomersDao customersDao;


    @Override
    public List<CustomersModel> getAllFromDao(Date oldDate) {
        return getCustomersDao().getAllCustomers(oldDate);
    }


    public CustomersDao getCustomersDao() {
        return customersDao;
    }

    public void setCustomersDao(CustomersDao customersDao) {
        this.customersDao = customersDao;
    }
}
