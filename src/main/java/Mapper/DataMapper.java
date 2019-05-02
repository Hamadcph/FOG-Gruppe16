/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import DataLayer.Carport;
import DataLayer.Connector;
import DataLayer.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author shpattt
 */
public class DataMapper {
    private Connector connector;
   
    public User getInfo(String e) {
        int userid = 0;
        String email = "";
        String password = "";
        try {
            this.connector = new Connector();
            String query
                    = "SELECT * "
                    + "FROM user "
                    + "WHERE email = '" + e + "';";
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                userid = rs.getInt("userid");
                email = rs.getString("email");
                password = rs.getString("password");
                

            }
        } catch (Exception ex) {
        }
        return new User(userid, email, password);

    }
        public void insertUser(String email, String password) {
        try {
            Connector connection = new Connector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "INSERT INTO user"
                    + "(email, password) "
                    + "values" + "('" + email + "'," + "'" + password + "');";

            stmt.executeUpdate(query);
        } catch (Exception e) {
        }

    }
       public ArrayList<Carport> getShit() {
        ArrayList<Carport> carlist = new ArrayList<>();
        try {
            Connector connection = new Connector();
            Statement stmt = connection.getConnection().createStatement();

            String query
                    = "Select * from carport;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Carport car = new Carport(rs.getInt("length"), rs.getInt("width"), rs.getString("roofstyle"));
                carlist.add(car);

            }

        } catch (Exception e) {
        }

        System.out.println(Arrays.toString(carlist.toArray()));
        return carlist;
    }
    
}
