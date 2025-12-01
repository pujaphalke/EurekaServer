package com.eureka.update.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.update.app.model.Employee;
import com.eureka.update.app.servicei.UpdateServiceI;

@RestController
@RequestMapping("/update")
public class UpdateController {

	@Autowired
	UpdateServiceI usi;
	
	@PutMapping("/emp/{id}")
	public Employee updateEmployee(@RequestBody Employee e,
			                        @PathVariable("id")int id)
	{
		Employee emp = usi.updateEmployee(id,e);
		return emp;
	}
}
