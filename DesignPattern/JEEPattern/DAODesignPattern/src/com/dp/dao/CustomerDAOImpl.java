package com.dp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.dp.factory.ConnectionFactory;
import com.dp.model.Customer;

public class CustomerDAOImpl implements ICustomerDAO {

	@Override
	public boolean InsertCustomer(Customer customer) {
	    String query = "INSERT INTO CUSTOMER (id, name, email, city) VALUES (?, ?, ?, ?)";
	    
	    try (Connection con = ConnectionFactory.getConnection();
	         PreparedStatement pr = con.prepareStatement(query)) {
	       
	        pr.setInt(1, customer.getCustomerId());
	        pr.setString(2, customer.getCustomerName());
	        pr.setString(3, customer.getCustomerEmail());
	        pr.setString(4, customer.getCustomerCity());
	        int rowsInserted = pr.executeUpdate();
	        return rowsInserted > 0;               
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}


	@Override
	public Customer GetCustomerById(int id) {
		 String query = "SELECT * FROM CUSTOMER WHERE id=?";
	        try (Connection con = ConnectionFactory.getConnection();
	             PreparedStatement ps = con.prepareStatement(query)) {
	            
	            ps.setInt(1, id);
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                return new Customer(rs.getInt("id"), rs.getString("name"),
	                                    rs.getString("email"), rs.getString("city"));
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	}

	@Override
	public List<Customer> GetListOfAllCustomer() {
		List<Customer> list = new ArrayList<>();
        String query = "SELECT * FROM CUSTOMER";
        try (Connection con = ConnectionFactory.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            
            while (rs.next()) {
                list.add(new Customer(rs.getInt("id"), rs.getString("name"),
                                      rs.getString("email"), rs.getString("city")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
	}

	@Override
	public boolean  DeleteCustomer(int id) {
		 String query = "DELETE FROM CUSTOMER WHERE id=?";
	        try (Connection con = ConnectionFactory.getConnection();
	             PreparedStatement ps = con.prepareStatement(query)) {
	            
	            ps.setInt(1, id);
	            return ps.executeUpdate() > 0;

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return false;
	}
}
