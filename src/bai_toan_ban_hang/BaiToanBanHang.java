/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_toan_ban_hang;

/**
 *
 * @author P51
 */
import java.util.*;
import java.io.*;
public class BaiToanBanHang {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_container/bai_toan_ban_hang/KH.in"));
//        Scanner input2 = new Scanner(new File("src/file_container/bai_toan_ban_hang/MH.in"));
//        Scanner input3 = new Scanner(new File("src/file_container/bai_toan_ban_hang/HD.in"));
        
        Scanner input1 = new Scanner(new File("KH.in"));
        Scanner input2 = new Scanner(new File("MH.in"));
        Scanner input3 = new Scanner(new File("HD.in"));
        
        int n = Integer.parseInt(input1.nextLine());
        int countCustomers = 0;
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            customers.add(new Customer(String.format("KH%03d", ++countCustomers), input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        int countProducts = 0;
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            products.add(new Product(String.format("MH%03d", ++countProducts),input2.nextLine(), input2.nextLine(), Integer.parseInt(input2.nextLine()), Integer.parseInt(input2.nextLine())));
        }
        int p = input3.nextInt();
        ArrayList<Bill> bills = new ArrayList<>();
        int countBills = 0;
        for (int i = 0; i < p; i++) {
            String customerId = input3.next(), productId = input3.next();
            int numBuys = input3.nextInt();
            Customer customer = null;
            Product product = null;
            for (Customer x : customers) {
                if (x.getCustomerId().equals(customerId)) {
                    customer = x;
                    break;
                }
            }
            for (Product x : products) {
                if (x.getProductId().equals(productId)) {
                    product = x;
                    break;
                }
            }
            bills.add(new Bill(String.format("HD%03d", ++countBills),customer, product, numBuys));
        }
        for (Bill x : bills) {
            System.out.println(x);
        }
    }
}
