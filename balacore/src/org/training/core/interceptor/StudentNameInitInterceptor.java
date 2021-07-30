package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.core.model.StudentModel;

public class StudentNameInitInterceptor implements InitDefaultsInterceptor<StudentModel>
{

   @Autowired
    private ModelService modelService;

    @Override
    public void onInitDefaults(StudentModel studentModel, InterceptorContext interceptorContext) throws InterceptorException {

       StudentModel studentModel1= modelService.create(StudentModel.class);
       studentModel1.setName("ANONYMOUS");
    }
}
