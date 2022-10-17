package com.tns.services;

import com.tns.entities.Certificate;
import com.tns.entities.Student;

public interface StudentService 
{

	public Student addStudent(Student student);  
	public Student updateStudent(Student student);  
	public Student searchStudentById(int id); 

	public Student searchStudentByHallTicket(int id); 
	public boolean addCertificate(Certificate certificate);
	public boolean updateCertificate(Certificate certificate);
	public boolean deleteStudent(int id);
	

}
