package com.djs.iterator.v1;


/**
 * 使用数组创建容器
 */
public class Main {

    public static void main(String[] args) {
   MyList list=new MyArrayList();

        for (int i = 0; i < 11;i++) {
            list.add(i);
        }

        System.out.println(list.size());




    }



}



