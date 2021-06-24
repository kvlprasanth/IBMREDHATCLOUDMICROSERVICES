package org.example.demo.model2.app;



import org.example.demo.model2.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
 public static void main( String[] args ) {
		 
		 
		 try {
			 
			 @SuppressWarnings("resource")
				ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
			Customer customer=context.getBean("cust1",Customer.class);
			System.out.println(customer);
			 
		} catch (Exception e) {
	
		}
	 }

}
