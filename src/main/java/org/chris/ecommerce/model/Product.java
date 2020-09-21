package org.chris.ecommerce.model;

import java.math.BigDecimal;

public class Product {

	private long pId;
	private String name;
	private String itemCode;
	private String category;
	private BigDecimal price;

	public Product(long pId, String name, String itemCode, String category, BigDecimal price) {
		this.pId = pId;
		this.name = name;
		this.itemCode = itemCode;
		this.category = category;
		this.price = price;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	//Make it display like a list
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + ", itemCode=" + itemCode + ", category=" + category
				+ ", price=" + price + "]";
	}

}
