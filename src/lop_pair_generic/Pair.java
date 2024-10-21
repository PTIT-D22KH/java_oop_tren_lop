/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_pair_generic;

/**
 *
 * @author P51
 */
public class Pair <T extends Integer, S extends  Integer> {
    private T first;
    private S second;
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    public boolean isPrime() {
        return (isNumberPrime(first) && isNumberPrime(second));
    }
    private boolean isNumberPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return first + " " + second;
    }
}
