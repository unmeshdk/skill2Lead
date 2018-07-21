package com.uk.skill2lead.utils;

import com.uk.skill2lead.dao.CarDAO;
import com.uk.skill2lead.dao.impl.CarDaoImpl;

//TODO 1 Import appropriate packages based on TODOs 2 and 3

//(C)Copyright 2008 SEED Infotech,  All Rights Reserved.
/**
 * 
 * This is a DBUtility class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
public class DBUtility {
	//TODO 2 Declare a static reference dao of type CarDAO pointing to JDBCCarDAO instance
		
	/**
	 * @return	CarDAO a factory for creating DAO 
	 */
	 //TODO 3 Implement a method getCarDAO which returns dao created in TODO 1
	
	public static CarDAO getCarDAO(){
		CarDAO carDao = new CarDaoImpl() ;
		return carDao;
	}
	
}
