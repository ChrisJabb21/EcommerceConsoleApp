package org.chris.ecommerce.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
	Map<Long, Invoice> invoices; /// Place to store the invoices a customer creates
	Map<String, Item> itemCodes; /// For itemcode lookup

	Scanner consoleScan = new Scanner(System.in);
	private Invoice invoice;

	/**
	 * constructor for controller object and to add test data into in-memory
	 * collections
	 */
	public EcommerceController() {
		customers = new HashMap<String, Customer>();
		items = new HashMap<Long, Item>();
		dataGeneratorUtil.generateCustomers(customers);
		dataGeneratorUtil.generateItems(items);
		invoices = new HashMap<Long, Invoice>();
		itemCodes = new HashMap<String, Item>();
		dataGeneratorUtil.generateInvoices(invoices, itemCodes);

	}

	/**
	 * Main entry point menu for console app for startBrowsing method that returns
	 * an int for user choice.
	 * 
	 * @return selected - User menu prompt selection of type int. returns a choice
	 *         or exception if invalid input
	 */
	private int displayMainMenu() {
		String choiceEntered;
		int selected;
		System.out.println("+================================+");
		System.out.println("| Welcome to CyberJab CommandLine Ecommerce! |");
		System.out.println("|1. Register |");
		System.out.println("|2. Login |");
		System.out.println("|3. Exit app. |");
		System.out.println("+================================+");
		while (true) {
			System.out.println("\nEnter Choice (1, 2, 3) : ");
			choiceEntered = consoleScan.nextLine();
			try {
				selected = Integer.parseInt(choiceEntered);
				break;
			} catch (Exception exception) {
				System.out.println("Enter a valid choice (1, 2, 3). Try Again!");
			}
		}

		System.out.println();
		return selected;
	}

	/**
	 * Display a submenu for customer after a successful login that returns an int
	 * 
	 * @return selected - User menu prompt selection of type int. returns a choice
	 *         or exception if invalid input
	 */
	private int displayCustMenu() {
		String inputToParse;
		int selected;

		System.out.println("+================================+");
		System.out.println("|1. Buy an Item                  |");
		System.out.println("|2. Return an Item               |");
		System.out.println("|3. Log out                      |"); // return user to to main menu
		System.out.println("+================================+");
		while (true) {
			System.out.println("Enter a number (1,2,3) : ");
			inputToParse = consoleScan.nextLine();
			try {
				selected = Integer.parseInt(inputToParse);
				break;
			} catch (Exception e) {
				System.out.println("Something happened with the try!");
				System.out.println("Please enter a valid choice. Try again!");
			}
		}

		return selected;
	}

	// Methods

	// private void login() {}

	/***
	 * method for creating a customer account
	 */
	private void register() {
		Customer customer;
		String email;
		String password;
		String confirmPassword;
		String name;
		System.out.println("Enter your details for a new customer account");
		System.out.println("Name: ");
		name = consoleScan.nextLine();
		System.out.println("Email: ");
		email = consoleScan.nextLine();
		while (customers.containsKey(email)) {
			System.out.println("Email already exists, Try again..");
			email = consoleScan.nextLine();
		}
		//
		System.out.println("Password: ");
		password = consoleScan.nextLine();
		System.out.println("Confirm password: ");
		confirmPassword = consoleScan.nextLine();
		// password check for matching strings.
		try {
			if (password.equals(confirmPassword)) {
				customer = new Customer(name, password, email);

				customers.put(email, customer);
				System.out.println("Registration Successful");
			} else {
				System.out.println("Password does not match. try again");
			}
		} catch (Exception e) {
			System.out.println("something happened, try again");
		}

	}

	/**
	 * Method to display all items for sale from datasource or testdata
	 *
	 */
	private void showItems() {
		Set set = items.entrySet();
		Iterator iterator = set.iterator();
		System.out.println("\n+================================+");
		System.out.print("|ProductId \t Name \t\t Item Code \t Price |\t \n");
		if (items.isEmpty()) {
			System.out.println("No purchases have been made on this account ");
		}
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("|" + mentry.getKey() + ". " + mentry.getValue() + "|");
		}
		System.out.println("+================================+");
	}

	private void showInvoices() {
		Set set = invoices.entrySet();
		Iterator iterator = set.iterator();
		System.out.println("\n+================================+");
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("|" + mentry.getValue() + "|");
		}
		System.out.println("+================================+");
	}

	/**
	 * Method for choosing an item to buy by its key and making it into an invoice
	 * by looking for its key value in hashmap.
	 */
	private void buyItem(Customer c) {
		// Show list of items
		String choice;
		Long selected;
		Item item; // add values of item to Invoice

		showItems();
		// select an item to buy and search for it by its key in the hashmap
		System.out.println("Enter the product Id of the item you want to purchase");
		// choice
		choice = consoleScan.nextLine();
		selected = Long.parseLong(choice);

		// Extra credit Idea/challenge: ask for how much of an idea to buy/quantity and
		// get the invoice to show the total of all item elements in item list
		// Extra // ask if a user wants to purchase a different item and prompt if they
		// are finished.

		try {
			if (items.containsKey(selected)) {
				item = items.get(selected);
				long min = 1L;
				long max = 100L;
				long invoiceNo = min + (long) (Math.random() * (max - min));

				invoice = new Invoice(invoiceNo, c, item, item.getItemTotal());
				invoices.put(invoiceNo, invoice);
				itemCodes.put(item.getItemCode(), item);

				invoice.showInvoiceDetails();

				invoice.toString();
				System.out.println(invoice.showInvoiceDetails());
				System.out.println(invoice.toString());
			}
		} catch (Exception e) {
			System.out.println("Please enter the product number from the catalog.");
		}
	}

	/**
	 * Method for checking a purchase by invoice and purchase date and returning an
	 * item within a 15 day return policy
	 */
	private void ReplaceItem(Customer c) {

		String input;
		String choice;
		Item itemToReplace;
		Long invoiceNo;
		Invoice enteredInvoice;
		System.out.println("Welcome " + c.getEmail() + "!! Your invoice details are:");
		showInvoices();

		try {
			System.out.println("Enter the invoice number.");
			input = consoleScan.nextLine();
			invoiceNo = Long.parseLong(input);

			if (invoices.containsKey(invoiceNo)) {
				System.out.println("Invoice found");
				enteredInvoice = invoices.get(invoiceNo);

				System.out.println("Enter the itemcode of the item to replace.");
				input = consoleScan.nextLine();

				if (itemCodes.containsKey(input)) {

					itemToReplace = itemCodes.get(input);
					long validDate = ChronoUnit.DAYS.between(enteredInvoice.getPurchaseDate(), LocalDate.now());

					if (validDate >= -15) {
						System.out.println(
								"Yes, you can return your purchase. Would you like to proceed (enter y for yes or n for no.)");
						choice = consoleScan.nextLine();
						if (choice.equals("y")) {
							System.out.println("Return successful,Your replaced item is" + itemToReplace.toString()); // return
																														// item
																														// object
																														// as
																														// string
						} else if (choice.equals("n")) {
							System.out.println("Returning back to customer menu");
							displayCustMenu();
						} else {
							System.out.println("Not valid input");
						}
					} else {
						System.out.println(
								"Your purchase is past the 15 day period. You are not able to return or replace your item(s)");
					}

				} else {
					System.out.println("You dont have this item in your invoice");
				}
			}
		} catch (Exception e) {
			System.out.println("Not a valid choice");

		}
	}

	/**
	 * Method for starting up ecommerce menu for Customer registration Customer
	 * Login Buying an item Replacing an item if broken Exit the program
	 */
	public void startBrowsing() {
		try {
			Customer customer;
			String cEmail;
			String cPassword;
			int input; // local function scope
			mainloop: while (true) {
				input = displayMainMenu();
				switch (input) {
					case 1:
						register();
						break;
					case 2:
						System.out.println("Enter Email and Password:");
						System.out.println("Email : ");
						cEmail = consoleScan.nextLine();
						System.out.println("Password : ");
						cPassword = consoleScan.nextLine();
						System.out.println();
						if (customers.containsKey(cEmail)) {
							customer = customers.get(cEmail);
							if (customer.getPassword().equals(cPassword)) {
								while (true) {
									System.out.println("\n+======Login Successful!=========+");
									System.out.println("Welcome " + customer.getName());
									showItems();
									input = displayCustMenu();
									switch (input) {
										case 1:
											buyItem(customer);
											break;
										case 2:
											ReplaceItem(customer);
											break;
										case 3: {
											System.out.println("Signed out successfully");
											continue mainloop;
										}
										default:
											System.out.println("Enter a valid choice");
									}
								}
							} else {
								System.out.println("Invalid Credentials..Try again");
							}
						} else {
							System.out.println("Invalid Credentials..Try again");
						}
						break;
					case 3:
						System.out.println("Thank you for using the CyberJab Ecommerce CLI");
						System.exit(1);
						break;
					default:
						System.out.println("Enter a Valid Option!");
				}
				System.out.println();
			}
		} catch (Exception exception) {
			System.out.println("Enter a valid choice. Try Again!");
			System.out.println(exception);
		}
	}
}
