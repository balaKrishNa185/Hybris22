package org.training.core.PracticeDAO;

import org.training.core.model.CustomersModel;

import java.util.Date;
import java.util.List;

public interface CustomersDao {

    List<CustomersModel> getAllCustomers(Date oldDate);
}
