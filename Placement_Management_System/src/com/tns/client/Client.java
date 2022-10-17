package com.tns.client;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.entities.*;
import com.tns.services.*;

@SuppressWarnings("unused")
public class Client
{

	public static void main(String[] args)
	{
		
		//CRUD OPERATION CALLING ACTIVITY for college and Placement.
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		em.getTransaction().begin();

		Placement placement = new Placement();
		PlacementService Pservice = new PlacementServiceImpl();	
		Placement placement1 = new Placement();
		PlacementService Pservice1 = new PlacementServiceImpl();
	
		
		College college=new College();
		CollegeService Cservice= new CollegeServiceImpl();
		College college1=new College();
		CollegeService Cservice1 = new CollegeServiceImpl();
		
		Student student = new Student();
		StudentService Sservice = new StudentServiceImpl();
		
		User user = new User();
		UserService Uservice = new  UserServiceImpl();
		
		Certificate certificate = new Certificate();	
		CertificateService Crserivece = new CertificateServiceImpl();
		
		Admin admin = new Admin();
		
		//college, student, certificate association
		
/*		//college reocord create
		
		college.setCollegeAdmin("Pranav");
		college.setCollegeName("APCOER");
		college.setLocation("Pune");
		Cservice.addCollege(college);
		
		///certificate record create 
		certificate.setYear(2022);
		certificate.setCollege(college);
		Crserivece.addCertificate(certificate);
		
		
		///Student record create 
		 * 
		student.setName("Inzamam");
		student.setRoll(4);
		student.setCollege(college);
		student.setCourse("B.E");
		student.setCertificate(certificate);
		student.setYear(2022);
		student.setHallTicketNo(121);
		Sservice.addStudent(student);
		List<Student> list=new ArrayList<Student>();
		list.add(student);
		college.setStudent(list);
		certificate.setStudent(student);
		
		List<Certificate> list1=new ArrayList<Certificate>();
		list1.add(certificate);
		college.setCertificate(list1);
		
		//student.setCollege(college);
		student.setCertificate(certificate);
		
		System.out.println("Record added...");
	*/	
		// Create   //association college, user and admin
		
	/*	
		admin.setName("Pranav");
		admin.setPassword("1234");
		//admin.setUser(user);
			
		college.setId(6);
		college.setCollegeAdmin("Pranav");
		college.setCollegeName("Apcoer");
		college.setLocation("Pune");
		Cservice.addCollege(college);
			
		user.setId(6);
		user.setName("Abhineel");
		user.setType("user");
		user.setPassword("1234");
		user.setAdmin(admin);
		user.setCollege(college);
		Uservice.addUser(user);
		
		System.out.println("Record added ");
*/
		// Creating College record // college and placement association

	/*	college.setCollegeAdmin("Pranav");
		college.setId(122);
		college.setCollegeName("APCOER");
		college.setLocation("Pune");
		Cservice.addCollege(college);
		
		// Creating Placement record
		
		placement.setS_name("Abhineel");
		placement.setCollege(college);
		placement.setDate("5/02/2023"); 
		placement.setQualification("B.E");
		placement.setYear(2022);
		
		Pservice.addPlacement(placement);
		
		placement1.setS_name("Anil");
		placement1.setCollege(college);
		placement1.setDate("18/01/2023");
		placement1.setQualification("B.E");
		placement1.setYear(2022);
		
		Pservice1.addPlacement(placement1);
		
		List<Placement> list=new ArrayList<Placement>();
		list.add(placement1);
		list.add(placement);
		college.setPlacement(list);
		
		System.out.println("Record added");
		*/ 
		
		// Create	// admin and user association
	/*	
		admin.setName("Inzamam");
		admin.setPassword("1234");
		admin.setUser(user);
		
		user.setName("Inzamam");
		user.setType("user");
		user.setPassword("1234");
		user.setAdmin(admin);
		Uservice.addUser(user);	
	
		em.getTransaction().commit();
		System.out.println("Record added ");
		*/
		//======================================================================================
	/*
		// Retrieve Placement record
		System.out.println("Placement Details are : ");
		placement	= Pservice.searchPlacementById(2);
		//college = Cservice.searchCollegeById(122);
		System.out.println("ID is:"+placement.getP_id());
		System.out.println("Student Name is:"+placement.getS_name());
		//System.out.println("College name is:"+college.getCollegeName());
		System.out.println("Qualification is:"+placement.getQualification());
		System.out.println("Date is:"+placement.getDate());
		System.out.println("Year is:"+placement.getYear());
			
		// Retrieve college record
		System.out.println("====================================");
		System.out.println("College Details are : ");
		college = Cservice.searchCollegeById(1);
		System.out.println(college.getId());
		System.out.println("College Admin is : "+college.getCollegeAdmin());
		System.out.println("College name is : "+college.getCollegeName());
		*/
		
		// Retrieve student record
	/*	System.out.println("Student details are...");
		student = Sservice.searchStudentById(2);
		System.out.println("Student id : "+student.getId());
		System.out.println("Student name : "+student.getName());
		System.out.println("Student course : "+student.getCourse());
*/

		// Retrieve certificate record
		certificate = Crserivece.searchCertificateById(1);
		student = Sservice.searchStudentById(1);
		college = Cservice.searchCollegeById(2);
		System.out.println("Certificate id : "+certificate.getId());
		System.out.println("Certificate student name : "+student.getName());
		System.out.println("Certificate college name  : "+college.getCollegeName());
		System.out.println("Certificate year : "+certificate.getYear()); 
		
		//=====================================================================================

		// Update Placement record
	/*	placement	= Pservice.searchPlacementById(82);
		placement.setDate("18 April 2022");
		System.out.println("Update is successful");
*/
		// Update college record

	/*	college = Cservice.searchCollegeById(6);
		college.setLocation("Mumbai");
		college = Cservice.updateCollege(college);
		Pservice.updatePlacement(placement);
		System.out.println("Update is successful");
		*/
		// Update Student record
	/*	  student = Sservice.searchStudentById(1);
		  student.setRoll(001);
*/

		//=====================================================================================
		// Delete Placement record				
	/*	placement	= Pservice.searchPlacementById(4);
		Pservice.cancelPlacement(placement);
		
		System.out.println("Canceled and Deletion is successful");
	*/

	}

	}
