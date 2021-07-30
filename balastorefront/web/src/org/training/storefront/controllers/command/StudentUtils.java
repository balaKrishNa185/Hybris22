package org.training.storefront.controllers.command;

import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.training.core.model.StudentModel;

@Component("studentUtils")
public class StudentUtils {


    @Autowired
    private ModelService modelService;


    public StudentModel convertFormToModel(final StudentForm studentForm)
    {
        final StudentModel studentModel=modelService.create(StudentModel.class);

        studentModel.setId(studentForm.getId());
        studentModel.setName(studentForm.getName());
        studentModel.setStandard(studentForm.getStandard());
        studentModel.setAddress(studentForm.getAddress());

        return studentModel;
    }
}
