package org.training.core.custom.service;


import org.training.core.model.StudentModel;

import java.util.List;

public interface StudentService {

    StudentModel getOneDataFromDao(int id);

    List<StudentModel> getAllFromDao();


    List<StudentModel> getAllPagination(int page);
}
