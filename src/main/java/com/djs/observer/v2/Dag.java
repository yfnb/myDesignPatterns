package com.djs.observer.v2;

public class Dag implements Observer {
    @Override
    public void actionOnWakeUp(Event event) {
        System.out.println("小狗知道了当前时间是:"+event.getCurrentTime());
        System.out.println("小狗知道了当前时间是:"+event.getLocation());
        speak();
    }

    private void speak() {
        System.out.println("汪汪汪");
    }
}
