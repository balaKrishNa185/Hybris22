package org.training.core.custom.service.Impl;

import org.training.core.custom.dao.StudentDao;
import org.training.core.custom.service.StudentService;
import org.training.core.model.StudentModel;

import java.util.List;

public class DefaultStudentService implements StudentService {

   private StudentDao studentDao;

    @Override
    public StudentModel getOneDataFromDao(int id) {
        return getStudentDao().getOneStudentById(id);
    }

    @Override
    public List<StudentModel> getAllFromDao() {
        return getStudentDao().getAllStudents();
    }


    @Override
    public List<StudentModel> getAllPagination(int page) {
        return getStudentDao().getALLByPagination(page);
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
