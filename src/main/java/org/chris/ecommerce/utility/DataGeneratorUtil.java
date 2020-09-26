package org.chris.ecommerce.utility;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

import org.chris.ecommerce.model.Customer;
import org.chris.ecommerce.model.Invoice;
import org.chris.ecommerce.model.Item;

//Test Data
public class DataGeneratorUtil {

	String cId = "C001";
	String cPassword = "password!12";
	String cEmail = "cj@mail.com";
	String cName = "Chris F Jabbour";
	String cNumber = "7244211234";
	String cAddr = "Pittsburgh PA, USA";
	Customer c = new Customer(cId, cPassword, cEmail, cName, cAddr, cNumber);
	
	long pThreeId = 3;
	String pTestName3 = "GeForce RTX™ 3090";
	String pTestCode3 = "GPU01";
	BigDecimal pTestPrice3 = new BigDecimal("1499.00");
	int quantityTest3 = 1;
	BigDecimal item3Total = pTestPrice3;

	Item p3 = new Item(pThreeId, pTestName3, pTestCode3, pTestPrice3, quantityTest3, item3Total);


	public void generateCustomers(Map<String, Customer> customers) {
		customers.put(cEmail, c);
	}

	public void generateItems(Map<Long, Item> items) {

		long pId = 1;
		String pName = "Polarized Cyberpunk Sunglasses";
		String pCode = "PSG01";
		BigDecimal pPrice = new BigDecimal("39.99");
		int quantity = 1;
		BigDecimal itemTotal = pPrice;
		Item p = new Item(pId, pName, pCode, pPrice, quantity, itemTotal);
		items.put(pId, p);

		long pTwoId = 2;
		String pTestName = "Rubber Ducky";
		String pTestCode = "D01";
		BigDecimal pTestPrice = new BigDecimal("12.99");
		int quantityTest = 1;
		BigDecimal item2Total = pPrice;
		Item p2 = new Item(pTwoId, pTestName, pTestCode, pTestPrice, quantityTest, item2Total);
		items.put(pTwoId, p2);
		items.put(pThreeId, p3);

	}

	public void generateInvoices(Map<Long, Invoice> invoices, Map<String, Item>itemCodes) {

		long invoiceId = 1111;
		LocalDate today = LocalDate.now();
		LocalDate after15days = today.plusDays(16);
	

		Invoice invoice = new Invoice(invoiceId, c, p3, after15days, p3.getItemPrice());
		invoices.put(invoiceId, invoice);
		itemCodes.put(p3.getItemCode(), p3);

	}


}
