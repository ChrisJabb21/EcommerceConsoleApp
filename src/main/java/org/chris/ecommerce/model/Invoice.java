package org.chris.ecommerce.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;



public class Invoice {
	
	
	private long invoiceNo;
	private String email; //this would be the full name of customer in invoice
	private long itemId;
	private String itemName;
	private String itemCode;
	private BigDecimal itemPrice; //price
	private BigDecimal itemtotal;
	private Date purchaseDate;
	private int quantity = 1;
	private BigDecimal invoiceTotal;
	
	//Idea: make an counter for the quantity of a product that appears more than once in the list
	
	@Override
	public String toString() {
		
		String formatString = "+=======Invoice===========+\n"
				+ "|Customer Email: " + email + " Date: " + purchaseDate + " |\n"
				+ "|P.No\t Name \t Price \t Quantity \t Total  | \n"
				+ "|" +itemId + "\t" + itemName + "\t" + itemCode +"\t" + itemPrice +"\t" + quantity +"\t" + itemPrice +"$"+ "| \n" 
				+ "|------------------------------------\n"
				+ "|Total = $"+ invoiceTotal + "| \n"
				+ "|Thanks for visiting  \n"
				+ "============================================|";
			
		
		return "Invoice [invoiceNo=" + invoiceNo + ", email=" + email + ", itemName=" + itemName + ", itemCode="
				+ itemCode + ", itemPrice=" + itemPrice + ", purchaseDate=" + purchaseDate + ", quantity=" + quantity
				+ ", itemtotal=" + itemtotal + ", invoiceTotal=" + invoiceTotal + "]";
	}
	public long getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public BigDecimal getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getItemtotal() {
		return itemtotal;
	}
	public void setItemtotal(BigDecimal itemtotal) {
		this.itemtotal = itemtotal;
	}
	public BigDecimal getInvoiceTotal() {
		return invoiceTotal;
	}
	public void setInvoiceTotal(BigDecimal invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}
	
	
		
}



