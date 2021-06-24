package org.example.demo;

import org.example.demo.model.Student;
import org.example.demo.model.University;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Configuration;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   
    	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(University.class).addAnnotatedClass(Student.class).buildSessionFactory();
				
    	   
    	  Session session=factory.getCurrentSession();
    	 University un=new University();
    	 
    	 un.setCountry("india");
    	 un.setName("JNTU");
    	
    	 session.getTransaction().begin();
    	 
    	 Student st=new Student();
    	 st.setFirstName("kvl");
    	 st.setLastName("prasanth");
    	 st.setSection("A");
    	 
    	 un.add(st);
    	 Student st2=new Student();
    	 st2.setFirstName("john");
    	 st2.setLastName("cena");
    	 st2.setSection("B");
    	
    	 un.add(st2);
    	 session.persist(un);
    	 session.getTransaction().commit();
    	 System.out.println("done");
    	 
    	  
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
