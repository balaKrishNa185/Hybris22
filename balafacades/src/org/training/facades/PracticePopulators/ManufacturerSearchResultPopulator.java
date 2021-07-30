package org.training.facades.PracticePopulators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import org.apache.log4j.Logger;
import org.training.core.model.ManufacturerModel;
import org.training.facades.product.data.ManufacturerData;

import java.util.List;

public class ManufacturerSearchResultPopulator extends SearchResultProductPopulator implements Populator<SearchResultValueData, ProductData>
{

    private Logger Log= Logger.getLogger("ManufacturerSearchResultPopulator.Class");
    @Override
    public void populate(SearchResultValueData source, ProductData target) {
        super.populate(source, target);
       Log.info("ManufacturerSearchResultPopulator is caled");
        target.setManufacturerDetails(this.<List<ManufacturerData>>getValue(source,"ManufacturerDetails"));
    }
}
