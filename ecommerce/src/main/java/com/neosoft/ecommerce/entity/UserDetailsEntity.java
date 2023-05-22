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
@Table(name="users_details")


public class UserDetailsEntity {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    
	private String username;
    
    private String userPassword;
    private boolean isActive;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId")
    private RoleEntity roleEntity;
    
    @OneToOne(mappedBy = "userDetailsEntity",cascade = CascadeType.ALL)
    private LoginEntity loginEntity;
    
	public UserDetailsEntity() {
		
	}

	public UserDetailsEntity(int userId, String username, String userPassword, int roleId, boolean isActive) {
		super();
		this.userId = userId;
		this.username = username;
		this.userPassword = userPassword;
		this.isActive = isActive;
	}
	
	 public RoleEntity getRoleEntity() {
			return roleEntity;
		}

		public void setRoleEntity(RoleEntity roleEntity) {
			this.roleEntity = roleEntity;
		}

		public LoginEntity getLoginEntity() {
			return loginEntity;
		}

		public void setLoginEntity(LoginEntity loginEntity) {
			this.loginEntity = loginEntity;
		}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	

}
