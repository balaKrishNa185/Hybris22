package org.training.facades.facade;

import org.training.facades.product.data.StudentData;

import java.util.List;

public interface StudentFacade {

    StudentData getFromService(int id);

    List<StudentData> getaLLfROMsERVICE();

    List<StudentData> getaLLPagination(int page);
}
