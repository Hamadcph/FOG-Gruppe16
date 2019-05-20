/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Employee;
import Data.Mappers.DBFacade;
import Data.Mappers.MapperFacade;
import Logic.Exceptions.LoginException;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Younes
 */
public class RegisterEmployeeCommand extends Command {

    public RegisterEmployeeCommand() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        MapperFacade mf = new DBFacade();
        
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        int phoneNo = Integer.parseInt(request.getParameter("phoneNo"));
        
        Employee emp = new Employee(name, password, phoneNo);
        
       
        
        if(mf.createEmployee(emp)) {
            request.setAttribute("name", name);
            request.setAttribute("password", password);
            request.setAttribute("phoneNo", phoneNo);
        }    
       return "noget.jsp";
        
    }
    }
    

