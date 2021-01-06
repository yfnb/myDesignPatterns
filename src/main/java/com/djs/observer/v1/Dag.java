package com.djs.observer.v1;

public class Dag implements Observer {
    @Override
    public void actionOnWakeUp() {
        speak();
    }

    private void speak() {
        System.out.println("汪汪汪");
    }
}
