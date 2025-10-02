package com.dp.service;

import java.util.List;

import com.dp.dao.ICustomerDAO;
import com.dp.factory.CustomerDaoFactory;
import com.dp.model.Customer;

public class CustomerService {
	 private ICustomerDAO customerDao;

	 public CustomerService(String daoType) {
		customerDao = CustomerDaoFactory.getCustomerDao(daoType);
	 }
	 
	 public boolean AddCustomer(Customer customer)
	 {
		 return customerDao.InsertCustomer(customer);
	 }
	 
	 public boolean DeleteCustomer(int id)
	 {
		 return customerDao.DeleteCustomer(id);
	 }
	 
	 public List<Customer> GetListOfCustomer()
	 {
		 return customerDao.GetListOfAllCustomer();
	 }
	 
	 public Customer GetCustomerById(int id)
	 {
		 return customerDao.GetCustomerById(id);
	 }
}