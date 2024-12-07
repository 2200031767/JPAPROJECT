package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.service;

@RestController
@RequestMapping("customer")

public class CustomerController 
{
	@Autowired
	private service service;
	
	@GetMapping("/")
	public String home()
	{
		return "JPA";
	}
	
	@PostMapping("add")
	public String addcustomer(@RequestBody Customer customer)
	{
		return service.addcustomer(customer);
	}
	
	@PutMapping("update")
	public String updatecoustomer(@RequestBody Customer c)
	{
		return service.updatecustomer(c);
	}
	

}
