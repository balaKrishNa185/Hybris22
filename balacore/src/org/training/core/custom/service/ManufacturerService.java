package org.training.core.custom.service;

import org.training.core.model.ManufacturerModel;

import java.util.List;

public interface ManufacturerService  {


    List<ManufacturerModel> getManufacturerFromDao();

    ManufacturerModel getOneManufacturer(Integer id);


    List<ManufacturerModel> getAllByPagination(int currentPage);


    List<ManufacturerModel> getAllByPaginationByOrder(int currentPage);
}
