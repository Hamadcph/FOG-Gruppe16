/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Mappers.DBFacade;
import Data.Mappers.MapperFacade;
import Logic.Exceptions.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Younes
 */
public class LoginCommand extends Command {

    public LoginCommand() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) t {
        MapperFacade mf = new DBFacade();
            int id = Integer.parseInt(request.getParameter("id"));
            String password = request.getParameter("password");
            
            
            if(mf.verifyEmployee(id, password)){
                request.getSession().setAttribute("id", id);
                request.getSession().setAttribute("password", password);
                request.getRequestDispatcher("").forward(request, response); 
            }
            else{
                request.getRequestDispatcher("").forward(request, response);      
            }
    
}