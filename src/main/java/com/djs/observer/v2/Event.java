package com.djs.observer.v2;

public class Event {
    private long currentTime;
    private String location;

    public Event(long currentTime, String location) {
        this.currentTime = currentTime;
        this.location = location;
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
}
