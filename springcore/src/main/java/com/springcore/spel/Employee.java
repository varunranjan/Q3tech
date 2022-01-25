package com.springcore.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component()
public class Employee {
	@Value("Varun Ranjan")
	private String name;
	
	@Value("#{T(com.springcore.spel.Mathematics).add(2,4)}")
	private double totalSum;
	
	@Value("#{T(com.springcore.spel.Mathematics).x}")
	private int x;
	
	@Value("#{new com.springcore.spel.Mathematics().y}")
	private int y;
	
	
	@Value("#{phoneList}")
	private List<String> phones;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	
	
	public double getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(double totalSum) {
		this.totalSum = totalSum;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", totalSum=" + totalSum + ", x=" + x + ", y=" + y + ", phones=" + phones
				+ "]";
	}
	
	

	
	
}
