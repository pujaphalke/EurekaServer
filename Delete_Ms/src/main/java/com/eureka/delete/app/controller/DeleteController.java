package com.eureka.delete.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.delete.app.servicei.DeleteServiceI;
import com.eureka.delete.app.model.Employee;

@RestController
@RequestMapping("/delete")
public class DeleteController {

	@Autowired
	DeleteServiceI dsi;
	
	
	@DeleteMapping("/emp/{id}")
	public void deleteEmployee(@PathVariable("id")int id)
	{
	  dsi.deleteEmployee(id);	
	}
}
