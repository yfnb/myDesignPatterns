package com.djs.observer.v3;

/**
 * 被监听者作为事件的属性，传入，但是这样，这个事件就是一个专门的child的事件
 * 如果再来个其他需要监听的对象，则event的代码需要修改，所以事件和被监听者的耦合度太高
 */
public class Event {
    private long currentTime;
    private String location;
    private Child resourse;

    public Event(long currentTime, String location, Child resourse) {
        this.currentTime = currentTime;
        this.location = location;
        this.resourse=resourse;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Child getResourse() {
        return resourse;
    }

    public void setResourse(Child resourse) {
        this.resourse = resourse;
    }
}
