package com.springcore.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Employee e = context.getBean("employee",Employee.class);
		System.out.println(e);
	
	}

}
