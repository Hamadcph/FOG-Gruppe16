/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Younes
 */
public class CustomerInfo {
    
    private int userId;
    private String name;
    private String address;
    private String zipCode;
    private String city;
    private String phoneNumber;
    private String email;
    private String comment;

    public CustomerInfo(int userId, String name, String address, String zipCode, String city, String phoneNumber, String email, String comment) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.comment = comment;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }
    
    
    
}
