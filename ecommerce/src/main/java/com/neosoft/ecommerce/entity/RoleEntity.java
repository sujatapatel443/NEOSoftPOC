package com.neosoft.ecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="role_details")


public class RoleEntity {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId;
    
    private String roleName;
    
    @OneToOne(mappedBy = "roleEntity",cascade = CascadeType.ALL)
    private UserDetailsEntity userDetailsEntity;
    
	public RoleEntity() {
		
	}

	public RoleEntity(int roleId, int userId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	
	public UserDetailsEntity getUserDetailsEntity() {
		return userDetailsEntity;
	}

	public void setUserDetailsEntity(UserDetailsEntity userDetailsEntity) {
		this.userDetailsEntity = userDetailsEntity;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
}
