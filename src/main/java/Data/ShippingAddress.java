/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * 
 */
public class ShippingAddress {
    private String street;
    private int zip;
    private String city;
    private String firstname;
    private String lastname;

    public ShippingAddress(String street, int zip, String city, String firstname, String lastname) {
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "ShippingAddress{" + "street=" + street + ", zip=" + zip + ", city=" + city + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
    
}
