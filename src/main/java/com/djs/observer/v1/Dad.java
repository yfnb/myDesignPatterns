package com.djs.observer.v1;

public class Dad implements Observer {
    @Override
    public void actionOnWakeUp() {
        eat();
    }

    private void eat() {

        System.out.println("吃东西。。。");
    }
}
