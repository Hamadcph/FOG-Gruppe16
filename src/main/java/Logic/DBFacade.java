/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Carport;
import Data.Customer;
import Data.Employee;
import Data.Mappers.CarportMapper;
import Data.Mappers.CustomerMapper;
import Data.Mappers.MaterialMapper;
import Data.Mappers.RequestMapper;
import Data.Material;
import Data.Request;
import Logic.Exception.UserNotExistingExeption;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * 
 */
public class DBFacade implements MapperFacade {
    
    CarportMapper cpm = new CarportMapper();
    CustomerMapper cm = new CustomerMapper();
    MaterialMapper mm = new MaterialMapper();
    RequestMapper rm = new RequestMapper();

    @Override
    public void createCustomer(Customer c) throws SQLException {
         cm.createCustomer(c);
    }


    @Override
    public boolean verifyCustomer(String name, String password) throws SQLException {
       return cm.verifyCustomer(name, password);
    }


    @Override
    public Carport getCarport(int id) throws SQLException {
        return cpm.getCarport(id);
    }


    @Override
    public boolean createCarportMaterial(Material MM) throws SQLException {
       return mm.createCarportMaterial(MM);
    }


    @Override
    public Customer getCustomer(int id) throws SQLException, UserNotExistingExeption {
        return cm.getCustomer(id);
    }
    @Override
    public Customer getCustomer(String email) throws UserNotExistingExeption {
        return cm.getCustomer(email);
    }

    @Override
    public void insertRequest(Request request) {
        rm.insertRequest(request);
    }

    @Override
    public boolean createcarport(Carport c) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Request getRequest(int id) throws UserNotExistingExeption {
        return getRequest(id);
    }

    @Override
    public List<Request> getRequests() {
        return rm.getRequests();
    }

   

   

    

   
    

}
