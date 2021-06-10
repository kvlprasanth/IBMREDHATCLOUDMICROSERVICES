package com.app1;

import java.util.Scanner;

import com.example1.Employee;
import com.example1.Engineer;
import com.example1.Manager;
import static java.lang.System.out;
import static java.lang.System.in;
import static com.example1.Employee.max;
import static java.lang.Math.PI;
import static com.example1.EmployeeType.HOORLY_PAID;
import static com.example1.EmployeeType.SALARIED;
public class App {
	
	private static Scanner scanner=new Scanner(in);
	private Employee[] employees;
	
	{
		employees=new Employee[5];
	}
	public static void main(String args[])
	{
		int a=max;
		System.out.println(a);
		System.out.println(PI);
		App app=new App();
		app.employees[0]=new Employee(10, "John", "Doe", "john@email.com",SALARIED);
		app.employees[1]=new Manager(20, "Marry", "Public", "marry@email.com", HOORLY_PAID,"Sales");
		app.employees[2]=new Engineer(30, "Sachin", "Tendulkar", "sachin@email.com", SALARIED, "Mechanical");
		
		
		//enhanched for loop
		for(Employee employee : app.employees)
		{
			System.out.println(employee);
		}
		
		//standard for loop
		for(int i=0;i<app.employees.length;i++)
		{
			out.println(app.employees[i]);
		}
		
	}

}