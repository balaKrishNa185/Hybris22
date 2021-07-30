package org.training.storefront.controllers.custom;


import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.training.core.interceptorService.ManufacturerNameValidateService;
import org.training.core.model.ManufacturerModel;
import org.training.facades.facade.ManufacturerFacade;
import org.training.facades.product.data.ManufacturerData;
import org.training.storefront.controllers.ControllerConstants;
import org.training.storefront.controllers.command.ManufacturerForm;
import org.training.storefront.controllers.command.ManufacturerUtils;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class ManufacturerController extends AbstractPageController {

    @Autowired
    private ManufacturerFacade manufacturerFacade;

    @Resource(name="manufacturerUtils")
    private ManufacturerUtils manufacturerUtils;

    @Resource(name = "defaultManufacturerNameValidateService")
    private ManufacturerNameValidateService manufacturerNameValidateService;

    @RequestMapping(value = "/manu")
    public String getData(Model model)
    {
      List<ManufacturerData> data=manufacturerFacade.convertModeLToData();
      model.addAttribute("datas",data);
      return ControllerConstants.Views.Pages.Manufacturer.Details;
    }

    @RequestMapping(value = "/man/{id}")
    public String getData(@PathVariable("id")Integer id, Model model)
    {
        ManufacturerData data=manufacturerFacade.convertOneModeltoData(id);
        model.addAttribute("datas",data);
        return ControllerConstants.Views.Pages.one.MANU;
    }

    @RequestMapping(value = "/page/{currentPage}")
    public String getByPagination(@PathVariable("currentPage")int currentPage, Model model)
    {
        List<ManufacturerData> paginationData = manufacturerFacade.PaginationData(currentPage);
        model.addAttribute("resultByPages",paginationData);
        return ControllerConstants.Views.Pages.Paging.AllByPagination;
    }

    @RequestMapping(value = "/sam/{currentPage}")
    public String getByPaginationbyOrder(@PathVariable("currentPage")int currentPage, Model model)
    {
        List<ManufacturerData> paginationData = manufacturerFacade.PaginationDataByOrder(currentPage);
        model.addAttribute("resultByPages1",paginationData);
        return ControllerConstants.Views.Pages.PagingOrder.AllByPaginationOrder;
    }


  /*  @RequestMapping(value = "/add")
    public String createForm(@ModelAttribute("manu")ManufacturerForm manufacturerForm)
    {
        return ControllerConstants.Views.Pages.Manufacturer.NewManufacturer;
    }
*/

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveForm(@ModelAttribute("manu")ManufacturerForm manufacturerForm)
    {
       final ManufacturerModel model= manufacturerUtils.convertDataToModel(manufacturerForm);
        manufacturerNameValidateService.saveModel(model);
        return ControllerConstants.Views.Pages.Manufacturer.SaveManufacturer;
    }

    @RequestMapping(value = "/manuPage")
    public String ownCustomPage(Model model,ManufacturerForm manufacturerForm)
    {
       String page="customPage";
       try {
           model.addAttribute("manu",new ManufacturerForm());
           final ContentPageModel contentPageModel= getContentPageForLabelOrId(page);
           storeCmsPageInModel(model,contentPageModel);
           setUpMetaDataForContentPage(model,contentPageModel);

       }catch (CMSItemNotFoundException e)
       {
           e.printStackTrace();
       }
         return getViewForPage(model);
    }


 }
