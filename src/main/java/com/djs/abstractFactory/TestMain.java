package com.djs.abstractFactory;

import com.djs.simpleFactory.Moveable;

public class TestMain {
    public static void main(String[] args) {
        //抽象工厂模式，是以产品簇进行设计的模式

        PeopleAbstarctFactory peopleAbstarctFactory=new SmallPeopleFactory();

        Eatable food = peopleAbstarctFactory.getFood();
        food.eat();

        Moveable tool = peopleAbstarctFactory.getTool();
        tool.move();


    }
}
