package org.training.storefront.controllers.practice;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SamePageTemplateController extends AbstractPageController {


    @RequestMapping(value = "/page1")
    public String pageOne(Model model) throws CMSItemNotFoundException
    {;
        final ContentPageModel contentPageModel = getContentPageForLabelOrId("PageOne");
        storeCmsPageInModel(model, contentPageModel);
        setUpMetaDataForContentPage(model, contentPageModel);

       return "pages/custom1/firstPage";
    }


    @RequestMapping(value = "/page2")
    public String pageTwo(Model model) throws CMSItemNotFoundException
    {
        final ContentPageModel contentPageModel = getContentPageForLabelOrId("PageTwo");
        storeCmsPageInModel(model, contentPageModel);
        setUpMetaDataForContentPage(model, contentPageModel);
        return "pages/custom1/secondPage";
    }
}
