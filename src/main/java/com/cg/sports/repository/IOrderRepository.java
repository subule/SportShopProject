package com.cg.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sports.entity.Order;

public interface IOrderRepository extends JpaRepository<Order, Long> {

}
