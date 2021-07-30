package org.training.storefront.controllers.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.facades.facade.CustomersFacade;
import org.training.facades.product.data.CustomersData;
import org.training.storefront.controllers.ControllerConstants;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class CustomersController {


    @Autowired
    private CustomersFacade customersFacade;

    @RequestMapping(value = "/cus")
    private String getAll(Model model, Date oldDate)
    {
     List<CustomersData> data= customersFacade.getAllData(oldDate);
     model.addAttribute("datas",data);
     return ControllerConstants.Views.Pages.Customers.AllCustomers;
    }
}
