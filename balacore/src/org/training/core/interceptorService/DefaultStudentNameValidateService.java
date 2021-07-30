package org.training.core.interceptorService;

import com.google.common.collect.ImmutableSet;
import de.hybris.platform.servicelayer.interceptor.impl.InterceptorExecutionPolicy;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionExecutionBody;
import de.hybris.platform.servicelayer.session.SessionService;
import jersey.repackaged.com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.core.model.StudentModel;

import java.util.Map;

public class DefaultStudentNameValidateService implements StudentNameValidateService {


    private ModelService modelService;
    @Autowired
    private SessionService sessionService;
    @Override
    public void saveModel(StudentModel s) {
        final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_TYPES,
                ImmutableSet.of(InterceptorExecutionPolicy.InterceptorType.PREPARE,InterceptorExecutionPolicy.InterceptorType.VALIDATE));
        sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody() {
            @Override
            public void executeWithoutResult() {
                modelService.save(s);
            }
        });
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
