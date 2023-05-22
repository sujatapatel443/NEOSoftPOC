package com.neosoft.ecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login_details")


public class LoginEntity {
	

    

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loginId;
    
    private String username;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private UserDetailsEntity userDetailsEntity;
    
	public LoginEntity() {
		
	}

	public LoginEntity(int loginId, int userId, String username) {
		this.loginId = loginId;
		this.username = username;
	}
	public UserDetailsEntity getUserDetailsEntity() {
		return userDetailsEntity;
	}

	public void setUserDetailsEntity(UserDetailsEntity userDetailsEntity) {
		this.userDetailsEntity = userDetailsEntity;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
