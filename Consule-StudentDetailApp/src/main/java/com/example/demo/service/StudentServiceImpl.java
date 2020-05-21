package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.Student;

public class StudentServiceImpl implements StudentService {

	private StudentRepo studentRepo;
	
	@Autowired
	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	@Override
	public List<Student> getListBySchoolName(String schoolName) {
		Iterator<Student> iter=studentRepo.findAllBySchoolName(schoolName).iterator();
		List<Student> listObj=new ArrayList<Student>();
		while(iter.hasNext())
		{
			listObj.add(iter.next());
		}
		return listObj;
	}

}
