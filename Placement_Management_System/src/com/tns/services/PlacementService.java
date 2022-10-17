package com.tns.services;

import com.tns.entities.Placement;

public interface PlacementService
{
	
	public Placement addPlacement(Placement placement);  
	public Placement updatePlacement(Placement placement);  
	public Placement searchPlacementById(int id);   	
	public boolean cancelPlacement(int id);

}
