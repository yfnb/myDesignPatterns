package com.djs.proxy.v2;


import com.djs.proxy.v1.Movable;

public class TankLogProxy implements Movable {
    Movable movable;

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() throws InterruptedException {
        System.out.println("坦克开动啦");
        movable.move();
        System.out.println("坦克停止啦");



    }
}
