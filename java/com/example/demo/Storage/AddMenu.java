package com.example.demo.Storage;

public class AddMenu {

private String item_name;
	
	private String item_image;
	
	private double price;

	public String getItem_name() {
		return item_name;
	}

	public AddMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddMenu(String item_name, String item_image, double price) {
		super();
		this.item_name = item_name;
		this.item_image = item_image;
		this.price = price;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_image() {
		return item_image;
	}

	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
