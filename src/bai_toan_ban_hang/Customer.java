/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_toan_ban_hang;

/**
 *
 * @author P51
 */
public class Customer {
    private String customerId, customerName, gender, dob, address;

    public Customer(String customerId, String customerName, String gender, String dob, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
    }

    public String getCustomerId() {
        return customerId;
    }
    @Override
    public String toString(){ 
        return customerName + " " + address;
    }
    
    
}
