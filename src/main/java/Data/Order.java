/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Younes
 */
public class Order {
    
    private Carport carportOrdered;
    private CustomerInfo customerInfo;
    

    public Order(Carport carportOrdered, CustomerInfo customerInfo) {
        this.carportOrdered = carportOrdered;
        this.customerInfo = customerInfo;
    }

    public Carport getCarportOrdered() {
        return carportOrdered;
    }
    
    
}