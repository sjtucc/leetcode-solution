package cn.cc.org;

import java.util.Arrays;

public class leetcode_26 {
	 public int removeDuplicates(int[] nums) {
	        if(nums == null || nums.length == 0) 
	            return 0;
	        if(nums.length == 1) 
	            return 1;

	        //不是有序的，先用Arrays排序
	        int j = 1;
	        int cur = 1; //覆盖的当前索引
	        for(int i=0; i<nums.length-1; i++) {
	            if(nums[i+1] != nums[i]) {
	                j++;    
	                nums[cur] = nums[i+1]; //采用覆盖的方式
	                cur++;
	            }

	        }

	        System.out.println(Arrays.toString(Arrays.copyOf(nums, j)));//输出最后数组

	        return j;

	   }
}


