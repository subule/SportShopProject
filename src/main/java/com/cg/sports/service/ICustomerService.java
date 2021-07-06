package com.cg.sports.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.sports.entity.Customer;

@Service
public interface ICustomerService {

	public List<Customer>getAllCustomers();
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomerById(long cusId);
	public void deleteCustomer(long cusId);
}
