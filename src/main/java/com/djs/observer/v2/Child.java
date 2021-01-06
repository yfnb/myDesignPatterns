package com.djs.observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 有些时候，观察者需要根据事件的具体情况来处理，使用传参得到方式把事件对象传给观察者
 */
public class Child {
    private List<Observer> list=new ArrayList<>();

    {
        list.add(new Dad());
        list.add(new Dag());
    }

    public void wakeUp(){
        System.out.println("呜呜呜呜。。。。");

        Event event=new Event(System.currentTimeMillis(),"在床上");
        for (Observer observer : list) {

            observer.actionOnWakeUp(event);

        }
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.wakeUp();
    }




}
