package org.training.core.PracticeDAO.Impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchService;
import org.training.core.PracticeDAO.TeacherDao;
import org.training.core.model.TeacherModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultTeacherDao implements TeacherDao
{
    private FlexibleSearchService flexibleSearchService;
    private PaginatedFlexibleSearchService paginatedFlexibleSearchService;


    @Override
    public TeacherModel getById(Integer id) {
        String query="SELECT {"+TeacherModel.PK+"} FROM {"+TeacherModel._TYPECODE+"} WHERE {"+TeacherModel.ID+"}=?id";

        Map<String,Object> param=new HashMap<>();
        param.put("id",id);

        FlexibleSearchQuery fsk=new FlexibleSearchQuery(query,param);

       SearchResult<TeacherModel> searchResult= getFlexibleSearchService().search(fsk);
        return searchResult.getResult().get(0);
    }

    @Override
    public TeacherModel getByIdTwo(Integer id) {

      /*  StringBuilder sb=new StringBuilder();
        sb.append("SELECT {"+TeacherModel.PK+"}");
        sb.append("FROM {"+TeacherModel._TYPECODE+"}");
        sb.append("WHERE {"+TeacherModel.ID+"}=?id");
       */

        String query="SELECT {"+TeacherModel.PK+"} FROM {"+TeacherModel._TYPECODE+"} WHERE {"+TeacherModel.ID+"}=?id";

        Map<String,Object> param=new HashMap<>();
        param.put("id",id);

        /*FlexibleSearchQuery fsk=new FlexibleSearchQuery(query,param);*/

        SearchResult<TeacherModel> searchResult=getFlexibleSearchService().search(query,param);
        return searchResult.getResult().get(0);
    }

    @Override
    public List<TeacherModel> getAllTeachers() {
        return null;
    }

    @Override
    public List<TeacherModel> getAllByPaginationByNormal() {
        return null;
    }

    @Override
    public List<TeacherModel> getallByAscId() {
        return null;
    }

    @Override
    public List<TeacherModel> getAllByDescId() {
        return null;
    }

    @Override
    public List<TeacherModel> getAllByNameDesc() {
        return null;
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
