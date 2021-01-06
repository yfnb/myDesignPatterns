package com.djs.iterator.v3;

import java.util.LinkedList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        MyLinkedList <Integer> myList=new MyLinkedList<Integer>();

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
