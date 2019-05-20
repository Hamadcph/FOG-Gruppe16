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

    public Customer(int ID, String email, String password, String name, String lastname, String adress, int phoneNumber, int FK_ordernumber) {
        this.ID = ID;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.FK_ordernumber = FK_ordernumber;
    }
    
    public Customer(int id, String email, String name, String lastname, String adress, int phoneNumber) {
        
        this.ID = id;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
     
    }
    
    public Customer(String email, String name, String lastname, String adress, int phoneNumber) {
        
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
     
    }

    public Customer(int Cid, String name, String name0, String lastname, String adress, int phonenumber, int FK_ono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }
    
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getFK_ordernumber() {
        return FK_ordernumber;
    }


    

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", email=" + email + ", name=" + name + ", lastname=" + lastname + ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", FK_ordernumber=" + FK_ordernumber + '}';
    }
    
    

}