package org.chris.ecommerce.model;

public class Customer {
	
	private String id;
	private String password;
	private String email;// Unique constraint 
	private String name; //make first name and last name separate
	private String address;
	private String contactNumber;
	
	//TO ADD: Date registered
	//Additional addresses
	
	//have a Collection object or String for customer

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
	
	public Customer(String name, String address, String contactNumber, String password, String email) {
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

	@Override
	public String toString() {
		return "Customer [id=" + id + ", password=" + password + ", email=" + email + ", name=" + name + ", address="
				+ address + ", contactNumber=" + contactNumber + "]";
	}
	
	
	
	
	
}
