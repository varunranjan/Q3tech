package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        StudentDao studentDao = ctx.getBean("studentDao",com.spring.jdbc.dao.StudentDao.class);
        Student student=new Student();
        student.setId(9);
        student.setName("suresh yadav");
        student.setState("Gujrat");
        student.setCity("Rajkot");
        System.out.println( studentDao.insert(student));
    }
}
