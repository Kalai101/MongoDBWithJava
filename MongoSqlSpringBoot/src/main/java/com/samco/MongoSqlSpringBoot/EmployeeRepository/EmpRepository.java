package com.samco.MongoSqlSpringBoot.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samco.MongoSqlSpringBoot.EmployeeModel.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{
	
}
