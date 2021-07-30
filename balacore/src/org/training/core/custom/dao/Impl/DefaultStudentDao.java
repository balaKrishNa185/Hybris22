package org.training.core.custom.dao.Impl;


import de.hybris.platform.core.servicelayer.data.PaginationData;
import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchService;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import org.training.core.custom.dao.StudentDao;
import org.training.core.model.StudentModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultStudentDao implements StudentDao {

   private FlexibleSearchService flexibleSearchService;

   private PaginatedFlexibleSearchService paginatedFlexibleSearchService;

    @Override
    public StudentModel getOneStudentById(int id) {


        /*StringBuilder sb=new StringBuilder();
        sb.append("SELECT * {").append(StudentModel.PK);
        sb.append("FROM {").append(StudentModel._TYPECODE);
        sb.append("WHERE "+StudentModel.ID+"}");
        sb.append("=?id");*/

        String s="SELECT {"+StudentModel.PK+"} FROM {"+StudentModel._TYPECODE+"} WHERE {"+StudentModel.ID+"}=?id";


        Map<String,Object> param=new HashMap<>();
        param.put("id",id);

        FlexibleSearchQuery query=new FlexibleSearchQuery(s,param);


        SearchResult<StudentModel>sr=getFlexibleSearchService().search(query);
        return sr.getResult().get(0);
    }


    @Override
    public List<StudentModel> getAllStudents() {
        String query = "SELECT {" + StudentModel.PK + "} FROM {"+ StudentModel._TYPECODE + "}";
        final FlexibleSearchQuery fsk = new FlexibleSearchQuery(query);
        SearchResult<StudentModel> sr= getFlexibleSearchService().search(fsk);
         return sr.getResult();
    }


    @Override
    public List<StudentModel> getALLByPagination(int page) {

        int range=10;
        boolean needTotal=true;

        String query="SELECT {"+StudentModel.PK+"} FROM {"+StudentModel._TYPECODE+"} ORDER BY {"+StudentModel.ID+"}";

        FlexibleSearchQuery fsk=new FlexibleSearchQuery(query);

        SearchPageData searchPageData=PaginatedSearchUtils.createSearchPageDataWithPagination(range,page,needTotal);

        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setFlexibleSearchQuery(fsk);
        parameter.setSearchPageData(searchPageData);

       SearchPageData<StudentModel> searchPageData1= getPaginatedFlexibleSearchService().search(parameter);
       return searchPageData1.getResults();

    }




    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public PaginatedFlexibleSearchService getPaginatedFlexibleSearchService() {
        return paginatedFlexibleSearchService;
    }

    public void setPaginatedFlexibleSearchService(PaginatedFlexibleSearchService paginatedFlexibleSearchService) {
        this.paginatedFlexibleSearchService = paginatedFlexibleSearchService;
    }
}
