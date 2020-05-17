package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class CustomerContoller {
	
	@Autowired
	CustomerService custService;
	@RequestMapping("/customer") //by default GET
	public List<Customer> getAllCustomers() {
		return custService.getAllCustomers();
	}
	
	//exclusive POST
	@RequestMapping(method=RequestMethod.POST,value="/customer")
	public void addCustomer(@RequestBody Customer cust) {
		custService.addCustomer(cust);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/login")
	public boolean login(@RequestBody Customer cust) {
		Boolean a=custService.login(cust);
		return a;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/user/{email}")
	public Customer getUser(@PathVariable String email) {
		return custService.getUser(email);
	}
	
	
}
