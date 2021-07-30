package org.training.core.PracticeService;

import org.training.core.model.TeacherModel;

public interface TeacherService {

    TeacherModel getIdFromDao(Integer id);

    TeacherModel getIdfromDaoTwo(Integer id);
}
