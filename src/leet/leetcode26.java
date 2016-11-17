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
public class leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        if (nums.length<2)
            return nums.length;
        for(int i=0; i<nums.length-1; i++){
            int j = i+1;
            if(nums[i]<nums[j])
                count++;
            if(nums[i]==nums[j])
                continue;
        }return count;
    }
    /*public static int removeDuplicates(int[] nums) 
	{	
		if(nums == null)
			return 0;
		
		if(nums.length <= 1)
			return nums.length;
		
		int len = 1;
		int unique = 0;
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] != nums[unique])
			{
				len++;
				nums[len-1] = nums[i];
				unique = i;
			}
		}	
        return len;
    }*/
}
