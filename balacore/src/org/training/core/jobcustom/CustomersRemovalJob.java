package org.training.core.jobcustom;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.commons.collections.CollectionUtils;
import org.training.core.PracticeDAO.CustomersDao;
import org.training.core.model.CustomersModel;
import org.training.core.model.CustomersRemovalCronJobModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CustomersRemovalJob extends AbstractJobPerformable<CustomersRemovalCronJobModel> {

    private CustomersDao customersDao;
    private ModelService modelService;

    @Override
    public PerformResult perform(CustomersRemovalCronJobModel customersRemovalCronJobModel) {

        final int noOfDaysRemove =customersRemovalCronJobModel.getXDaysOld();

        final Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,-noOfDaysRemove);
        final Date oldDate = cal.getTime();

        List<CustomersModel> listTobeDeleted = new ArrayList<>();
         List<CustomersModel> allCustomers=   getCustomersDao().getAllCustomers(oldDate);

        for (final CustomersModel customersModel : allCustomers)
        {
            if (!CollectionUtils.isEmpty(allCustomers))
            {
                listTobeDeleted.add(customersModel);
            }
        }

        if (!CollectionUtils.isEmpty(listTobeDeleted))
        {
           getModelService().removeAll(allCustomers);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public CustomersDao getCustomersDao() {
        return customersDao;
    }

    public void setCustomersDao(CustomersDao customersDao) {
        this.customersDao = customersDao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
