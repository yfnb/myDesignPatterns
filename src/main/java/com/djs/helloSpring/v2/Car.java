package com.djs.helloSpring.v2;

public class Car {
    public Car() {
    }

    public void go(){
        System.out.println("开起来");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

   public void fire(){
        System.out.println("小汽车开火啦");
       try {
           Thread.sleep(50);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
