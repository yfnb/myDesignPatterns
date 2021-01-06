package com.djs.proxy.v2;

import com.djs.proxy.v1.Movable;
import com.djs.proxy.v1.Tank;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //可以任意改变代理的先后顺序，确定是都要继承movable接口
        Movable movable=new TankTimeProxy(new TankLogProxy(new Tank()));
        movable.move();
    }
}
