package com.djs.iterator.v1;

import com.djs.iterator.v4.MyArrayListIter;
import com.djs.iterator.v4.MyIterator;

/**
 * 自定义一个动态数组
 */
public class MyArrayList <E> implements MyList <E>{
    Object[] objects = new Object[10];
    private int index = 0;

    @Override
    public void add(E o) {

        if (index == objects.length) {

            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }

        System.out.println("动态数组的长度:"+objects.length);
        objects[index] = o;
        index++;
    }

    @Override
    public int size() {

        return index;
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyArrayListIter<>();
    }

}
