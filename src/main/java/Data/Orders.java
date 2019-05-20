/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Date;

/**
 *
 * @author Hamad
 */
public class Orders {    
   
    private int ono;
    private Date deliveryDate;
    private double shipping;
    private int carportmaterial_id;

    public Orders(int ono, Date deliveryDate, double shipping, int carportmaterial_id) {
        this.ono = ono;
        this.deliveryDate = deliveryDate;
        this.shipping = shipping;
        this.carportmaterial_id = carportmaterial_id;
    }

    public int getOno() {
        return ono;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public double getShipping() {
        return shipping;
    }

    public int getCarportmaterial_id() {
        return carportmaterial_id;
    }


    
    

}
