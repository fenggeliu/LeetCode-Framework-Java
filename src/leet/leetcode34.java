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
public class leetcode34 {


    /**
     * @param args the command line arguments
     */
        public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int left ;
        int right ;
        int key= 0;
        //if(low==high && target==nums[low])
        //    return new int[]{low,low};
        while(low<high){
            int mid = low+(high-low)/2;
            if(target<nums[mid])
                high=mid-1;
            if(target>nums[mid])
                low=mid+1;
            if(target==nums[mid]){
                key=mid;
                break;
            }
        }
        if(target==nums[key]){    
            while(key>low){
                left= low+(key-low)/2;
                if(target==nums[left])
                    key=left-1;
                if(target>nums[left])
                    low=left+1;
            }
            while(key<high){
                right= key+(high-key)/2;
                if(target==nums[right])
                    key=right+1;
                if(target<nums[right])
                    high=right-1;
            }
            return new int[]{low,high};
        }
        else 
            return new int[]{-1,-1};        
            
        }
    
}
