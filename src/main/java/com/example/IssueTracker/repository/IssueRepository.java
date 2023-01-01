package com.example.IssueTracker.repository;

import com.example.IssueTracker.entity.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.config.Task;



    public interface IssueRepository extends CrudRepository<Issue,String> {

    }
