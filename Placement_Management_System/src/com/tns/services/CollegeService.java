package com.tns.services;

import com.tns.entities.College;
import com.tns.entities.Placement;

public interface CollegeService
{

	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollegeById(int id);
	public boolean deleteCollege(int id);
	public boolean schedulePlacement(Placement placement);

}