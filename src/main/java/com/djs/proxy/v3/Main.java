package com.djs.proxy.v3;


import com.djs.proxy.v1.Movable;
import com.djs.proxy.v1.Tank;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 上个版本只代理了tank,如果要代理其他别的对象？如果有stop方法需要代理...使用jdk的动态代理
 */
public class Main {



    public static void main(String[] args) throws InterruptedException {
        Tank tank=new Tank();

        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");


        Movable m;
        m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println(method.getName()+" :start......");

                Object invoke = method.invoke(tank, args);

                System.out.println(method.getName()+" :end......");

                return invoke;
            }
        });

        m.move();










    }


}
