package com.tns.entities;



import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@Table(name="user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
	private long u_id;
	private String name;
	private String Types;
	private String password;

		
		//@OneToOne(mappedBy="user")
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="A_id")
		private Admin admin;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="c_id")
		private College college;
		
		
		public long getId()
		{
			return u_id;
		}
		public void setId(long id) 
		{
			this.u_id = id;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public String getType() 
		{
			return Types;
		}
		public void setType(String type) 
		{
			this.Types = type;
		}
		public String getPassword() 
		{
			return password;
		}
		public void setPassword(String password)
		{
			this.password = password;
		}
		public Admin getAdmin() 
		{
			return admin;
		}
		public void setAdmin(Admin admin) 
		{
			this.admin = admin;
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
			return  "User [u_id=" + u_id + ",Types=" + Types +",,password=" + password + ", college=" + college + ", admin=" + admin + "]";
		}
}