package org.training.core.PracticeDAO;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.Date;
import java.util.List;

public interface CustomerCronDao {


    List<CustomerModel> getAllCustomers(int days);
    List<CustomerModel> getOnlyNewCustomer(Date date);
}
