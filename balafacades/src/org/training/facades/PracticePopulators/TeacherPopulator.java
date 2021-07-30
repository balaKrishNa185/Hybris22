package org.training.facades.PracticePopulators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.TeacherModel;
import org.training.facades.product.data.TeacherData;

public class TeacherPopulator implements Populator<TeacherModel, TeacherData>
{


    @Override
    public void populate(TeacherModel source, TeacherData data) throws ConversionException {
      data.setId(source.getId());
      data.setName(source.getName());
      data.setDegree(source.getDegree());
      data.setPhone(source.getPhone());
    }


}
