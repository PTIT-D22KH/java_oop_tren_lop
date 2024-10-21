/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tang_dan_giam_dan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author P51
 */
public class TangDanGiamDan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            TreeSet<Integer> evens = new TreeSet<>();
            TreeSet<Integer> odds = new TreeSet<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                int x = input.nextInt();
                if (x % 2 == 0) {
                    evens.add(x);
                } else {
                    odds.add(x);
                }
            }
            for (int x : evens) {
                System.out.printf("%d ", x);
            }
            System.out.println();
            for (int x : odds) {
                System.out.printf("%d ", x);
            }
            System.out.println();
        }
    }
     
    
}
