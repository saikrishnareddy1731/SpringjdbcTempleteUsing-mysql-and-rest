package com.example.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeDAOImpl;
import com.example.dao.EmployeeMapper;
import com.example.dto.Employee;
import com.example.service.EmployeeService;
@RestController

//
//@RequestMapping("/customer")   ->
public class EmployeeController 
{
@Autowired
private EmployeeService empservice;

@GetMapping("/customer")
public List<Employee> emplist()
{
	return empservice.listEmployeeService();
}
	
//	@Autowired
//	private JdbcTemplate jdbcTemplateObject;
//	@GetMapping("/employees")
//	public List<Employee> listEmployees() 
//	{
//		// TODO Auto-generated method stub
//		 String SQL = "select * from employee";
//	      List <Employee> employees = jdbcTemplateObject.query(SQL, 
//	                                new EmployeeMapper());
//	    	      logger.debug("in debug");
//	      return employees;
//	}







	

}
