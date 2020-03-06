package com.example.dao;

import java.util.List;

import com.example.dto.Invoice;


public interface InvoiceDAO
{
	//employee service declaration
	   public Invoice getInvoice(Integer id);
	  
	   public List<Invoice> listInvoice();
	  
	   public void delete(Integer id);
	  
	   public void update(Integer id, Integer age);
	   
	   public void create(String name,Integer age);


}
