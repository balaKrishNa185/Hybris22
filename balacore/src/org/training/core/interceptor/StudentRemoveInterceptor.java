package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import org.training.core.model.StuEntryModel;
import org.training.core.model.StudentModel;

public class StudentRemoveInterceptor implements RemoveInterceptor<StudentModel> {

    @Override
    public void onRemove(StudentModel studentModel, InterceptorContext interceptorContext) throws InterceptorException {

        final StuEntryModel model=interceptorContext.getModelService().create(StuEntryModel.class);

        model.setId(studentModel.getId());
        model.setName(studentModel.getName());
        model.setStandard(studentModel.getStandard());
        model.setAddress(studentModel.getAddress());//no need to add all values

        interceptorContext.registerElementFor(model, PersistenceOperation.SAVE);
    }
}
