package com.eureka.create.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.create.app.model.Employee;

@Repository
public interface CreateRepository extends JpaRepository<Employee, Integer>{

}
