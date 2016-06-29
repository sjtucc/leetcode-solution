package cn.cc.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;




public class leetcode_18 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet hs = new HashSet(); //��󲻻����ظ�
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {

                int left = j + 1;  //��ؼ��ĵط����������취ȥ�������left=0,���ظ�����
                int right = nums.length-1;
                while(left < right) {
                    sum = nums[left] + nums[right] + nums[i] + nums[j];
                    if(sum > target) {
                        right--;
                    }
                    else if(sum < target) {
                        left++;
                    }
                    else {
                        List li = new ArrayList();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[left]);
                        li.add(nums[right]);
                        hs.add(li);
                        //break;   //��ÿ����Ϊ���㣬�𰸿����ж��
                        left++;    
                        right--;
                    }
                }


            }
        }
        return new ArrayList(hs);
    }
}
