package com.tns.repository;

import com.tns.entities.User;

public interface UserRepository 
{
	
	public User addNewUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);

	public abstract void beginTransaction();
	public abstract void commitTrasaction();

}