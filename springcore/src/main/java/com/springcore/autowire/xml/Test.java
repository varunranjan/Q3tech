package com.springcore.autowire.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/xml/config.xml");
		context.registerShutdownHook();
		Employee e = (Employee)context.getBean("emp");
		System.out.println(e);
	
	}

}