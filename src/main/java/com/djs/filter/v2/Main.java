package com.djs.filter.v2;

import com.djs.filter.v1.*;

public class Main {

    public static void main(String[] args) {

      MyRequst myRequst=new MyRequst();
      myRequst.setStr("请求");

      MyResponse myResponse=new MyResponse();
      myResponse.setStr("相应");

        FilterChain filterChain=new FilterChain();

        MyFilter filter1=new HTMLFilter();
        MyFilter filter2=new SensitiveFilter();
        MyFilter filter3=new URLFilter();


        filterChain.add(filter1);
        filterChain.add(filter2);
        filterChain.add(filter3);

        filterChain.doFilter(myRequst,myResponse);

        System.out.println("&&&&&&&&&&&&");
        System.out.println(myRequst.getStr());
        System.out.println(myResponse.getStr());






    }
}
