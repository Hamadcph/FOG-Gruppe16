package Presentation;

import Logic.Exceptions.AlreadyExistsException;
import Logic.Exceptions.LoginException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Younes
 */
abstract class Command {
    
    private static HashMap<String, Command> commands;
    
    private static void initCommands(){
        commands = new HashMap<>();
        commands.put("something", new LoginCommand() );
        commands.put("something", new RegisterCustomerCommand() );
        commands.put("something", new RegisterEmployeeCommand() );
        commands.put("something", new OrderCarportCommand() );
        commands.put("something", new CustomerInfoCommand() );
        commands.put("something", new OrderInfoCommand() );
        
        
       }
        
        static Command from(HttpServletRequest request){
            String commandName = request.getParameter("command");
            if(commands == null){
                initCommands();
            }
         
            return commands.getOrDefault(commandName, new DefaultCommand() );
        
        }
        
        abstract String execute(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException, SQLException, LoginException, AlreadyExistsException;
    
    
    
    
}
