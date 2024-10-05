/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation_practice.sapxepmatran;

import java.util.Arrays;

/**
 *
 * @author P51
 */
public class Matrix {
    private int row, column;
    private int data[][];
    
    public Matrix(int row, int column, int x[]) {
        this.row = row;
        this.column = column;
        int curr = 0;
        data = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                data[i][j] = x[curr++];
            }
        }
    }
    
    
    public Matrix sortMatrix(int col) {
//        int 
        col--;
        int n = row + column;
        int a[] = new int[n];
        int curr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[curr++] = data[i][j];
            }
        }
        Matrix res = new Matrix(row, column, a);
        Integer cols[] = new Integer[row];
        for (int i = 0; i < row; i++) {
            cols[i] = data[i][col];
        }
        Arrays.sort(cols);
        for (int i = 0; i < row; i++) {
            res.data[i][col] = cols[i];
        }
        return res;
    }
    
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res.append(data[i][j]);
                if (j != column - 1) {
                    res.append(" ");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }
}
