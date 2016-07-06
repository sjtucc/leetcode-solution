package cn.cc.org;

public class leetcode_45 {
	 public int jump(int[] nums) {
	        int level = 0;    //±£´æ½á¹û
	        int start = 0,end = 0;
	        int target = nums.length - 1;

	        while(end<target){
	            level++;  
	            int value = start;
	            for(int i = start;i<=end;i++){
	                value = Math.max(value,nums[i]+i);
	            }
	            if(value<=end)//never has chance to reach last
	                return -1;

	            start = end+1;
	            end = value;
	        }
	        return level;
	    } 
}
