/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import DB.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Data.Product;

/**
 *
 * @author Hamad
 */
public class ProductMapper {
    
    Connection conn;
    public ProductMapper() {
        this.conn = new Connector().getConnection();
    }
    
    public void createProduct(Product p) throws SQLException{
        
        try{
            String sql = "INSERT INTO Product(ProductsID, name, size, price) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, p.getId());
            pst.setString(2, p.getName());
            pst.setDouble(3, p.getMeasure());
            pst.setDouble(4, 0);
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Product> getAllProduct() throws SQLException{
        
        ArrayList<Product> p = new ArrayList();
        
        String sql = "SELECT * FROM Product";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            int pid = rs.getInt("ProductsID");
            String name = rs.getString("Name");
            double size = rs.getInt("size");
            
            Product pd = new Product(pid, name, size);
            p.add(pd);
        }
         return p;
    }
}

    

