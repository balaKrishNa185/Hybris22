package org.training.facades.facade;


import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.custom.service.ManufacturerService;
import org.training.core.model.ManufacturerModel;
import org.training.facades.product.data.ManufacturerData;

import java.util.List;

public class DefaultManufacturerFacade implements ManufacturerFacade {

   private ManufacturerService manufacturerService;

    private Converter<ManufacturerModel,ManufacturerData> manufacturerDataConverter;

   @Override
    public List<ManufacturerData> convertModeLToData() {

      List<ManufacturerModel> model= getManufacturerService().getManufacturerFromDao();
      List<ManufacturerData> data=getManufacturerDataConverter().convertAll(model);
        return data;
    }

    @Override
    public ManufacturerData convertOneModeltoData(Integer id) {
        ManufacturerModel mm= getManufacturerService().getOneManufacturer(id);
        ManufacturerData md=getManufacturerDataConverter().convert(mm);
        return md;
    }


    @Override
    public List<ManufacturerData> PaginationData(int currentPage) {

     final List<ManufacturerModel> models=  getManufacturerService().getAllByPagination(currentPage);
     final List<ManufacturerData> data1=getManufacturerDataConverter().convertAll(models);
        return data1;
    }

    @Override
    public List<ManufacturerData> PaginationDataByOrder(int currentPage) {
        final List<ManufacturerModel> models1=  getManufacturerService().getAllByPaginationByOrder(currentPage);
        final List<ManufacturerData> data2=getManufacturerDataConverter().convertAll(models1);
        return data2;
    }

    public ManufacturerService getManufacturerService() {
        return manufacturerService;
    }

    public void setManufacturerService(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    public Converter<ManufacturerModel, ManufacturerData> getManufacturerDataConverter() {
        return manufacturerDataConverter;
    }

    public void setManufacturerDataConverter(Converter<ManufacturerModel, ManufacturerData> manufacturerDataConverter) {
        this.manufacturerDataConverter = manufacturerDataConverter;
    }
}
