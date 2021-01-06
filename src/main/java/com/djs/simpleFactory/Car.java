package com.djs.simpleFactory;

public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("小汽车跑起来啦。。。。");
    }
}
