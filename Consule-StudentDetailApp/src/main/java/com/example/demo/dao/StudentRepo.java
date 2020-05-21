package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.entity.Student;

@Repository(value = "studentRepo")
@EnableTransactionManagement
public interface StudentRepo  extends CrudRepository<Student , Integer>{

	
	@Query("select * from consulstudent where school-name=	")
	public Iterable<Student> findAllBySchoolName(String schoolName);
}
