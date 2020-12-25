package com.djs.singleton;

/**
 * 懒汉模式2 -方法加锁synchronized变成线程安全的，但是因为加锁的原因，效率也会降低
 */
public class Singleton03 {
    private static Singleton03 singleton03;

    private Singleton03() {
    }

    public static synchronized Singleton03 getInstance() throws InterruptedException {
        if (singleton03 == null) {
            Thread.sleep(1);
            singleton03 = new Singleton03();
        }
        return singleton03;

    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Singleton03.getInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


        }


    }
}
