package com.springcore.withAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Student {
	

	private int studentId;
	private String StudentName;
	private String studentAddress;

	public Student() {
	}
	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		StudentName = studentName;
		this.studentAddress = studentAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	@PostConstruct
	public void afterPropertiesSet() {
		// TODO Auto-generated method stub
		System.out.println("inside init @PostConstruct");
	}
	@PreDestroy
	public void destroy(){
		// TODO Auto-generated method stub
		System.out.println("inside destroy @PreDestroy");
	}
}
