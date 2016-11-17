/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fengge
 */
public class leetcode30 {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || words.length == 0) return res;
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.containsKey(word) ? 
            map.get(word) + 1 : 1);
            
        }
        int m = words[0].length();
        for (int i = 0; i <= s.length() - m * words.length; i++) {
            Map<String, Integer> copy = new HashMap<>(map);
            int k = words.length, j = i;
            while (k > 0) {
                String sub = s.substring(j, j + m);
                if (!copy.containsKey(sub) || copy.get(sub) == 0){
                    break;
                }else{
                    copy.put(sub, copy.get(sub) - 1);
                    j += m;
                    k--;
                }
            }
            if (k == 0) res.add(i);
        } return res;
    }
}
