package com.uk.skill2lead.dao.impl;

import java.util.LinkedList;
import java.util.List;

import com.uk.skill2lead.dao.CarDAO;
import com.uk.skill2lead.dto.CarDTO;

public class CarDaoImpl implements CarDAO{

	
	private List<CarDTO> carDTO;
	
	@Override
	public List<CarDTO> findAll() {
		// TODO Auto-generated method stub
		return new LinkedList<CarDTO>();
	}

	@Override
	public CarDTO findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(CarDTO car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CarDTO car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String[] ids) {
		// TODO Auto-generated method stub
		
	}

}
