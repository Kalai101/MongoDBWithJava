package com.samco.MongoSqlSpringBoot.EmployeeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.MongoSqlSpringBoot.EmployeeModel.Employee;
import com.samco.MongoSqlSpringBoot.EmployeeService.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping
	public List<Employee>findAllEmployee(Employee employee){
		return service.findAll();
	}
	@PostMapping
	
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.save(employee);
	}
	
	@GetMapping("/resources/{id}")
	public Optional<Employee> FindEmpById(Integer id) {
		
		return Optional.empty();

}
}