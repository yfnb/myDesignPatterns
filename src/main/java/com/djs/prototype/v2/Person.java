package com.djs.prototype.v2;


public class Person implements Cloneable {
    String name;
    int age;
    Location loc;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Person的clone方法重写
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone =(Person)super.clone();
        clone.setLoc((Location)loc.clone());
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", loc=" + loc +
                '}';
    }
}
