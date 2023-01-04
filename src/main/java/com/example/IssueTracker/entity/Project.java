package com.example.IssueTracker.entity;

import javax.persistence.*;
import java.util.UUID;



@Entity
@Table(name = "projects")
public class Project {
    @Id
    private String projectId;
    private String projectName;



    public Project() {
    }

    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;

    }


    public Project(String projectName) {
        this.projectId = UUID.randomUUID().toString();
        this.projectName = projectName;

    }


    public String getId() {
        return projectId;
    }

    public void setId(String id) {
        this.projectId = id;
    }

    public String getProjectName() {            //alt insert for getters and settters
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }



}