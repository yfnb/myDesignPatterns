package com.djs.observer.v4;

/**
 * 被监听者作为事件的属性，传入，但是这样，这个事件就是一个专门的child的事件
 * 如果再来个其他需要监听的对象，则event的代码需要修改，所以事件和被监听者的耦合度太高
 */
public class ChildEvent extends Event<Child>{

    private Child resourse;

    public ChildEvent(long currentTime, String location, Child resourse) {
        setCurrentTime(currentTime);
        setLocation(location);
        this.resourse=resourse;
    }

    @Override
    Child getResourse() {
        return resourse;
    }

}
