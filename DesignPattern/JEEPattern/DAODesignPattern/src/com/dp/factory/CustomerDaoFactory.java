package com.dp.factory;

import com.dp.dao.CustomerDAOImpl;
import com.dp.dao.ICustomerDAO;

public class CustomerDaoFactory {
	
	public static ICustomerDAO getCustomerDao(String daoType)
	{
		if ("JDBC".equalsIgnoreCase(daoType)) {
			return new CustomerDAOImpl();
		}
		else
		{
			throw new IllegalArgumentException("Unknown DAO");
		}
	}
}
