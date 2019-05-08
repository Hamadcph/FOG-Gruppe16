/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Younes
 */
public class Command {
    
    public abstract void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    
    public static Command from(HttpServletRequest request) {
        
        Command c = null;
        
        String origin = request.getParameter("command");
        
        Map<String, Command> commands = new HashMap();
       
        return c;
    }
    
    
}
