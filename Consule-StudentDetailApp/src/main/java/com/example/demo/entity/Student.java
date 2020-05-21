package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "consulstudent")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int studentId;
	
	@Column(name = "name")
	private String studentName;
	
	@Column(name = "class")
	private int studentClass;
	
	@Column(name = "school-name")
	private String schoolname;
}
