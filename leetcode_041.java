package cn.cc.org;

import java.util.HashSet;

/*
 * Լ�������������˵㣬���Դ�0��ʼ����
 * ʱ�䳤��ΪO(n)������������
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
