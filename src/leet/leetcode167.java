package leet;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tkkin_000
 */
public class leetcode167 {

    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        
        while(low<high){
            int sum = numbers[low]+numbers[high];
            if(sum>target)
                --high;
            else if(sum<target)
                ++low;
            else 
                return new int[]{low+1,high+1};
        }return null;
     
    }
    
}
