package org.chris.ecommerce.utility;

import java.math.BigDecimal;
import java.util.Map;

import org.chris.ecommerce.model.Customer;
import org.chris.ecommerce.model.Invoice;
import org.chris.ecommerce.model.Item;

//Test Data
public class DataGeneratorUtil {
	
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
		  String pCode = "PSG01";
		  BigDecimal pPrice = new BigDecimal("39.99");
		  int quantity = 1;
		  BigDecimal itemTotal = pPrice;
		  Item p = new Item(pId,pName, pCode, pPrice, quantity, itemTotal);
		  items.put(pId, p); 
		  
		  long pTwoId = 2;
		  String pTestName = "Rubber Ducky";
		  String pTestCode = "D01";
		  BigDecimal pTestPrice = new BigDecimal("12.99");
		  int quantityTest = 1;
		  BigDecimal item2Total = pPrice;
		  Item p2 = new Item(pTwoId, pTestName, pTestCode, pTestPrice, quantityTest, item2Total);
		  items.put(pTwoId, p2); 
		
		long pThreeId = 3;
		String pTestName3 = "GeForce RTX™ 3090";
		String pTestCode3 = "GPU01";
		BigDecimal pTestPrice3 = new BigDecimal("1499.00");
		int quantityTest3 = 1;
		BigDecimal item3Total = pTestPrice3;

		Item p3 = new Item(pThreeId, pTestName3,pTestCode3,pTestPrice3,quantityTest3,item3Total);
		items.put(pThreeId, p3); 

	  }
}
