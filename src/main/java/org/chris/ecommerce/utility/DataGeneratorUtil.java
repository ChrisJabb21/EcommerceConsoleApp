package org.chris.ecommerce.utility;

import java.math.BigDecimal;
import java.util.Map;

import org.chris.ecommerce.model.Customer;
import org.chris.ecommerce.model.Invoice;
import org.chris.ecommerce.model.Item;

//Test Data
public class DataGeneratorUtil {
	
	//TODO make test data
	  public void generateCustomers(Map<String, Customer> customers){
		  String cId = "C001";
		  String cPassword = "password!12";
		  String cEmail = "chris@mail.com";
		  String cName = "Chris F Jabbour";
		  String cNumber = "7244211234";
		  String cAddr = "Pittsburgh PA, USA";
		  Customer  c = new Customer(cId, cPassword, cEmail, cName, cAddr, cNumber);
	      customers.put(cEmail, c);
	  }

	  
	  public void generateItems(Map<Long, Item> items) {
		  
		  long pId = 1;
		  String pName = "Polarized Cyberpunk Sunglasses";
		  String pCode = "SG01";
		  BigDecimal pPrice = new BigDecimal("39.99");
		  int quantity = 1;
		  BigDecimal itemTotal = pPrice;
		  Item p = new Item(pId,pName, pCode, pPrice, quantity, itemTotal);
	      items.put(pId, p); 
	  }
	  
	  
	  
	  
	  
	  //TODO
	  //invoice should contain customerid/customer details and product info
	  public void generateInvoices(Map<Long, Invoice> invoices) {
		 
	  }
	
	

}
