package com.djs.abstractFactory;

import com.djs.simpleFactory.Moveable;
import com.djs.simpleFactory.Plane;

public class BigPeopleFactory implements PeopleAbstarctFactory {
    @Override
    public Eatable getFood() {
        return new BigFood();
    }

    @Override
    public Moveable getTool() {
        return new Plane();
    }
}
