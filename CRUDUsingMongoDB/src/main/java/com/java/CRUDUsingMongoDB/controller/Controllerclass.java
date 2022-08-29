package com.java.CRUDUsingMongoDB.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.java.CRUDUsingMongoDB.Model.Employee;
import com.java.CRUDUsingMongoDB.service.ServiceClass;

@RestController
@RequestMapping("/emp")
public class Controllerclass  {
	
	@Autowired
	ServiceClass service;
	
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp(Employee employee) {
		return service.findAll();
	}
	
	@PostMapping
	public Employee save(@RequestBody Employee employee){
		return service.save(employee);
	}
	@GetMapping
	public boolean exsistsbyId(Integer id) {
		return service.existsById(id);
		
	}
	
	 @ResponseBody
	 @RequestMapping("/{id}") 
	 public Optional<Employee>getbyId(@PathVariable("id") Integer empid) {
	 return service.findById(empid); 
    }
	 
}


