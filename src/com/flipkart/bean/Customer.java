/**
 * 
 */
package com.flipkart.bean;

/**
 * @author HP
 *
 */
public class Customer {
	//Define all the properties of the customers
	
		private int customerId;
		private String customerName;
		private String customerAddress;
		/**
		 * @return the customerId
		 */
		public int getCustomerId() {
			return customerId;
		}
		/**
		 * @param customerId the customerId to set
		 */
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		/**
		 * @return the customerName
		 */
		public String getCustomerName() {
			return customerName;
		}
		/**
		 * @param customerName the customerName to set
		 */
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		/**
		 * @return the customerAddress
		 */
		public String getCustomerAddress() {
			return customerAddress;
		}
		/**
		 * @param customerAddress the customerAddress to set
		 */
		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}
		
}
