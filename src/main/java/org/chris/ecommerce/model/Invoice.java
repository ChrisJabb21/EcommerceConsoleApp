package org.chris.ecommerce.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/*the unique invoice number, name of seller, the company’s name, address, contact details, name of the buyer, address, items purchased, total cost, etc.*/

public class Invoice {
	
	
	private long invoiceNo;
	private String customerName; //this would be the full name of customer in invoice
	private BigDecimal total;
	private List<Product> purchases;
	private Date DateOfTransaction;
	
	public long getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public List<Product> getPurchases() {
		return purchases;
	}
	public void setPurchases(List<Product> purchases) {
		this.purchases = purchases;
	}
	
	public Date getDateOfTransaction() {
		return DateOfTransaction;
	}
	public void setDateOfTransaction(Date dateOfTransaction) {
		DateOfTransaction = dateOfTransaction;
	}
	
	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", customerName=" + customerName + ", total=" + total
				+ ", purchases=" + purchases + ", DateOfTransaction=" + DateOfTransaction + "]";
	}
		
}



