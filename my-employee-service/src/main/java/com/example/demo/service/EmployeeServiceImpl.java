package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
@Service

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeServiceImpl (EmployeeDao employeeDao) {
		this.employeeDao=employeeDao;
	}
	@Override
	public Employee createEmployee(Employee employee) {
		String[] str=UUID.randomUUID().toString().split("-");
		employee.setEmployeeId(str[0]);
		return employeeDao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	}
	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}
	@Override
	public Employee getByEmployeeId(String id) {
		
		return employeeDao.getByEmployeeId(id);
	}

}
