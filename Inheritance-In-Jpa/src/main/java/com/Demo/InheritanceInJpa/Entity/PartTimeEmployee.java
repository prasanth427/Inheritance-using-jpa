package com.Demo.InheritanceInJpa.Entity;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee {
   
	private int hourlywage;

	public  PartTimeEmployee() {
		 
	}

	
	public PartTimeEmployee(long id,String name, String email,int hourlywage) {
		super(id,name, email);
		this.hourlywage = hourlywage;
	}


	public int getHourlywage() {
		return hourlywage;
	}


	public void setHourlywage(int hourlywage) {
		this.hourlywage = hourlywage;
	}


	@Override
	public String toString() {
		return "PartTimeEmployee [hourlywage=" + hourlywage + "]";
	}
	
	
	
	
}
