package com.tns.repository;

import com.tns.entities.*;
;

public interface CollegeRepository
{

	   public College addCollege(College college);
	   public College updateCollege(College college);
	   public College searchCollegeById(int id);
	   public boolean deleteCollege(int id);
	   
	   public abstract void beginTransaction();
	   public abstract void commitTransaction();

}