/**
 * 
 */
package com.flipkart.application;

import java.util.Scanner;

import com.flipkart.business.CustomerService;

/**
 * @author HP
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the instance of customer service
		CustomerService service = new CustomerService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Create Customer");
		System.out.println("2 - Update Customer");
		System.out.println("3 - List Customer");
		System.out.println("4- Delete Customer");
		System.out.println("5 - QUIT");
		
		boolean quit=false;
		do {

			
			int a=scanner.nextInt();
		switch(a) {
		case 1:service.createCustomer();
		break;
		
		case 2:service.updateCustomer();
		break;
		
		
		case 3:service.listCustomer();
		break;
		
		
		case 4:service.deleteCustomer();
		break;
		
		case 5:quit=true;
		break;
		
		default: System.out.println("Error Input");
		break;
		
		} 
		
		}while(!quit);
		
	}

}
