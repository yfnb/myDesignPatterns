package com.djs.iterator.v1;

import com.djs.iterator.v4.MyIterator;

public interface MyList <E>{
    void add(E object);
    int size();
    MyIterator iterator();

}
