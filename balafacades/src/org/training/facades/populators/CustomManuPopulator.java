package org.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.model.ManufacturerModel;
import org.training.facades.product.data.ManufacturerData;

public class CustomManuPopulator implements Populator<ProductModel, ProductData> {


    private Converter<ManufacturerModel, ManufacturerData> manufacturerDataConverter;

    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
        target.setManufacturerDetails(getManufacturerDataConverter().convertAll(source.getManufacturers()));

    }

    public Converter<ManufacturerModel, ManufacturerData> getManufacturerDataConverter() {
        return manufacturerDataConverter;
    }

    public void setManufacturerDataConverter(Converter<ManufacturerModel, ManufacturerData> manufacturerDataConverter) {
        this.manufacturerDataConverter = manufacturerDataConverter;
    }
}
