package com.Demo.InheritanceInJpa.Entity;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee {
	
	private  int salary;
	
	public FullTimeEmployee() {
		
	}

	

	public FullTimeEmployee(long id,String name, String email,int salary) {
		super(id,name, email);
		this.salary=salary;
		
		
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + "]";
	}
	
	
	

}
