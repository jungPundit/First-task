/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.firsttask;



public class Main {

    /**
     * Calculates the product of numbers within an interval
     *
     * @param st start of the interval
     * @param end end of the interval
     */
    public int factorial(int st, int end) {
        if (st > end) {
            return 1;
        }
        if (st == end) {
            return st;
        }

        if (st == end - 1) {
            return end * st;
        }
        int m = (end + st) / 2;
        return factorial(st, m) * factorial(m + 1, end);
    }

    /**
     * Calculates the number of correct bracket sequences
     *
     * @param n quantity of opening and closing brackets
     */
    public int calculate(int n) {
        if (n > 0) {
            return (factorial(2, 2 * n) / (factorial(2, n) * factorial(2, 2 * n - n))) / (n + 1);
        }
        return -1;
    }
}
