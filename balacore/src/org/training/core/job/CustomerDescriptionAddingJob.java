package org.training.core.job;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.log4j.Logger;
import org.training.core.model.CustomerDescriptionCronJobModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerDescriptionAddingJob extends AbstractJobPerformable<CustomerDescriptionCronJobModel>
{

    private static final Logger LOG=Logger.getLogger(CustomerDescriptionAddingJob.class);

    private FlexibleSearchService flexibleSearchService;
    private ModelService modelService;

    @Override
    public PerformResult perform(CustomerDescriptionCronJobModel customerDescriptionCronJobModel) {

        LOG.info("CustomerDescriptionAddingJob is called");
        String value = customerDescriptionCronJobModel.getNullOrNotNull();
        List<CustomerModel> customerModels =  getEmptyDescriptionRecords(value);
        for(CustomerModel oneCustomer:customerModels) {
            if (oneCustomer != null) {
                oneCustomer.setDescription("Description value given by bala");
                getModelService().save(oneCustomer);
                LOG.info("description value is saved");
            }
        }
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }


    private List<CustomerModel> getEmptyDescriptionRecords(String value) {

    /*    StringBuilder sb=new StringBuilder();
        sb.append("SELECT{"+CustomerModel.PK+"}");
        sb.append("FROM{"+CustomerModel._TYPECODE+"}");
        sb.append("WHERE{"+CustomerModel.DESCRIPTION+"}?value");
        sb.append("ORDER BY{"+CustomerModel.CREATIONTIME+"} DESC LIMIT 1 ");*/

       String query="select {"+CustomerModel.PK+"}from{"+CustomerModel._TYPECODE+"}where{"+CustomerModel.DESCRIPTION+"}=?value order by {"+CustomerModel.CREATIONTIME+"} DESC";
        Map<String,Object> params=new HashMap<>();
        params.put("value",value);
         FlexibleSearchQuery fsk1=new FlexibleSearchQuery(query,params);
        // fsk.addQueryParameter("value",value);

         SearchResult<CustomerModel> customerModel= getFlexibleSearchService().search(fsk1);
         LOG.info("fsk executed in service");
          return customerModel.getResult();

    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    @Override
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
