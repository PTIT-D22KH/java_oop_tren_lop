/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_toan_ban_hang;

/**
 *
 * @author P51
 */
public class Bill {
    private String billId;
    private Customer customer;
    private Product product;
    private int numBuys;

    public Bill(String billId, Customer customer, Product product, int numBuys) {
        this.billId = billId;
        this.customer = customer;
        this.product = product;
        this.numBuys = numBuys;
    }
    private int calTotalPrice() {
        return product.getSellPrice() * numBuys;
    }
    @Override
    public String toString (){ 
        return billId + " " + customer + " " + product + " " + numBuys + " " + calTotalPrice();
    }
}
