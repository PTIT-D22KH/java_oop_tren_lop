/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepmatran;

import java.io.*;
import java.util.*;

/**
 *
 * @author P51
 */
public class Main {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_container/sapxepmatran/MATRIX.in"));
        Scanner input = new Scanner(new File("MATRIX.in"));
        int t = input.nextInt();
        while (t-- > 0) {
            int row = input.nextInt();
            int column = input.nextInt();
            int specifiedCol = input.nextInt();
            int data[] = new int[row * column];
            for (int i = 0; i < row * column; i++) {
                data[i] = input.nextInt();
            }
            Matrix a = new Matrix(row, column, data);
            System.out.println(a.sortMatrix(specifiedCol));
            
        }
        input.close();
    }
}
