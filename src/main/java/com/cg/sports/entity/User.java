package com.cg.sports.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.List;

@Entity
public class User {

	@Id @NotNull
	private long userId;

	@NotNull
	@Pattern.List({
     @Pattern(regexp = "(?=.*[0-9]).+", message = "Password must contain one digit."),
     @Pattern(regexp = "(?=.*[a-z]).+", message = "Password must contain one lowercase letter."),
     @Pattern(regexp = "(?=.*[A-Z]).+", message = "Password must contain one upper letter."),
     @Pattern(regexp = "(?=.*[!@#$%^&*+=?-_()/\"\\.,<>~`;:]).+", message ="Password must contain one special character."),
     @Pattern(regexp = "(?=\\S+$).+", message = "Password must contain no whitespace.")
	})
	private String password;

	@NotEmpty
	private String role;

	@OneToOne
	private Customer customer;

	@OneToOne
	private Admin admin;

	public User() {
		super();
	}

	public User(@NotNull long userId, @NotNull @List({
			@Pattern(regexp = "(?=.*[0-9]).+", message = "Password must contain one digit."),
			@Pattern(regexp = "(?=.*[a-z]).+", message = "Password must contain one lowercase letter."),
			@Pattern(regexp = "(?=.*[A-Z]).+", message = "Password must contain one upper letter."),
			@Pattern(regexp = "(?=.*[!@#$%^&*+=?-_()/\"\\.,<>~`;:]).+", message = "Password must contain one special character."),
			@Pattern(regexp = "(?=\\S+$).+", message = "Password must contain no whitespace.") }) String password,
			@NotEmpty String role, Customer customer, Admin admin) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.customer = customer;
		this.admin = admin;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
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
		User other = (User) obj;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + ", customer=" + customer
				+ ", admin=" + admin + "]";
	}

	
}
