package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import org.training.core.model.ManuEntryModel;
import org.training.core.model.ManufacturerModel;

public class ManufacturerRemoveInterceptor implements RemoveInterceptor<ManufacturerModel> {


    @Override
    public void onRemove(ManufacturerModel manufacturerModel, InterceptorContext interceptorContext) throws InterceptorException {

        final ManuEntryModel model=interceptorContext.getModelService().create(ManuEntryModel.class);

        model.setIdEntry(manufacturerModel.getId());
        model.setNameEntry(manufacturerModel.getName());
        model.setStateEntry(manufacturerModel.getState());
        model.setCountryEntry(manufacturerModel.getCountry());

        interceptorContext.registerElementFor(model, PersistenceOperation.SAVE);
    }
}
