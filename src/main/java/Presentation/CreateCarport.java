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
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamad
 */
@WebServlet(name = "CreateCarport", urlPatterns = {"/CreateCarport"})
public class CreateCarport extends HttpServlet {

    private MaterialCalc mc = new MaterialCalc();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
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
            request.getRequestDispatcher("").forward(request, response);

        }
        
    }
    
    
    
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CreateCarport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CreateCarport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
