/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.Customer;

/**
 * @author saksh
 *
 */
public class CustomerService {
	//The service implementing all the operations for creating, upadating and deleting the customers
	Customer customer=new Customer();
	
	public void createCustomer()
	{
		
		System.out.println("Customer is created");
		//Add dummy values in customer object
		customer.setCustomerID(101);
		customer.setCustomerName("Saksham");
		customer.setCustomerAddress("Allahabad");
	}
	public void updateCustomer() {
		System.out.println("Customer is updated");
	}
	public void listCustomer() {
		System.out.println("Customer is listed");
		System.out.println("Cusotmer ID: "+customer.getCustomerID()+" Customer Name:"+customer.getCustomerName()+" Customer Address: "+customer.getCustomerAddress());
	}
	public void deleteCustomer() {
		System.out.println("Customer is deleted");
	}
}
