package com.example.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.Invoice;


@Repository
public class InvoiceDAOImpl implements InvoiceDAO {
	
	Logger logger=LoggerFactory.getLogger(InvoiceDAOImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	public void setupDB()
	{
        jdbcTemplateObject.execute("DROP TABLE IF EXISTS invoice ");
		jdbcTemplateObject.execute("CREATE TABLE invoice" + "(" +"name VARCHAR(255),age INT,id SERIAL)");
	}
	@Override
	@Transactional
	public void create(String name, Integer age)
	{
		String SQL="insert into invoice(name,age) values(?,?)";
		jdbcTemplateObject.update(SQL,name,age);
		return;
		// TODO Auto-generated method stub

	}

	@Override
	public Invoice getInvoice(Integer id) 
	{
		String SQL="select * from invoice where id=?";
		Invoice invoice=jdbcTemplateObject.queryForObject(SQL, new Object[] {id}, new InvoiceMapper());
		//logger.debug(jdbcTemplateObject.queryForObject(SQL, new Object[] {id}, new InvoiceMapper()));
		logger.debug("value",jdbcTemplateObject.queryForObject(SQL, new Object[] {id},new InvoiceMapper()));
		logger.debug("value of inv->>"+ invoice.toString());
		
		// TODO Auto-generated method stub
		return invoice;
	}

	@Override
	
	public List<Invoice> listInvoice()
	{
		String SQL="select * from invoice";
		List<Invoice> invoices=jdbcTemplateObject.query(SQL, new InvoiceMapper());
		logger.debug("in debug");
		// TODO Auto-generated method stub
		return invoices;
	}

	@Override
	@Transactional
	public void delete(Integer id) 
	{
		String SQL="delete from invoice where id=?";
		jdbcTemplateObject.update(SQL,id);
		logger.debug("deleted record with id"+ id);
		return;
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void update(Integer id, Integer age)
	{
		String SQL="update invoice set age=? where id=?";
		jdbcTemplateObject.update(SQL,age,id);
		// TODO Auto-generated method stub

	}

	

}
