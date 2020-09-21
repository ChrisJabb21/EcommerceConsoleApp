package org.chris.ecommerce.utility;

import java.math.BigDecimal;
import java.util.Map;

import org.chris.ecommerce.model.Customer;
import org.chris.ecommerce.model.Product;

//Test Data
public class DataGeneratorUtil {
	
	//TODO make test data
	  public void generateCustomers(Map<String, Customer> customers){
		  Customer c; 
		  String cId = "C001";
		  String cPassword = "password!123";
		  String cEmail = "chris@gmail.com";
		  String cName = "Chris F Jabbour";
		  String cNumber = "7244203847";
		  String cAddr = "Pittsburgh PA, USA";
	      c = new Customer(cId, cPassword, cEmail, cName, cAddr, cNumber);
	      customers.put(cId, c);
	  }

	  
	  public void generateProducts(Map<Long, Product> products) {
		  
		  Product p; 
		  long pId = 1;
		  String pName = "Polarized Cyberpunk Sunglasses";
		  String pCode = "AEW01";
		  String pCategory = "Accessory";
		  BigDecimal pPrice = 39.99;
	      c = new Customer(pId,pName, pCode, pCategory, c);
	      customers.put(cId, c);
		  
	  
	  }
	
	

}
