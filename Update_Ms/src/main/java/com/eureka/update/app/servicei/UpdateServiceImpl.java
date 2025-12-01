package com.eureka.update.app.servicei;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.update.app.model.Employee;
import com.eureka.update.app.repository.UpdateRepository;

@Service
public class UpdateServiceImpl implements UpdateServiceI{

	@Autowired
	UpdateRepository ur;

	@Override
	public Employee updateEmployee(int id, Employee e)
	{
       Optional<Employee> op= ur.findById(id);
       
       if(op.isPresent())
       {
    	 Employee emp=op.get();
    	 emp.setName(e.getName());
    	 emp.setAddress(e.getAddress());
    	 return ur.save(emp);
       }
		return null;
	}
	
	
}
