package cn.cc.org;

import java.util.List;

public class leetcode_52 {
	 private int  solve(int n,int index,List<Integer> tmpList){
	        if(n==index){
	            return 1;
	        }
	        int count = 0;
	        for(int col = 0;col<n;col++){
	            int row = index;
	            int rowList;
	            for(rowList = 0;rowList<tmpList.size();rowList++){
	                int rowrow = rowList;
	                int colcol = tmpList.get(rowrow);
	                //ͬһ��
	                if(col == colcol)
	                    break;
	                //ͬһб��
	                if(Math.abs(rowrow-row)==Math.abs(colcol-col))
	                    break;
	            }
	            if(rowList==tmpList.size()) {
	                tmpList.add(col);
	                int val = solve(n, index + 1, tmpList);
	                tmpList.remove(tmpList.size()-1);
	                if(val>0) {
	                    count += val;
	                }
	            }
	        }
	        return count;
	    }
}
