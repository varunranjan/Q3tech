package com.springcore.autowire.xml;



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
	public void setaddress1(Address address1) {
		this.address1 = address1;
	}
	
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Degree degree,Address address1) {
		super();
		this.degree = degree;
		this.address1 = address1;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address1=" + address1 + ", degree=" + degree + "]";
	}
	
	
}