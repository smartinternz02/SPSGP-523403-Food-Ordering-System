package com.example.demo.Storage;


public class AddRestaurant {
	
	private String name;
	
	private String image;
	
	private double rating;
	

	public AddRestaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddRestaurant(String name, String image, double rating) {
		super();
		this.name = name;
		this.image = image;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
