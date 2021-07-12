package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	@GetMapping("/api/employees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
	log.info("within get all method");
	return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployee());
	}
	
	@PostMapping("/api/employees")
	public ResponseEntity<Employee> createNewEmployee(@RequestBody Employee employee) throws Exception{
		log.info("within post mapping");
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
		
	}
	@GetMapping("/api/employees/{id}")
	
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id){
		log.info("within get by id");
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeById(id));
		
	}
	@GetMapping("/api/employees/find/{employeeId}")
	public ResponseEntity<Employee> getEmployeeByEmployeeId(@PathVariable("employeeId") String employeeId)
	{
		log.info("within get by employeeId");
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getByEmployeeId(employeeId));
	}
}
