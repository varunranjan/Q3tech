package com.spring.orm;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

	public class Test {
	public String getProperty(String key) {
		String value = "";
		try {
			FileReader reader = new FileReader("application.properties");
			System.out.println(reader);
			Properties p = new Properties();
			p.load(reader);
			value = p.getProperty(key);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test t = new Test();
		System.out.println("1:"+t.getProperty("hibernate.dialect"));
		System.out.println("2:"+t.getProperty("hibernate.show_sql"));
		System.out.println("3:"+t.getProperty("hibernate.hbm2ddl.auto"));
		
	}

}
