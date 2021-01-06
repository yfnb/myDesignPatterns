package com.djs.simpleFactory;

public class MoveFactory {

    public Moveable creatTool(String name){
        if(name.equals("car")){
            return new Car();
        }
        if(name.equals("plane")){
            return new Plane();
        }
        return null;


    }

}
