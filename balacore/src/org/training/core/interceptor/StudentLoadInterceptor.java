package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import org.training.core.model.StudentModel;

public class StudentLoadInterceptor implements LoadInterceptor<StudentModel> {


    @Override
    public void onLoad(StudentModel studentModel, InterceptorContext interceptorContext) throws InterceptorException {

        String name=studentModel.getName();
        String modifiedName="Mr."+name;
        studentModel.setName(modifiedName);

        String standard= studentModel.getStandard();
       String modifiedStandard ="PG"+standard;
       studentModel.setStandard(modifiedStandard);
    }
}
