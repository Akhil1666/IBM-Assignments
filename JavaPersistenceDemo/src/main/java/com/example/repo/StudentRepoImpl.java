package com.example.repo;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Repository("repo")
public class StudentRepoImpl implements StudentRepo {
	
	private SessionFactory sessionFactory;
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	
	@Autowired
	public StudentRepoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	@PostConstruct
	public void init() {
		factory=sessionFactory.unwrap(SessionFactory.class);
		entityManager=factory.createEntityManager();
	}
	
	@Override
	public Student creatStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		return student;
	}

	@Override
	public void updateStudent(int id, String name) {
		// TODO Auto-generated method stub
		Student student=findStudent(id);
		if(student==null)
			System.out.println("Updation not possible");
		else
		{
			student.setStudentName(name);
			entityManager.getTransaction().begin();
			entityManager.merge(student);
			entityManager.getTransaction().commit();
			System.out.println("Student deleted successfully.......");
		}
	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		Student student=findStudent(id);
		if(student==null)
			System.out.println("Deletion not possible");
		else
		{
			entityManager.getTransaction().begin();
			entityManager.remove(student);
			entityManager.getTransaction().commit();
			System.out.println("Student deleted successfully.......");
		}
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		Student student=findStudent(id);
		if(student==null)
		{
			System.out.println("Student not Exist");
			return null;
		}
		else
		{
			return student;
		}
	}

	@Override
	public Collection<Student> findAllEmployees() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select * from student",Student.class).getResultList();
	}

}
