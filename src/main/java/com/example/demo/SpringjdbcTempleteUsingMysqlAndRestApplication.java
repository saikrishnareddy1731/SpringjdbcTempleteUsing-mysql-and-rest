package com.example.demo;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.dao.CustomerDAOImpl;
import com.example.dao.EmployeeDAOImpl;
import com.example.dao.InvoiceDAOImpl;
import com.example.dto.Customer;
import com.example.dto.Employee;
import com.example.dto.Invoice;
import com.example.service.EmployeeImpl;
//@Configuration

//@ComponentScan({"com.example.rest"})

@EnableWebMvc
@SpringBootApplication
public class SpringjdbcTempleteUsingMysqlAndRestApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(AppConfig.class, args);
		
		 //ApplicationContext context=SpringApplication.run(AppConfig.class, args);
		 
			
			// remaining code will write after the break
			
			// perform operation @Employee
			
//		EmployeeImpl employeeJDBCTemplate = 
//				context.getBean(EmployeeImpl.class);
//		CustomerDAOImpl customerJDBCTemplate=context.getBean(CustomerDAOImpl.class);
//		InvoiceDAOImpl invoiceJDBCTemplate=context.getBean(InvoiceDAOImpl.class);
//					
//		// method call here 
//		runEmployeeCRUD(employeeJDBCTemplate);
//		runCustomerCRUD(customerJDBCTemplate);
//		runInvoiceCRUD(invoiceJDBCTemplate);
//		
//		}
//		
//		
//		
//		
//	    public static void runEmployeeCRUD(EmployeeImpl 
//	    		employeeJDBCTemplate) {
//				
//			// create the employee data 
//			
//	          employeeJDBCTemplate.setupDB();
//			
//			System.out.println("------Records Creation--------");
//			employeeJDBCTemplate.createEmployeeService("siddu", 11);
//			employeeJDBCTemplate.createEmployeeService("bano", 2);
//			employeeJDBCTemplate.createEmployeeService("saiteja", 15);
//
//			System.out.println("------Listing Multiple Records--------");
//			List<Employee> employees = employeeJDBCTemplate.listEmployeeService();
//			for (Employee record : employees) {
//				System.out.print("ID : " + record.getId());
//				System.out.print(", Name : " + record.getName());
//				System.out.println(", Age : " + record.getAge());
//			}
//			
//	
//			System.out.println("----Updating Record with ID = 2 -----");
//			employeeJDBCTemplate.updateEmployeeService(2, 20);
//			
//
//			System.out.println("----Listing Record with ID = 2 -----");
//		
//			Employee employee = employeeJDBCTemplate.getEmployeeService(2);
//			System.out.print("ID : " + employee.getId());
//			System.out.print(", Name : " + employee.getName());
//			System.out.println(", Age : " + employee.getAge());
//			
//			System.out.println("--------Deleteting the record with id=2------");
//			employeeJDBCTemplate.deleteEmployeeService(2);
//			
//	
//			
//			
//		}
//	    public static void runCustomerCRUD(CustomerDAOImpl customerJDBCTemplate)
//	    {
//	    	customerJDBCTemplate.setupDB();
//	    	System.out.println("******customer Record creation********");
//	    	customerJDBCTemplate.create("Rajesh", 21);
//	    	customerJDBCTemplate.create("Rakesh", 25);
//	    	customerJDBCTemplate.create("Vanitha", 20);
//	    	customerJDBCTemplate.create("Rani", 23);
//	    	
//	    	System.out.println("*****Listing multiple records of customer********");
//	    	List<Customer> customers=customerJDBCTemplate.listCustomer();
//	    	for(Customer record: customers)
//	    	{
//	    		System.out.print("ID : " + record.getId());
//				System.out.print(", Name : " + record.getName());
//				System.out.println(", Age : " + record.getAge());
//	    	
//	    	}
//	    	
//	    	System.out.println("******************UPDATED RECORD WITH ID=3*********");
//	    	customerJDBCTemplate.update(3, 19);
//	    	
//	    	System.out.println("*************LISTING RECORD WITH ID=3******");
//	    	Customer customer=customerJDBCTemplate.getCustomer(3);
//	    	System.out.print("ID : " + customer.getId());
//			System.out.print(", Name : " + customer.getName());
//			System.out.println(", Age : " + customer.getAge());
//			
//			System.out.println("*****Deleting Record with id=2");
//			customerJDBCTemplate.delete(2);
//	    	
//	    	
//	    	
//	    }
//	    public static void runInvoiceCRUD(InvoiceDAOImpl invoiceJDBCTemplate)
//	    {
//	    	invoiceJDBCTemplate.setupDB();
//	    	System.out.println("++++++++Invoice Record Creation++++++");
//	    	invoiceJDBCTemplate.create("Srihari", 21);
//	    	invoiceJDBCTemplate.create("Bharath", 22);
//	    	invoiceJDBCTemplate.create("Koushik", 21);
//	    	
//	    	System.out.println("+++++++Listing multiple records+++++++");
//	    	List<Invoice> invoices=invoiceJDBCTemplate.listInvoice();
//	    	for(Invoice record: invoices)
//	    	{
//	    		System.out.print("ID : " + record.getId());
//				System.out.print(", Name : " + record.getName());
//				System.out.println(", Age : " + record.getAge());
//	    	}
//	    	
//	    	System.out.println("+++++++Updating Record with ID = 2+++++++");
//	    	invoiceJDBCTemplate.update(2, 20);
//			
//
//			System.out.println("+++++++Listing Record with ID = 2 ++++++++");
//		
//			Invoice invoice= invoiceJDBCTemplate.getInvoice(2);
//			System.out.print("ID : " + invoice.getId());
//			System.out.print(", Name : " + invoice.getName());
//			System.out.println(", Age : " + invoice.getAge());
//			
//			System.out.println("+++++++Deleteting the record with id=2++++++");
//			invoiceJDBCTemplate.delete(1);
	    	
	    }

}
