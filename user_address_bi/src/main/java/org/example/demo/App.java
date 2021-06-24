package org.example.demo;
import java.util.UUID;
import java.util.logging.Logger;

import org.example.demo.model.Address;

import org.example.demo.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
					.addAnnotatedClass(Users.class).addAnnotatedClass(Address.class)
					.buildSessionFactory();
			Session session = factory.getCurrentSession();
			
			Address a=new Address();
			a.setStreetName("brahmin street");
			a.setCity("sullurupeta");
			Users u=new Users();
			u.setUserName("prasanth");
			
			u.setAddress(a);
			u.setAddress_id(2);
			a.setUser(u);
			u.setAddress(a);
			session.getTransaction().begin();
			session.persist(u);
			session.persist(a);
			session.getTransaction().commit();
			System.out.println("done");
			
			
			
    		
    		
    		  } catch (Exception e) {
			// TODO: handle exception
    			  e.printStackTrace();
		}
    }
}
