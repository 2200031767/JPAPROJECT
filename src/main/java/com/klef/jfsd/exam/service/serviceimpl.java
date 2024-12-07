package com.klef.jfsd.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;

@Service
public class serviceimpl  implements service
{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public String addcustomer(Customer customer) {
		
		customerRepository.save(customer);
		return "added";
	}

	@Override
	public String updatecustomer(Customer customer) {
		Optional<Customer> obj=	customerRepository.findById(customer.getId());
		String msg=null;
		if(obj.isPresent())
		{
			Customer c=obj.get();
			c.setName(customer.getName());
			
			c.setAddress(customer.getAddress());
			
			
			customerRepository.save(customer);
			msg="Customer Updated Successfully";
		}
		else
		{
			msg="Customer ID Not Found";
		}
		return msg;
		
	}

}
