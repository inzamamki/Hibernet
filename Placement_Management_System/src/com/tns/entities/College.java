package com.tns.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@Table(name="college")

public class College implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id // PK
		@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
		private long c_id;
		private String collegeName;
		private String location;
		
		@OneToOne(cascade = CascadeType.ALL) // 1:1
		@JoinColumn(name = "u_id") // FK
		private User user;	
			
	@OneToMany(mappedBy="college",cascade=CascadeType.PERSIST)    // association with placement 1:M
	private List<Placement> placement;

	@OneToMany(mappedBy="college",cascade=CascadeType.PERSIST)		// association student 1:M
	private List<Student> student;
	
	@OneToMany(mappedBy="college",cascade=CascadeType.PERSIST)		// association with certificate 1:M
	private List<Certificate> certificate;
	
	public long getId() 
	{
		return c_id;
	}

	public void setId(long id)
	{
		this.c_id = id;
	}

	public String getCollegeName()
	{
		return collegeName;
	}

	public void setCollegeName(String collegeName) 
	{
		this.collegeName = collegeName;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public List<Student> getStudent() 
	{
		return student;
	}

	public void setStudent(List<Student> student)
	{
		this.student = student;
	}

	public List<Certificate> getCertificate() 
	{
		return certificate;
	}

	public void setCertificate(List<Certificate> certificate) 
	{
		this.certificate = certificate;
	}


	public User getUser()
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}

	public List<Placement> getPlacement() 
	{
		return placement;
	}

	public void setPlacement(List<Placement> placement) 
	{
		this.placement = placement;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return  "College [c_id=" + c_id + ",collegeName=" + collegeName + ", location=" + location + ", user=" + user + ","
				+ " student=" + student + ", certificate=" + certificate + ", placement=" + placement + "]";
	}

}