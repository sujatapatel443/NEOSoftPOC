package com.neosoft.ecommerce.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class RoleInterceptorAppConfig extends WebMvcConfigurerAdapter {
	   @Autowired
	   RoleInterceptor roleInterceptor;

	   @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(roleInterceptor);
	   }
	}


