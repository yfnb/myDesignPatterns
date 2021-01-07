package com.djs.filter.v1;

public class SensitiveFilter implements Filter {


    @Override
    public void doFilter(Msg m) {
        String msg = m.getMsg();
        msg = msg.replaceAll("996", "995");
        m.setMsg(msg);
    }
}
