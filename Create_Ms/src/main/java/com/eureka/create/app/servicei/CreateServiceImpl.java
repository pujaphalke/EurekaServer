package com.eureka.create.app.servicei;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.create.app.model.Employee;
import com.eureka.create.app.repository.CreateRepository;

@Service
public class CreateServiceImpl implements CreateServiceI{

	@Autowired
	CreateRepository cr;

	@Override
	public Employee saveEmployee(Employee e) {
		return cr.save(e);
	}

	@Override
	public List<Employee> getEmployees() {
		return cr.findAll();
	}

	
}
