package com.example.demo.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="gdnmenu")
public class GdnMenu {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="item_name")
    private String item_name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="item_image")
	private String item_image;

	public GdnMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GdnMenu(Long id, String item_name, double price, String item_image) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.price = price;
		this.item_image = item_image;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItem_image() {
		return item_image;
	}

	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}
	
	
	

}
