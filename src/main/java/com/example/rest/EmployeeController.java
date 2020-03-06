package com.example.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.example.dao.EmployeeDAO;
import com.example.dao.EmployeeDAOImpl;
import com.example.dao.EmployeeMapper;
import com.example.dto.Employee;
import com.example.service.EmployeeService;
@RestController

//
//@RequestMapping("/customer")   ->
public class EmployeeController 
{
	
	
	Logger logger=LoggerFactory.getLogger(EmployeeController.class);
@Autowired
private EmployeeService empservice;

@GetMapping("/employee")
public List<Employee> emplist()
{
	
//	logger.debug("Employee list:=");
	return empservice.listEmployeeService();
}
	

//****************************this is one method calling the id********************************************** 
//****************************compilation= http://localhost:8082//employees/1********************we have to pass the id 

//@RequestMapping(value="/employees/{id}", method = RequestMethod.GET)
//public ResponseEntity getCustomerbyId(@PathVariable("id") Integer id) {
//
//	Employee employee = empservice.getEmployeeService(id);
//	if (employee == null) {
//		return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
//	}
//
//	return new ResponseEntity(employee, HttpStatus.OK);
//}


//****************************this is another method calling the id  **********************************************
//****************************compilation= http://localhost:8082//employees/1********************we have to pass the id 

     @GetMapping("/employees/{id}")
       public ResponseEntity getCustomerbyId(@PathVariable("id") Integer id) 
          {
	               Employee employee = empservice.getEmployeeService(id);
                	if (employee == null) 
                	{
		              return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
	                }
	              return new ResponseEntity(employee, HttpStatus.OK);
}

     
     
     
     @RequestMapping(value="/deleteID/{customerId}", method=RequestMethod.DELETE)
	  public ResponseEntity<Void> deleteService(@PathVariable("customerId") Integer customerId) 
	  { 
		 
		 try { 
			 logger.debug("In method Delete");
		 empservice.deleteEmployeeService(customerId);
		 logger.debug("After Delete");
		 return ResponseEntity.ok().build();
		 }
		 catch(ResourceAccessException e)
		 {
			 logger.error("error**********"+e.getMessage());
			 return ResponseEntity.notFound().build();
			
		 }
     
     
     
     
     
     
     
     
//     @DeleteMapping("/delete/employees/{id}")
// 	public ResponseEntity deleteCustomer(@PathVariable Integer id) {
//   
//    	 
//    	 try
//         {
//    		 empservice.deleteEmployeeService(id);
//    		 logger.debug("After Delete");
//    		 return ResponseEntity.ok().build();
//         }
//    	 catch(ResourceAccessException e)
//    	 {
//    		 logger.error("error**********"+e.getMessage());
//    		 return ResponseEntity.notFound().build();
//    	 }
// 		
 		
     
     
     
     
     

}






	

}
