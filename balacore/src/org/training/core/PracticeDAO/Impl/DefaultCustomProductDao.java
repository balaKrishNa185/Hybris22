package org.training.core.PracticeDAO.Impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.PracticeDAO.CustomProductDao;

import java.util.List;

public class DefaultCustomProductDao extends DefaultProductDao implements CustomProductDao {


    public DefaultCustomProductDao(String typecode) {
        super(typecode);
    }

    @Override
    public List<ProductModel> getAllProducts(int noofLatest) {
        
        int count=noofLatest;
        String query="SELECT {"+ProductModel.PK+"} FROM {"+ProductModel._TYPECODE+"}";

        FlexibleSearchQuery fsk=new FlexibleSearchQuery(query);
        fsk.setNeedTotal(true);
        fsk.setCount(count);
        fsk.setStart(0);

        SearchResult<ProductModel> searchResult=getFlexibleSearchService().search(fsk);
        return searchResult.getResult();
    }
}
