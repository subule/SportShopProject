package com.cg.sports.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.sports.entity.Order;
import com.cg.sports.repository.IOrderRepository;

@Service
public class COrderService implements IOrderService{
	
	@Autowired
	IOrderRepository orderRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(COrderService.class);

	@Override
	@Transactional
	public Order addOrder(Order order) {
		LOGGER.info("EOrder addOrder()");
		return orderRepository.save(order);
	}

	@Override
	@Transactional
	public Order removeOrder(long id) {
		LOGGER.info("EOrder removeOrder()");
		if (orderRepository.findById(id).isPresent()){
			orderRepository.deleteById(id);
			return null;
		}
		else {
			//else throw new OrderNotFoundException();
			return null;//FOR_THE_TIME_BEING
		}
		
	}

	@Override
	@Transactional
	public Order updateOrder(long id, Order order) {
		LOGGER.info("EOrder updateOrder()");
		if (orderRepository.findById(id).isPresent()) {
			Order order2 = new Order();
			order2.setOrderId(order.getOrderId());
			order2.setAmount(order.getAmount());
			order2.setBillingDate(order.getBillingDate());
			order2.seteCustomer(order.geteCustomer());
			orderRepository.save(order2);
			return order2;
		}
		else {
			//throws new OrderNotFoundException();
			return null;
		}
	}

	@Override
	@Transactional
	public Order getOrderDetails(long id) {
		LOGGER.info("EOrder getOrderDetails()");
		Optional<Order> orderById = orderRepository.findById(id) ;
		if(orderById.isPresent()) {
			Order foundOrderById = orderById.get();
			return foundOrderById;
		}
		else {
			//throw new OrderNotFoundException();
			return null;
		}
	}

	@Override
	@Transactional
	public List<Order> getAllOrders() {
		System.out.println("OrderService");
		LOGGER.info("EOrder getAllOrders()");
		return orderRepository.findAll();
	}

	
}
