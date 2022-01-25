package com.springcore.withAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//System.out.println("Hello World!" + new Student(12, "varun", "hanuman nagar"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/withAnnotation/config.xml");

		context.registerShutdownHook();
		Student s = (Student)context.getBean("student1");
		System.out.println("Student:"+s);
	}
}