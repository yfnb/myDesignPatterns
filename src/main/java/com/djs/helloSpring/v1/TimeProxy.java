package com.djs.helloSpring.v1;

public class TimeProxy {

    public void before(){
        System.out.println("开始的时间是"+System.currentTimeMillis());

    }

    public void after(){

        System.out.println("结束的时间是"+System.currentTimeMillis());
    }

}
