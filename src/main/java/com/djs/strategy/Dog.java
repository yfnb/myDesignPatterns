package com.djs.strategy;

public class Dog {

    private Integer age;
    private Integer weight;

    private int a;

    public Dog(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

//    @Override
//    public int compareTo(Object o) {
//        //引用类型（可以排序的类型）可以直接调用CompareTo方法
//        //基本类型--使用   减
//        return ((Dog)o).age.compareTo(this.age);
//    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
