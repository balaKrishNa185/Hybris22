package org.training.core.PracticeDAO;


import org.training.core.model.TeacherModel;

import java.util.List;

public interface TeacherDao {


    TeacherModel getById(Integer id);

    TeacherModel getByIdTwo(Integer id);

    List<TeacherModel> getAllTeachers();


    List<TeacherModel> getAllByPaginationByNormal();

    List<TeacherModel> getallByAscId();

    List<TeacherModel> getAllByDescId();

    List<TeacherModel> getAllByNameDesc();
}
