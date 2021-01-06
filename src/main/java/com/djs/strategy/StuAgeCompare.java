package com.djs.strategy;

public class StuAgeCompare implements MyComparator<Stu> {

    @Override
    public int compare(Stu o1, Stu O2) {
        return o1.getAge().compareTo(O2.getAge());
    }
}
