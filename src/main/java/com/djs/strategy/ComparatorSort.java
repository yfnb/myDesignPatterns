package com.djs.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * comparator比较器测试
 */
public class ComparatorSort {

    public static void main(String[] args) {

        List<Stu> list = new ArrayList<>();
        list.add(new Stu(1, 9));
        list.add(new Stu(9, 8));
        list.add(new Stu(28, 99));
        list.add(new Stu(3, 100));
        list.add(new Stu(2, 9));

      //  StuAgeCompare stuAgeCompare = new StuAgeCompare();

        StuWeightCompare stuWeightCompare=new StuWeightCompare();
        selectSort(list, stuWeightCompare);

        System.out.println(list);


    }


    /**
     * 选择排序
     */
    private static void selectSort(List list, MyComparator myComparable) {


        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {


                if (myComparable.compare(list.get(j), list.get(minIndex)) == -1) {

                    minIndex = j;
                }

            }

            exchange(list, i, minIndex);


        }
    }

    /*两个数组元素的位置交换*/
    public static void exchange(List<Stu> list, int i, int j) {
        Stu temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }


}
