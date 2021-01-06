package com.djs.observer.v4;

public abstract class Event <T>{
    private long currentTime;
    private String location;
    abstract  T getResourse();

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
}
