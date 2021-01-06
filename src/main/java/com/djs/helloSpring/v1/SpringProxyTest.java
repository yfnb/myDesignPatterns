package com.djs.helloSpring.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring代理练习
 */
public class SpringProxyTest {

    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext2.xml");

        Car car = (Car) applicationContext.getBean("car");
        car.fire();
    }

}
