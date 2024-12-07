package com.klef.jfsd.exam.repository;

import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.model.Customer;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>
{

}
