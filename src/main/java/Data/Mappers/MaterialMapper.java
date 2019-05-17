/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import Data.Material;
import Data.Carport;
import DB.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hamad
 */
public class MaterialMapper {
    
    Connection conn;
    CarportMapper cm = new CarportMapper();

    public MaterialMapper() {
        this.conn = new Connector().getConnection();
    }
    
    
    
    public boolean createCarportMaterial(Material M) throws SQLException{
        
        try{
            String sql = "INSERT INTO Material(Wood, Screws, Roof, Bracket, FK_CarportID) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, M.getWood_qty());
            pst.setInt(2, M.getScrew_qty());
            pst.setString(3, M.getRoof());
            pst.setInt(4, M.getBracket());
            pst.setInt(5, cm.getCarportID(M.getCarport().getLength(), M.getCarport().getWidth(), M.getCarport().getRoof(), M.getCarport().getIncline()));
            return true;
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    
}
