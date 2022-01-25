package com.springcore.noxml2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	/* @Bean(name = { "emp", "employee" }) */
	/* @Bean */
	@Bean(name = "emp")
	public Employee getEmployee() {
		return new Employee(getAddress());
	}
	@Bean(name = "address")
	public Address getAddress() {
		return new Address();
	}

}
