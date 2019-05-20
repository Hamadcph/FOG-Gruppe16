/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Customer;
import Data.Mappers.DBFacade;
import Data.Mappers.MapperFacade;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Younes
 */
public class RegisterCustomerCommand extends Command {

    public RegisterCustomerCommand() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        
        
        MapperFacade mf = new DBFacade();
        
        String fname = request.getParameter("name");
        String lname = request.getParameter("lastname");
        String adress = request.getParameter("adress");
        int cphone = Integer.getInteger(request.getParameter("phonenumber"));
        String mail = request.getParameter("Email");
        
        Customer c = new Customer(mail, fname, lname, adress, cphone);
        
        if(mf.createCustomer(c)){
            
            
                request.setAttribute("name", fname);
                request.setAttribute("lastname", lname);
                request.setAttribute("adress", adress);
                request.setAttribute("phonenumber", cphone);
                request.setAttribute("Email", mail);
                
        }
        return "something";
        
   } 

}
            