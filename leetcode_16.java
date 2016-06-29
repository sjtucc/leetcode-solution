package cn.cc.org;

import java.util.Arrays;

public class leetcode_16 {
	public int threeSumClosest(int[] nums, int target) { 
        Arrays.sort(nums);
        int result = 0;
        int sum = 0;
        int closestDis = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {

            int left = i + 1;  //最关键的地方，如果是想办法去掉定点后left=0,会重复计算
            int right = nums.length-1;


            while(left < right) {
                sum = nums[left] + nums[right] + nums[i];
                if(sum > target) {
                    if(sum-target < closestDis) {
                        closestDis = sum - target;
                        result = sum;
                    }
                    right--;
                }
                else if(sum < target) {
                    if(target-sum < closestDis) {
                        closestDis = target - sum ;
                        result = sum;
                    }
                    left++;
                }
                else {
                    return sum;
                }
            }
        }
        return result;
    }   
}
