package cn.cc.org;

import java.util.HashSet;

/*
 * 约定了正数，简单了点，可以从0开始搜索
 * 时间长度为O(n)，不能先排序
 */
public class leetcode_41 {
	 public int firstMissingPositive(int[] nums) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        int length = nums.length;
	        if(length<=0)
	            return 1;

	        for(int i = 0;i<length;i++){
	            set.add(nums[i]);
	        }

	        int index = 1;
	        while(set.contains(index++));
	        return index-1;
	     }
}
