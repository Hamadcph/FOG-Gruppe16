
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Hamad
 */
public class Connector {

    private Connection connection = null;
	
    private static final String IP = "localhost";
    private static final String PORT = "3306";

    /**
     * "DATABASE" which database to connect.
     * "USERNAME" username of the owner.
     * "password" password of the owner.
     */
    public static final String DATABASE = "fogh";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "johnjohn";

    /**
     * Connecting magic.
     * @throws SQLException
     */
    public Connector() throws SQLException {
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        Properties props = new Properties();
        props.put("user", USERNAME);
        props.put("password", PASSWORD);
        props.put("allowMultiQueries", true);
        props.put("useUnicode", true);
        props.put("useJDBCCompliantTimezoneShift", true);
        props.put("useLegacyDatetimeCode", false);
        props.put("serverTimezone", "CET");
        this.connection = DriverManager.getConnection(url, props);
        System.out.println("Connection correctly established to the database: " + DATABASE);
    }
     catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
            throw new SQLException(ex.getMessage());
        }
     }
     
    /**
     * 
     * @return
     */
    public Connection getConnection() {
        return this.connection;
    }
}
    

    

