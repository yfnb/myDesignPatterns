package com.djs.helloSpring.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext2.xml");

    //    Car car = (Car) applicationContext.getBean("car");
        Driver driver = (Driver) applicationContext.getBean("driver");

        driver.run();
    }

}
