package com.djs.builder.v1;

public class Main {
    public static void main(String[] args) {
        Person P=new Person();

        P.ageBuilder(8).nameBuilder("小红").locBuilder(new Location(5, 9));

        System.out.println(P);

    }

}
