package com.eureka.delete.app.servicei;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eureka.delete.app.model.Employee;
import com.eureka.delete.app.repository.DeleteRepository;

@Service
public class DeleteServiceImpl implements DeleteServiceI{

	@Autowired
	DeleteRepository dr;
	

	

	@Override
	public void deleteEmployee(int id) {
		
		dr.deleteById(id);
	}
}
