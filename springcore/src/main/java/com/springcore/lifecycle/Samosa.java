package com.springcore.lifecycle;

public class Samosa {
	private int price;



	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setting samosa price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("initiating samosa");
	}
	
	public void destroy() {
		System.out.println("destroying samosa");
	}

}
