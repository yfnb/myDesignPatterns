package com.djs.factoryMethod;


import com.djs.simpleFactory.Moveable;

public class TestMain {

    public static void main(String[] args) {
        //和简单工厂模式中工厂负责生产所有产品相比，工厂方法模式将生成具体产品的任务分发给具体的产品工厂
        AbstractFactory abstractFactory=new PlaneFactory() ;
        Moveable moveable = abstractFactory.create();
        moveable.move();
    }
}
