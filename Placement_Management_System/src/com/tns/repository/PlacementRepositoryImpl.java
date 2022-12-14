package com.tns.repository;


import javax.persistence.EntityManager;

import com.tns.entities.Placement;

public class PlacementRepositoryImpl implements PlacementRepository
{
	//Step 1: Start JPA LifeCycle
		private EntityManager entityManager;
		public PlacementRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}

		// Create operation - Repo/DAO
	@Override
	public Placement addPlacement(Placement placement)
	{
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement)
	{
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacementById(int id)
	{
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
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

}
