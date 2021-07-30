package org.training.core.custom.dao;


import org.training.core.model.StudentModel;

import java.util.List;


public interface StudentDao {


    StudentModel getOneStudentById(int id);

    List<StudentModel> getAllStudents();

    List<StudentModel> getALLByPagination(int page);


}
