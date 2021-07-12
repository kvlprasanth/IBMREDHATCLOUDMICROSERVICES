package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(Integer id);
	public Employee getByEmployeeId(String id);
//	public Employee updateEmployeeByEmployeeId(String EmployeeId,Employee employee);
}
