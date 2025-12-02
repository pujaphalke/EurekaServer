package com.eureka.delete.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.delete.app.model.Employee;

@Repository
public interface DeleteRepository extends JpaRepository<Employee, Integer>{

}
