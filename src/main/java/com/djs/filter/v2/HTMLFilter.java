package com.djs.filter.v2;

import com.djs.filter.v1.Filter;
import com.djs.filter.v1.Msg;

public class HTMLFilter implements MyFilter {

    @Override
    public void doFilter(MyRequst myRequst, MyResponse myResponse, FilterChain myFilter) {
        String myRequstStr = myRequst.getStr();
        myRequst.setStr(myRequstStr+" :myRequstStr:htmlFilter");

        myFilter.doFilter(myRequst,myResponse);

        String myResponseStr = myResponse.getStr();
        myResponse.setStr(myResponseStr+":myResponseStr:htmlFilter");
        System.out.println("***:myResponseStr:htmlFilter");

    }
}
