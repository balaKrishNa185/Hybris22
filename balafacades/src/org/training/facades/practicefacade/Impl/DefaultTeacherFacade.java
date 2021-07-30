package org.training.facades.practicefacade.Impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.PracticeService.TeacherService;
import org.training.core.model.TeacherModel;
import org.training.facades.practicefacade.TeacherFacade;
import org.training.facades.product.data.TeacherData;

public class DefaultTeacherFacade implements TeacherFacade {

    private TeacherService teacherService;
    private Converter<TeacherModel, TeacherData> teacherDataConverter;


    @Override
    public TeacherData getIdByOne(Integer id) {

     final TeacherModel model=getTeacherService().getIdFromDao(id);
     final TeacherData data= getTeacherDataConverter().convert(model);
        return data;
    }

    @Override
    public TeacherData getIdByTwo(Integer id) {

        final TeacherModel model=getTeacherService().getIdfromDaoTwo(id);
        final TeacherData data1= getTeacherDataConverter().convert(model);
        return data1;
    }

    public TeacherService getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public Converter<TeacherModel, TeacherData> getTeacherDataConverter() {
        return teacherDataConverter;
    }

    public void setTeacherDataConverter(Converter<TeacherModel, TeacherData> teacherDataConverter) {
        this.teacherDataConverter = teacherDataConverter;
    }
}
