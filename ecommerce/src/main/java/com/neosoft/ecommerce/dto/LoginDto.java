package com.neosoft.ecommerce.dto;

public class LoginDto {
	
	private String password;
	
	
	public LoginDto() {
		
	}

	public LoginDto(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
