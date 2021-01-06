package com.djs.helloSpring.v1;

public class Driver {
    private   Car car;

    public Driver() {
        System.out.println("创建driver对象");
    }
    public void run(){
         car=new Car();

    }
}
