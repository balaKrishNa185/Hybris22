package org.training.core.customResolver;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;
import org.apache.log4j.Logger;
import org.training.core.model.ManufacturerModel;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerValueResolver extends AbstractValueResolver<ProductModel,String, String> {

    private static final Logger LOG= Logger.getLogger(ManufacturerValueResolver.class);

    @Override
    protected void addFieldValues(InputDocument inputDocument, IndexerBatchContext indexerBatchContext, IndexedProperty indexedProperty, ProductModel productModel, ValueResolverContext<String, String> valueResolverContext) throws FieldValueProviderException {

        LOG.info("ManufacturerDetailsValueResolver is called.......");
        List<String> name = new ArrayList<>();
        List<String> manufacturersName=CollectManufacturerName(productModel,name);
        if(manufacturersName!=null)
        {
            inputDocument.addField(indexedProperty,manufacturersName,valueResolverContext.getFieldQualifier());
            LOG.info("ManufacturerDetails is added in document.......");
        }
        else {
            throw new FieldValueProviderException("No value resolved for indexed property " + indexedProperty.getName());
        }
    }

    private List<String> CollectManufacturerName(ProductModel productModel, List<String> name) {

        List<ManufacturerModel> manufacturerModels = productModel.getManufacturers();
        if (manufacturerModels != null) {
            for (ManufacturerModel names : manufacturerModels) {
               name.add(names.getName());
            }
        }
        return name;
    }
}
