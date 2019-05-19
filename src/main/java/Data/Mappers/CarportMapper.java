/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import Data.Carport;
import DB.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Hamad
 */
public class CarportMapper {
    Connection conn;

    public CarportMapper() {
        this.conn = new Connector().getConnection();
    }   
    
    public boolean createcarport(Carport c) throws SQLException{
        
        try{
            String sql = "INSERT INTO Carport(length, width, roof) VALUES(?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, c.getLength());
            pst.setInt(2, c.getWidth());
            pst.setString(3, c.getRoof());
            
            pst.executeLargeUpdate();
        
            return true;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
            return false;
    }
    
    public Carport getCarport(int id) throws SQLException{
        
        try{
            String sql = "SELECT * FROM Carport WHERE CarportID=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int length = rs.getInt("Length");
                int width = rs.getInt("Width");
                String roof = rs.getString("Roofstyle");
                int incline = rs.getInt("Inclined");
                Carport c = new Carport(length, width, roof,incline);
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
            String sql = "SELECT * FROM Carport WHERE Carport.Length = ? AND Carport.width = ? AND Carport.roof = ? AND Carport.inclined = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, length);
            pst.setInt(2, width);
            pst.setString(3, roof);
            pst.setInt(4, inclined);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt("CarportID");
            }
            return 0;
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return 0;
    }
    
}
