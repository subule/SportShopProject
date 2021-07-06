package com.cg.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sports.entity.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
