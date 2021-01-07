package com.djs.filter.v2;

import com.djs.filter.v1.Filter;
import com.djs.filter.v1.Msg;

public class SensitiveFilter implements MyFilter {



    @Override
    public void doFilter(MyRequst myRequst, MyResponse myResponse, FilterChain myFilter) {
        String myRequstStr = myRequst.getStr();
        myRequst.setStr(myRequstStr+" :myRequstStr:SensitiveFilter");

        System.out.println("***:myRequstStr:SensitiveFilter");

        myFilter.doFilter(myRequst,myResponse);

        String myResponseStr = myResponse.getStr();
        myResponse.setStr(myResponseStr+":myResponseStr:SensitiveFilter");

        System.out.println("***:myResponseStr:SensitiveFilter");
    }
}
