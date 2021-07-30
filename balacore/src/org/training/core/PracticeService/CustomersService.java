package org.training.core.PracticeService;

import org.training.core.model.CustomersModel;

import java.util.Date;
import java.util.List;

public interface CustomersService
{

    List<CustomersModel> getAllFromDao(Date oldDate);
}
