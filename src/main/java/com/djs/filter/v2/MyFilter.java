package com.djs.filter.v2;

public interface MyFilter {
    void doFilter(MyRequst myRequst,MyResponse myResponse,FilterChain myFilter);
}
