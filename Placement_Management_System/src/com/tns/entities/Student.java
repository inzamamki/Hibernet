package com.tns.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@Table(name = "student")

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
	private long Student_id;
	private String name;
	private int roll;
	private String qualification;
	private String course;
	private int year;
	private long hallTicketNo;

		
		@OneToOne(cascade=CascadeType.ALL)  //mapping with certificate 1:1
		@JoinColumn(name="certificat_id")
		private Certificate certificate;
		
		@ManyToOne							//mapping with college M:1
		@JoinColumn(name = "c_id")
		private College college;

		/* ------------------- GS------------------- */
		
		public long getId() 
		{
			return Student_id;
		}

		public void setId(long id)
		{
			this.Student_id = id;
		}

		public String getName() 
		{
			return name;
		}

		public void setName(String name) 
		{
			this.name = name;
		}

		public int getRoll() 
		{
			return roll;
		}

		public void setRoll(int roll)
		{
			this.roll = roll;
		}

		public String getQualification()
		{
			return qualification;
		}

		public void setQualification(String qualification)
		{
			this.qualification = qualification;
		}

		public String getCourse() 
		{
			return course;
		}

		public void setCourse(String course) 
		{
			this.course = course;
		}

		public int getYear() 
		{
			return year;
		}

		public void setYear(int year)
		{
			this.year = year;
		}

		public Certificate getCertificate() 
		{
			return certificate;
		}

		public void setCertificate(Certificate certificate) 
		{
			this.certificate = certificate;
		}

		public long getHallTicketNo() 
		{
			return hallTicketNo;
		}

		public void setHallTicketNo(long hallTicketNo)
		{
			this.hallTicketNo = hallTicketNo;
		}

		public College getCollege()
		{
			return college;
		}

		public void setCollege(College college) 
		{
			this.college = college;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return  "Student [Student_id=" + Student_id + ",college=" + college + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
					+ ", year=" + year + ", hallTicketNo=" + hallTicketNo + ", college=" + college + " , certificate=" + certificate +"]";
		}

}
