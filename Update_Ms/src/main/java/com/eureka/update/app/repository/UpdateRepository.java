package com.eureka.update.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.update.app.model.Employee;

@Repository
public interface UpdateRepository extends JpaRepository<Employee, Integer>{

}
