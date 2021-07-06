package com.cg.sports.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Product {
/*
	@Id @Column(name="Product Id") @GeneratedValue(strategy=GenerationType.AUTO)
	private long productId;

	@NotEmpty
	private String productName;

	@NotEmpty
	private String category;

	private String description;

	private String brand;

	private String color;

	private String size;

	private String mrp;
	
	private int discount;

	@NotNull
	private double priceAfterDiscount;

	@NotEmpty
	private boolean inStock;

	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate estimatedDelivery;
	
	@ManyToOne @JoinColumn(name="orderId")
	private Order orders;
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="product")
	private List<Cart> cartEntity;

	public Product() {
		super();
	}

	public Product(long productId, String productName, String category, String description,
			String brand, String color, String size, String mrp, int discount,
			double priceAfterDiscount, boolean inStock, LocalDate estimatedDelivery, Order orders,
			List<Cart> cartEntity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.description = description;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.mrp = mrp;
		this.discount = discount;
		this.priceAfterDiscount = priceAfterDiscount;
		this.inStock = inStock;
		this.estimatedDelivery = estimatedDelivery;
		this.orders = orders;
		this.cartEntity = cartEntity;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}

	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public LocalDate getEstimatedDelivery() {
		return estimatedDelivery;
	}

	public void setEstimatedDelivery(LocalDate estimatedDelivery) {
		this.estimatedDelivery = estimatedDelivery;
	}

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	public List<Cart> getCartEntity() {
		return cartEntity;
	}

	public void setCartEntity(List<Cart> cartEntity) {
		this.cartEntity = cartEntity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cartEntity == null) ? 0 : cartEntity.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + discount;
		result = prime * result + ((estimatedDelivery == null) ? 0 : estimatedDelivery.hashCode());
		result = prime * result + (inStock ? 1231 : 1237);
		result = prime * result + ((mrp == null) ? 0 : mrp.hashCode());
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
		long temp;
		temp = Double.doubleToLongBits(priceAfterDiscount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (productId ^ (productId >>> 32));
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Product other = (Product) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cartEntity == null) {
			if (other.cartEntity != null)
				return false;
		} else if (!cartEntity.equals(other.cartEntity))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (discount != other.discount)
			return false;
		if (estimatedDelivery == null) {
			if (other.estimatedDelivery != null)
				return false;
		} else if (!estimatedDelivery.equals(other.estimatedDelivery))
			return false;
		if (inStock != other.inStock)
			return false;
		if (mrp == null) {
			if (other.mrp != null)
				return false;
		} else if (!mrp.equals(other.mrp))
			return false;
		if (orders == null) {
			if (other.orders != null)
				return false;
		} else if (!orders.equals(other.orders))
			return false;
		if (Double.doubleToLongBits(priceAfterDiscount) != Double.doubleToLongBits(other.priceAfterDiscount))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", description=" + description + ", brand=" + brand + ", color=" + color + ", size=" + size + ", mrp="
				+ mrp + ", discount=" + discount + ", priceAfterDiscount=" + priceAfterDiscount + ", inStock=" + inStock
				+ ", estimatedDelivery=" + estimatedDelivery + ", orders=" + orders + ", cartEntity=" + cartEntity
				+ "]";
	}
	*/
}
