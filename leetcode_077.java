package cn.cc.org;

import java.util.ArrayList;
import java.util.List;

public class leetcode_077 {
	 public List<List<Integer>> combine(int n, int k) {  
	        List<List<Integer>> res = new ArrayList<List<Integer>>();  
	        List<Integer> temp = new ArrayList<Integer>();  
	        dfs(res, temp, n, k, 1);  
	        return res;  
	    }  
	    private void dfs(List<List<Integer>> res, List<Integer> temp, int n, int k, int m) {  
	        if(k == 0) {  
	            res.add(new ArrayList<Integer>(temp));  
	            return;  
	        }  
	        for(int i=m; i<=n; i++) {  
	            temp.add(i);  
	            dfs(res, temp, n, k-1, i+1);  
	            temp.remove(temp.size()-1);  
	        }  
	    }  
}
