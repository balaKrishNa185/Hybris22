package org.training.core.PracticeDAO.Impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.PracticeDAO.CustomersDao;
import org.training.core.model.CustomersModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultCustomersDao implements CustomersDao {

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomersModel> getAllCustomers(Date oldDate) {


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        String strDate= formatter.format(oldDate);

        StringBuilder sb=new StringBuilder();
        sb.append("SELECT {"+CustomersModel.PK+"}");
        sb.append("FROM {"+CustomersModel._TYPECODE+"}");
        sb.append("WHERE {"+CustomersModel.CUSTOMERCREATED+"}");
        sb.append("<=?strDate");


        FlexibleSearchQuery fsk=new FlexibleSearchQuery(sb);
        fsk.addQueryParameter("strDate", strDate);

        SearchResult<CustomersModel> customersModelSearchResult= getFlexibleSearchService().search(fsk);
        return customersModelSearchResult.getResult();
    }


    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
