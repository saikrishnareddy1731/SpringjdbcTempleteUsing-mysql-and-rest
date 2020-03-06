package com.example.dao;

import java.util.List;

import com.example.dto.Customer;

public interface CustomerDAO 
{
	//customer service declaration
	   public Customer getCustomer(Integer id);
	  
	   public List<Customer> listCustomer();
	  
	   public void delete(Integer id);
	  
	   public void update(Integer id, Integer age);
	   
	   public void create(String name,Integer age);


}
