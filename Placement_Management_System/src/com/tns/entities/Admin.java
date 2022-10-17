package com.tns.entities;


import java.io.Serializable;
import java.util.*;
import javax.persistence.*;


@SuppressWarnings("unused")
@Entity
@Table(name="admin")
public class Admin {
	

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
		private int A_id;
		private String name;
		private String passwords;
		
		@OneToOne(mappedBy="admin")
		private User user;
		//@OneToOne(cascade=CascadeType.ALL)
		//@JoinColumn(name="u_id")
	
		public int getId() 
		{
			return A_id;
		}
		public void setId(int id)
		{
			this.A_id = id;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public String getPassword() 
		{
			return passwords;
		}
		public void setPassword(String password)
		{
			this.passwords = password;
		}
		public User getUser() 
		{
			return user;
		}
		public void setUser(User user) 
		{
			this.user = user;
		}
		@Override
		public String toString() {
			return  "Admin [A_id=" + A_id + ",name=" + name + ", passwords=" + passwords + ", user=" + user + "]";
		}
}
