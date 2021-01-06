package com.djs.iterator.v2;

import com.djs.iterator.v1.MyList;
import com.djs.iterator.v4.MyIterator;
import com.djs.iterator.v4.MylInkedListIter;


/**
 * 实现动态链表结构
 */
public class MyLinkedList<E> implements MyList <E>{
    Node head;
    Node tail;



    int index=0;


    @Override
    public void add(E object) {
        Node newNode = new Node(object);

        if(head==null){
            head=newNode;
            tail=head;
        }else {
           tail.next=newNode;
           tail=tail.next;
        }

      index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public MyIterator iterator() {
        return new MylInkedListIter();
    }
}
