/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Mappers.DBFacade;
import Data.Mappers.MapperFacade;
import Logic.Exceptions.LoginException;
import java.sql.SQLException;
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
    String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        MapperFacade mf = new DBFacade();
            int id = Integer.parseInt(request.getParameter("id"));
            String password = request.getParameter("password");
            
            if(mf.verifyEmployee(id, password)){
                request.setAttribute("id", id);
                request.setAttribute("password", password);
            return "login";
            }else{     
               return "notFound";
                
            }
            
            }
            
    }
    