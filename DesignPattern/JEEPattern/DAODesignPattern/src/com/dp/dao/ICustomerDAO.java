package com.dp.dao;

import java.util.List;

import com.dp.model.Customer;

public interface ICustomerDAO {
	public boolean InsertCustomer(Customer customer);
	public Customer GetCustomerById(int id);
	public List<Customer> GetListOfAllCustomer();
	public boolean DeleteCustomer(int id);
}
