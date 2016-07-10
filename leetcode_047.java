package cn.cc.org;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leetcode_47 {
	public class Solution {
	    public List<List<Integer>> permuteUnique(int[] nums){
	        List<List<Integer>> res = new LinkedList<>();
	        List<Integer> tmpList = new LinkedList<>();
	        boolean[] visited = new boolean[nums.length];

	        Arrays.sort(nums);
	        solve(nums, res, tmpList,visited);
	        return res;
	    }
	    private void solve(int[] nums,List<List<Integer>> res,List<Integer> tmpList,boolean[] visited){
	        int length = nums.length;
	        if(tmpList.size()==length){
	            res.add(new LinkedList<>(tmpList));
	            return;
	        }

	        for(int i = 0;i<length;i++){
	            while(i>0&&i<length&&nums[i]==nums[i-1]&&!visited[i-1]) i++;
	            if(i==length)
	                return;

	            if(visited[i]) continue;

	            tmpList.add(nums[i]);
	            visited[i] = true;
	            solve(nums,res,tmpList,visited);

	            visited[i] = false;
	            tmpList.remove(tmpList.size()-1);
	        }
	    }
	}
}
