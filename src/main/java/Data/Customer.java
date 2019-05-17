/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Hamad
 */
public class Customer {
    private int ID;
    private String email;
    private String name;
    private String lastname;
    private String adress;
    private int phoneNumber;
    private int FK_ordernumber;

    public Customer(int ID, String email, String name, String lastname, String adress, int phoneNumber, int FK_ordernumber) {
        this.ID = ID;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.FK_ordernumber = FK_ordernumber;
    }
    
    public Customer(String email, String name, String lastname, String adress, int phoneNumber) {
        
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
     
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFK_ordernumber() {
        return FK_ordernumber;
    }

    public void setFK_ordernumber(int FK_ordernumber) {
        this.FK_ordernumber = FK_ordernumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", email=" + email + ", name=" + name + ", lastname=" + lastname + ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", FK_ordernumber=" + FK_ordernumber + '}';
    }
    
    

}