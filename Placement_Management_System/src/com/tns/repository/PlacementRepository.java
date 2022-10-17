package com.tns.repository;

import com.tns.entities.Placement;

public interface PlacementRepository 
{

	
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacementById(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();

}
