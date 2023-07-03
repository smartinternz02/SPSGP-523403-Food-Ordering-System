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
@Table(name="login")
public class SignUpCustomer 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="mobile")
    private String mobile;
	
	@Column(name="hostel")
    private String hostel;
	
	@Column(name="block")
    private String block;
	
	@Column(name="username")
    private String username;
	
	@Column(name="password")
    private String password;
	
	

	public SignUpCustomer(Long id, String name, String mobile, String hostel, String block, String username,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.hostel = hostel;
		this.block = block;
		this.username = username;
		this.password = password;
	}

	public SignUpCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	
	
	
	 
}
