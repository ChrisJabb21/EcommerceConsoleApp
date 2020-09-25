package org.chris.ecommerce.model;

import java.math.BigDecimal;
//import java.util.Date;
//import java.util.List;

public class Invoice {
	
	private long invoiceNo;
	private Customer customer;
	private Item item;
	//private List<Item> items;
	private String purchaseDate;
	private int quantity = 1; //change to totalitemsQTY bought
	private BigDecimal invoiceTotal;
	
	public Invoice(long invoiceNo, Customer customer, Item item, String purchaseDate, BigDecimal invoiceTotal) {
		this.invoiceNo = invoiceNo;
		this.customer = customer;
		this.item = item;
		this.purchaseDate = purchaseDate;
		this.invoiceTotal = invoiceTotal;
	}

	
	@Override
	public String toString() {

	String testString= 
		"Invoice No: \t EMAIL  \t ItemName \t ItemCode \t Price \t Quantity \t  ItemTotal \t PurchaseDate | \n"
		+ invoiceNo + "\t" + customer.getEmail() + "\t" + item.getName() + "\t" + item.getItemCode() +"\t" + item.getItemPrice() +"\t" + item.getQuantity() +"\t" + item.getItemPrice() + "\t"+ getPurchaseDate() + "| \n";

		return testString;

	}

	public String showInvoiceDetails(){
		String formatString = "+=======Invoice===========+\n"
		+ "|Customer Email: " + customer.getEmail() + " Date: " + purchaseDate + "|\n"
		+ "|Invoice No " + invoiceNo + "|\n"
		+ "|P.No\t Name  \t ItemCode \t Price \t Quantity \t Total  | \n"
		+ "|" +item.getpId() + "\t \t" + item.getName() + "\t" + item.getItemCode() +"\t" + item.getItemPrice() +"\t" + item.getQuantity() +"\t" + "$"+ item.getItemPrice() + "| \n" 
		+ "|----------------------------------------------|\n"
		+ "|Total = $"+ invoiceTotal +"|\n"
		+ "|Thanks for visiting|\n"
		+ "============================================|";

		return formatString;


	}



	public long getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		
		this.purchaseDate = purchaseDate;
	}
	// public String getEmail() {
	// 	return email;
	// }
	// public void setEmail(String email) {
	// 	this.email = email;
	// }

	public BigDecimal getInvoiceTotal() {
		return invoiceTotal;
	}
	public void setInvoiceTotal(BigDecimal invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	// public List<Item> getItems() {
	// 	return items;
	// }

	// public void setItems(List<Item> items) {
	// 	this.items = items;
	// }
}



