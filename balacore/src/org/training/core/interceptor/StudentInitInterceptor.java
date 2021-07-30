package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import org.training.core.model.StudentModel;

public class StudentInitInterceptor implements InitDefaultsInterceptor<StudentModel>
{
    @Override
    public void onInitDefaults(StudentModel studentModel, InterceptorContext interceptorContext) throws InterceptorException {

    }
}
