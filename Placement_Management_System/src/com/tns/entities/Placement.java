package com.tns.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@Table(name="placement")


public class Placement  implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
	private long p_id;
	private String s_name;
	private LocalDate date;
	private String qualification;
	private int year;
	
	
	@ManyToOne							//Association M:1
	@JoinColumn(name="c_id")
	private College college;
	
	public long getP_id()
	{
		return p_id;
	}
	public void setP_id(long p_id)
	{
		this.p_id = p_id;
	}
	public String getS_name()
	{
		return s_name;
	}
	public void setS_name(String s_name)
	{
		this.s_name = s_name;
	}
	
	public String getQualification()
	{
		return qualification;
	}
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public College getCollege() 
	{
		return college;
	}
	public void setCollege(College college)
	{
		this.college = college;
	}
	public LocalDate getDate() 
	{
		return date;
	}
	public void setDate(LocalDate date)
	{
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return  "Placement [p_id=" + p_id + ",date=" + date + ", s_name=" + s_name + ", qualification=" + qualification
				+ ", year=" + year + ", college=" + college + "]";
	}
}

