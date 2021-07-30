package org.training.storefront.controllers.custom;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewTestingTemplateController extends AbstractPageController {


    @RequestMapping(value = "/testingPage")
    public String testCmsPage(Model model) {
        try {
            final ContentPageModel contentPageModel = getContentPageForLabelOrId("newTesting");
            storeCmsPageInModel(model, contentPageModel);
            setUpMetaDataForContentPage(model, contentPageModel);
        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }
}
