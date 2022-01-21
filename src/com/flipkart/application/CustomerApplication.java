/**
 * 
 */
package com.flipkart.application;

import com.flipkart.business.CustomerService;

/**
 * @author saksh
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create the instance of customer service
		CustomerService service=new CustomerService();
		service.createCustomer();
		
		service.updateCustomer();
		service.deleteCustomer();
		service.listCustomer();
	}

}
