package com.djs.abstractFactory;

import com.djs.simpleFactory.Moveable;

public interface PeopleAbstarctFactory {
     Eatable getFood();
     Moveable getTool();
}
