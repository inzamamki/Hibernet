package com.tns.entities;


import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@SuppressWarnings("unused")

@Entity
@Table(name = "certificate")

public class Certificate 
{
		
		@Id // PK
		@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
		private long certificat_id;
		private int year;

		@ManyToOne // M:1    // mapping with college M:1
		@JoinColumn(name = "c_id") // FK
		private College college;

		@OneToOne(cascade = CascadeType.ALL) // 1:1
		@JoinColumn(name = "studentid") // FK
		private Student student;

		
		public long getId() 
		
		{
			return certificat_id;
		}

		public void setId(long id) 
		{
			this.certificat_id = id;
		}

		public int getYear()
		{
			return year;
		}

		public void setYear(int year) 
		{
			this.year = year;
		}

		public Student getStudent()
		{
			return student;
		}

		public void setStudent(Student student) 
		{
			this.student = student;
		}

		public College getCollege()
		{
			return college;
		}

		public void setCollege(College college) 
		{
			this.college = college;
		}
		
		@Override
		public String toString() {
			return  "Certificate [certificat_id=" + certificat_id + ",year=" + year + ", student=" + student + ", college=" + college + "]";
		}


}
