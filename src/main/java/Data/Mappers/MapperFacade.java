package Data.Mappers;

import Data.Carport;
import Data.Customer;
import Data.Employee;
import Data.Material;
import Data.Orders;
import Data.Product;
import Logic.Exceptions.CarportException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hamad
 */
public interface MapperFacade {
     // CustomerMapper
     public boolean createCustomer(Customer c) throws SQLException;
     public Customer getCustomer(int id) throws SQLException;
     public ArrayList<Customer> getAllCustomer() throws SQLException;
     public Customer loginCustomer() throws SQLException;
     
     // DetailMapper
     public boolean createcarport(Carport c) throws SQLException;
     public Carport getCarport(int id) throws SQLException;
     
     // EmployeeMapper
     public boolean createEmployee(Employee e) throws SQLException;
     public Employee getEmployee(int id) throws SQLException;
     public boolean verifyEmployee(int id, String password) throws SQLException;
     
     // OrderlineMapper
     public boolean createCarportMaterial(Material MM) throws SQLException;
     
     // OrdersMapper
     public void createOrders(Orders od) throws SQLException;
     public Orders getCustomerOrderByCustomer(Customer c);
     
     // ProductMapper
     public void createProduct(Product p) throws SQLException;
     public ArrayList<Product> getAllProduct() throws SQLException;

    }
