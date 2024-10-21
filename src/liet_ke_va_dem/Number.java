/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liet_ke_va_dem;

/**
 *
 * @author P51
 */
public class Number implements  Comparable<Number>{
    private int value;
    private int frequency;
    private int rank;
    private static int count = 0;
    
    public Number(int value, int frequency) {
        this.value = value;
        this.frequency = frequency;
        this.rank = ++count;
    }

    @Override
    public int compareTo(Number o) {
        if (this.frequency == o.frequency) {
            return Integer.compare(this.rank, o.rank);
        }
        return Integer.compare(o.frequency, this.frequency);
    }
    
    @Override
    public String toString() {
        return value + " " + frequency;
    }
}

