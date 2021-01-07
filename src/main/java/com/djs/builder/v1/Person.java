package com.djs.builder.v1;

import lombok.Data;

@Data
public class Person {
    private int age;
    private String name;
    private Location loc;

    public Person() {
    }

    public Person ageBuilder(int age){
        this.age=age;
        return this;

    }

    public Person nameBuilder(String name){

        this.name=name;
        return this;

    }


    public Person locBuilder(Location loc){

        this.loc=loc;
        return this;
    }



}
