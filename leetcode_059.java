package cn.cc.org;

import java.util.ArrayList;
import java.util.List;

public class leetcode_059 {
	List<String[]> result;  
    int[] A;  
    public List<String[]> solveNQueens(int n) {  
        result = new ArrayList<String[]>();  
        A = new int[n];  
        nqueens(0, n);  
        return result;  
    }  
    public void nqueens(int cur, int n){  
        if(cur==n) printres(n);  
        else {  
            for(int i=0;i<n;i++){  
                A[cur] = i;  
                if(valid(cur)){  
                    nqueens(cur+1, n);  
                }  
            }  
        }  
    }  
    public void printres(int n){  
        String[] tem = new String[n];  
        for(int i=0;i<n;i++){  
            StringBuffer sBuffer = new StringBuffer();  
            for(int j=0;j<n;j++){  
                if(j==A[i]) sBuffer.append('Q');  
                else sBuffer.append('.');  
            }  
            tem[i] = sBuffer.toString();  
        }  
        result.add(tem);  
    }  
    public boolean valid(int r){  
        for(int i=0;i<r;i++){  
            if(A[i]==A[r]|| Math.abs(A[i]-A[r])==r-i){  
                return false;  
            }  
        }  
        return true;  
    }  

}
