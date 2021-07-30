package org.training.storefront.controllers.practice;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SamplePageController extends AbstractPageController {


    @RequestMapping(value = "/sample1")
    public String samplepageOne(Model model) throws CMSItemNotFoundException
    {
        final ContentPageModel contentPageModel = getContentPageForLabelOrId("SampleOne");
        storeCmsPageInModel(model, contentPageModel);
        setUpMetaDataForContentPage(model, contentPageModel);

        return "pages/custom1/samplefirstPage";
    }

    @RequestMapping(value = "/sample2")
    public String samplepageTwo(Model model) throws CMSItemNotFoundException
    {
        final ContentPageModel contentPageModel = getContentPageForLabelOrId("SampleTwo");
        storeCmsPageInModel(model, contentPageModel);
        setUpMetaDataForContentPage(model, contentPageModel);

        return "pages/custom1/samplesecondPage";
    }
}
