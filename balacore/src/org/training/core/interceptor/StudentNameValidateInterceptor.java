package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.apache.commons.lang.StringUtils;
import org.training.core.model.StudentModel;

public class StudentNameValidateInterceptor implements ValidateInterceptor<StudentModel> {
    @Override
    public void onValidate(StudentModel studentModel, InterceptorContext interceptorContext) throws InterceptorException {


             String name = studentModel.getName();

        if (!StringUtils.isAlphanumeric(name)) {
            throw new InterceptorException("Name should be alphanumeric");
        }

    }


}