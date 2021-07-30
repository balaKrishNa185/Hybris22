package org.training.facades.facade;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.custom.service.StudentService;
import org.training.core.model.StudentModel;
import org.training.facades.product.data.StudentData;

import java.util.List;

public class DefaultStudentFacade implements StudentFacade {


    private StudentService studentService;
    private Converter<StudentModel,StudentData> studentDataConverter;

    @Override
    public StudentData getFromService(int id) {
       StudentModel model= getStudentService().getOneDataFromDao(id);
       StudentData data=getStudentDataConverter().convert(model);
        return data;
    }

    @Override
    public List<StudentData> getaLLfROMsERVICE() {
        List <StudentModel> model= getStudentService().getAllFromDao();
        List<StudentData> data=getStudentDataConverter().convertAll(model);
        return data;
    }


    @Override
    public List<StudentData> getaLLPagination(int page) {
        List <StudentModel> model= getStudentService().getAllPagination(page);
        List<StudentData> data=getStudentDataConverter().convertAll(model);
        return data;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Converter<StudentModel, StudentData> getStudentDataConverter() {
        return studentDataConverter;
    }

    public void setStudentDataConverter(Converter<StudentModel, StudentData> studentDataConverter) {
        this.studentDataConverter = studentDataConverter;
    }
}
