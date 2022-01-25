package com.springcore.ref;

public class A {
	private int y;
	private B bObj;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public B getbObj() {
		return bObj;
	}
	public void setbObj(B bObj) {
		this.bObj = bObj;
	}
	@Override
	public String toString() {
		return "A [y=" + y + ", bObj=" + bObj + "]";
	}
	
}
