package com.tns.services;

import com.tns.entities.*;
import com.tns.repository.*;

public class CollegeServiceImpl implements CollegeService
{

	//STEP 1_ESTABLISHING CONNECTION BETWEEN SERVICE AND REPOSITORY FILES
		private CollegeRepository dao;
		
		public CollegeServiceImpl() 
		{
			dao = new CollegeRepositoryImpl();
			
		}
	//STEP 2_SERVICE CALLS TO PERFORM CRUD OPERTAIONS.
		@Override
		public College addCollege(College college)
		{
			 
			dao.beginTransaction();
			dao.addCollege(college);
			dao.commitTransaction();
			return college;
		}		
		
		@Override
		public College updateCollege(College college) 
		{
			 
			dao.beginTransaction();
			dao.updateCollege(college);
			dao.commitTransaction();
			return college;
		
		}

		@Override
		public College searchCollegeById(int id) 
		{
			College cllege=dao.searchCollegeById(id);
			
			
			return cllege;
		}

		@Override
		public boolean deleteCollege(int id)
		{
			dao.beginTransaction();
			dao.deleteCollege(id);
			dao.commitTransaction();
			
			return false;
		}
		
		@Override
		public boolean schedulePlacement(Placement placement)
		{
			dao.beginTransaction();
			//dao.schedulePlacement(placement);
			dao.commitTransaction();
			return false;
		
		}

}