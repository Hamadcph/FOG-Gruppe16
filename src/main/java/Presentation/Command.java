package Presentation;

import Logic.Exceptions.LoginException;
import java.util.HashMap;
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
        commands.put("login", new LoginCommand() );
        commands.put("registerCust", new RegisterCustomerCommand() );
        commands.put("registerEmp", new RegisterEmployeeCommand());
        
              
    
    
    }
        
        static Command from(HttpServletRequest request){
            String commandName = request.getParameter("command");
            if(commands == null){
                initCommands();
            }
         
            return commands.getOrDefault(commandName, new DefaultCommand() );
        
        }
        
        abstract String execute(HttpServletRequest request, HttpServletResponse response)
                    throws LoginException;
    
    
    
    
}
