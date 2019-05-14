package Data.Mappers;


import Logic.LoginSampleException;
import Data.User;
import DB.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Younes
 */
public class UserMapper {
    
    static Connector dbcon = new Connector();
    
    public static User getUser(String email) throws SQLException {
        
        
        String email_ = "";
        String password = "";
        String role = "";

        try {
            PreparedStatement statement = dbcon.getConnection().prepareStatement(email);
            String query
                    = "SELECT * "
                    + "FROM user "
                    + "WHERE email = '" + email + "';";
            ResultSet rs = statement.executeQuery(query);

            if (rs.next()) {
                email_ = rs.getString("email");
                password = rs.getString("password");
                role = rs.getString("role");
            }
            
        } catch (Exception e) {
        }
        return new User(email_,password, role);
    }
    
    
    public static void createUser( User user ) throws LoginSampleException, ClassNotFoundException {
       try {
            String SQL = "";
            PreparedStatement statement = Connector.connection().prepareStatement(SQL);
            String role = user.getRole();
            String query = "";
            if(role.equalsIgnoreCase("customer"))
            query
                    = "INSERT INTO user(username, password, email, role) "
                    + "VALUES ('"+ user.getUsername() + "', '" + user.getPassword() + "', " + user.getEmail() + ", customer);";
            statement.executeUpdate(query);
            
            if(role.equalsIgnoreCase("employee"))
            query
                    = "INSERT INTO user(username, password, email, role) "
                    + "VALUES ('"+ user.getUsername() + "', '" + user.getPassword() + "', " + user.getEmail() + ", employee);";
            statement.executeUpdate(query);
            

        } catch (SQLException e) {
        }
    }

    public static User loginUser( String username, String password ) throws LoginSampleException {
        try {
            Connection con = DBConnector.connection();
            String SQL = "SELECT username, role FROM user "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, username );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String email = rs.getString("email");
                String role = rs.getString( "role" );
                
                User user = new User(username, password);
               
                return user;
            } else {
                throw new LoginSampleException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    }
