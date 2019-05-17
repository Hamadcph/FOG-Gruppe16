/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import Data.Carport;
import Data.Customer;
import Data.Employee;
import Data.Mappers.EmployeeMapper;
import Data.Mappers.MapperFacade;
import Data.Mappers.MaterialMapper;
import Data.Mappers.OrderMapper;
import Data.Mappers.ProductMapper;
import Data.Material;
import Data.Orders;
import Data.Product;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Hamad
 */
public class DBFacade implements MapperFacade {
    
    CarportMapper cpm = new CarportMapper();
    CustomerMapper cm = new CustomerMapper();
    MaterialMapper MM = new MaterialMapper();
    OrderMapper om = new OrderMapper();
    ProductMapper pm = new ProductMapper();
    EmployeeMapper em = new EmployeeMapper();

    
    @Override
    public boolean createCustomer(Customer c) throws SQLException {
        return cm.createCustomer(c);
    }

    @Override
    public Customer getCustomer(int id) throws SQLException {
        return cm.getCustomer(id);
    }

    @Override
    public ArrayList<Customer> getAllCustomer() throws SQLException {
        return cm.getAllCustomer();
    }

    @Override
    public boolean createcarport(Carport c) throws SQLException {
        return cpm.createcarport(c);
    }

    @Override
    public Carport getCarport(int id) throws SQLException {
        return cpm.getCarport(id);
    }

    @Override
    public boolean createEmployee(Employee e) throws SQLException {
        return em.createEmployee(e);
    }

    @Override
    public Employee getEmployee(int id) throws SQLException {
        return em.getEmployee(id);
    }
    
    @Override
    public boolean verifyEmployee(int id, String password) throws SQLException{
        return em.verifyEmployee(id, password);
    }

    @Override
    public boolean createCarportMaterial(Material M) throws SQLException {
        return MM.createCarportMaterial(M);
    }

    @Override
    public void createOrders(Orders od) throws SQLException {
        om.createOrders(od);
    }

    @Override
    public void createProduct(Product p) throws SQLException {
        pm.createProduct(p);
    }

    @Override
    public ArrayList<Product> getAllProduct() throws SQLException {
        return pm.getAllProduct();
    }
    
    public Orders getCustomerOrderByCustomer(Customer c)
    {
        return om.getOrderByCustommerID(c);
    }

}
