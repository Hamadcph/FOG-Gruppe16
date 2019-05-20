/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Calculator.MaterialCalc;
import Data.Carport;
import Data.Mappers.DBFacade;
import Data.Mappers.MapperFacade;
import Data.Material;
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
public class OrderCarportCommand extends Command {
        
    private final MaterialCalc mc = new MaterialCalc();
    
    
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, LoginException, AlreadyExistsException {
        
        
        MapperFacade MF = new DBFacade();
        
        int length = Integer.parseInt(request.getParameter("Length"));
        int width = Integer.parseInt(request.getParameter("Width"));
        String roof = request.getParameter("Roofstyle");
        //int inclined = Integer.parseInt(request.getParameter("Inclined"));
        
        Carport c = new Carport(length, width, roof);
        Material M = mc.calculator(c.getLength(), c.getWidth(), c.getRoof());
        
        //TODO: Create an order using the detail and order created above and link that to costumer
        // then add the variables of the order to session variables 
        
        if(MF.createcarport(c)){
            request.getSession().setAttribute("Length", c.getLength());
            request.getSession().setAttribute("Width", c.getWidth());
            request.getSession().setAttribute("Roofstyle", c.getRoof());
            if(MF.createCarportMaterial(M)){
                request.getSession().setAttribute("Woods", M.getWood_qty());
                request.getSession().setAttribute("Screws", M.getScrew_qty());
                request.getSession().setAttribute("Bracket", M.getBracket());
            }
            
            return "something";
            
        }
        
        return "something";
        
    }
    
}
