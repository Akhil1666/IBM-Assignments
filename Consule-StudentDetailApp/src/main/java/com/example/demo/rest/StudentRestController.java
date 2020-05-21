package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@EnableAutoConfiguration
public class StudentRestController {
	private StudentService studentService;
	
	@Autowired
	public StudentRestController(StudentService stufendService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/byschoolname")
	public ResponseEntity<Iterable<Student>> bySchoolName(@RequestParam String name)
	{
		return ResponseEntity.status(HttpStatus.OK).body(studentService.getListBySchoolName(name));
	}
}
