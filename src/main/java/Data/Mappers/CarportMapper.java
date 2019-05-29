/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import Data.Carport;
import Data.Connection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * 
 */
public class CarportMapper {
    Connection conn;

    public CarportMapper() {
        this.conn = new Connector().getConnection();
    }   
    
    
    public Carport getCarport(int id) throws SQLException{
        
        try{
            String sql = "SELECT * FROM carports WHERE carport_id=?;";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                String rooftype = rs.getString("rooftype");
                int inclination = rs.getInt("inclination");
                Carport c = new Carport(length, width, inclination, rooftype);
                return c;
            }
            return null;
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    
        public int getCarportID(int length, int width, String roof, int inclined) throws SQLException{
        
        try{
            String sql = "SELECT * FROM carports WHERE length = ? AND width = ? AND rooftype = ? AND inclination = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, length);
            pst.setInt(2, width);
            pst.setString(3, roof);
            pst.setInt(4, inclined);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt("carport_id");
            }
            return 0;
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return 0;
    }
    
}
