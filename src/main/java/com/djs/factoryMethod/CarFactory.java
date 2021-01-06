package com.djs.factoryMethod;

import com.djs.simpleFactory.Car;
import com.djs.simpleFactory.Moveable;

public class CarFactory implements AbstractFactory {
    @Override
    public Moveable create() {
        return new Car();
    }
}
