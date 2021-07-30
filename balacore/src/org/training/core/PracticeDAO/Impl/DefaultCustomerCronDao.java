package org.training.core.PracticeDAO.Impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.PracticeDAO.CustomerCronDao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class DefaultCustomerCronDao implements CustomerCronDao {

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomerModel> getAllCustomers(int days) {

        LocalDate ldate=LocalDate.now().minusDays(days);
        String date=ldate.toString();

        StringBuilder sb=new StringBuilder();
        sb.append("select {").append(CustomerModel.PK).append("}");
        sb.append("from {").append(CustomerModel._TYPECODE).append("}");
        sb.append("where {").append(CustomerModel.CREATIONTIME).append("}");
        sb.append(">=?date");

        FlexibleSearchQuery fsk=new FlexibleSearchQuery(sb);
        fsk.addQueryParameter("date",date);

       SearchResult<CustomerModel> searchResult= getFlexibleSearchService().search(fsk);
        return searchResult.getResult();
    }

    @Override
    public List<CustomerModel> getOnlyNewCustomer(Date date) {

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date1=simpleDateFormat.format(date);

        StringBuilder sb=new StringBuilder();
        sb.append("select {").append(CustomerModel.PK).append("}");
        sb.append("from {").append(CustomerModel._TYPECODE).append("}");
        sb.append("where {").append(CustomerModel.CREATIONTIME).append("}");
        sb.append(">=?date1");

        FlexibleSearchQuery fsk=new FlexibleSearchQuery(sb);
        fsk.addQueryParameter("date1",date1);

        SearchResult<CustomerModel> searchResult= getFlexibleSearchService().search(fsk);
        return searchResult.getResult();

    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
