package com.example.demo.Storage;

public class MenuWithTableName {
	
	private Long id;
	
	private String item_name;
	
	private String item_image;
	
	private double price;
	
	private String tableName;

	
	public MenuWithTableName() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuWithTableName(Long id, String item_name, String item_image, double d, String tableName) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.item_image = item_image;
		this.price = d;
		this.tableName = tableName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
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

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	

}
