package org.training.facades.facade;

import org.training.facades.product.data.ManufacturerData;

import java.util.List;

public interface ManufacturerFacade {

    List<ManufacturerData> convertModeLToData();

    ManufacturerData convertOneModeltoData(Integer id);

    List<ManufacturerData> PaginationData(int currentPage);

    List<ManufacturerData> PaginationDataByOrder(int currentPage);
}
