package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repo.StudentRepo;
import com.example.repo.StudentRepoImpl;

@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepo repo;
	
	{
		repo=new StudentRepoImpl();
	}

	public Student creatStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.creatStudent(student);
	}

	public void updateStudent(int id, String name) {
		// TODO Auto-generated method stub
		repo.updateStudent(id, name);
	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		repo.removeStudent(id);
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		return repo.findStudent(id);
	}

	@Override
	public Collection<Student> findAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAllEmployees();
	}

}
