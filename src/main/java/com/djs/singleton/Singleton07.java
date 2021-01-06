package com.djs.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化。
 */
public enum Singleton07 {

    INSTANCE;

    public void m() {}

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Singleton07.INSTANCE.hashCode());
            }).start();
        }
    }

}
