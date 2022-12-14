package com.cg.jpastart.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)	//This annotation must be written only on parent class
@DiscriminatorColumn (name="emp_type",discriminatorType=DiscriminatorType. STRING)
@DiscriminatorValue (value="EMPLOYEE")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	private String name;
	private double experiance;
	private double salary;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	public double getExperiance() {
		return experiance;
	}
	public void setExperiance(double experiance) {
		this.experiance = experiance;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}