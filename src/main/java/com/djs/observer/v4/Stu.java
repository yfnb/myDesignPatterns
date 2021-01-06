package com.djs.observer.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建另外一个需要监听的对象
 *
 *
 */
public class Stu {
    private List<Observer> list=new ArrayList<>();

    private String name;




    {
        name="学生小明";
        list.add(new Dad());
        list.add(new Dag());
    }

    public void wakeUp(){
        System.out.println("呜呜呜呜。。。。");

        StuEvent event=new StuEvent(System.currentTimeMillis(),"在床上",this);
        for (Observer observer : list) {
            observer.actionOnWakeUp(event);
        }
    }

    public static void main(String[] args) {
        Stu stu=new Stu();
        stu.wakeUp();

    }


    public List<Observer> getList() {
        return list;
    }

    public void setList(List<Observer> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
