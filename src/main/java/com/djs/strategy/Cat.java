package com.djs.strategy;

public class Cat implements MyComparable<Cat>{

    private Integer age;
    private Integer weight;

    public Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

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



    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compare(Cat o) {


        return this.weight.compareTo(o.weight);
    }

}
