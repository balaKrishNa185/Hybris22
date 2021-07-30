package org.training.core.custom.dao.Impl;
import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.constants.SearchConstants;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import de.hybris.platform.servicelayer.search.paginated.impl.DefaultPaginatedFlexibleSearchService;


import org.training.core.custom.dao.ManufacturerDao;
import org.training.core.model.ManufacturerModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class DefaultManufacturerDao implements ManufacturerDao {


    private FlexibleSearchService flexibleSearchService;

    private DefaultPaginatedFlexibleSearchService paginatedFlexibleSearchService;



    @Override
    public List<ManufacturerModel> getManufacturerDetailsFromDB() {


        LocalDate date=LocalDate.now().minusDays(5);

        String query="SELECT {" + ManufacturerModel.PK + "} FROM {" + ManufacturerModel._TYPECODE + "} WHERE {"+ManufacturerModel.CREATIONTIME+"}>=?date";
       FlexibleSearchQuery fsk=new FlexibleSearchQuery(query);
       fsk.addQueryParameter("date",date);


        SearchResult<ManufacturerModel> result = getFlexibleSearchService().search(fsk);
        return result.getResult();
    }

    @Override
    public ManufacturerModel getOneManufacturerDetailById(Integer id) {

      /*  StringBuilder sbQuery= new StringBuilder();
        sbQuery.append("SELECT {"+ManufacturerModel.PK+"}");
        sbQuery.append("From {"+ManufacturerModel._TYPECODE+"}");
        sbQuery.append("WHERE {"+ManufacturerModel.ID+"}");
        sbQuery.append("=?id");

       // final Map<String,Object> mapParam= Collections.singletonMap(ManufacturerModel.ID,id);

        final FlexibleSearchQuery fq=new FlexibleSearchQuery(sbQuery.toString(),Collections.singletonMap(ManufacturerModel.ID,id));
        //fq.addQueryParameters(mapParam);
*/

        String query = "SELECT {PK} FROM {Manufacturer} WHERE {id}=?id";

        Map<String, Object> param = new HashMap<>();
        param.put("id", id);

        SearchResult<ManufacturerModel> sr = getFlexibleSearchService().search(query, param);
        return sr.getResult().get(0);
    }


    @Override
    public List<ManufacturerModel> getManufacturerDetailsByPagination(int currentPage) {

       /*  final int pageSize =5;
         final boolean needsTotal = true;

        String query = "SELECT {" + ManufacturerModel.PK + "} FROM {" + ManufacturerModel._TYPECODE + "}";

        FlexibleSearchQuery fsk=new FlexibleSearchQuery(query);

        final Map<String, String> sortMap = new LinkedHashMap<>();
        sortMap.put(ManufacturerModel.ID,SearchConstants.DESCENDING);

        final SearchPageData searchPageData = PaginatedSearchUtils.createSearchPageDataWithPaginationAndSorting(pageSize, currentPage, needsTotal,sortMap);

        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setSearchPageData(searchPageData);
        parameter.setFlexibleSearchQuery(fsk);


        final SearchPageData<ManufacturerModel> searchResult = getPaginatedFlexibleSearchService().search(parameter);
        return searchResult.getResults();*/
        final int pageSize = 10;
        final boolean needsTotal = true;
        String query = "SELECT {" + ManufacturerModel.PK + "} FROM {" + ManufacturerModel._TYPECODE + "}";

        FlexibleSearchQuery fsk=new FlexibleSearchQuery(query);


        final Map<String, String> sortMap = new LinkedHashMap<>();
        sortMap.put(ManufacturerModel.ID, SearchConstants.ASCENDING);

        final SearchPageData searchPageData = PaginatedSearchUtils.createSearchPageDataWithPaginationAndSorting(pageSize,currentPage,needsTotal,sortMap);

        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setSearchPageData(searchPageData);
        parameter.setFlexibleSearchQuery(fsk);


        //when


        final SearchPageData<ManufacturerModel> searchResult = paginatedFlexibleSearchService.search(parameter);
        return searchResult.getResults();


        /*//then
        assertPaginationResults(0, 6, 1, pageSize, 0, 0, Boolean.FALSE, Boolean.FALSE, searchResult);*/


        /*final SearchPageData<ProductInterestRelationData> pagedResult = new SearchPageData<>();
        pagedResult.setPagination(paginationDataOutput);
        pagedResult.setResults(pagedList);
        pagedResult.setSorts(searchPageData.getSorts());
        return pagedResult;*/
    }

    @Override
    public List<ManufacturerModel> getManufacturerDetailsByPaginationOrderBy(int currentPage) {

        int pageSize=5;
        boolean needTotal=true;
        String query="SELECT  {"+ManufacturerModel.PK+"} FROM {"+ManufacturerModel._TYPECODE+"} ORDER BY {"+ManufacturerModel.ID+"} DESC";
        FlexibleSearchQuery fsk =new FlexibleSearchQuery(query);

      SearchPageData searchPageData=  PaginatedSearchUtils.createSearchPageDataWithPagination(pageSize,currentPage,needTotal);

      PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
      parameter.setSearchPageData(searchPageData);
      parameter.setFlexibleSearchQuery(fsk);

      SearchPageData<ManufacturerModel>searchPageData1=getPaginatedFlexibleSearchService().search(parameter);
        return searchPageData1.getResults();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public DefaultPaginatedFlexibleSearchService getPaginatedFlexibleSearchService() {
        return paginatedFlexibleSearchService;
    }

    public void setPaginatedFlexibleSearchService(DefaultPaginatedFlexibleSearchService paginatedFlexibleSearchService) {
        this.paginatedFlexibleSearchService = paginatedFlexibleSearchService;
    }
}
