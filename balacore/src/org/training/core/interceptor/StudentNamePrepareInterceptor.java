package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import org.training.core.model.StudentModel;

public class StudentNamePrepareInterceptor implements PrepareInterceptor<StudentModel> {


    @Override
    public void onPrepare(StudentModel studentModel, InterceptorContext interceptorContext) throws InterceptorException {
       String name= studentModel.getName();

       String newName="KSR"+name;

       studentModel.setName(newName);
    }
}
