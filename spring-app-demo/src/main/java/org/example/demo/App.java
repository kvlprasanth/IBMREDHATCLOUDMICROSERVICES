package org.example.demo;

import org.example.demo.model.CD;
import org.example.demo.model.Coach;
import org.example.demo.model.CricketCoach;
import org.example.demo.model.Employee;
import org.example.demo.model.InternationalCD;
import org.example.demo.model.SpecialEdisionCD;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {

			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			/*
			 * Coach theCoach=context.getBean("theCoach",Coach.class);
			 * System.out.println(theCoach.getDailyWorkOut());
			 */
			/*
			 * Employee e=context.getBean("e",Employee.class);
			 * System.out.println(e.getFirstName());
			 * 
			 * SpecialEdisionCD cd=context.getBean("cd",SpecialEdisionCD.class);
			 * System.out.println(cd.getDetails());
			 */
			
			Coach tempFortune=context.getBean("ch3",CricketCoach.class);
			System.out.println(tempFortune.getDailyFortune());
			System.err.println(tempFortune.getDailyWorkOut());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
