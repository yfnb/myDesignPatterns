package com.djs.observer.v1;

import java.util.ArrayList;
import java.util.List;

public class Child {
    private List<Observer> list=new ArrayList<>();

    {
        list.add(new Dad());
        list.add(new Dag());
    }

    public void wakeUp(){
        System.out.println("呜呜呜呜。。。。");

        for (Observer observer : list) {

            observer.actionOnWakeUp();

        }
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.wakeUp();
    }




}
