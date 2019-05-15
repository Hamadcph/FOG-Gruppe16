/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import Logic.Exceptions.LoginException;
import Data.Mappers.UserMapper;
import Data.User;


    /**
 * 
 * @author Younes
 */
public class LogicFacade {

    public static User login( String email, String password) throws LoginException {
        return UserMapper.loginUser(email, password);
    } 

    public static User createUserCustomer(String email, String password ) throws LoginException, ClassNotFoundException {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }
    
    public static User createUserEmployee(String username, String password, String email ) throws LoginException, ClassNotFoundException {
        User user = new User(email, password, "employee");
        UserMapper.createUser(user);
        return user;
    }
}
