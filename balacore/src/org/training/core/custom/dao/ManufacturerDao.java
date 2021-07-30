package org.training.core.custom.dao;

import org.training.core.model.ManufacturerModel;

import java.util.List;

public interface ManufacturerDao {


    List<ManufacturerModel> getManufacturerDetailsFromDB();


    ManufacturerModel getOneManufacturerDetailById(Integer id);


    List<ManufacturerModel> getManufacturerDetailsByPagination(int currentPage);


    List<ManufacturerModel> getManufacturerDetailsByPaginationOrderBy(int currentPage);
}
