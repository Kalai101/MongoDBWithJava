package com.java.CRUDUsingMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.java.CRUDUsingMongoDB.Model.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
