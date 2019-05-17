package Data.Mappers;


import DB.Connector;
import Data.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 public class EmployeeMapper {
    
    Connection conn;
    
    public EmployeeMapper(){
        this.conn = new Connector().getConnection();
    }
    
    public boolean createEmployee(Employee e) throws SQLException{
        
        try{
            String sql = "INSERT INTO Employee(id, Ename, ePhone, password) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, e.getUserid());
            pst.setString(2, e.getName());
            pst.setInt(3, e.getPhone());
            
            int hashPassword = e.getPassword().hashCode();
            String hashString = String.valueOf(hashPassword);
            pst.setString(4, hashString);
            
            pst.executeUpdate();
            
            return true;
        } catch(SQLException ex){
            ex.printStackTrace();
            
            return false;
        }
    }
    
    public Employee getEmployee(int id) throws SQLException{
        
        try{
            String sql = "SELECT * FROM Employee WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String ename = rs.getString("eName");
                int ePhone = rs.getInt("ePhone");
                String password = rs.getString("password");
                
                Employee c = new Employee(id, ename, password, ePhone);
                return c;
            }
            return null;
            
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    
    public boolean verifyEmployee(int id, String password){
        
        try{
            String sql = "SELECT id, password FROM Employee WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
        if(rs.next()){
            rs.getString("password");         
            if(password.equals(rs.getString("password")))
                return true;
        }
        
        
    } catch (SQLException ex){
            System.out.println(ex);
    }
      return false;  
    }
    
}
