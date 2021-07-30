package org.training.facades.populators;

import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.model.ManufacturerModel;
import org.training.facades.product.data.ManufacturerData;

public class ManufacturerPopulator implements Populator<ManufacturerModel, ManufacturerData> {

   private Converter<CountryModel, CountryData> countryDataConverter;


    @Override
    public void populate(ManufacturerModel source, ManufacturerData target) throws ConversionException {
        target.setId(source.getId());
        target.setName(source.getName());
        target.setState(source.getState());
        target.setCountry(getCountryDataConverter().convert(source.getCountry()));
    }

    public Converter<CountryModel, CountryData> getCountryDataConverter() {
        return countryDataConverter;
    }

    public void setCountryDataConverter(Converter<CountryModel, CountryData> countryDataConverter) {
        this.countryDataConverter = countryDataConverter;
    }
}
