/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Customer;
import Data.Mappers.DBFacade;
import Data.Mappers.MapperFacade;
import Data.Orders;
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
public class OrderInfoCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, LoginException, AlreadyExistsException {
        MapperFacade mf = new DBFacade();
        
        Customer c = mf.getCustomer(Integer.parseInt(request.getParameter("iduser")));
        
        Orders o = mf.getCustomerOrderByCustomer(c);
        
        request.setAttribute("ono", o.getOno());
        request.setAttribute("Delivery", o.getDeliveryDate());
        request.setAttribute("Shipping", o.getShipping());
        request.setAttribute("Materialid", o.getCarportmaterial_id());
        
        
        return "something";
    }
    
    
    
    
}
