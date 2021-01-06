package com.djs.iterator.v4;

import java.util.Iterator;
import java.util.LinkedList;

public class MainTest {

    public static void main(String[] args) {
        //jdk自带的链表结构
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("dadsa");
        linkedList.add("66");
        linkedList.add("dsa");


        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        //*********  自定义链表结构

        MyLinkedList<Integer> myList=new MyLinkedList<Integer>();

        for (int i = 0; i < 18; i++) {
            myList.add(i);
        }

        System.out.println(myList.size());

       Node node=myList.head;

       while (node!=null){

           System.out.println(node.value);
           node=node.next;

       }




    }
}
