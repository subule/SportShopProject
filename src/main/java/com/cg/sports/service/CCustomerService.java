package com.cg.sports.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.sports.entity.Customer;
import com.cg.sports.repository.ICustomerRepository;

public class CCustomerService implements ICustomerService{

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(long cusId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(long cusId) {
		// TODO Auto-generated method stub
		
	}
/*
	@Autowired
	private ICustomerRepository customerRepository;
	@Override
		public List<Customer> getAllCustomers() {
			return this.customerRepository.findAll();
		}

		@Override
		public Customer addCustomer(Customer customer) {
			return customerRepository.save(customer);
		}

		@Override
		public Customer updateCustomer(Customer customer) {
			Optional<Customer> customerC= this.customerRepository.findById(customer.getUserId());
			if(customerC.isPresent()) {
				Customer customerUpdate = customerC.get();
				customerUpdate.setUserId(customer.getUserId());
				customerUpdate.setName(customer.getName());
				customerUpdate.setEmail(customer.getEmail());
				customerUpdate.setContactNo(customer.getContactNo());
				customerUpdate.setDob(customer.getDob());
				customerUpdate.setAddresses(customer.getAddresses());
				customerRepository.save(customerUpdate);
				return customerUpdate;
			}else {
				//throw new CustomerNotFoundException("customer not found with id :" +customer.getCusId());
			}
			return customer;
			
		}

		@Override
		public Customer getCustomerById(long cusId) {
			Optional<Customer> customerC= this.customerRepository.findById(cusId);
			if(customerC.isPresent()) {
			return customerC.get();
		}else {
			//throw new CustomerNotFoundException("Record not founf by id" +cusId);
		}
			return null;
			
		}

		@Override
		public void deleteCustomer(long cusId) {
			Optional<Customer> customerC= this.customerRepository.findById(cusId);
			if(customerC.isPresent()) {
			this.customerRepository.delete(customerC.get());
		}else {
			//throw new CustomerNotFoundException("Record not founf by id" +cusId);
		}
			
	}*/
}
