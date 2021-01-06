package com.djs.helloSpring.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring代理练习
 */
public class SpringProxyTest {

    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        Object car = applicationContext.getBean("car");

        Car car1 = (Car) car;
        car1.go();

    }

}
