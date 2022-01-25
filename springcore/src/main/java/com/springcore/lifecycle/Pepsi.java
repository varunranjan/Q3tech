package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
	System.out.println("setting value of Pepsi");
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
}




}
