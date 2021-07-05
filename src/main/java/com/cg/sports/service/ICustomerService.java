package com.cg.sports.service;

import java.util.List;

import com.cg.sports.entity.Customer;

public interface ICustomerService {

	public List<Customer>getAllCustomers();
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomerById(long cusId);
	public void deleteCustomer(long cusId);
}
