package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "AnnotationExample [subject=" + subject + "]";
}
@PostConstruct
public void init() {
	System.out.println("initiating anotation based lifecycle");
}
@PreDestroy
public void destroy() {
	System.out.println("destroying anotation based lifecycle");
}
}
