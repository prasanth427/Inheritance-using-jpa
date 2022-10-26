package com.Demo.InheritanceInJpa.Repo;

import java.util.List;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Demo.InheritanceInJpa.Entity.Employee;

@Repository
@Transactional
public class EmployeeRepository {
 
	@Autowired
	EntityManager em;
	
	
	public void insert(Employee employee) {
	 em.persist(employee);
	}
	
	public List<Employee> retriveAll(){
		return  em.createQuery("select e from Employee e",Employee.class).getResultList();
		
	}
	
}
