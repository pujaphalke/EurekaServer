package com.eureka.create.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.create.app.model.Employee;
import com.eureka.create.app.servicei.CreateServiceI;


@RestController
@RequestMapping("/create")
public class CreateController {

	@Autowired
	CreateServiceI csi;
	
	@PostMapping("/emp")
	public Employee createEmployee(@RequestBody Employee e)
	{
		Employee emp= csi.saveEmployee(e);
		return emp;
	}
	
	
	
}
