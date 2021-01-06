package com.djs.observer.v4;

/**
 * 被监听者作为事件的属性，传入，但是这样，这个事件就是一个专门的child的事件
 * 如果再来个其他需要监听的对象，则event的代码需要修改，所以事件和被监听者的耦合度太高
 */
public class StuEvent extends Event<Stu>{

    private Stu resourse;

    public StuEvent(long currentTime, String location, Stu resourse) {
        setCurrentTime(currentTime);
        setLocation(location);
        this.resourse=resourse;
    }

    @Override
    Stu getResourse() {
        return resourse;
    }
}
