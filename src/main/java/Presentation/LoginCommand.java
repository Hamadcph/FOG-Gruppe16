/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Customer;
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
public class LoginCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, UserNotExistingExeption {
        System.out.println("LOGINCOMMAND///////////////////////////////7");
        MapperFacade mf = new DBFacade();
        String email = request.getParameter("email");
        System.out.println(email);
        String password = request.getParameter("pass");
        System.out.println(password);

        if (mf.verifyCustomer(email, password)) {
            Customer customer = mf.getCustomer(email);
            System.out.println("CUSTOMER = " + customer);
            request.getSession().setAttribute("customer", customer);
            System.out.println("The customer is = " + request.getSession().getAttribute("customer"));

            return "loginscreencustomer";
        } else if (email.equals("admin") && password.equals("admin")) {
            return "loginscreenemployee";
        }
        return "index";
    }

}
