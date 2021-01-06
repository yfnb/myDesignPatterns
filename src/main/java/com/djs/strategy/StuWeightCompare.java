package com.djs.strategy;

public class StuWeightCompare implements MyComparator<Stu> {

    @Override
    public int compare(Stu o1, Stu O2) {
        return o1.getWeight().compareTo(O2.getWeight());
    }
}
