/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import Data.CarportPart;
import DB.Connector;
import Data.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hamad
 */
public class PartsMapper {
    Connection conn;
    
    public PartsMapper() throws SQLException{
        this.conn = new Connector().getConnection();
    }
    
    /**
     * The combination of CarportPart and product, 
     * is only shown to the employee of the company.
     */
    public List<CarportPart> getCarportParts(int id) throws SQLException{
        
        ArrayList<CarportPart> cpp = new ArrayList<>();
        
        Product product = new Product();
        
        String sql = "SELECT * FROM Product INNER JOIN carportpart ON Product.ProductID= carportpart.FK_product WHERE FK_carportid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            int ProductID = rs.getInt("ProductsID");
            String name = rs.getString("name");
            double size = rs.getInt("size");
            product = new Product(ProductID, name, size);
            int amount = rs.getInt("size");
            CarportPart cp = new CarportPart(product, amount);
            cpp.add(cp);
        }
        return cpp;
    }

}
