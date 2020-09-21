package org.chris.ecommerce.model;

public class Customer {
	
	private String id;
	private String password;
	private String email;
	private String name;
	private String address;
	private String contactNumber;
	//TO ADD: Date registered
	//Additional addresses
	

	public Customer(String id, String password, 
			String email, String name, String address,
			String contactNumber) {
		this.id = id;
		this.password = password;
		this.email = email;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerAddress() {
		return address;
	}
	public void setCustomerAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
