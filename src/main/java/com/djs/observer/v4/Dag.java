package com.djs.observer.v4;

public class Dag implements Observer {
    @Override
    public void actionOnWakeUp(Event event) {
        System.out.println("小狗知道了当前时间是:"+event.getCurrentTime());
        System.out.println("小狗知道了当前地点是:"+event.getLocation());
        System.out.println("小狗知道了这个被监听者的名字是:");

        speak();
    }

    private void speak() {
        System.out.println("汪汪汪");
    }
}
