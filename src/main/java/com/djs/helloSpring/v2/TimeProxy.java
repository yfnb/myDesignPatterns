package com.djs.helloSpring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect()
public class TimeProxy {

    @Before("execution (void com.djs.helloSpring.v2.Car.go())")
    public void before(){
        System.out.println("开始的时间是"+System.currentTimeMillis());

    }

    @After("execution (void com.djs.helloSpring.v2.Car.go())")
    public void after(){

        System.out.println("结束的时间是"+System.currentTimeMillis());
    }

}
