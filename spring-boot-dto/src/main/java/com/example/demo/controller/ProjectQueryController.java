package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProjectQueryDTO;
import com.example.demo.service.ProjectQueryService;

@RestController
@RequestMapping("/api")
public class ProjectQueryController {

 @Autowired
 private ProjectQueryService projectQueryService;

 @GetMapping("/projects")
 public ResponseEntity<Object> getAllProjects() {
  return new ResponseEntity<>(projectQueryService.getAllProjects(), HttpStatus.OK);
 }

 @GetMapping("/projects/{id}")
 public ResponseEntity<ProjectQueryDTO> getProjectById(@PathVariable("id") Integer id){
  return new ResponseEntity(projectQueryService.getProject(id),HttpStatus.OK);
 }
}