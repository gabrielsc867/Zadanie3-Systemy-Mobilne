package com.example.zadanie3;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task() {
        this.id = UUID.randomUUID();
        this.date = new Date();
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return this.date;
    }

    public boolean isDone() {
        return this.done;
    }

    public void setDone(boolean check) {
        this.done = check;
    }
}
