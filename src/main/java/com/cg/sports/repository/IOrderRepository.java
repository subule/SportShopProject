package com.cg.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sports.entity.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {

}
