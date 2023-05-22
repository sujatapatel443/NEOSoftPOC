package com.neosoft.ecommerce.dto;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class APIRole {
	
	public static Map<String, List<String>> m=new LinkedHashMap<String, List<String>>();
	
	static{
		List<String> list1=new LinkedList<String>();
		list1.add("Admin");list1.add("Basic");list1.add("Elevated");
		
		List<String> list2=new LinkedList<String>();
		list2.add("Admin");list2.add("Elevated");
		
		m.put("/login", list1);
		m.put("/show", list2);
	}

}
