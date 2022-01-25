package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		context.registerShutdownHook();
		Employee e = (Employee)context.getBean("e");
		System.out.println(e);
	
	}

}
