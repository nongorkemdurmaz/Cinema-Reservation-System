package edu.estu.model;

import java.time.LocalDateTime;

public class Scene {
    private final LocalDateTime time;
    private final String name;
    private final String seat;

    public LocalDateTime getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getSeat() {
        return seat;
    }

    public Scene(String name, LocalDateTime time, String seat) {
        this.time = time;
        this.name = name;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return name + "----> " + time + " " +  " " + seat;
    }
}