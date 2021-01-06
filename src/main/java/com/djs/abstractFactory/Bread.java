package com.djs.abstractFactory;

public class Bread implements Eatable {
    @Override
    public void eat() {
        System.out.println("吃面包");
    }
}
