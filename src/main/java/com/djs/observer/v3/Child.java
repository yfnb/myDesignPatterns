package com.djs.observer.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 有些时候，观察者需要根据事件的具体情况来处理，使用传参得到方式把事件对象传给观察者
 * 大多数时候，需要事件的原对象
 * 有时候监听者需要知道被监听者
 */
public class Child {
    private List<Observer> list=new ArrayList<>();

    private String name;




    {
        name="小米";
        list.add(new Dad());
        list.add(new Dag());
    }

    public void wakeUp(){
        System.out.println("呜呜呜呜。。。。");

        Event event=new Event(System.currentTimeMillis(),"在床上",this);
        for (Observer observer : list) {

            observer.actionOnWakeUp(event);

        }
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.wakeUp();
    }


    public List<Observer> getList() {
        return list;
    }

    public void setList(List<Observer> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
