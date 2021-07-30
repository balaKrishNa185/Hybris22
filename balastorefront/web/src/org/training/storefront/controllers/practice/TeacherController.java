package org.training.storefront.controllers.practice;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.facades.practicefacade.TeacherFacade;
import org.training.facades.product.data.TeacherData;
import org.training.storefront.controllers.ControllerConstants;

import javax.annotation.Resource;


@Controller
@RequestMapping("/")
public class TeacherController {

    @Resource(name="defaultTeacherFacade")
    private TeacherFacade teacherFacade;

    @RequestMapping(value = "/tea/{id}")
    public String getOneId(@PathVariable("id")Integer id, Model model)
    {
        TeacherData s= teacherFacade.getIdByOne(id);
        model.addAttribute("manufacturerDetails",s);
        return ControllerConstants.Views.Pages.OneTeacher.oneStu;
    }

    @RequestMapping(value = "/teach/{id}")
    public String getOneIdByTwo(@PathVariable("id")Integer id, Model model)
    {
        TeacherData s= teacherFacade.getIdByTwo(id);
        model.addAttribute("one",s);
        return ControllerConstants.Views.Pages.OneTeacher.oneStu1;
    }

}
