package com.tns.repository;


import javax.persistence.EntityManager;

import com.tns.entities.Student;

public class StudentRepositoryImpl implements StudentRepository
{

	//Step 1: Start JPA LifeCycle
	private EntityManager entityManager;
	public StudentRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	  }
	
	//Create Operation - Repository
	@Override
	public Student addStudent(Student student) 
	{
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) 
	{
		entityManager.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(int id) 
	{
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo)
	{
		Student student = entityManager.find(Student.class, hallTicketNo);
		return student;
	}

	@Override
	public boolean deleteStudent(int id) 
	{
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
		return false;
	}

	@Override
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}

}

