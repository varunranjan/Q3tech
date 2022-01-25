package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	
	@Value("Varun Ranjan")
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	
	
	
	
	
}
