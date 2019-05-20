/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Customer;
import Data.Mappers.DBFacade;
import Data.Mappers.MapperFacade;
import Logic.Exceptions.AlreadyExistsException;
import Logic.Exceptions.LoginException;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Younes
 */
public class CustomerInfoCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, LoginException, AlreadyExistsException {
        
        MapperFacade mf = new DBFacade();
        
        Customer c = mf.getCustomer(Integer.parseInt(request.getParameter("iduser")));
        
        request.getSession().setAttribute("iduser", c.getID());
        request.getSession().setAttribute("name", c.getName());
        request.getSession().setAttribute("lastname", c.getLastname());
        request.getSession().setAttribute("adress", c.getAdress());
        request.getSession().setAttribute("phonenumber", c.getPhoneNumber());
        request.getSession().setAttribute("Email", c.getEmail());
        request.getSession().setAttribute("FK_Ono", c.getFK_ordernumber());
        
        return "something.jsp";
    }
    
}
