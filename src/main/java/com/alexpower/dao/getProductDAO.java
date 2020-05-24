package com.alexpower.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alexpower.bean.Product;
import com.alexpower.jdbc.GetConnection;

public class getProductDAO {


	public Product getProduct(int id) throws Exception {
		
		Product product =  new Product();
		
		product.setId(id);
        product.setName("Computer");
        product.setField("tech");
		
		Connection connection =  GetConnection.getConnection();
	        
        String sql  = "select id, name, field from products where id = ?";
        PreparedStatement ps =  connection.prepareStatement(sql);
                
        ResultSet rs = null;
        
        ps.setObject(1, id);
        	       
        rs = ps.executeQuery();
        
        if(rs.next()) {
        	 int prodid = rs.getInt("id");
    	     
    	     String name = rs.getString("name");
    	     String field = rs.getString("field");
             
             product.setId(prodid);
             product.setName(name);
             product.setField(field);
        }
	     
		
		return product;
	}

}
