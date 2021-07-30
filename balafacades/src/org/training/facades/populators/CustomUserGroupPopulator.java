package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import org.apache.log4j.Logger;

public class CustomUserGroupPopulator implements Populator<SolrFacetSearchConfigModel, IndexConfig> {


    private static final Logger LOG=Logger.getLogger(CustomUserGroupPopulator.class);


    @Override
    public void populate(SolrFacetSearchConfigModel source, IndexConfig target) throws ConversionException {

        LOG.info("-----CustomUserGroupPopulator is called........................");

        target.setCustomUserGroup(source.getCustomUserGroup());


        LOG.info("-----CustomUserGroupPopulator userGroupValue is setted........................");
    }
}

