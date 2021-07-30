package org.training.facades.facade;

import org.training.facades.product.data.CustomersData;

import java.util.Date;
import java.util.List;

public interface CustomersFacade {

    public List<CustomersData> getAllData(Date oldDate);
}
