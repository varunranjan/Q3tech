package com.springcore.autowire.xml;

public class Degree {
private String higherDegree;

public String getHigherDegree() {
	return higherDegree;
}

public void setHigherDegree(String higherDegree) {
	this.higherDegree = higherDegree;
}

public Degree(String higherDegree) {
	super();
	this.higherDegree = higherDegree;
}

public Degree() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Degree [higherDegree=" + higherDegree + "]";
}

}
