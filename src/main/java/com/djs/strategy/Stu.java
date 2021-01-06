package com.djs.strategy;

public class Stu {
    private Integer age;
    private Integer weight;

    public Stu(Integer age, Integer weight) {
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
        return "Stu{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
