/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao_tu;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author P51
 */
public class DaoTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            String s = input.nextLine();
            Stack st = new Stack();
            String a[] = s.trim().split("\\s+");
            for (int i = 0; i < a.length; i++) {
                st.push(a[i]);
            }
            while (!st.empty()) {
                System.out.print(st.pop() + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
