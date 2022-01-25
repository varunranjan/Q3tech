package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(com.spring.orm.Config.class);
        
		
		  Student student = new Student(); student.setId(21);
		  student.setName("Akhilesh Yadav3"); student.setState("Uttar Pradesh");
		  student.setCity("Haridwar");
		 
        StudentDao studentDao = (StudentDao)ctx.getBean("studentDao");
        studentDao.saveStudent(student);
        //studentDao.deletStudent(studentDao.getStudentById(21));
        
        List<Student> s1 = studentDao.getAllStudent();
        for(Student s:s1) {
        	System.out.println(s);
        }
        
        
    }
}
