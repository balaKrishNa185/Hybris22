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
import org.training.core.interceptorService.DefaultStudentNameValidateService;
import org.training.core.interceptorService.DefaultStudentRemoveInterceptorService;
import org.training.core.model.ManufacturerModel;
import org.training.core.model.StudentModel;
import org.training.facades.facade.StudentFacade;
import org.training.facades.product.data.ManufacturerData;
import org.training.facades.product.data.StudentData;
import org.training.storefront.controllers.ControllerConstants;
import org.training.storefront.controllers.command.ManufacturerForm;
import org.training.storefront.controllers.command.StudentForm;
import org.training.storefront.controllers.command.StudentUtils;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController extends AbstractPageController {

    @Autowired
    private StudentFacade studentFacade;

    @Resource(name="studentUtils")
    private StudentUtils studentUtils;

    @Resource(name="defaultStudentNameValidateService")
    private DefaultStudentNameValidateService defaultStudentNameValidateService;

    @Resource(name = "defaultStudentRemoveInterceptorService")
    private DefaultStudentRemoveInterceptorService defaultStudentRemoveInterceptorService;

    @RequestMapping(value = "/one/{id}")
    public String getOne(@PathVariable("id")int id, Model model)
    {
       StudentData s= studentFacade.getFromService(id);
       model.addAttribute("one",s);
       return ControllerConstants.Views.Pages.OneStudent.ONE;
    }


    @RequestMapping(value = "/all")
    public String getData( Model model)
    {
        List<StudentData> data=studentFacade.getaLLfROMsERVICE();
        model.addAttribute("datas",data);
        return ControllerConstants.Views.Pages.AllStudent.ALL;
    }


    @RequestMapping(value = "/res/{page}")
    public String getPagination(@PathVariable("page")int page, Model model)
    {
        List<StudentData> data1=studentFacade.getaLLPagination(page);
        model.addAttribute("data",data1);
        return ControllerConstants.Views.Pages.AllStudentPagination.ALLPAGE;
    }




/*
    @RequestMapping(value = "/addStudent")
    public String createForm(@ModelAttribute("stu") StudentForm studentForm)
    {
        return ControllerConstants.Views.Pages.AllStudent.NewStudent;
    }
*/

/*

    @RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
    public String saveForm(@ModelAttribute("stu")StudentForm studentForm)
    {
        final StudentModel model= studentUtils.convertFormToModel(studentForm);
        defaultStudentNameValidateService.saveModel(model);
        return ControllerConstants.Views.Pages.AllStudent.savedStudent;
    }
*/


    @RequestMapping(value = "/rem/{id}")
    public String removing(@PathVariable("id")int id,Model model)
    {
        defaultStudentRemoveInterceptorService.removingModel(id);
        return ControllerConstants.Views.Pages.AllStudent.REM;
    }

    @RequestMapping("/studentcms")
    public String getPage(Model model)
    {
        String page="studentPage";
        try {
            model.addAttribute("stu",new StudentForm());
            final ContentPageModel contentPageModel= getContentPageForLabelOrId(page);
            storeCmsPageInModel(model,contentPageModel);
            setUpMetaDataForContentPage(model,contentPageModel);
        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }
    @RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
    public String getSavePage(@ModelAttribute("stu")StudentForm studentForm,Model model)
    {
        String id="studentsavepage";
        try {
            model.addAttribute("save","saved");
            final StudentModel studentModel= studentUtils.convertFormToModel(studentForm);
            defaultStudentNameValidateService.saveModel(studentModel);
            final ContentPageModel contentPageModel= getContentPageForLabelOrId(id);
            storeCmsPageInModel(model,contentPageModel);
            setUpMetaDataForContentPage(model,contentPageModel);
        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }


 }
