package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.StudentModel;
import org.training.facades.product.data.StudentData;

public class StudentPopulator implements Populator<StudentModel, StudentData> {


    @Override
    public void populate(StudentModel source, StudentData target) throws ConversionException {
        target.setId(source.getId());
        target.setName(source.getName());
        target.setStandard(source.getStandard());
        target.setAddress(source.getAddress());
    }
}
