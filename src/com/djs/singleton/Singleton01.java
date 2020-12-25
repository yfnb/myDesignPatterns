package com.djs.singleton;

/**
 * 单例模式之饿汉模式
 */
public class Singleton01 {
    private static final Singleton01 singleton = new Singleton01();
    public static Singleton01 getInstance() {
        return singleton;
    }

    /**
     * 构造方法私有化
     */
    private Singleton01() {
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();

        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());

    }
}
