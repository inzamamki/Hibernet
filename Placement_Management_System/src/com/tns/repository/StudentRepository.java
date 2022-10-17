package com.tns.repository;

import com.tns.entities.Student;

public interface StudentRepository 
{
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int hallTicketNo);
	public boolean deleteStudent(int id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();

}