package com.djs.filter.v1;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    private List<Filter> filters=new ArrayList<>();

    @Override
    public void doFilter(Msg m) {
        for (Filter filter : filters) {

            filter.doFilter(m);
        }

    }

    public  void add(Filter f){

        filters.add(f);
    }
}
