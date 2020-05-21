package com.example.repo;

import java.util.Collection;

import com.example.model.Student;


public interface StudentRepo {
	public Student creatStudent(Student student);
	public void updateStudent(int id,String name);
	public void removeStudent(int id);

	public Student findStudent(int id);

	public Collection<Student> findAllEmployees();
}
