package org.training.core.job;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobHistoryModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;
import org.training.core.PracticeDAO.CustomerCronDao;
import org.training.core.model.NewCustomerCronJobModel;

import java.util.Date;
import java.util.List;

public class IsNewCustomerJob extends AbstractJobPerformable<NewCustomerCronJobModel> {


    private final static Logger LOG=Logger.getLogger(IsNewCustomerJob.class);
    private CustomerCronDao customerCronDao;
    private ModelService modelService;


    @Override
    public PerformResult perform(NewCustomerCronJobModel newCustomerCronJobModel) {
      int days= newCustomerCronJobModel.getDays();
      if(days!=0)
      {
          List<CronJobHistoryModel> models = newCustomerCronJobModel.getCronJobHistoryEntries();
          Date endOfLastCronjob = models.get(0).getEndTime();
          LOG.info("last endTimeOfCronjob=="+endOfLastCronjob);
          if (endOfLastCronjob == null) {
              List<CustomerModel> customerModels = getCustomerCronDao().getAllCustomers(days);
              {
                  LOG.info("NEW CRON JOB ENTRIES");
                  setIsNewCustomer(customerModels);
              }
          }
      }
      else
          {
         CronJobHistoryModel models=newCustomerCronJobModel.getCronJobHistoryEntries().get(0);
          Date date= models.getEndTime();
          List<CustomerModel> customerModels1=getCustomerCronDao().getOnlyNewCustomer(date);
              setIsNewCustomer(customerModels1);

      }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    private void setIsNewCustomer(List<CustomerModel> customerModels) {

        for(CustomerModel customerModel:customerModels) {
            if (customerModel != null) {
                customerModel.setIsNew(true);
                getModelService().save(customerModel);
                LOG.info("BOOLEAN VALUE SAVED");
            }
        }
    }


    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public CustomerCronDao getCustomerCronDao() {
        return customerCronDao;
    }

    public void setCustomerCronDao(CustomerCronDao customerCronDao) {
        this.customerCronDao = customerCronDao;
    }
}
