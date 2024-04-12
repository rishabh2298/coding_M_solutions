package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.masai.dbconnection.db;
import com.masai.exception.ProductException;
import com.model.Product;

public class ProdcutDaoImpl implements ProductDao {

	@Override
	public String addProduct(Product product) throws ProductException {
		
		String message = "Product Not added....";
				
		try (Connection conn = db.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into product values(?,?,?,?)");
			
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setInt(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			
			int status = ps.executeUpdate();
			
			if(status>0)
				message = "Product is added successfully to Database evaluatoin";
			else
				message = "There is no such table in database";
			
			
		} catch (SQLException e) {
			
			throw new ProductException(e.getMessage());
		}
				
		return message;
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {

		List<Product> products = new ArrayList<>();
		
		try (Connection conn = db.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from product");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int productId = rs.getInt("productId");
				String pname = rs.getString("productName");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				
				Product product = new Product(productId, pname, price, quantity);
				
				products.add(product);
				
			}
			
			
		}catch (SQLException e1) {
			throw new ProductException(e1.getMessage());
		}
		
		
		return products;
	}

	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
		
		List<Product> products = new ArrayList<>();
		
		try(Connection conn = db.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement(" select * from product where quantity<?");
			
			ps.setInt(1, quantity);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int productId = rs.getInt("productId");
				String pname = rs.getString("productName");
				int price = rs.getInt("price");
				int quan = rs.getInt("quantity");
				
				Product product = new Product(productId, pname, price, quan);
				
				products.add(product);
				
			}
			
		} catch (SQLException e) {

			throw new ProductException(e.getMessage());
		}
		
		return products;
	}

	@Override
	public String addProductQuantity(int productId, int quantity) throws ProductException {

		String message = "Product is not added.....";
		
		try(Connection conn = db.getConnection()){
			
			Statement st = conn.createStatement();
			
			int status = st.executeUpdate(" update product set quantity="+quantity+" where productId="+productId+"");
			
			if(status>0) {
				message = "Product quantity has been updated";
			}
			else {
				message = "No such product with this productId "+productId;
			}
			
			
		} catch (SQLException e) {
			
			throw new ProductException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String deleteProductByProductName(String pname) throws ProductException {

		String message = "Product is not deleted...";
		
		try(Connection conn = db.getConnection()){
			
			Statement st = conn.createStatement();
			
			int status = st.executeUpdate("delete from product where productName='"+pname+"'");
			
			if(status>0)
				message = "Product with name "+pname+" has been deleted from database";
			else {
				message = "No such product name exist in table of database";
			}
			
		} catch (SQLException e) {
			
			throw new ProductException(e.getMessage());
		}
		
		return null;
	}

	@Override
	public Product getProductByProductName(String pname) throws ProductException {
		
		Product product = null;
		
		try(Connection conn = db.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from product where productName='"+pname+"'");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int productId = rs.getInt("productId");
				String name = rs.getString("productName");
				int price = rs.getInt("price");
				int quan = rs.getInt("quantity");
				
				product = new Product(productId, name, price, quan);
				
			}
			else {
				throw new ProductException("No such product available with product name "+pname);
			}
			
			
			
		} catch (SQLException e) {

			throw new ProductException(e.getMessage());
		}
		
		
		return product;
	}

}
