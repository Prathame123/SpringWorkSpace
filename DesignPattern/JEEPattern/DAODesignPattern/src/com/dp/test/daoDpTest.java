package com.dp.test;

import com.dp.controller.CustomerController;
import com.dp.model.Customer;

public class daoDpTest {
	public static void main(String[] args) {
		CustomerController controller = new CustomerController("JDBC");
		controller.createCustomer(new Customer(101, "John", "john@example.com", "NY"));
	    controller.createCustomer(new Customer(102, "Alice", "alice@example.com", "LA"));
	    System.out.println("---- All Customers ----");
	    controller.showAllCustomer();
	    
        // Fetch single
        controller.getCustomerById(101);

        // Delete
        controller.deleteCustomer(102);
        
        // Show all after delete
        System.out.println("---- After Deletion ----");
        controller.showAllCustomer();
	}
}
