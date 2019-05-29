/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import java.sql.SQLException;

/**
 *
 * 
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        CarportMapper m = new CarportMapper();
        System.out.println(m.getCarport(1));
    }
    
}
