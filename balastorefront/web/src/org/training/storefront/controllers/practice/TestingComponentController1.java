package org.training.storefront.controllers.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.training.core.model.TestingComponent1Model;
import org.training.storefront.controllers.ControllerConstants;
import org.training.storefront.controllers.cms.AbstractAcceleratorCMSComponentController;


import javax.servlet.http.HttpServletRequest;

@Controller("TestingComponentController1")
@RequestMapping(value = ControllerConstants.Actions.Cms.TestingComponent)
public class TestingComponentController1 extends AbstractAcceleratorCMSComponentController<TestingComponent1Model> {

    @Override
    protected void fillModel(HttpServletRequest request, Model model, TestingComponent1Model component) {

        model.addAttribute("display",component.getDisplay());
    }
}
