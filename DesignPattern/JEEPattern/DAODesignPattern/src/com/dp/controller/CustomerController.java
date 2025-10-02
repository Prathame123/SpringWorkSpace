package com.dp.controller;

import java.util.List;

import com.dp.model.Customer;
import com.dp.service.CustomerService;

public class CustomerController {
	private CustomerService customerService;

	public CustomerController(String ServiceType) {
		customerService = new CustomerService(ServiceType);
	}
	
	public void createCustomer(Customer customer)
	{
		boolean status = customerService.AddCustomer(customer);
		System.out.println(status? "Customer Added Successfully" : "Failed to add Customer");
	}
	
	public void deleteCustomer(int id)
	{
		boolean status = customerService.DeleteCustomer(id);
		System.out.println(status? "Customer deleted Successfully" : "Failed to delete Customer");
	}
	
	public void showAllCustomer()
	{
		List<Customer> list = customerService.GetListOfCustomer();
	    list.forEach(System.out::println);
	}
	
	public void getCustomerById(int id)
	{
		Customer customer = customerService.GetCustomerById(id);
	    customer.toString();
	}
}
