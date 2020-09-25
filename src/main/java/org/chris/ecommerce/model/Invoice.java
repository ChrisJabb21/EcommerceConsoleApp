package org.chris.ecommerce.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;



public class Invoice {
	
	
	private long invoiceNo;
	private Customer customer;
	//private String email; //this would be the unique identifier of customer in invoice
	private Item item;
	// private long itemId;
	// private String itemName;
	// private String itemCode;
	// private BigDecimal itemPrice; //price
	// private BigDecimal itemtotal;
	private String purchaseDate;
	private int quantity = 1; //change to totalitemsQTY bought
	private BigDecimal invoiceTotal;
	
	//Idea: make an counter for the quantity of a product that appears more than once in the list

	public Invoice(long invoiceNo, Customer customer, Item item, String purchaseDate, BigDecimal invoiceTotal) {
		this.invoiceNo = invoiceNo;
		this.customer = customer;
		this.item = item;
		this.purchaseDate = purchaseDate;
		this.invoiceTotal = invoiceTotal;
	}

	
	@Override
	public String toString() {
		
		String formatString = "+=======Invoice===========+\n"
				+ "|Customer Email: " + customer.getEmail() + " Date: " + purchaseDate + " |\n"
				+ "|P.No\t Name \t Price \t Quantity \t Total  | \n"
				+ "|" +item.getpId() + "\t" + item.getName() + "\t" + item.getItemCode() +"\t" + item.getItemPrice() +"\t" + item.getQuantity() +"\t" + "$"+ item.getItemPrice() + "| \n" 
				+ "|------------------------------------\n"
				+ "|Total = $"+ invoiceTotal + "| \n"
				+ "|Thanks for visiting  \n"
				+ "============================================|";
			

		return "Invoice [invoiceNo=" + invoiceNo + ", email=" +  customer.getEmail() + ", itemName=" + item.getName() + ", itemCode="
				+  item.getItemCode() + ", itemPrice=" + item.getItemPrice()  + ", quantity=" + quantity+ ", invoiceTotal=" + invoiceTotal + ", purchaseDate=" + purchaseDate + "]";
	}

	public String showInvoiceDetails(){
		String formatString = "+=======Invoice===========+\n"
		+ "|Customer Email: " + customer.getEmail() + " Date: " + purchaseDate + " |\n"
		+ "|P.No\t Name \t Price \t Quantity \t Total  | \n"
		+ "|" +item.getpId() + "\t" + item.getName() + "\t" + item.getItemCode() +"\t" + item.getItemPrice() +"\t" + item.getQuantity() +"\t" + "$"+ item.getItemPrice() + "| \n" 
		+ "|------------------------------------\n"
		+ "|Total = $"+ invoiceTotal + "| \n"
		+ "|Thanks for visiting  \n"
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



	
	
	
		
}



