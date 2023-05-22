package com.neosoft.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.neosoft.ecommerce.entity.UserDetailsEntity;

public interface UserDetailsRepository extends CrudRepository<UserDetailsEntity, Integer>{
	
	UserDetailsEntity findByUsername(String username);

}
