package com.eureka.create.app.servicei;

import java.util.List;

import com.eureka.create.app.model.Employee;

public interface CreateServiceI {

	Employee saveEmployee(Employee e);

	List<Employee> getEmployees();

	

}
