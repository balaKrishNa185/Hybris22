package org.training.core.jobcustom;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.training.core.model.TestCronJobModel;
import org.apache.log4j.Logger;


public class TestJobPerformable extends AbstractJobPerformable<TestCronJobModel> {

   private static final Logger LOG =Logger.getLogger(TestJobPerformable.class);
    @Override
    public PerformResult perform(TestCronJobModel testCronJobModel) {

        try {
            String firstName = testCronJobModel.getFirstName();
            LOG.info("FirstTest" + firstName);

            String lastName = testCronJobModel.getLastName();
            LOG.info("LastTest" + lastName);

            LOG.info(" cronjob executed  & completed ");
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }
        catch (Exception e)
        {
            LOG.info("Problem during execution of cronjob & execution cancelled");
            return new PerformResult(CronJobResult.ERROR,CronJobStatus.ABORTED);
        }
    }
}
