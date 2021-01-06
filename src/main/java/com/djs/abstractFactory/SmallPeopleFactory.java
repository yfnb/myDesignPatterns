package com.djs.abstractFactory;

import com.djs.simpleFactory.Car;
import com.djs.simpleFactory.Moveable;

public class SmallPeopleFactory implements PeopleAbstarctFactory {
    @Override
    public Eatable getFood() {
        return new Bread();
    }

    @Override
    public Moveable getTool() {
        return new Car();
    }
}
