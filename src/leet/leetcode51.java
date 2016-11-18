/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fengge
 */
public class leetcode51 {
     
    static public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        if (n == 0) return result;
        hasPos(n, 0, col, res);
        if (res.size() > 0){
            char[] temp = new char[n];
            //Arrays.fill(temp, '.');
            
            for(int j = 0; j < res.size(); j++) {
                List<String> solution = new ArrayList<>();
                for(int i = 0; i < n; i++){
                    Arrays.fill(temp, '.');
                    temp[res.get(j).get(i)] = 'Q'; 
                    String queen = new String(temp);
                    solution.add(queen);
                    
                }
                result.add(solution);
                
            }
            
        } return result;
        
    }
    
    private static void hasPos(int n, int row, List<Integer> col, List<List<Integer>> res){
        if (row == n) {
            res.add(col);
            return;
        }
        boolean valid;
        if(row == 0 )
            col = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            valid = true;
            for (int j = 0; j < row; j++) {
                if(col.get(j) == i || j + col.get(j) == i + row || j - col.get(j) == row - i){
                    valid = false; 
                    break;
                }
            }
            
            if (col.size() == row + 1 && valid) {
                List<Integer> col2 = new ArrayList(col);
                col2.set(row, i);
                hasPos(n, row + 1, col2, res);
            } else if (valid) {
                col.add(i);
                hasPos(n, row + 1, col, res);
            }
        }
    }

}
