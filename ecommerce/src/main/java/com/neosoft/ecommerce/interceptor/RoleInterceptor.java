package com.neosoft.ecommerce.interceptor;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.neosoft.ecommerce.dto.APIRole;
import com.neosoft.ecommerce.entity.RoleEntity;
import com.neosoft.ecommerce.entity.UserDetailsEntity;
import com.neosoft.ecommerce.repository.UserDetailsRepository;

@Component
public class RoleInterceptor implements HandlerInterceptor {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Autowired
	APIRole aPIRole;
	   
	   @Override
	   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		   
		   String uname=(String) request.getParameter("userName");
		   System.out.println("uname :"+uname);
		   String uri=request.getRequestURI();
		   System.out.println("uri :"+uri);
		   
		   UserDetailsEntity userDetailsEntity=userDetailsRepository.findByUsername(uname);
		   RoleEntity roleEntity= userDetailsEntity.getRoleEntity();
		   String role=roleEntity.getRoleName();
		   
		   Map<String, List<String>> roleMap=aPIRole.m;
		   
		   List<String> roleList=roleMap.get(uri);
		   
		   if(roleList.contains(role)) {
			   return true;
		   }
		   
	      return false;
	   }
	   @Override
	   public void postHandle(
	      HttpServletRequest request, HttpServletResponse response, Object handler, 
	      ModelAndView modelAndView) throws Exception {}
	   
	   @Override
	   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
	      Object handler, Exception exception) throws Exception {}
	}


