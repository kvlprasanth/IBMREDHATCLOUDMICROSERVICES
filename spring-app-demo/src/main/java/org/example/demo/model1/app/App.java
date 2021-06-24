package org.example.demo.model1.app;

import org.example.demo.model.InternationalCD;
import org.example.demo.model.SpecialEdisionCD;
import org.example.demo.model1.MyInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	 public static void main( String[] args ) {
		 
		 
		 try {
			 
			 @SuppressWarnings("resource")
				ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			
			 MyInterface cd1=context.getBean("cd1",MyInterface.class);
			 System.out.println(cd1.getDetails());
			 
		} catch (Exception e) {
	
		}
	 }
	
	

}
