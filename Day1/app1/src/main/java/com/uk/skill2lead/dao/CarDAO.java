package com.uk.skill2lead.dao;

import java.util.List;

import com.uk.skill2lead.dto.CarDTO;

//(C)Copyright 2008 SEED Infotech,  All Rights Reserved.
/**
 * 
 * This is a CarDAO class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
public interface CarDAO 
{
    public List<CarDTO> findAll(); 
    public CarDTO findById(int id);
    public void create(CarDTO car);
    public void update(CarDTO car);
    public void delete(String[] ids);
}