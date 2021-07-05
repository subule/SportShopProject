package com.cg.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sports.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
