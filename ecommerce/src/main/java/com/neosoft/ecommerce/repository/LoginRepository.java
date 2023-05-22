package com.neosoft.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.neosoft.ecommerce.entity.LoginEntity;

public interface LoginRepository extends CrudRepository<LoginEntity, Integer>{

}
