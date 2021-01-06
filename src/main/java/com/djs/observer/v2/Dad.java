package com.djs.observer.v2;

public class Dad implements Observer {
    @Override
    public void actionOnWakeUp(Event event) {
        eat();
    }

    private void eat() {

        System.out.println("吃东西。。。");
    }
}
