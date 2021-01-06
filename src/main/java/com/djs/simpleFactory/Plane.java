package com.djs.simpleFactory;

public class Plane implements Moveable{
    @Override
    public void move() {
        System.out.println("飞机跑起来啦。。。。");
    }
}
