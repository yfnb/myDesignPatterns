package com.djs.proxy.v1;


/**
 * 使用继承方式来做，不在原类的方法上进行修改
 */
public class Tank2 extends Tank {

    @Override
    public void move() throws InterruptedException {
        long start=System.currentTimeMillis();
        super.move();
        long end=System.currentTimeMillis();

        System.out.println("共花费了多少事件"+(end-start));
    }


    public static void main(String[] args) throws InterruptedException {
        Movable movable=new Tank2();
        movable.move();
    }
}
