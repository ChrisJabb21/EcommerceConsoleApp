package org.chris.ecommerce.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.chris.ecommerce.model.Customer;
import org.chris.ecommerce.model.Invoice;
import org.chris.ecommerce.model.Item;
import org.chris.ecommerce.utility.DataGeneratorUtil;

public class EcommerceController {
	DataGeneratorUtil dataGeneratorUtil = new DataGeneratorUtil();
	Map<String, Customer> customers;
	Map<Long, Item> items;
	Map<Long, Invoice> invoices;
	
	Scanner consoleScan = new Scanner(System.in);
	/**
	 * constructor for controller object and to add test data into in-memory collections
	 */
	public EcommerceController() {
		customers = new HashMap<String, Customer>();
		items = new HashMap<Long, Item>();
		dataGeneratorUtil.generateCustomers(customers);
		dataGeneratorUtil.generateItems(items);
	}

	/**
	 * Main entry point menu for console app for startBrowsing method that returns an int for user choice.
	 * @return selected - User menu prompt selection of type int. 
	 * returns a choice or exception if invalid input
	 */
	private int displayMainMenu() {
		String choiceEntered;
		int selected;
		System.out.println("+================================+");
		System.out.println("| Welcome to CyberJab CommandLine Ecommerce! |");
		System.out.println("|1. Register |");
		System.out.println("|2. Login |");
	//	System.out.println("|3. Buy an Item. |"); // take me to a list
	//	System.out.println("|4. Replace an Item. |"); // works like a warranty?
		System.out.println("|5. Exit app. |");
		while (true) {
			System.out.println("\nEnter Choice (1, 2, 3, 4, or 5) : ");
			choiceEntered = consoleScan.nextLine();
			try {
				selected = Integer.parseInt(choiceEntered);
				break;
			} catch (Exception exception) {
				System.out.println("Enter a valid choice (1, 2, 3, 4, or 5). Try Again!");
			}
		}

		System.out.println();
		return selected;
	}
	
	/**
	 * Display a submenu for customer after a successful login that returns an int 
	 */
	private int displayCustMenu() {
		int selected = 0;
		
		return selected;
	}

	// Methods

	private void login() {}

	/***
	 * method for creating a customer account
	 */
	private void register() 
	{
		Customer customer;
		String email;
		String password;
		//String confirm_password;
		String name;
		String address;
		String contactNo;
		System.out.println("Enter your details for a new customer account");
		
		System.out.println("Name: ");
	    name = consoleScan.nextLine();
		System.out.println("Address: ");
		address = consoleScan.nextLine();
		System.out.println("Contact Number: ");
		contactNo = consoleScan.nextLine();
		
		System.out.println("Email: ");
	    email = consoleScan.nextLine();
	    
	    while(customers.containsKey(email)) {
	    	System.out.println("Email already exists, Try again..");
	    	email = consoleScan.nextLine();
	    }
	    
	    System.out.println("Password: ");
	    password = consoleScan.nextLine();
	    //System.out.println("Confirm password: ");
	    //password = consoleScan.nextLine();
	    //password check for matching strings.
	    
	    customer = new Customer(name, address, contactNo, password, email);
	    
	    customers.put(email, customer);
	}
	
	/**
	 * Method to display all items for sale from datasource or testdata
	 */
	private void showItems() {
		Set set = items.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("+================================+");
			System.out.println("Name \t Item Code \t Price \t \n");
			System.out.println(mentry.getKey()+". " + mentry.getValue());
		}
	}
	//buy an item
	private void buyItem() {
		//Show list of items
		String choice;
		showItems();
		//select an item to buy 
		try {
		System.out.println("What would you like to purchase");
		choice = consoleScan.nextLine();
		//select by itemNo or id.
		//check if the item is in items map by suching for the key
			//if found, instantiate an invoice object and return
				//otherwise return exception
		} catch(Exception e) {
			System.out.println("Invalid choice, please select an item from the list");
		}
		
		//
	}
	
	private void ReturnItem() {}
	
	

	/**
	 * Method for  starting up ecommerce menu for
	 * Customer registration
	 * Customer Login
	 * Buying an item 
	 * Replacing an item if broken 
	 * Exit the program
	 */
	public void startBrowsing() {
		try {
			Customer customer;
			String cEmail;
			String cPassword;
			int input;
			mainloop: while(true) {
				input = displayMainMenu();
				switch(input) {
					case 1: 
						register();
						displayMainMenu();
						break;
					case 2:
						System.out.println("Enter Email and Password:");
						System.out.println("Email : ");
						cEmail = consoleScan.nextLine();
						System.out.println("Password : ");
						cPassword = consoleScan.nextLine();
						if(customers.containsKey(cEmail)) {
							customer = customers.get(cEmail);
						if(customer.getPassword().equals(cPassword)){
							while(true) {
								//choice =
								System.out.println("Welcome " + customer.getName());
								showItems();

								//TODO show top and do a loop on product data structure to show products as a list
								//Ask if customer wants to buy an item or return an item.
								//default:
								//System.out.println("\"Enter a valid choice!");
								//}
							}
						}
					 else { 
								System.out.println("Invalid Credentials..Try again");
						} 
				} else {
							System.out.println("Invalid Credentials..Try again");
						}
						break;
					case 3:
						
					case 4:
						
						
					case 5:
				
				}
			}
		}
	}
	//consoleScan.close();
}

		