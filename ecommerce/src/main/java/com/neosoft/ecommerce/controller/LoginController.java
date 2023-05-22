package com.neosoft.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.ecommerce.dto.LoginDto;
import com.neosoft.ecommerce.entity.UserDetailsEntity;
import com.neosoft.ecommerce.sreviceimpl.LoginServiceImpl;

@RestController
public class LoginController {
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ResponseEntity<String> loginUser(@RequestParam String userName, @RequestBody LoginDto loginDto) {
		System.out.println("loginUser..started...................");
		
		UserDetailsEntity userDetailsEntity=(UserDetailsEntity)loginServiceImpl.loginUser(userName, loginDto.getPassword());
		
		if(null !=userDetailsEntity)
		return new ResponseEntity("User Logged in Successfully",HttpStatus.OK);
		else {
			return new ResponseEntity("Failed",HttpStatus.BAD_REQUEST);
		}
	}

}
