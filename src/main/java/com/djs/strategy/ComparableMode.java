package com.djs.strategy;

import java.util.*;

/**
 * comparable和comparator
 */
public class ComparableMode<collectionsTest> {

    public static void main(String[] args) {
        collectionsTest2();

    }

    /**
     * collections的sort方法多list进行排序
     */
    public static void collectionsTest(){
       List<Integer> list=new ArrayList<>();
       list.add(14);
       list.add(4);
       list.add(10);
       list.add(14);
       list.add(19);
       Collections.sort(list);
       System.out.println(list);
   }


   public static void collectionsTest2(){
       List<Dog> list=new ArrayList<Dog>();
       list.add(new Dog(4,9));
       list.add(new Dog(8,10));
       list.add(new Dog(45,9));
       list.add(new Dog(3,89));

       Collections.sort(list, new Comparator<Dog>() {
           @Override
           public int compare(Dog o1, Dog o2) {

               return o1.getAge()-o2.getAge();
           }
       });
       System.out.println(list);

   }
}
