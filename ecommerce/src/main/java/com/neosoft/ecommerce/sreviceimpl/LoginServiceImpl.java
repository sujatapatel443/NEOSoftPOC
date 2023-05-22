package com.neosoft.ecommerce.sreviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.ecommerce.entity.UserDetailsEntity;
import com.neosoft.ecommerce.repository.UserDetailsRepository;
import com.neosoft.ecommerce.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	public UserDetailsEntity loginUser( String userName, String password) {
		
		UserDetailsEntity userDetailsEntity=userDetailsRepository.findByUsername(userName);
		
		if(userDetailsEntity.getUserPassword().equals(password)) {
			return userDetailsEntity;
		}
		
		return null;
		
	}

}
