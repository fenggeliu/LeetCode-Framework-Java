/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leet;

/**
 *
 * @author tkkin_000
 */
public class leetcode29 {
    public static int divide(int dividend, int divisor) {
        int mod = 0;
        boolean sign = dividend < 0 ? divisor < 0: divisor > 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int e = Math.abs(dividend), s = Math.abs(divisor), time = 1;
        if (e < s) return 0;
        int q = s;
        while (e >= q + q){
            time += time;
            q += q;
        }
        if (e > q) mod = divide(e-q, s);
        
        if (sign)
            return time + mod ;
        else return -time - mod;
    }
    
}
