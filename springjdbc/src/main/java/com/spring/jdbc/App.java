package com.spring.jdbc;

import java.util.List;

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
        AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao = ctx.getBean("studentDaoImpl",StudentDao.class);
        Student student=new Student();
        student.setId(3);
        student.setName("Ravi Ranjan3");
        student.setState("Haryana3");
        student.setCity("jhajhar3");
       // System.out.println( studentDao.insert(student));
       // System.out.println( studentDao.update(student));
        //System.out.println( studentDao.delete(3));
        System.out.println( studentDao.getStudent(2));
        System.out.println("------------------------------");
        List<Student> studentList = studentDao.getAllStudent();
        for(Student s:studentList) {
        	System.out.println( s);
        }
        
    }
}
