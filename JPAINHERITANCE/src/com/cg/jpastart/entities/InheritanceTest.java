package com.cg.jpastart.entities;

import javax.persistence.*;


public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("inzamam");
		employee.setSalary(10000);
		employee.setExperiance(2.5);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("krushna");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}