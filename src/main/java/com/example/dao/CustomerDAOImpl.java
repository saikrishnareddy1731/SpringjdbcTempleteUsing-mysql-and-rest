package com.example.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO 
{
	Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	public void setupDB()
	{
		jdbcTemplateObject.execute("DROP TABLE  IF EXISTS customer");
		jdbcTemplateObject.execute("CREATE TABLE customer " + "(" + "name VARCHAR(255),age INT,id SERIAL)");
	}
	@Override
	@Transactional
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		String SQL="insert into customer (name,age) values(?,?)";
		jdbcTemplateObject.update(SQL,name,age);
		logger.debug("Create rocord name" + name + "age" + age);
		return;
	}

	@Override
	public Customer getCustomer(Integer id)
	{
		String SQL="select * from customer where id=?";
		Customer customer=jdbcTemplateObject.queryForObject(SQL, new Object[] {id}, new CustomerMapper());
		logger.debug("value",jdbcTemplateObject.queryForObject(SQL, new Object[] {id},new CustomerMapper()));
		logger.debug("value of cus->" +customer.toString());
		
		// TODO Auto-generated method stub
		return customer;
	}

	@Override
	public List<Customer> listCustomer()
	{
		String SQL="select * from customer";
		List<Customer> customers=jdbcTemplateObject.query(SQL, new CustomerMapper());
		logger.debug("in debug");
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	@Transactional
	public void delete(Integer id) 
	{
		String SQL="delete from customer where id=?";
		jdbcTemplateObject.update(SQL,id);
		logger.debug("Deleted record id" + id);
		return;
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void update(Integer id, Integer age)
	{
		String SQL="update customer set age=? where id=?";
		jdbcTemplateObject.update(SQL,age,id);
		logger.debug("Updated record with id" + id);
		// TODO Auto-generated method stub

	}

	

}
