package com.djs.filter.v2;

import com.djs.filter.v1.Filter;


import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<MyFilter> filters=new ArrayList<>();

    int index=0;


    public void doFilter(MyRequst myRequst, MyResponse myResponse) {

        if(index==filters.size()){
            return;
        }
        MyFilter filter = filters.get(index);

        index++;

        filter.doFilter(myRequst,myResponse,this);
    }

    public void add(MyFilter myFilter){
        filters.add(myFilter);
    }
}
