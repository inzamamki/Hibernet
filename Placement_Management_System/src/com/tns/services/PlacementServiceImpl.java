package com.tns.services;


import com.tns.entities.*;
import com.tns.repository.*;

public class PlacementServiceImpl implements PlacementService
{

	// Step 1: Establishing connection between Service and Repository
		private PlacementRepository dao;
		
		public PlacementServiceImpl() 
		{
			dao = new PlacementRepositoryImpl();
			
		}
		// Step 2: Service calls to perform CRUD Operation

		@Override
		public Placement addPlacement(Placement placement) 
		{
			dao.beginTransaction();
			dao.addPlacement(placement);
			dao.commitTrasaction();
			return placement;
			}

		@Override
		public Placement updatePlacement(Placement placement) 
		{
			dao.beginTransaction();
			dao.updatePlacement(placement);
			dao.commitTrasaction();
			return placement;
		}

		@Override
		public Placement searchPlacementById(int id) 
		{
			Placement placement = dao.searchPlacementById(id);

			return placement;
		}


		@Override
		public boolean cancelPlacement(int id)
		{
			dao.beginTransaction();
			 dao.searchPlacementById(id);
			dao.commitTrasaction();
			return false;
		}

}