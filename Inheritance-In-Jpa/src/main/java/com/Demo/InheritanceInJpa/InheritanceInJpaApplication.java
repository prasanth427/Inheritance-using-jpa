package com.Demo.InheritanceInJpa;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Demo.InheritanceInJpa.Entity.FullTimeEmployee;
import com.Demo.InheritanceInJpa.Entity.PartTimeEmployee;
import com.Demo.InheritanceInJpa.Repo.EmployeeRepository;

@SpringBootApplication
public class InheritanceInJpaApplication implements CommandLineRunner {
	@Autowired
	 EmployeeRepository Repo;
	
	
	private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(InheritanceInJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Repo.insert(new PartTimeEmployee(1001,"Prasanth","prasanth@gmail.com", 50));
		Repo.insert(new FullTimeEmployee(1002,"Pavan","pavan@gamil.com",1000));
		
		logger.info(" fetch all employees --> {}", Repo.retriveAll());
		
	}

}
