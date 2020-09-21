package org.chris.ecommerce.application;

import org.chris.ecommerce.controller.EcommerceController;

/**
 * Hello world!
 *
 */
public class EcommerceApplication 
{
	public EcommerceController ecommerce;
	
	
    public static void main( String[] args )
    {
    	try{
    		EcommerceController ecommerceController = new EcommerceController();
    	}
    	catch(Exception e){
    		System.out.println("The ecommerce platform is having issues initializing");
    		System.out.println("Try again later!");
    	}
    }
}
