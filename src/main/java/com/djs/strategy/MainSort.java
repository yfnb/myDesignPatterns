package com.djs.strategy;


import java.util.ArrayList;
import java.util.List;

/**
 * 自定义comparable接口，需要比较的对象得实现comparable接口,并重写compare方法
 */
public class MainSort {


    public static void main(String[] args) {
        List<MyComparable> list=new ArrayList<>();

        list.add(new Cat(5,16));
        list.add(new Cat(9,10));
        list.add(new Cat(0,15));
        selectSort(list);
        System.out.println(list);
    }
    /**
     * 选择排序
     *
     *
     */
    private static void selectSort(List<MyComparable> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {

                if(list.get(j).compare(list.get(minIndex))==-1){

                    minIndex = j;
                }

            }

            exchange( list, i, minIndex);


        }
    }

    /*两个数组元素的位置交换*/
    public static void exchange(List<MyComparable> list, int i, int j) {
        MyComparable temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }



}
