package org.training.core.interceptorService;

import com.google.common.collect.ImmutableSet;
import de.hybris.platform.servicelayer.interceptor.impl.InterceptorExecutionPolicy;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionExecutionBody;
import de.hybris.platform.servicelayer.session.SessionService;
import jersey.repackaged.com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.core.custom.service.StudentService;
import org.training.core.model.StudentModel;

import java.util.Map;

public class DefaultStudentRemoveInterceptorService implements StudentRemoveInterceptorService {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ModelService modelService;

    @Autowired
    private SessionService sessionService;

    @Override
    public void removingModel(int id) {
        final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_TYPES,
                ImmutableSet.of(InterceptorExecutionPolicy.InterceptorType.REMOVE));
        sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody() {
            @Override
            public void executeWithoutResult() {
                StudentModel model=  studentService.getOneDataFromDao(id);
                modelService.remove(model);
            }
        });
    }

    }

