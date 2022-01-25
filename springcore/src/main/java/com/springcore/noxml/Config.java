package com.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.noxml")
public class Config {

	/*
	 * @Bean(name= {"emp","employee"}) public Employee getEmployee() { return new
	 * Employee(); }
	 */

}
