package com.cg.sports.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sports.entity.Order;
import com.cg.sports.service.IOrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@GetMapping("/hello/message")
	public String helloMessage() {
		System.out.println("Hello Message");
		return "From Controller";
	}
	
	@Autowired
	IOrderService orderService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
	
	
	
	@PostMapping(path="/addedOrders")
	public ResponseEntity<Order> addOrder(@Validated @RequestBody Order order) {
		LOGGER.info("EOrder addOrder()");
		Order addedOrder = orderService.addOrder(order);
		return new ResponseEntity<Order>(addedOrder, HttpStatus.ACCEPTED);
	}

	@DeleteMapping(path="/deletedOrders/{id}")
	public ResponseEntity<Order> removeOrder(@PathVariable long id) {
		LOGGER.info("EOrder removeOrder()");
		Order deletedOrder = orderService.removeOrder(id);
		return new ResponseEntity<Order>(deletedOrder, HttpStatus.OK);
	}

	@PutMapping(path="/updatedOrders/{id}")
	public ResponseEntity<Order> updateOrder(@PathVariable long id, @Validated @RequestBody Order order) {
		LOGGER.info("EOrder updateOrder()");
		Order updatedOrder = orderService.updateOrder(id, order);
		return new ResponseEntity<Order>(updatedOrder, HttpStatus.OK);
	}

	@GetMapping(path="/orderDetailsById /{id}")
	public ResponseEntity<Order> getOrderDetails(@PathVariable long id){
		LOGGER.info("EOrder getOrderDetails()");
		Order orderDetailsById =  orderService.getOrderDetails(id);
		return new ResponseEntity<Order>(orderDetailsById, HttpStatus.OK);
	}

	@GetMapping(path="/allOrders")
	public ResponseEntity<List<Order>> getAllOrders() {
		System.out.println("AllOrderController");
		LOGGER.info("EOrder getAllOrders()");
		List<Order> allOrders = orderService.getAllOrders();
		return new ResponseEntity<List<Order>>(allOrders, HttpStatus.OK);
	}

}
