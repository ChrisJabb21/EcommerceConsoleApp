package org.chris.ecommerce.application;

import org.chris.ecommerce.controller.EcommerceController;

/**
 * The main entry point of the Java application.
 */
public class EcommerceApplication 
{
	public EcommerceController ecommerce;
    public static void main( String[] args )
    {
    	try{
    		EcommerceController ecommerceController = new EcommerceController();
    		ecommerceController.startBrowsing();
    	}
    	catch(Exception e){
    		System.out.println("The ecommerce platform is having issues loading");
    		System.out.println("Try again later!");
    	}
    }
}
