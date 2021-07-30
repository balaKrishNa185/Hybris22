package org.training.core.jobcustom;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;

import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;
import org.training.core.model.HelloWorldCronJobModel;

public class HelloWorldPerformable extends AbstractJobPerformable<HelloWorldCronJobModel> {

    private static final Logger LOG =Logger.getLogger(HelloWorldPerformable.class);


    @Override
    public PerformResult perform(HelloWorldCronJobModel helloWorldCronJobModel) {

        try {

            String name = helloWorldCronJobModel.getName();
            LOG.info("HelloWorldPerformable is called");
            LOG.info("Name:" + name);

            String place = helloWorldCronJobModel.getPlace();
            LOG.info("Place:" + place);

            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }
        catch (Exception e)
        {
            return new PerformResult(CronJobResult.ERROR,CronJobStatus.ABORTED);
        }
    }
}
