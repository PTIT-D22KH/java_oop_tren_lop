/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_toan_ban_hang;

/**
 *
 * @author P51
 */
public class Product {
    private String productId, productName, unit;
    private int buyPrice, sellPrice;

    public Product(String productId, String productName, String unit, int buyPrice, int sellPrice) {
        this.productId = productId;
        this.productName = productName;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getProductId() {
        return productId;
    }

    public int getSellPrice() {
        return sellPrice;
    }
    @Override
    public String toString() {
        return productName + " " + unit + " " + buyPrice + " " + sellPrice;
    }
    
}
