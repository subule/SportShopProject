package com.cg.sports.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Order {
	/*
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;

	@NotNull @Column(name="Bill Amount")
	private double amount;

	@NotNull @JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate billingDate;

	@ManyToOne @JoinColumn(name="Customer ID")
	private Customer eCustomer;
	
	@OneToMany(mappedBy="orders",cascade = CascadeType.ALL)
	private List<Product> productEntity;
	
	@OneToOne @JoinColumn(name="paymentId")
	private Payment paymentEntity;

	public Order() {
		super();
	}

	public Order(long orderId, double amount, LocalDate billingDate, Customer eCustomer,
			List<Product> productEntity, Payment paymentEntity) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.billingDate = billingDate;
		this.eCustomer = eCustomer;
		this.productEntity = productEntity;
		this.paymentEntity = paymentEntity;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public Customer geteCustomer() {
		return eCustomer;
	}

	public void seteCustomer(Customer eCustomer) {
		this.eCustomer = eCustomer;
	}

	public List<Product> getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(List<Product> productEntity) {
		this.productEntity = productEntity;
	}

	public Payment getPaymentEntity() {
		return paymentEntity;
	}

	public void setPaymentEntity(Payment paymentEntity) {
		this.paymentEntity = paymentEntity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((billingDate == null) ? 0 : billingDate.hashCode());
		result = prime * result + ((eCustomer == null) ? 0 : eCustomer.hashCode());
		result = prime * result + (int) (orderId ^ (orderId >>> 32));
		result = prime * result + ((paymentEntity == null) ? 0 : paymentEntity.hashCode());
		result = prime * result + ((productEntity == null) ? 0 : productEntity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (billingDate == null) {
			if (other.billingDate != null)
				return false;
		} else if (!billingDate.equals(other.billingDate))
			return false;
		if (eCustomer == null) {
			if (other.eCustomer != null)
				return false;
		} else if (!eCustomer.equals(other.eCustomer))
			return false;
		if (orderId != other.orderId)
			return false;
		if (paymentEntity == null) {
			if (other.paymentEntity != null)
				return false;
		} else if (!paymentEntity.equals(other.paymentEntity))
			return false;
		if (productEntity == null) {
			if (other.productEntity != null)
				return false;
		} else if (!productEntity.equals(other.productEntity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", billingDate=" + billingDate + ", eCustomer="
				+ eCustomer + ", productEntity=" + productEntity + ", paymentEntity=" + paymentEntity + "]";
	}*/
}
