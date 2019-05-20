/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author shpattt
 */
public class Employee {
   private int empId;
   private String name;
   private String password;
   private int phoneNo;

    public Employee(int empId, String name, String password, int phoneNo) {
        this.empId = empId;
        this.name = name;
        this.password = password;
        this.phoneNo = phoneNo;
    }

    public Employee(String name, String password, int phoneNo) {
        this.name = name;
        this.password = password;
        this.phoneNo = phoneNo;
    }
    
    

    public Employee(int empId, String password) {
        this.empId = empId;
        this.password = password;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    
    

   


}