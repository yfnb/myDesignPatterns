package com.djs.prototype.v2;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Location loc = new Location("西安", 15);
        Person person = new Person("小明", 11);
        person.setLoc(loc);
        System.out.println("原对象" + person); //打印原对象 原对象Person{name='小明', age=11, loc=Location{name='西安', x=15}}


        Person clone = (Person) person.clone();
        System.out.println("克隆对象" + clone); //打印clone后得到对象 克隆对象Person{name='小明', age=11, loc=Location{name='西安', x=15}}

        System.out.println(person == clone);  //false
        System.out.println(person.equals(clone)); //false
        System.out.println(person.hashCode() == clone.hashCode());  //测试源对象和clone是否为同一个地址 false

        person.setName("小红"); //修改原对象的属性name
        System.out.println("原对象" + person); //打印原对象 原对象Person{name='小红', age=11, loc=Location{name='西安', x=15}}

        System.out.println("克隆对象" + clone); //打印clone后得到对象  克隆对象Person{name='小明', age=11, loc=Location{name='西安', x=15}}
         //克隆对象的name没有更改，说明已经是两个对象了


        //打印下各自的location ,发现两个对象的引用指向同一个地址，也就是基本类型不会影响，但是引用类型还是同一个地址，所以还是会互相影响
        System.out.println(person.getLoc().hashCode()==clone.getLoc().hashCode());

        person.getLoc().setName("南京"); //修改原对象的location

        //打印下clone对象的location属性，发现也被修改了
        System.out.println(clone.getLoc().getName());   //南京
    }
}
