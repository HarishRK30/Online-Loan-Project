package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	public List<Customer> getAllCustomers() {
		List<Customer> cust=new ArrayList<Customer>();
		customerRepository.findAll().forEach(cust::add);
		return cust;
	}
	
	public void addCustomer(Customer cust) {
		customerRepository.save(cust);
	}
	
	public boolean login(Customer cust) {
		Boolean login=null;
		Customer cus=customerRepository.findByEmail(cust.getEmail());
		if (cus==null)
		{
			login=false;
		}
		else if(cus.getPassword().equals(cust.getPassword())) 
		{
			login=true;
		}
		else
		{
			login=false;
		}
		return login;
		
	}
	
	public Customer getUser(String email)
	{
		return customerRepository.findByEmail(email);
	}
	

}
