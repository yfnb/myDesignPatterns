package com.djs.iterator.v2;

import com.djs.iterator.v1.MyList;

public class MainTest {

    public static void main(String[] args) {

        MyLinkedList myList=new MyLinkedList();

        for (int i = 0; i < 18; i++) {
            myList.add("&"+i);
        }

        System.out.println(myList.size());

       Node node=myList.head;

       while (node!=null){

           System.out.println((String) node.value);
           node=node.next;

       }




    }
}
