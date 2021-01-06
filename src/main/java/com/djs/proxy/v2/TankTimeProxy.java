package com.djs.proxy.v2;

import com.djs.proxy.v1.Movable;
import com.djs.proxy.v1.Tank;


/**
 * 使用聚合的方式来代理，将被代理人最为代理人的属性
 */
public class TankTimeProxy implements Movable {
    Movable tank;


    public TankTimeProxy(Movable tank) {
        this.tank = tank;
    }

    @Override
    public void move() throws InterruptedException {
        long start=System.currentTimeMillis();
        tank.move();
        long end=System.currentTimeMillis();

        System.out.println("共花费了多少事件"+(end-start));

    }


    public static void main(String[] args) throws InterruptedException {

        Movable movable=new TankTimeProxy(new Tank());

        movable.move();

    }
}
