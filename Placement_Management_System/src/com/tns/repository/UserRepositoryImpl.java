package com.tns.repository;


import javax.persistence.EntityManager;

import com.tns.entities.User;

public class UserRepositoryImpl implements UserRepository
{

	private EntityManager entityManager;
	public UserRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	// Create operation - Repo/DAO


	@Override
	public User addNewUser(User user) 
	{
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user)
	{
		entityManager.merge(user);
		return user;
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();

	}

	@Override
	public void commitTrasaction() 
	{
		entityManager.getTransaction().commit();

	}


	@Override
	public User deleteUser(int id) 
	{
	User user= entityManager.find(User.class, id);
		entityManager.remove(user);
		return user;
	}

}