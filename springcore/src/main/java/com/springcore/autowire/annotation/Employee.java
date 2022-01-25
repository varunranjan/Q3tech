package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String name;
	
	
	private Address address1;
	
	private Degree degree;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getaddress1() {
		return address1;
	}
	@Autowired
	@Qualifier("addr")
	public void setaddress1(Address address1) {
		this.address1 = address1;
	}
	
	public Degree getDegree() {
		return degree;
	}
	@Autowired
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	
	public Employee(Address address1, Degree degree) {
		super();
		this.address1 = address1;
		this.degree = degree;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(Address address1) {
		super();
		this.address1 = address1;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address1=" + address1 + ", degree=" + degree + "]";
	}
	
	
}