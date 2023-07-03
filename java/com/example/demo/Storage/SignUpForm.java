package com.example.demo.Storage;

public class SignUpForm {
    private String name;
    private String mobile;
    private String hostel;
    private String block;
    private String username;
    private String password;
    private String correctPassword;
    
    
	public SignUpForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignUpForm(String name, String mobile, String hostel, String block, String username, String password,
			String correctPassword) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.hostel = hostel;
		this.block = block;
		this.username = username;
		this.password = password;
		this.correctPassword = correctPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHostel() {
		return hostel;
	}
	public void setHostel(String hostel) {
		this.hostel = hostel;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCorrectPassword() {
		return correctPassword;
	}
	public void setCorrectPassword(String correctPassword) {
		this.correctPassword = correctPassword;
	}
    

   }
