package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.dto.Invoice;

public class InvoiceMapper implements RowMapper<Invoice> 
{

	@Override
	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Invoice invoice=new Invoice();
		invoice.setName(rs.getString("name"));
		invoice.setAge(rs.getInt("age"));
		// TODO Auto-generated method stub
		return invoice;
	}

}
