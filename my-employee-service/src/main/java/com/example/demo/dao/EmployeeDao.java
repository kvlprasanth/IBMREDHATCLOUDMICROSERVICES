package com.example.demo.dao;
import java.util.List;
import com.example.demo.model.Employee;

public interface EmployeeDao {
	
	public Employee createEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(Integer id);
	public Employee getByEmployeeId(String id);
}
