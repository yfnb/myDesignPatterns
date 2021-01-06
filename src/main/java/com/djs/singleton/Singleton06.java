package com.djs.singleton;

/**
 * 静态内部类方式，JVM保证单例，加载外部类时不会加载内部类，这样也可以实现懒加载
 */
public class Singleton06 {
    private static Singleton06 singleton06;

    private Singleton06() {
    }

    public static Singleton06 getInstance() {
        return SingletonInnerClass.singleton06;
    }

    /**
     * 在静态内部类里面new 这个对象
     */
    public static class SingletonInnerClass {
        private static Singleton06 singleton06 = new Singleton06();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Singleton06.getInstance().hashCode());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

        }


    }
}
