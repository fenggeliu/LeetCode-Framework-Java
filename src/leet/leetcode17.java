/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tkkin_000
 */
public class leetcode17 {
    public static List<String> letterCombinations(String digits) {
        String[] dict = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> curr = new ArrayList<>();
        List<String> prev = new ArrayList<>();
        if (digits.length() == 0) return prev;
        if (digits.length() >0) {
            String temp = dict[digits.charAt(0)-'0'];
            for (int i = 0; i < temp.length(); i++){
                prev.add(Character.toString(temp.charAt(i)));
            }
        }
        if (digits.length() > 1) {
            for (int i = 1; i < digits.length(); i++){
                curr.clear();
                String temp = dict[digits.charAt(i)-'0'];
                
                for (int j = 0; j < temp.length(); j++){
                    for (int  k = 0; k < prev.size(); k++){
                        curr.add(prev.get(k) + Character.toString(temp.charAt(j)));
                    }
                }
                prev = curr;
            }
        }
        return prev;
    }
}
