package com.uk.skill2lead.dto;

//(C)Copyright 2008 SEED Infotech,  All Rights Reserved.
/**
 * 
 * This is a CarDTO class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
public class CarDTO
{
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	private int id;
    private String make;
    private String model;
    private String modelYear;

    public CarDTO()
    {
        //TODO 1 initialize id to -1 and rest of the member variables to a blank string
		
    }

    //TODO 2 Implement the setter and getter methods
}
