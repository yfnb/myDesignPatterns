package com.djs.filter.v1;

public class URLFilter implements Filter {
    @Override
    public void doFilter(Msg m) {
        String r=m.getName();
        m.setName(r+"****");
    }
}
