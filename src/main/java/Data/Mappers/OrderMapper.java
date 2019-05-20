/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import DB.Connector;
import Data.Customer;
import Data.Orders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hamad
 */
public class OrderMapper {

    Connection conn;

    public OrderMapper() {
        this.conn = new Connector().getConnection();
    }

    public void createOrders(Orders od) throws SQLException {

        try {
            String sql = "INSERT INTO Orders(Delivery, Shipping, Materialid) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, od.getDeliveryDate());
            pst.setDouble(2, od.getShipping());
            pst.setInt(3, od.getCarportmaterial_id());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Orders getOrderByCustommerID(Customer c) {
        try {
            String sql = "SELECT * FROM Orders WHERE OrderNumber = " + c.getFK_ordernumber();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Orders customerOrder = new Orders(rs.getInt("OrderNumber"), rs.getDate("Delivery"), rs.getInt("Shipping"), rs.getInt("Materialid"));
                return customerOrder;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
