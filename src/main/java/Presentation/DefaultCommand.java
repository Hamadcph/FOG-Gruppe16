/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DB.DBConnector;
import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Younes
 */
public class DefaultCommand extends Command {

    public DefaultCommand() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) {
        DBConnector con_ = new DBConnector();
        Connection con = DBConnector.connection();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}