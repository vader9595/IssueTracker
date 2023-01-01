package com.example.IssueTracker.controller;

import com.example.IssueTracker.entity.Issue;
import com.example.IssueTracker.entity.Project;
import com.example.IssueTracker.model.SaveRequest;
import com.example.IssueTracker.repository.IssueRepository;
import com.example.IssueTracker.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class IssueController {


// why rest and not just reg controller? its  rest api, gives json functionality


    // TODO: Sonarlint plugin

    private final IssueRepository issueRepository;
    private final ProjectRepository projectRepository;

    public IssueController(IssueRepository issueRepository, ProjectRepository projectRepository) {
        this.issueRepository = issueRepository;
        this.projectRepository = projectRepository;
    }






    @GetMapping("/issues")
    public Iterable<Issue> getIssues() {
        return issueRepository.findAll();
    }

    // TaskService - Pascal Case
    // taskId - Camel Case
    // task_id - snake case





    @PutMapping("/issues/{issueId}")
    public void completeIssue(@PathVariable String issueId) {
        Optional<Issue> optionalTask = issueRepository.findById(issueId);
        Issue issue = optionalTask.get();      // null - NPE null pointer exception
        issue.setCompleted(!issue.isCompleted());

        issueRepository.save(issue);
    }

    @DeleteMapping("/issues/{issueId}")
    public void deleteIssue(@PathVariable String issueId){
        issueRepository.deleteById(issueId);

    }







    @PostMapping("/issues")                 // JSON JavaScript Object Notation-> Jackson-> Java object
    public void saveIssue(@RequestBody SaveRequest saveRequest) {
        Issue issue = new Issue(saveRequest.getName());             // create entity
        issueRepository.save(issue);                          // save entity
    }

    @PostMapping("/project")                 // JSON JavaScript Object Notation-> Jackson-> Java object
    public void saveProject(@RequestBody SaveRequest saveRequest) {
        Project project = new Project(saveRequest.getProjectName());             // create entity
        projectRepository.save(project);                          // save entity
    }


}