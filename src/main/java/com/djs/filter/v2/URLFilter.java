package com.djs.filter.v2;

import com.djs.filter.v1.Filter;
import com.djs.filter.v1.Msg;

public class URLFilter implements MyFilter {


    @Override
    public void doFilter(MyRequst myRequst, MyResponse myResponse, FilterChain myFilter) {
        String myRequstStr = myRequst.getStr();
        myRequst.setStr(myRequstStr+" :myRequstStr:URLFilter");

        System.out.println("***:myRequstStr:URLFilter");

        myFilter.doFilter(myRequst,myResponse);

        String myResponseStr = myResponse.getStr();
        myResponse.setStr(myResponseStr+":myResponseStr:URLFilter");

        System.out.println("***:myResponseStr:URLFilter");
    }
}
