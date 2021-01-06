package com.djs.singleton;

/**
 * 懒汉模式2 -方法加锁synchronized变成线程安全的，但是因为加锁的原因，效率也会降低
 * 把锁加到代码块里，提高效率
 * 然而这样也是线程不安全的
 */
public class Singleton04 {
    private static Singleton04 singleton04;

    private Singleton04() {
    }

    public static  Singleton04 getInstance() throws InterruptedException {
        if (singleton04 == null) {
            //锁加到代码块内部
            synchronized (Singleton04.class){
                Thread.sleep(1);
                singleton04 = new Singleton04();

            }

        }
        return singleton04;

    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Singleton04.getInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


        }


    }
}
