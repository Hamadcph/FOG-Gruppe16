/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import DB.Connector;
import Data.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author shpattt
 */
public class CustomerMapper {
     Connection conn;
    
    public CustomerMapper() {
        this.conn = new Connector().getConnection();
    }
    
    public boolean createCustomer(Customer c) throws SQLException{
        
        try{
            String sql = "INSERT INTO customer(name, lastname, adress, phonenumber, Email) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, c.getName());
            pst.setString(2, c.getLastname());
            pst.setString(3, c.getAdress());
            pst.setInt(4, c.getPhoneNumber());
            pst.setString(5, c.getEmail());

            pst.executeUpdate();
            
            return true;
        } catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("not working");
        
            return false;
        }
  
    }
    
     public Customer getCustomer(int id) throws SQLException{
        
         String sql = "SELECT * FROM Customer WHERE id=?";
         PreparedStatement pst = conn.prepareStatement(sql);
         pst.setInt(1, id);
         ResultSet rs = pst.executeQuery();
         
         
         if(rs.next()){
             int Cid = rs.getInt("id");
             String name = rs.getString("name");
             String lastname = rs.getString("lastname");
             String adress = rs.getString("adress");
             int phonenumber = rs.getInt("phonenumber");
             int FK_ono = rs.getInt("FK_ono");
             Customer c = new Customer(Cid, name, name, lastname, adress, phonenumber, FK_ono);
             
             return c;
         }
         
         return null;
        }
     
     public ArrayList<Customer> getAllCustomer() throws SQLException{
         
         ArrayList<Customer> customer = new ArrayList<>();
         
         String sql = "SELECT * from Customer";         
         PreparedStatement pst = conn.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
        while(rs.next()){ 
            int Cid = rs.getInt("id");
            String name = rs.getString("name");
            String lastname = rs.getString("lastname");
            String adress = rs.getString("adress");
            int phonenumber = rs.getInt("phonenumber");
            String email = rs.getString("email");
            int FK_ono = rs.getInt("FK_ono");
            
            Customer c = new Customer(Cid, email, name, lastname, adress, phonenumber, FK_ono);
            customer.add(c);
        
        }  
         return customer;
     }
}

