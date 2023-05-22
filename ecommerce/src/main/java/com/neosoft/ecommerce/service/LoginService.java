package com.neosoft.ecommerce.service;

import com.neosoft.ecommerce.entity.UserDetailsEntity;

public interface LoginService {

	public UserDetailsEntity loginUser( String userName, String password);

}
