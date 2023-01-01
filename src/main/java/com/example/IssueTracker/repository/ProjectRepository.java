package com.example.IssueTracker.repository;

import com.example.IssueTracker.entity.Issue;
import com.example.IssueTracker.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.config.Task;



public interface ProjectRepository extends CrudRepository<Project,String> {

}
