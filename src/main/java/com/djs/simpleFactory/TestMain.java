package com.djs.simpleFactory;

public class TestMain {

     //简单工厂模式，由工厂来创建对象，工厂类的职责较重，不易于扩展复杂产品
    public static void main(String[] args) {

        MoveFactory moveFactory=new MoveFactory();
        Moveable car = moveFactory.creatTool("plane");
        car.move();


    }
}
