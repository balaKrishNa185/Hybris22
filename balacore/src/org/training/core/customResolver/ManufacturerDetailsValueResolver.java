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
import java.util.Collection;


public class ManufacturerDetailsValueResolver extends AbstractValueResolver<ProductModel,Object, Object> {


    private static final Logger LOG= Logger.getLogger(ManufacturerDetailsValueResolver.class);


    @Override
    protected void addFieldValues(InputDocument inputDocument, IndexerBatchContext indexerBatchContext, IndexedProperty indexedProperty, ProductModel productModel, ValueResolverContext<Object, Object> valueResolverContext) throws FieldValueProviderException {

        LOG.info("ManufacturerDetailsValueResolver is called.......");

        final Collection<String> name=new ArrayList<>();
        final Collection<String> manufacturerName=collectManufacturerDetails(productModel,name);

     if(!manufacturerName.isEmpty())
    {
        inputDocument.addField(indexedProperty,manufacturerName,valueResolverContext.getFieldQualifier());
        LOG.info("ManufacturerDetails is added in document.......");
    }
    else {
        throw new FieldValueProviderException("No value resolved for indexed property " + indexedProperty.getName());
    }
    }

    private Collection<String> collectManufacturerDetails(ProductModel productModel,Collection<String> name) {

           if(productModel!=null) {
            final Collection<ManufacturerModel> productManufacturers = productModel.getManufacturers();
           if(productManufacturers!=null && !productManufacturers.isEmpty())
             {
                for (final ManufacturerModel manufacturer : productManufacturers) {
                    name.add(manufacturer.getName());
                }
            }
        }

        return name;
    }
}
