/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.Exception.CarportException;
import Logic.Exception.PasswordFailExeption;
import Logic.Exception.UserNotExistingExeption;
import Logic.DBFacade;
import Logic.MapperFacade;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 *
 */
public class RequestCommand extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, UserNotExistingExeption, CarportException, PasswordFailExeption {
        MapperFacade mf = new DBFacade();
        request.setAttribute("requests", mf.getRequests());
       return "requests";
    }

    
    
}
