package com.djs.factoryMethod;

import com.djs.simpleFactory.Moveable;
import com.djs.simpleFactory.Plane;

public class PlaneFactory implements AbstractFactory {
    @Override
    public Moveable create() {
        return new Plane();
    }
}
