package com.djs.singleton;

/**
 * 懒汉模式4 -双重加锁
 *
 */
public class Singleton05 {
    private static Singleton05 singleton05;

    private Singleton05() {
    }

    public static Singleton05 getInstance() throws InterruptedException {

        if (singleton05 == null) {
            //加双重判断
            synchronized (Singleton05.class){
                if(singleton05==null){
                    Thread.sleep(1);
                    singleton05 = new Singleton05();

                }

            }

        }
        return singleton05;

    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Singleton05.getInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


        }


    }
}
