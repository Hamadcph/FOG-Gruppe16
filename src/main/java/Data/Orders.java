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
    private Date deliviry;
    private double shipping;
    private int carportmaterial_id;

    public Orders(int ono, Date deliviry, double shipping, int carportmaterial_id) {
        this.ono = ono;
        this.deliviry = deliviry;
        this.shipping = shipping;
        this.carportmaterial_id = carportmaterial_id;
    }

    public int getOno() {
        return ono;
    }

    public void setOno(int ono) {
        this.ono = ono;
    }

    public Date getDeliviry() {
        return deliviry;
    }

    public void setDeliviry(Date deliviry) {
        this.deliviry = deliviry;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public int getcarportmaterial_id() {
        return carportmaterial_id;
    }

    public void setcarportmaterial_id(int carportmaterial_id) {
        this.carportmaterial_id = carportmaterial_id;
    }

    @Override
    public String toString() {
        return "Orders{" + "ono=" + ono + ", deliviry=" + deliviry + ", shipping=" + shipping + ", carportmaterial_id=" + carportmaterial_id + '}';
    }


}
