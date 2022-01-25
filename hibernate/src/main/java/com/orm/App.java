package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Student s = new Student();
//        s.setId(10);
//        s.setName("Mohan");
//        s.setState("Nepal");
//        s.setCity("kathmandu");
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.config.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //System.out.println(sessionFactory);
		
		  Session session = sessionFactory.openSession();
		  Student student = session.load(com.orm.entity.Student.class, 10);
		  System.out.println(student.getId());
//		  Transaction tx = session.beginTransaction(); 
//		  session.save(s); 
//		  tx.commit(); 
		  session.close();
		
        
        
    }
}
