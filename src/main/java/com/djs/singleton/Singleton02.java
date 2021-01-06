package com.djs.singleton;

/**
 * 懒汉模式1 -线程不安全
 */
public class Singleton02 {
    private static Singleton02 singleton02;

    private Singleton02() {
    }

    public static Singleton02 getInstance() throws InterruptedException {
        if (singleton02 == null) {
            Thread.sleep(1);
            singleton02 = new Singleton02();
        }
        return singleton02;

    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Singleton02.getInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


        }


    }
}
