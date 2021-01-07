package com.djs.filter.v1;
public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Msg m) {
        String msg = m.getMsg();
        msg=msg.replace("<","[");
        msg=msg.replace(">","]");
        m.setMsg(msg);
    }
}
