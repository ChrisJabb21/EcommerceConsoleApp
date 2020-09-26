package org.chris.ecommerce.model;

import java.math.BigDecimal;

public class Item {

	private long pId;
	private String name;
	private String itemCode;
	private BigDecimal itemPrice;
	private int quantity = 1;
	private BigDecimal itemTotal;
	
	public Item(long pId, String name, String itemCode, BigDecimal itemPrice, int quantity, BigDecimal itemTotal) {
		this.pId = pId;
		this.name = name;
		this.itemCode = itemCode;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.itemTotal = itemTotal;
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

	public BigDecimal getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(BigDecimal itemTotal) {
		this.itemTotal = itemTotal;
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Override
	public String toString() {
		
		return  "\t" + name + "\t" + itemCode + "\t" + itemPrice;
		
//		return "Product [ItemNo=" + pId + ", Item name=" + name + ", itemCode=" + itemCode + ", itemPrice=" + itemPrice
//				+ ", quantity=" + quantity + ", itemTotal=" + itemTotal + "]";
	}

	
}
