package com.djs.proxy.v1;

public class Tank implements Movable{


    @Override
    public void move() throws InterruptedException {
        System.out.println("坦克跑起来了。。。。");

        Thread.sleep(1000);    }
}
