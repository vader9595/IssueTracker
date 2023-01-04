package com.example.IssueTracker.entity;




import javax.persistence.*;

import java.util.UUID;



@Entity
@Table(name = "issues")
public class Issue {
    @Id
    private String id;
    private String name;
    private boolean completed;                                         //lowercase boolean starts as false


    public Issue() {
    }

    public Issue(String id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }


    public Issue(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.completed = false;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {            //alt insert for getters and settters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


}