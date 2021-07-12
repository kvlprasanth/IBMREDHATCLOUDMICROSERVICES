package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Employee;

@Repository
@EnableTransactionManagement
public class EmployeeDaoImpl implements EmployeeDao {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}
	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		
		Query query=entityManager.createQuery("SELECT B FROM Employee B",Employee.class);
		
		return query.getResultList();
	}
	@Override
	@Transactional
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
		Employee employee1=entityManager.find(Employee.class, id);
		if(employee1==null) {
			throw new EmployeeNotFoundException("employee with the given id not found");
		}
		
		return employee1;
		
	}
	@Override
	public Employee getByEmployeeId(String id) {
		Query query=entityManager.createQuery("SELECT B FROM EMPLOYEE B WHERE B.employeeId=:bId",Employee.class);
		query.setParameter("bId", id);
		@SuppressWarnings("unchecked")
		List<Employee> list=query.getResultList();
		if(list.isEmpty())
		{
			throw new EmployeeNotFoundException("employee with the given employee_id not found.");
		}
		return list.get(0);
	}
	
}
	
