package org.training.core.custom.service.Impl;

import org.training.core.custom.dao.ManufacturerDao;
import org.training.core.custom.service.ManufacturerService;
import org.training.core.model.ManufacturerModel;

import java.util.List;

public class DefaultManufacturerService implements ManufacturerService {

   private ManufacturerDao manufacturerDao;

    @Override
    public List<ManufacturerModel> getManufacturerFromDao() {
        return getManufacturerDao().getManufacturerDetailsFromDB();
    }

    @Override
    public ManufacturerModel getOneManufacturer(Integer id) {
        return getManufacturerDao().getOneManufacturerDetailById(id);
    }


    @Override
    public List<ManufacturerModel> getAllByPagination(int currentPage) {
        return getManufacturerDao().getManufacturerDetailsByPagination(currentPage);
    }

    @Override
    public List<ManufacturerModel> getAllByPaginationByOrder(int currentPage) {
        return getManufacturerDao().getManufacturerDetailsByPaginationOrderBy(currentPage);
    }

    public ManufacturerDao getManufacturerDao() {
        return manufacturerDao;
    }

    public void setManufacturerDao(ManufacturerDao manufacturerDao) {
        this.manufacturerDao = manufacturerDao;
    }
}
