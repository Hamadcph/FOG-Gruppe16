package Logic;

import Data.Carport;
import Data.Customer;
import Data.Employee;
import Data.Material;
import Data.Request;
import Logic.Exception.CarportException;
import Logic.Exception.UserNotExistingExeption;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public interface MapperFacade {
     // CustomerMapper
     public void createCustomer(Customer c) throws SQLException;
     public Customer getCustomer(String email) throws UserNotExistingExeption ;
     public Customer getCustomer(int id) throws SQLException, UserNotExistingExeption;
     public boolean verifyCustomer(String name, String password) throws SQLException;
  
     //request mapper
     public void insertRequest(Request request);
     public Request getRequest(int id) throws UserNotExistingExeption;
     // DetailMapper
     public boolean createcarport(Carport c) throws SQLException;
     public Carport getCarport(int id) throws SQLException;
    
     // OrderlineMapper
     public boolean createCarportMaterial(Material MM) throws SQLException;
     
     // OrdersMapper
//     public void createOrders(Orders od) throws SQLException;
//     public Orders getCustomerOrderByCustomer(Customer c);
    
    public List<Request> getRequests();

    }
