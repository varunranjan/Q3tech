package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/collectionconfig.xml");
		Emp employee = (Emp)context.getBean("employee1");
		System.out.println("employee:"+employee);
		//System.out.println("employee:"+employee.getPhones());
	}
}