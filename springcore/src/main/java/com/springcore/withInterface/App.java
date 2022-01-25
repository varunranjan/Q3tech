package com.springcore.withInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//System.out.println("Hello World!" + new Student(12, "varun", "hanuman nagar"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/withInterface/config.xml");
		//System.out.println("context::"+context);
		/*
		 * Student student = (Student) context.getBean("student1"); Student student2 =
		 * (Student) context.getBean("student2"); System.out.println(student2);
		 */
		context.registerShutdownHook();
		Student s = (Student)context.getBean("student1");
		System.out.println("Student:"+s);
	}
}