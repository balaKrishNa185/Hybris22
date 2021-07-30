package org.training.core.PracticeService.Impl;

import org.training.core.PracticeDAO.TeacherDao;
import org.training.core.PracticeService.TeacherService;
import org.training.core.model.TeacherModel;

public class DefaultTeacherService implements TeacherService {

   private TeacherDao teacherDao;

    @Override
    public TeacherModel getIdFromDao(Integer id) {
        return getTeacherDao().getById(id);
    }

    @Override
    public TeacherModel getIdfromDaoTwo(Integer id) {
        return getTeacherDao().getByIdTwo(id);
    }

    public TeacherDao getTeacherDao() {
        return teacherDao;
    }

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }
}
